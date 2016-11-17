package sk.upjs.invoicesystem;

public class Company {

    private String companyName;
    private String surName;
    private String firstName;
    private String street;
    private String city;
    private int PSC;
    private String country;
    private Long ICO;
    private Long DIC;
    private boolean DPHPayer;
    private String telephoneNumber;
    private String email;
    private String IBAN;

    public Company(String companyName, String street, String city, int PSC, String country, Long ICO, Long DIC, boolean DPHPayer, String telephoneNumber, String email, String IBAN) {
        this.companyName = companyName;
        this.street = street;
        this.city = city;
        this.PSC = PSC;
        this.country = country;
        this.ICO = ICO;
        this.DIC = DIC;
        this.DPHPayer = DPHPayer;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
        this.IBAN = IBAN;
    }

    public Company(String surName, String firstName, String street, String city, int PSC, String country, Long ICO, Long DIC, boolean DPHPayer, String telephoneNumber, String email, String IBAN) {
        this.surName = surName;
        this.firstName = firstName;
        this.street = street;
        this.city = city;
        this.PSC = PSC;
        this.country = country;
        this.ICO = ICO;
        this.DIC = DIC;
        this.DPHPayer = DPHPayer;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
        this.IBAN = IBAN;
    }
    
    

}
