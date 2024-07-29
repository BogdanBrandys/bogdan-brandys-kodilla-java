package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product product = new Product("Computer");
        Item item = new Item(product, new BigDecimal(1200), 2, new BigDecimal(2400));
        Product product2 = new Product("Tablet");
        Item item2 = new Item(product2, new BigDecimal(800), 1, new BigDecimal(800));
        Invoice invoice = new Invoice("FV 1/07/2024");
        invoice.items.add(item);
        invoice.items.add(item2);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        assertEquals(2, invoice.getItems().size());

        //CleanUp
        invoiceDao.deleteById(invoiceId);
    }
}
