package org.example.entity;

public class Invoice {

    private Book book;
    private int quantity;
    private double total;

    public Invoice() {
    }

    public Invoice(Book book, int quantity, double total) {
        this.book = book;
        this.quantity = quantity;
        this.total = total;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
