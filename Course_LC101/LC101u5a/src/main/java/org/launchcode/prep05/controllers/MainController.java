package org.launchcode.prep05.controllers;

import java.util.ArrayList;

import org.launchcode.prep05.models.StateCapitals;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("")
public class MainController {
	//create an ArrayList to use in lieu of a database connection
	ArrayList<StateCapitals> capitals = new ArrayList<>();
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("title", "Listing of state capitals.");
		model.addAttribute("capitals", capitals);
		
		return "index";
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public String index(@RequestParam String capitalName, @RequestParam String stateName) {
		//get the input from the addition form
		
		//re-direct back to the home page
		return "redirect:";
	}

}