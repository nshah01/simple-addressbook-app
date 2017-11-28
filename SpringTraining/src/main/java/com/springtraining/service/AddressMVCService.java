package com.springtraining.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.jni.Address;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.springtraining.VO.AddressVO;

@Service
public class AddressMVCService {
	
	@Autowired
	JdbcTemplate jdbctemplate;
	
	
	

	
	public List search(AddressVO add){
		
		String sql = "Select * from addressbook where zipcode = '"+add.getZipcode()+"'";
		
		return this.jdbctemplate.queryForList(sql);
	}
	
	public void insert(AddressVO address) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
	
		try {
		
		Transaction tr = session.beginTransaction();
		session.save(address);
		tr.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public List getAddressLine1(AddressVO add) {
		List list = new ArrayList<>();
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
	try {
		Transaction tr = session.beginTransaction();
		String sql = "Select line1 from addressbook order by RAND()LIMIT 1";
		Query query = session.createSQLQuery(sql);
		list = query.list();
		String line1 = list.toString();
		System.out.println(">>>>>>>>>>>>>>>>>"+line1);
		add.setLine1(line1);
		tr.commit();
	}catch(Exception e) {
		e.printStackTrace();
	}
	return list;
	}
	
	public List getAddressLine2(AddressVO add) {
		List list = new ArrayList<>();
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
	try {
		Transaction tr = session.beginTransaction();
		String sql = "Select line2 from addressbook order by RAND()LIMIT 1";
		Query query = session.createSQLQuery(sql);
		list = query.list();
		String line2 = list.toString();
		System.out.println(">>>>>>>>>>>>>>>>>"+line2);
		add.setLine2(line2);
		tr.commit();
	}catch(Exception e) {
		e.printStackTrace();
	}
	return list;
	}
	
	public List getZipcode(AddressVO add) {
		List<Integer> list = new ArrayList<Integer>();
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
	try {
		Transaction tr = session.beginTransaction();
		String sql = "Select zipcode from addressbook order by RAND()LIMIT 1";
		Query query = session.createSQLQuery(sql);
		list = query.list();
		int zipcode = list.get(0);
		System.out.println(">>>>>>>>>>>>>>>>>"+zipcode);
		add.setZipcode(zipcode);
		tr.commit();
	}catch(Exception e) {
		e.printStackTrace();
	}
	return list;
	}
	
	public List getfirst(AddressVO add) {
		List<Integer> list = new ArrayList<Integer>();
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
	try {
		Transaction tr = session.beginTransaction();
		String sql = "Select firstname from addressbook order by RAND()LIMIT 1";
		Query query = session.createSQLQuery(sql);
		list = query.list();
		String firstname = list.toString();
		System.out.println(">>>>>>>>>>>>>>>>>"+firstname);
		add.setFirstname(firstname);
		tr.commit();
	}catch(Exception e) {
		e.printStackTrace();
	}
	return list;
	}
	
	public List getlast(AddressVO add) {
		List<Integer> list = new ArrayList<Integer>();
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
	try {
		Transaction tr = session.beginTransaction();
		String sql = "Select lastname from addressbook order by RAND()LIMIT 1";
		Query query = session.createSQLQuery(sql);
		list = query.list();
		String lastname = list.toString();
		System.out.println(">>>>>>>>>>>>>>>>>"+lastname);
		add.setLastname(lastname);
		tr.commit();
	}catch(Exception e) {
		e.printStackTrace();
	}
	return list;
	}
	
	/*public List getPhonenumber(AddressVO add) {
		List<Integer> list = new ArrayList<Integer>();
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
	try {
		Transaction tr = session.beginTransaction();
		String sql = "insert into phone.address values(floor(random * 1000000000)";
		Query query = session.createSQLQuery(sql);
		list = query.list();
		String lastname = list.toString();
		System.out.println(">>>>>>>>>>>>>>>>>"+lastname);
		add.setFirstname(lastname);
		tr.commit();
	}catch(Exception e) {
		e.printStackTrace();
	}
	return list;
	}*/
	
}
