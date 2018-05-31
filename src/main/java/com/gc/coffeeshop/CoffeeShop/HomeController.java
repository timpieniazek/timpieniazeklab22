package com.gc.coffeeshop.CoffeeShop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gc.coffeeshop.CoffeeShop.dao.UserDAO;
import com.gc.coffeeshop.CoffeeShop.model.Item;
import com.gc.coffeeshop.CoffeeShop.model.User;

@Controller
public class HomeController {
	
	@Autowired
	private UserDAO userDAO;

	@RequestMapping("/")
	public ModelAndView index() {
		List<Item> items = userDAO.findAllItems();
		return new ModelAndView("index", "items", items);
	}
	
	@RequestMapping("registration")
	public String form() {
		return "registration";
	}
	
	@RequestMapping("f1")
	public ModelAndView formStuff(User user) {
		userDAO.addUser(user);
		return new ModelAndView("summary", "special", user);
	}
	
	@RequestMapping("/register")
	public ModelAndView register() {
		return new ModelAndView("register", "info", "thanks!");
	}
}
