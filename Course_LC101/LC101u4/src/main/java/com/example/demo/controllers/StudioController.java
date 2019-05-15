package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;

/*
Present a checkbox next to each cheese. Recall that a checkbox is an input element of type='checkbox'. 
Look up details on w3schools. For this scenario, you'll want the same name attribute for each checkbox. 
Additionally, it will be possible for users to submit multiple cheeses for deletion at once, so in the 
controller handling form submission, the input parameter should be a collection. For example, if you 
have name='cheese' on each checkbox, you'll want an input parameter ArrayList<String> cheese.

Present a dropdown to allow the user to select which cheese they would like to delete. 
This approach allows for only one item to be deleted at a time. You'll need to use a select element 
for this, which you can read about on w3schools.
*/

@Controller
@RequestMapping("unit4studio")
public class StudioController {

    //create the hashmap that I'll use to store data
	static HashMap<String, String> buildings = new HashMap<>();

    //base page for display of the buildings and navigation
	@RequestMapping(value="", method = RequestMethod.GET)
    public String fourHome(Model model) {

        model.addAttribute("title", "Unit 4 Prep Work");
        model.addAttribute("buildings", buildings);

        return "studio/index";
    }

    //use a form to add a new building to the hashmap
	@RequestMapping(value="add", method = RequestMethod.GET)
        public String fourHomeAdder(Model model) {
            model.addAttribute("title", "Unit 4 Studio, Add Building");

            return "studio/add";
        }

    //process the form input and redirect to the home page
	@RequestMapping(value="add", method = RequestMethod.POST)
    public String fourHomeProcessor(@RequestParam String buildingName,
                                    @RequestParam String buildingType) {
        buildings.put(buildingName, buildingType);

        return "redirect:/unit4studio";
    }

    //display the page where the user can delete multiple entries at a time
	@RequestMapping(value="checkdelete", method = RequestMethod.GET)
    public String fourHomeCheckDelete(Model model) {
        model.addAttribute("buildings", buildings);

        return "studio/checkdelete";
    }

    //process multiple user deletions
	@RequestMapping(value="checkdelete", method = RequestMethod.POST)
    //create method and get the input as an ArrayList
	public String fourHomeCheckDeleter(@RequestParam ArrayList test) {
        //System.out.println(test);   //testing for receipt of the array
		
        //cycle thru the ArrayList received and remove each item from the HashMap within each cycle
		for (int i = 0; i < test.size(); i++) {
            System.out.println(test.get(i));
            //String itemKey = test.get(i);
            buildings.remove(test.get(i));
        }

        return "redirect:/unit4studio";

    }

    //use a drop-down to delete items that have been added to the hashmap
	@RequestMapping(value="listdelete", method = RequestMethod.GET)
    public String fourHomeListDelete(Model model) {
        model.addAttribute("buildings", buildings);

        return "studio/listdelete";
    }

    //delete the item removed via drop-down and redirect
	@RequestMapping(value="listdelete", method = RequestMethod.POST)
    public String fourHomeListDeleter(@RequestParam String deleteBuilding) {
        buildings.remove(deleteBuilding);

        return "redirect:/unit4studio";
    }
}
