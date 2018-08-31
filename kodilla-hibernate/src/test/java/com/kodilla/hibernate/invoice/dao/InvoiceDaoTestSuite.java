package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    ItemDao itemDao;


    @Test
    public void testInvoiceDaoSave() {
        //Given
        Item item1 = new Item(new Product("product1"),new BigDecimal("3.50"),5, new BigDecimal("10"));
        Item item2 = new Item(new Product("product2"),new BigDecimal("4.50"),10, new BigDecimal("30"));
        Item item3 = new Item(new Product("product3"),new BigDecimal("13.30"),13,new BigDecimal("15"));

        Invoice invoice = new Invoice("Invoice number");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();
        //Then
        Assert.assertNotEquals(0,invoiceId);

        //CleanUp
//        invoiceDao.delete(invoiceId);
    }
}
