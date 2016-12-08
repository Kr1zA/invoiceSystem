/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.invoicesystem;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

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
