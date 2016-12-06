package sk.upjs.invoicesystem;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author marosi
 */
public class MongoCompanies implements CompaniesDao {
    
    private DBCollection mongo;
    
    public MongoCompanies(DBCollection mongo){
        this.mongo=mongo;
    }
    @Override
    public long size(){
        
        return mongo.getCount();
    }
    
    @Override
    public void addCompany(Company company) {
        BasicDBObject doc =  new BasicDBObject("companyName",company.getCompanyName())
                .append("street",company.getStreet())
                .append("city",company.getCity())
                .append("postalCode", company.getPostalCode())
                .append("country", company.getCountry())
                .append("ico", company.getICO())
                .append("dic", company.getDIC())
                .append("dph", company.getDPHPayer())
                .append("telephoneNumber", company.getTelephoneNumber())
                .append("email", company.getEmail())
                .append("iban", company.getIBAN());
        mongo.insert(doc);
        
                
    }

    @Override
    public List<Company> getCompanies() {
        List<Company> companies = new ArrayList<Company>();
        DBCursor cursor = mongo.find();
        

        while(cursor.hasNext()){
            Company company=new Company();
            DBObject theone= cursor.next();
            company.setCompanyName((String)theone.get("companyName"));
            company.setStreet((String)theone.get("street"));
            company.setCity((String)theone.get("city"));
            company.setPostalCode((int)theone.get("postalCode"));
            company.setCountry((String)theone.get("country")); 
            company.setICO((Long)theone.get("ico"));
            company.setDIC((Long)theone.get("dic"));
            company.setDPHPayer((Long)theone.get("dph"));
            company.setTelephoneNumber((String)theone.get("telephoneNumber"));
            company.setEmail((String)theone.get("email"));
            company.setIBAN((String)theone.get("iban"));       
            companies.add(company);
        }
        return companies;
    }

    @Override
    public Company searchCompanyByCompanyName(String companyName) {
        Company company=new Company();
        
        BasicDBObject query = new BasicDBObject("companyName",companyName);
        DBObject theone= mongo.findOne(query);
        company.setCompanyName((String)theone.get("companyName"));
        company.setStreet((String)theone.get("street"));
        company.setCity((String)theone.get("city"));
        company.setPostalCode((int)theone.get("postalCode"));
        company.setCountry((String)theone.get("country")); 
        company.setICO((Long)theone.get("ico"));
        company.setDIC((Long)theone.get("dic"));
        company.setDPHPayer((Long)theone.get("dph"));
        company.setTelephoneNumber((String)theone.get("telephoneNumber"));
        company.setEmail((String)theone.get("email"));
        company.setIBAN((String)theone.get("iban"));
        
        return company;
    }

    @Override
    public Company searchCompanyById(String objectId) {
          Company company=new Company();
        
        BasicDBObject query = new BasicDBObject("_id",objectId);
        DBObject theone= mongo.findOne(query);
        company.setIdCompany((String)theone.get("_id"));
        company.setCompanyName((String)theone.get("companyName"));
        company.setStreet((String)theone.get("street"));
        company.setCity((String)theone.get("city"));
        company.setPostalCode((int)theone.get("postalCode"));
        company.setCountry((String)theone.get("country")); 
        company.setICO((Long)theone.get("ico"));
        company.setDIC((Long)theone.get("dic"));
        company.setDPHPayer((Long)theone.get("dph"));
        company.setTelephoneNumber((String)theone.get("telephoneNumber"));
        company.setEmail((String)theone.get("email"));
        company.setIBAN((String)theone.get("iban"));
        
        return company;
    }

   
}
