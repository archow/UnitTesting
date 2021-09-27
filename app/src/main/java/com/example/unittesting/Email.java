package com.example.unittesting;

public class Email {
    private String firstName;
    private String lastName;
    private String emailDomain;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailDomain() {
        return emailDomain;
    }

    public void setEmailDomain(String emailDomain) {
        this.emailDomain = emailDomain;
    }

    public Email(String firstName, String lastName, String emailDomain) {
        this.firstName = firstName;
        this.lastName = lastName;
        //takes in a string in the format "@blahblah.com"
        this.emailDomain = emailDomain;
    }

    public String getFullEmail() {

        return firstName + "." + lastName + emailDomain;
    }
}
