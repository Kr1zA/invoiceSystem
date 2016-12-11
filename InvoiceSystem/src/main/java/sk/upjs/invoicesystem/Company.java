package sk.upjs.invoicesystem;

import org.bson.types.ObjectId;

public class Company {

    public Company() {
    }

    public Company(String companyName, String street, String city, int postalCode, String country, Long ICO, Long DIC, Long ICDPH, String telephoneNumber, String email, String IBAN) {
        this.companyName = companyName;
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
        this.ICO = ICO;
        this.DIC = DIC;
        this.ICDPH = ICDPH;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
        this.IBAN = IBAN;
    }

    private ObjectId idCompany;
    private String companyName = "";
    private String street = "";
    private String city = "";
    private int postalCode;
    private String country = "";
    private Long ICO;
    private Long DIC;
    private Long ICDPH;
    private String telephoneNumber = "";
    private String email = "";
    private String IBAN = "";

    public ObjectId getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(ObjectId idCompany) {
        this.idCompany = idCompany;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setICO(Long ICO) {
        this.ICO = ICO;
    }

    public void setDIC(Long DIC) {
        this.DIC = DIC;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public Long getICO() {
        return ICO;
    }

    public Long getDIC() {
        return DIC;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getIBAN() {
        return IBAN;
    }

    public Long getICDPH() {
        return ICDPH;
    }

    public void setICDPH(Long ICDPH) {
        this.ICDPH = ICDPH;
    }

}
