package sk.upjs.invoicesystem;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.bson.types.ObjectId;

/**
 *
 * @author marosi
 */
public class MongoCompanies implements CompaniesDao {

    private DBCollection mongo;

    public MongoCompanies(DBCollection mongo) {
        this.mongo = mongo;
    }

    @Override
    public long size() {

        return mongo.getCount();
    }

    @Override
    public void addCompany(Company company) {

        BasicDBObject doc = new BasicDBObject("companyName", company.getCompanyName())
                .append("street", company.getStreet())
                .append("city", company.getCity())
                .append("postalCode", company.getPostalCode())
                .append("country", company.getCountry())
                .append("ico", company.getICO())
                .append("dic", company.getDIC())
                .append("dph", company.getICDPH())
                .append("telephoneNumber", company.getTelephoneNumber())
                .append("email", company.getEmail())
                .append("iban", company.getIBAN());
        mongo.insert(doc);

    }

    @Override
    public void updateCompany(Company company) {
        BasicDBObject doc = new BasicDBObject();

        doc.append("$set", new BasicDBObject().append("companyName", company.getCompanyName())
                .append("street", company.getStreet())
                .append("city", company.getCity())
                .append("postalCode", company.getPostalCode())
                .append("country", company.getCountry())
                .append("ico", company.getICO())
                .append("dic", company.getDIC())
                .append("dph", company.getICDPH())
                .append("telephoneNumber", company.getTelephoneNumber())
                .append("email", company.getEmail())
                .append("iban", company.getIBAN()));
        BasicDBObject searchQuery = new BasicDBObject().append("_id", company.getIdCompany());
        mongo.update(searchQuery, doc);

    }

    @Override
    public void deleteCompany(Company company) {
        ObjectId objectId = company.getIdCompany();
        BasicDBObject query = new BasicDBObject("_id", objectId);
        DBObject theone = mongo.findOne(query);
        mongo.remove(theone);

    }

    @Override
    public List<Company> getCompanies() {
        List<Company> companies = new ArrayList<Company>();
        DBCursor cursor = mongo.find();

        while (cursor.hasNext()) {
            Company company = new Company();
            DBObject theone = cursor.next();
            company.setIdCompany((ObjectId) theone.get("_id"));
            company.setCompanyName((String) theone.get("companyName"));
            company.setStreet((String) theone.get("street"));
            company.setCity((String) theone.get("city"));
            if (theone.get("postalCode") != null) {
                company.setPostalCode((Integer) theone.get("postalCode"));
            }
            company.setCountry((String) theone.get("country"));
            if (theone.get("ico") != null) {
                company.setICO((Long) theone.get("ico"));
            }
            if (theone.get("dic") != null) {
                company.setDIC((Long) theone.get("dic"));
            }
            if (theone.get("dph") != null) {
                company.setICDPH((Long) theone.get("dph"));
            }
            company.setTelephoneNumber((String) theone.get("telephoneNumber"));
            company.setEmail((String) theone.get("email"));
            company.setIBAN((String) theone.get("iban"));
            companies.add(company);
        }
        return companies;
    }

    @Override
    public Company searchCompanyByCompanyName(String companyName) { //najde prvu company s tymto nazvom
        Company company = new Company();
        if (!"".equals(company) && companyName != null) {
            BasicDBObject query = new BasicDBObject("companyName", companyName);

            DBCursor cursor = mongo.find(query);
            if (cursor.hasNext()) {
                DBObject theone = cursor.next();

                company.setIdCompany((ObjectId) theone.get("_id"));
                company.setCompanyName((String) theone.get("companyName"));
                company.setStreet((String) theone.get("street"));
                company.setCity((String) theone.get("city"));
                company.setPostalCode((int) theone.get("postalCode"));
                company.setCountry((String) theone.get("country"));
                company.setICO((Long) theone.get("ico"));
                company.setDIC((Long) theone.get("dic"));
                company.setICDPH((Long) theone.get("dph"));
                company.setTelephoneNumber((String) theone.get("telephoneNumber"));
                company.setEmail((String) theone.get("email"));
                company.setIBAN((String) theone.get("iban"));
            }
        }
        return company;
    }

    public List<Company> searchCompaniesByName(String companyName) {
        if (companyName != null && !"".equals(companyName)) {
            List<Company> companies = new ArrayList<Company>();
            Pattern regex = Pattern.compile(companyName, Pattern.CASE_INSENSITIVE);

            BasicDBObject query = new BasicDBObject();
            query.put("companyName", regex);
            DBCursor cursor = mongo.find(query);

            while (cursor.hasNext()) {
                Company company = new Company();
                DBObject theone = cursor.next();
                company.setIdCompany((ObjectId) theone.get("_id"));
                company.setCompanyName((String) theone.get("companyName"));
                company.setStreet((String) theone.get("street"));
                company.setCity((String) theone.get("city"));
                company.setPostalCode((int) theone.get("postalCode"));
                company.setCountry((String) theone.get("country"));
                company.setICO((Long) theone.get("ico"));
                company.setDIC((Long) theone.get("dic"));
                company.setICDPH((Long) theone.get("dph"));
                company.setTelephoneNumber((String) theone.get("telephoneNumber"));
                company.setEmail((String) theone.get("email"));
                company.setIBAN((String) theone.get("iban"));
                companies.add(company);
            }
            return companies;
        }
        return getCompanies();
    }

    @Override
    public Company searchCompanyById(ObjectId objectId) {
        Company company = new Company();
        if (objectId != null) {
            BasicDBObject query = new BasicDBObject("_id", objectId);

            DBCursor cursor = mongo.find(query);

            if (cursor.hasNext()) {
                DBObject theone = cursor.next();

                company.setIdCompany((ObjectId) theone.get("_id"));
                company.setCompanyName((String) theone.get("companyName"));
                company.setStreet((String) theone.get("street"));
                company.setCity((String) theone.get("city"));
                company.setPostalCode((int) theone.get("postalCode"));
                company.setCountry((String) theone.get("country"));
                company.setICO((Long) theone.get("ico"));
                company.setDIC((Long) theone.get("dic"));
                company.setICDPH((Long) theone.get("dph"));
                company.setTelephoneNumber((String) theone.get("telephoneNumber"));
                company.setEmail((String) theone.get("email"));
                company.setIBAN((String) theone.get("iban"));

            }
        }
        return company;
    }

}
