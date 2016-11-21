package sk.upjs.invoicesystem;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCursor;


public class CompaniesFactory {
  
   private String databaseName = "invoices_db";
   private DB db;
   
   
   public CompaniesDao getCompanyDao(){
       MongoClient mongoClient = new MongoClient( "localhost" , 27017 );    //pripoji sa na databazu	
       db=mongoClient.getDB( databaseName );
       return new MongoCompanies(db.getCollection("companies"));         //vrati companies collection
   }
  
   
    
}
