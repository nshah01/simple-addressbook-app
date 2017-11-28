package com.springtraining.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.springtraining.VO.AddressVO;

@Service
public class AddressService {
	
	@Autowired
	private JdbcTemplate jdbcTemplate; 
	

	public List searchByZipcode(int zipcode){	
		System.out.println("in method");
		System.out.println((List) this.jdbcTemplate.queryForList("Select * from addressbook where zipcode = ?",new Object[] {zipcode}));
		return (List) this.jdbcTemplate.queryForList("Select * from addressbook where zipcode = ?",new Object[] {zipcode});
	}
}
