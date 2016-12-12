package sk.upjs.invoicesystem;

import java.util.List;
import org.bson.types.ObjectId;

public interface ItemsDao {

    public List<Item> getItems(ObjectId idInvoice);

    public void addItem(Item item);
    
    public void deleteItems(ObjectId objectId);
    
    public long size();
    
}
