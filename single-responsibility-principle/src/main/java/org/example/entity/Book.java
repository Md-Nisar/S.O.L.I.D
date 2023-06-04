package org.example.entity;

public class Book {

    private String name;
    private String author;
    private double price;
    private double discountRate;
    private double taxRate;

    public Book() {
    }


    public Book(String name, String author, double price, double discountRate, double taxRate) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.discountRate = discountRate;
        this.taxRate = taxRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }
}
