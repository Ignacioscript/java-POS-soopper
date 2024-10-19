package org.ignacioScript.co.model;

public class SalesClerk extends User{

    private String jobTitle;

    public SalesClerk(int id, String name, String email, String phone, String jobTitle) {
        super(id, name, email, phone);
        this.jobTitle = jobTitle;
    }

    public SalesClerk(String name, String email, String phone, String jobTitle) {
        super(name, email, phone);
        this.jobTitle = jobTitle;
    }

    public SalesClerk(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "SalesClerk{" +
                "jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
