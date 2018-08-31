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

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private ProductDao productDao;


    @Test
    public void testInvoiceDaoSave() {

        //Given
        Item item1 = new Item(new BigDecimal("3.50"),5, new BigDecimal("10"));
        Item item2 = new Item(new BigDecimal("5.50"),10, new BigDecimal("30"));

        Product product1 = new Product("product1");
        Product product2 = new Product("product2");

        Invoice invoice1 = new Invoice("Invoice number");

        product1.getItems().add(item1);
        product1.getItems().add(item2);
        product2.getItems().add(item1);
        product2.getItems().add(item2);

        item1.setInvoice(invoice1);
        item1.setProduct(product1);
        item2.setInvoice(invoice1);
        item2.setProduct(product2);

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        //When
        productDao.save(product1);
        productDao.save(product2);

        invoiceDao.save(invoice1);

        itemDao.save(item1);
        itemDao.save(item2);
        int id = invoice1.getId();
        //Then
        Assert.assertNotEquals(0,id);

    }
}
