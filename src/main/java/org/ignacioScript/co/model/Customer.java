package org.ignacioScript.co.model;

public class Customer extends User{

    private String contactAddress;

    public Customer(int id, String name, String email, String phone, String contactAddress) {
        super(id, name, email, phone);
        this.contactAddress = contactAddress;
    }

    public Customer(String name, String email, String phone, String contactAddress) {
        super(name, email, phone);
        this.contactAddress = contactAddress;
    }

    public Customer(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "contactAddress='" + contactAddress + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
