package com.ad.boot;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ad.model.Bill;
import com.ad.model.HibernateUtil;
import com.ad.model.Products;

public class ApplicationServer {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Bill bill = new Bill();
		
		bill.setBillNumber(1);
		bill.setCgst(4.00);
		bill.setSgst(4.00);
		bill.setTotalPrice(20.00);
				
		List<Products> products = new ArrayList<>();
		Products pr1 = new Products();
		pr1.setAmount(20.00);
		pr1.setProductId(1);
		pr1.setProductName("TestPr");
		pr1.setQuantity(4);
		pr1.setRate(5.00);
		pr1.setBill(bill);
		
		products.add(pr1);
		
		bill.setProducts(products);
		
		 session.save(bill);
		session.save(pr1);
		
		session.getTransaction().commit();
		
	}

}
