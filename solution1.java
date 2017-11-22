package org.isbn.bk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {

	public static void main(String[] args) throws IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		/*
		 * double basicSalary; float dearnessAllowance; float
		 * houseRentAllowance; float providentFund; float travelAllowance;
		 */
		int id;
		String name;
		String publisher;
		String author;
		double price;

		// ///published;
		String isbn;
		System.out.println("Enter id:");
		id = Integer.valueOf(bf.readLine());
		System.out.println("Enter Name:");
		name = bf.readLine();
		System.out.println("Enter Publisher Name:");
		publisher = bf.readLine();
		System.out.println("Enter author name:");
		author = bf.readLine();
		System.out.println("Enter Price:");
		price = Double.valueOf(bf.readLine());
		System.out.println("Enter Published Date:");
		Date published = new Date(bf.readLine());
		System.out.println("Enter ISBN no:");
		isbn = bf.readLine();
		Book book = new Book(id,name,publisher,author,price,published,isbn);
		System.out.println("Book Id: " + book.getId());
		System.out.println("Book Name: " + book.getName());
		System.out.println("Publisher Name: " + book.getPublisher());
		System.out.println("author Name: " + book.getAuthor());
		System.out.println("Book price: " + book.getPrice());
		System.out.println("book published: " + book.getPublished());
		System.out.println("ISBN no: " + book.getIsbn());
		session.save(book);
		session.getTransaction().commit();

		session.close();
	}

}