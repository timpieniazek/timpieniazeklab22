package com.gc.coffeeshop.CoffeeShop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	

	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index", "coffee", "JAVA!");
	}
	
	@RequestMapping("registration")
	public String form() {
		return "registration";
	}
	
	@RequestMapping("f1")
	public ModelAndView formStuff(@RequestParam("fName") String firstName) {
		return new ModelAndView("summary", "special", firstName);
	}
	
	@RequestMapping("/register")
	public ModelAndView register() {
		return new ModelAndView("register", "info", "thanks!");
	}
}
