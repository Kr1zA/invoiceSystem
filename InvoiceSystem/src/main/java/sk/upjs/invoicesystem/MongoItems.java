package sk.upjs.invoicesystem;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import java.util.List;
import org.bson.types.ObjectId;


public class MongoItems implements ItemsDao{
    private DBCollection mongo;
    
    public MongoItems(DBCollection mongo) {
        this.mongo = mongo;
    }

    @Override
    public List<Item> getItems(ObjectId idInvoice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addItem(Item item) {
        BasicDBObject doc =  new BasicDBObject("description",item.getDescription())
                .append("amount", item.getDescription())
                .append("pricePerPiece", item.getPricePerPiece());
                
        mongo.insert(doc);
    }

    @Override
    public long size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
