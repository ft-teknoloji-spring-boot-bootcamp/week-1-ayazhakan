package org.onlineshopping.models;

import java.time.LocalDate;

import java.time.LocalDate;

public class Bill {

    private LocalDate billDate;
    private double amount;
    private boolean paid;

    public Bill(LocalDate billDate, double amount, boolean paid) {
        this.billDate = billDate;
        this.amount = amount;
        this.paid = paid;
    }


    public LocalDate getBillDate() {
        return billDate;
    }

    public void setBillDate(LocalDate invoiceDate) {
        this.billDate = invoiceDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    @Override
    public String toString() {
        return "Bill{" +
                ", billDate=" + billDate +
                ", amount=" + amount +
                ", paid=" + paid +
                '}';
    }
}
