package org.ignacioScript.co.model;

public class Admin extends User{

    private String username;
    private String password;

    public Admin(int id, String name, String email, String phone, String username, String password) {
        super(id, name, email, phone);
        this.username = username;
        this.password = password;
    }

    public Admin(String name, String email, String phone, String username, String password) {
        super(name, email, phone);
        this.username = username;
        this.password = password;
    }

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "password='" + password + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
