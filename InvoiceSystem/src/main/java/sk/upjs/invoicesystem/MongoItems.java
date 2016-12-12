package sk.upjs.invoicesystem;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;

public class MongoItems implements ItemsDao {

    private DBCollection mongo;

    public MongoItems(DBCollection mongo) {
        this.mongo = mongo;
    }

    @Override
    public List<Item> getItems(ObjectId idInvoice) {
        List<Item> items = new ArrayList<Item>();
        DBCursor cursor = mongo.find();

        while (cursor.hasNext()) {
            DBObject theone = cursor.next();
            if (theone.get("invoiceId") != null) {
                if (theone.get("invoiceId").equals(idInvoice)) {

                    Item item = new Item();
                    item.setAmount((int) theone.get("amount"));
                    item.setDescription((String) theone.get("description"));
                    item.setPricePerPiece((double) theone.get("pricePerPiece"));
                    item.setInvoiceId((ObjectId) theone.get("invoiceId"));
                    items.add(item);
                }
            }

        }
        return items;
    }

    @Override
    public void addItem(Item item) {
        BasicDBObject doc = new BasicDBObject("description", item.getDescription())
                .append("amount", item.getAmount())
                .append("pricePerPiece", item.getPricePerPiece())
                .append("invoiceId", item.getInvoiceId());

        mongo.insert(doc);
    }

    @Override
    public long size() {
        return mongo.getCount();
    }

    @Override
    public void deleteItems(ObjectId objectId) {
      
        DBCursor cursor = mongo.find();
        while(cursor.hasNext()){
            DBObject theone = cursor.next();
            
            if(theone.get("invoiceId").equals(objectId)){
                mongo.remove(theone);
            }   
        }
    }

}
