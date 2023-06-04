package org.example.service.impl;

import org.example.entity.Book;
import org.example.entity.Invoice;
import org.example.service.InvoiceFileService;
import org.example.service.InvoiceLogService;
import org.example.service.InvoicePersistenceService;
import org.example.service.InvoiceService;
import org.example.util.PriceUtil;

/**
 * 1. SRP: A class should have one & only one reason to change, which means a class(or function)
 * must have single and well-defined purpose.
 */
public class InvoiceServiceImpl implements InvoiceService {

    private final InvoiceLogService logService;

    private final InvoiceFileService fileService;

    private final InvoicePersistenceService persistenceService;

    public InvoiceServiceImpl(InvoiceLogService logService, InvoiceFileService fileService, InvoicePersistenceService persistenceService) {
        this.logService = logService;
        this.fileService = fileService;
        this.persistenceService = persistenceService;
    }

    @Override
    public void generateInvoice(Book book) {
        double totalPrice = PriceUtil.calculateTotalPrice(book);
        Invoice invoice = new Invoice(book, 1, totalPrice);
        this.logService.logInvoice(invoice);
        this.persistenceService.saveInvoice(invoice);
        this.fileService.downloadInvoice(invoice);
    }

}
