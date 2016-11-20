package sk.upjs.invoicesystem;

public class Company {

    private String companyName = "";
    private String surName = "";
    private String firstName = "";
    private String street = "";
    private String city = "";
    private int ZIP;
    private String country = "";
    private Long ICO;
    private Long DIC;
    private boolean DPHPayer;
    private String telephoneNumber = "";
    private String email = "";
    private String IBAN = "";

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPSC(int PSC) {
        this.ZIP = PSC;
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

    public void setDPHPayer(boolean DPHPayer) {
        this.DPHPayer = DPHPayer;
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

    public String getSurName() {
        return surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public int getPSC() {
        return ZIP;
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

    public boolean isDPHPayer() {
        return DPHPayer;
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

    public Company(String companyName, String firstName, String surName, String street, String city, int PSC, String country, Long ICO, Long DIC, boolean DPHPayer, String telephoneNumber, String email, String IBAN) {
        this.companyName = companyName;
        this.surName = surName;
        this.firstName = firstName;
        this.street = street;
        this.city = city;
        this.ZIP = PSC;
        this.country = country;
        this.ICO = ICO;
        this.DIC = DIC;
        this.DPHPayer = DPHPayer;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
        this.IBAN = IBAN;
    }

}
