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
    public void testGetItemsById() {
        Item item = new Item("drevo na zimu", 9, 33.3, "pc");
        ItemsDao mongo = ObjectFactory.INSTANCE.getItemsDao();
        ObjectId id = new ObjectId("58470a2e371f601b786f55ce");
        List<Item> items = mongo.getItemsById(id);
        long size = items.size();
        item.setInvoiceId(id);
        mongo.addItem(item);
        Assert.assertEquals(size, mongo.getItemsById(id).size() - 1);
        mongo.deleteItems(id);
    }

    @Test
    public void testAddItem() {
        Item item = new Item("motorku", 10, 200.0, "ks");
        ItemsDao mongo = ObjectFactory.INSTANCE.getItemsDao();
        ObjectId id = new ObjectId("58470a2e371f601b786f55cd");
        item.setInvoiceId(id);
        long daco = mongo.size();
        mongo.addItem(item);
        Assert.assertEquals(mongo.size(), daco + 1);
        mongo.deleteItems(id);

    }

    @Test
    public void testSize() {
    }

    @Test
    public void testDeleteItems() {
        Item item = new Item("motorku", 10, 200.0, "ks");
        ItemsDao mongo = ObjectFactory.INSTANCE.getItemsDao();
        ObjectId id = new ObjectId("58470a2e371f601b786f55cd");
        item.setInvoiceId(id);
        mongo.addItem(item);
        long daco = mongo.size();
        mongo.deleteItems(id);
        Assert.assertEquals(mongo.size(), daco - 1);
    }

}
