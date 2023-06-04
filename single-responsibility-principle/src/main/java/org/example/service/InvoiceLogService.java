package org.example.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.entity.Invoice;

public class InvoiceLogService {

    private static final Logger log = LogManager.getLogger(InvoiceLogService.class);

    public void logInvoice(Invoice invoice) {
        log.info("-----------< Invoice generated >-----------");
        log.info("Book Name: {}", invoice.getBook().getName());
        log.info("Price: {}", invoice.getBook().getPrice());
        log.info("Discount: {}", invoice.getBook().getDiscountRate());
        log.info("Tax: {}", invoice.getBook().getTaxRate());
        log.info("Total Price: {}", invoice.getTotal());
        log.info("-------------------------------------------");
    }
}
