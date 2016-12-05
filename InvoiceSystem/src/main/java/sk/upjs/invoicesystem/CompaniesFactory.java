package sk.upjs.invoicesystem;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCursor;

public enum CompaniesFactory {
    INSTANCE;
    private String databaseName = "invoices_db";

    MongoClient mongoClient = new MongoClient("localhost", 27017);    //pripoji sa na databazu	
    private DB db = mongoClient.getDB(databaseName);

    public CompaniesDao getCompanyDao() {

        return new MongoCompanies(db.getCollection("companies"));         //vrati companies collection
    }

}
