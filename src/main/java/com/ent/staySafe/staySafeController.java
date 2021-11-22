package com.ent.staySafe;

import com.ent.staySafe.entity.StaySafe;
import com.ent.staySafe.service.StaySafeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/StaySafe")
public class staySafeController {

	public StaySafeService staySafeService;

	@Autowired
	public staySafeController (StaySafeService specificStaySafeService) {staySafeService = specificStaySafeService;}



	@RequestMapping("/tenants")
	public String listTenants(Model specificModel){
		List<StaySafe> specificStaySafe = staySafeService.findAll();

		specificModel.addAttribute("tenants",specificStaySafe);
		return "tenants/list-tenants";

	}
}
