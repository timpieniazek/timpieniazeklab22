package com.gc.coffeeshop.CoffeeShop.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.gc.coffeeshop.CoffeeShop.model.User;
import com.gc.coffeeshop.CoffeeShop.model.Item;


@Repository
public class UserDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<User> findAllUsers() {
		String sql = "SELECT * FROM USERS";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
	}
	
	public List<Item> findAllItems() {
		String sql = "SELECT * FROM ITEMS";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Item.class));
	}
	
	public void addUser(User user) {
		String sql = "INSERT INTO USERS (FIRSTNAME, LASTNAME, EMAIL, PHONENO, PASSWORD) VALUES (?, ?, ?, ?, ?)";		
		jdbcTemplate.update(sql, user.getFirstName(), user.getLastName(), user.getEmail(), user.getPhoneNumber(), user.getPassword());
	}

}
