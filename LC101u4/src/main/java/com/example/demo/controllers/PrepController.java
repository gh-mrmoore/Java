package com.example.demo.controllers;

import java.util.HashMap;

/*
Add a description field to the application. This will involve:
DONE - Modifying the static cheeses list to be a HashMap* object with key/value pairs
that correspond to the name/description of the cheese.

DONE - Adding a new form input field in cheese/add.html to allow for submission of the description.
DONE - Modifying the processAddCheeseForm method to insert the name and description of the new cheese into the cheeses HashMap.
DONE - Displaying the description field in the cheese/index.html view template.
*/

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("prep")
public class PrepController {
	//create a hashmap for use in the web app
	//using animals instead of cheese
	static HashMap<String, String> animals = new HashMap<>();
	
	@RequestMapping(value="")
	public String prepIndex(Model model) {
		model.addAttribute("title", "Unit 4 Prep Exercises");
		
		return "prep/index";
	}
	
	//display any animals currently stored in the hashmap and display the form
	@RequestMapping(value="animals", method = RequestMethod.GET)
	public String animalFormDisplay(Model model) {
		model.addAttribute("title", "List of Animals and Form to Add New Animals");
		model.addAttribute("animals", animals);
		
		return "prep/animals";
	}
	
	//add the user input to the hashmap and then redirect to the same page for form and list display
	@RequestMapping(value="animals", method = RequestMethod.POST)
	public String animalFormProcessing(@RequestParam String animalSize, @RequestParam String animalName) {
		animals.put(animalSize, animalName);
		
		//redirect the form to the main animals page after processing
		return "redirect:/prep/animals";
	}

}
