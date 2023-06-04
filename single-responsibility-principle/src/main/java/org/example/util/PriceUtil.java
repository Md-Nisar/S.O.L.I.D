package org.example.util;

import org.example.entity.Book;

public interface PriceUtil {

    static double calculateTotalPrice(Book book) {
        double discountedPrice = book.getPrice() - (book.getPrice() * book.getDiscountRate() / 100);
        double taxableAmount = book.getPrice() * book.getTaxRate() / 100;
        return discountedPrice + taxableAmount;
    }
}
