package sk.upjs.invoicesystem;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCursor;

public enum ObjectFactory {
    INSTANCE;
    private String databaseName = "invoices_db";
    private CompaniesDao mongoCompanies;
    private InvoicesDao mongoInvoices;
    private ItemsDao mongoItems;

    MongoClient mongoClient = new MongoClient("localhost", 27017);    //pripoji sa na databazu	
    private DB db = mongoClient.getDB(databaseName);

    public CompaniesDao getCompanyDao() {

        if (mongoCompanies == null) {
            mongoCompanies = new MongoCompanies(db.getCollection("companies"));         //vrati companies collection
        }
        return mongoCompanies;
    }
    
    public InvoicesDao getInvoicesDao(){
        if(mongoInvoices==null){
            mongoInvoices=new MongoInvoices(db.getCollection("invoices"));
        }
        return mongoInvoices;
    }
    
    public ItemsDao getItemsDao(){
        if(mongoItems==null){
            mongoItems=new MongoItems(db.getCollection("items"));
        }
        return mongoItems;
    }

}
