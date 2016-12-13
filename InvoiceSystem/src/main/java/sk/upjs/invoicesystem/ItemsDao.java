package sk.upjs.invoicesystem;

import java.util.List;
import org.bson.types.ObjectId;

public interface ItemsDao {

    public List<Item> getItemsById(ObjectId idInvoice);     //dostanem polozky ktore patria k fakture

    public void addItem(Item item);                         //pridam jednu polozku
    
    public void deleteItems(ObjectId objectId);             //vymazem vsetky polozky podla id faktury
    
    public long size();
    
}
