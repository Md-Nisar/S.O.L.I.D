package org.example;

import org.example.entity.Book;
import org.example.service.InvoiceFileService;
import org.example.service.InvoiceLogService;
import org.example.service.InvoicePersistenceService;
import org.example.service.InvoiceService;
import org.example.service.impl.InvoiceServiceImpl;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("Clean Code", "Robert C. Marting", 1000, 10, 7);
        InvoiceService invoiceService = new InvoiceServiceImpl(new InvoiceLogService(), new InvoiceFileService(), new InvoicePersistenceService());
        invoiceService.generateInvoice(book);
    }
}