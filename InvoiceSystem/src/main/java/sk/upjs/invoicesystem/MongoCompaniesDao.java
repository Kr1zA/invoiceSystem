package sk.upjs.invoicesystem;

import com.mongodb.DBCollection;
import java.util.List;

public class MongoCompaniesDao implements CompaniesDAO {

    private DBCollection mongo;
    public MongoCompaniesDao(DBCollection mongo) {
        this.mongo=mongo;
    }

    @Override
    public void AddCompany(Company company) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public List<Company> getCompanies() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
