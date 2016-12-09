/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.invoicesystem;

import java.util.List;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.bson.types.ObjectId;

/**
 *
 * @author marosi
 */
public class MongoItemsTest {
    
    public MongoItemsTest() {
    }
    
    @Before
    public void setUp() {
    }

    @Test
    public void testGetItems() {
        Item item = new Item();
        ItemsDao mongo = ObjectFactory.INSTANCE.getItemsDao();
        long daco = mongo.size();
        ObjectId id = new ObjectId("58470a2e371f601b786f55cc");
        List<Item> items = mongo.getItems(id);
        mongo.addItem(item);
        Assert.assertEquals(mongo.size(), items.size()+1);
    }

    @Test
    public void testAddItem() {
        Item item = new Item("chceme ucit", 10, 2.5);
        ItemsDao mongo = ObjectFactory.INSTANCE.getItemsDao();
        long daco= mongo.size();
        mongo.addItem(item);
        Assert.assertEquals(mongo.size(),daco+1);
        
    }

    @Test
    public void testSize() {
    }
    
}
