package org.ignacioScript.co.model;

import org.ignacioScript.co.interfaces.DataTransferObject;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Report implements DataTransferObject {


    private int reportId;
    private List<Sale> sales;
    private LocalDate date;
    private double totalExpense;
    private double totalRevenue;

    public Report(int reportId, List<Sale> sales, LocalDate date, double totalExpense, double totalRevenue) {
        this.reportId = reportId;
        this.sales = new ArrayList<>();
        this.date = date;
        this.totalExpense = totalExpense;
        this.totalRevenue = totalRevenue;
    }

    public Report(List<Sale> sales, LocalDate date, double totalExpense, double totalRevenue) {
        this.sales = new ArrayList<>();
        this.date = date;
        this.totalExpense = totalExpense;
        this.totalRevenue = totalRevenue;
    }

    public Report() {
    }

    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public List<Sale> getSales() {
        return sales;
    }

    public void setSales(List<Sale> sales) {
        this.sales = sales;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getTotalExpense() {
        return totalExpense;
    }

    public void setTotalExpense(double totalExpense) {
        this.totalExpense = totalExpense;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    @Override
    public int getId() {
        return this.reportId;
    }

    @Override
    public String toString() {
        return "Report{" +
                "reportId=" + reportId +
                ", sales=" + sales +
                ", date=" + date +
                ", totalExpense=" + totalExpense +
                ", totalRevenue=" + totalRevenue +
                '}';
    }
}
