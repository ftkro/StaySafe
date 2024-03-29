package com.ent.staySafe;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ent.staySafe.entity.Stay;
import com.ent.staySafe.service.StaySafeService;

@Controller
@RequestMapping("/staySafe")
public class StaySafeController {
	
	
	public StaySafeService staySafeService;
	
	public StaySafeController(StaySafeService theStaySafeService) {
		staySafeService = theStaySafeService;
	}
	
	
	@GetMapping("/home")
	public String start(Model theModel) {
		
		//Retrieve stays from database
		List<Stay> theStays = staySafeService.findAll();
				
				
		//add stay to the spring model
		theModel.addAttribute("stay", theStays);
		
		return "staySafe";
	}
	
	@GetMapping("/checkin-form")
	public String viewCheckIn(Model theModel) {
		
		//model attribute for data binding
		Stay theStay = new Stay(0, null, null, null, null, null, null);
		
		theModel.addAttribute("stay", theStay);
		
		return "checkin-form";
	}
	
	@PostMapping("/save")
	public String saveStay(@ModelAttribute("stay") Stay theStay) {
		
		//register the stay
		staySafeService.save(theStay);
		
		//block duplicate submission for accidental page refresh
		return "redirect:/staySafe/home";
		
	}
}
