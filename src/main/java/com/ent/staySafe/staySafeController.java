package com.ent.staySafe;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ent.staySafe.entity.Stay;

@Controller
@RequestMapping("/staySafe")
public class staySafeController {
	@GetMapping("/home")
	public String start() {
		
		return "staySafe";
	}
	
	@GetMapping("/checkin-form")
	public String viewCheckIn(Model theModel) {
		
		//model attribute for data binding
		Stay theStay = new Stay(0, null, null, null, null, null);
		
		theModel.addAttribute("stay", theStay);
		
		return "checkin-form";
	}
}
