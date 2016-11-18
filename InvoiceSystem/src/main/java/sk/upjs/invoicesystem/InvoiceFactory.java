package sk.upjs.invoicesystem;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCursor;


public class InvoiceFactory {
  
   private String databaseName = "invoices_db";
   private DB db;
   
   
   public CompaniesDAO getCompanyDao(){
       MongoClient mongoClient = new MongoClient( "localhost" , 27017 );    //pripoji sa na databazu	
       mongoClient.getDB( databaseName );
       return new MongoCompaniesDao(db.getCollection("companies"));         //vrati companies collection
   }
  
   
    
}
