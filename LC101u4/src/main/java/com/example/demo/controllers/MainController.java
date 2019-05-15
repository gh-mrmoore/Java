package com.example.demo.controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("")
public class MainController {
	
	//Create a broader ArrayList for use in the form example
	static ArrayList<String> formCheese = new ArrayList<>();
	
	/*
	//Quick stub to make sure the project works
	@RequestMapping(value="")
	@ResponseBody
	public String index() {return "Hello World!";}
	*/
	
	//Use the index.html template to render the home page
	@RequestMapping(value="")
	public String index(Model model) {
		model.addAttribute("title", "LC101 Java Track | Unit 4");
		return "main/index";
	}
	
	@RequestMapping(value="cheeses")
	public String cheeseList(Model model) {
		//Local variable only
		ArrayList<String> cheeses = new ArrayList<String>();
		cheeses.add("Cheddar");
		cheeses.add("Parmesan");
		cheeses.add("Mozarella");
		cheeses.add("Colby Jack");

		model.addAttribute("title", "ArrayList of Cheeses");
		model.addAttribute("cheeses", cheeses);

		return "main/cheeses";
	}
	
	@RequestMapping(value="addcheese", method = RequestMethod.GET)
	public String addCheese(Model model) {
		model.addAttribute("title", "Add New Cheese via Form");
		model.addAttribute("formCheese", formCheese);
		
		return "main/add";
	}
	
	@RequestMapping(value="addcheese", method = RequestMethod.POST)
	//lower-level way to get information using HttpServletRequest from the form
	//Doesn't integrate Spring, relies on Java
	/*public String processCheese(HttpServletRequest request) {
		//model.addAttribute("title", "Cheese added");
		String cheeseName = request.getParameter("cheeseName");*/
	
	//Using Spring functionality...
	public String processCheese(@RequestParam String cheeseName) {
		formCheese.add(cheeseName);
		
		//redirect relative to any RequestMapping we might have...
		return "redirect:addcheese";
	}
}