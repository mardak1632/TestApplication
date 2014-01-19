package org.metin.test.persontest;

public class Person4 {

    private String firstName;
    private String lastName;

    public Person4() {
    }

    public Person4(String firstName) {
        this.firstName = firstName;
    }

    public Person4(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return (firstName + " " + lastName);
    }

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
}
