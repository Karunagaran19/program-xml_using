package org.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {

	public static void main(String[] args) throws IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		double basicSalary;
		float dearnessAllowance;
		float houseRentAllowance;
		float providentFund;
		float travelAllowance;
		System.out.println("Enter id:");
		int id = Integer.valueOf(bf.readLine());
		System.out.println("Enter Name:");
		String name = bf.readLine();
		System.out.println("Enter Email:");
		String email = bf.readLine();
		System.out.println("Enter Phone:");
		long phone = Long.valueOf(bf.readLine());
		Employee employee = new Employee(id, name, email, phone);
		System.out.println("Employee Id: " + employee.getId());
		System.out.println("Employee Name: " + employee.getName());
		System.out.println("Employee Email: " + employee.getEmail());
		System.out.println("Employee Phone: " + employee.getPhone());
		session.save(employee);
		session.getTransaction().commit();
		
		session.close();
	}

}