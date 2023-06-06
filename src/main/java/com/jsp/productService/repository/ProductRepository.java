package com.jsp.productService.repository;

import java.util.Collections;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.jsp.productService.entity.Product;

@Repository
public class ProductRepository {
	private SessionFactory sessionFactory;
	
	public List<Product> findAllProducts() {
		try {
			String hqlQuery="from Product";
			Session session=sessionFactory.openSession();
			Query query = session.createQuery(hqlQuery);
			return query.getResultList();
		} catch (Exception e) {
			// TODO: handle exception 
		}
		return Collections.EMPTY_LIST; 
	}

	
	public void createProduct(Product product) {
		try {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(product);
			transaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
