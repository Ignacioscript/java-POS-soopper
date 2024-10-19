package org.ignacioScript.co.model;

import org.ignacioScript.co.interfaces.DataTransferObject;

import java.time.LocalDate;

public class Sale implements DataTransferObject {

    private int salesId;
    private Customer customerName;
    private SalesClerk clerkName;
    private  Product productName;
    private double payment;
    private double totalSale;
    private LocalDate date;

    public Sale(int salesId, Customer customerName, SalesClerk clerkName, Product productName, double payment, double totalSale, LocalDate date) {
        this.salesId = salesId;
        this.customerName = customerName;
        this.clerkName = clerkName;
        this.productName = productName;
        this.payment = payment;
        this.totalSale = totalSale;
        this.date = date;
    }

    public Sale(Customer customerName, SalesClerk clerkName, Product productName, double payment, double totalSale, LocalDate date) {
        this.customerName = customerName;
        this.clerkName = clerkName;
        this.productName = productName;
        this.payment = payment;
        this.totalSale = totalSale;
        this.date = date;
    }

    public Sale() {
    }

    public int getSalesId() {
        return salesId;
    }

    public void setSalesId(int salesId) {
        this.salesId = salesId;
    }

    public Customer getCustomerName() {
        return customerName;
    }

    public void setCustomerName(Customer customerName) {
        this.customerName = customerName;
    }

    public SalesClerk getClerkName() {
        return clerkName;
    }

    public void setClerkName(SalesClerk clerkName) {
        this.clerkName = clerkName;
    }

    public Product getProductName() {
        return productName;
    }

    public void setProductName(Product productName) {
        this.productName = productName;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public double getTotalSale() {
        return totalSale;
    }

    public void setTotalSale(double totalSale) {
        this.totalSale = totalSale;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public int getId() {
        return this.salesId;
    }

    @Override
    public String toString() {
        return "Sales{" +
                "salesId=" + salesId +
                ", customerName=" + customerName +
                ", clerkName=" + clerkName +
                ", productName=" + productName +
                ", payment=" + payment +
                ", totalSale=" + totalSale +
                ", date=" + date +
                '}';
    }
}
