package com.workshop.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {
	
//	@GetMapping("/home")
//	public String showHome() {
//		return "home";
//	}

	
	 @GetMapping("/user/dashboard")
	    public String patientDashboard() {
	        // TODO: Implement logic to display patient dashboard
	        return "user";
	    }
	 
	 
	 @GetMapping("/contact")
	 public String contact() {
		 return "contact1";
	 }
	 
	 @GetMapping("/about")
	 public String about() {
		 return "about";
	 }
	@GetMapping("/services")
	public String services() {
		return "services";
	}
	@GetMapping("/pune")
	public String pune() {
		return "pune";
	}
	 
	 
	
}
