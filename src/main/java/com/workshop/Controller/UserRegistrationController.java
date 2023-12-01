package com.workshop.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.workshop.DTO.UserRegistrationDto;
import com.workshop.Entity.User;
import com.workshop.Service.UserDetailServiceImpl;





@Controller
public class UserRegistrationController {
	
	
	private UserDetailServiceImpl service;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	public UserRegistrationController (UserDetailServiceImpl service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	
	@GetMapping("/registration")
	public String showRegistrationForm( ) {
		return "registration";
	}
	
	@ModelAttribute("user")
	public com.workshop.DTO.UserRegistrationDto userregistrationDto () {
		return new com.workshop.DTO.UserRegistrationDto();
	}
	
	@GetMapping("/")
	public String home() {
		return "redirect:/home";
	}
	
	@PostMapping("/register")
	public String registeruser(@ModelAttribute("user") UserRegistrationDto userregistrationDto,RedirectAttributes redirectAttributes) {
		String name = userregistrationDto.getUsername();
		try {
		    User user = service.getByUsername(name);
		    if(user!=null) {
		        redirectAttributes.addFlashAttribute("message", "Username already exists");

		        return "redirect:/registration";
		    }
		    
		    User lastuser = service.getLastUser();
	        String userid = lastuser.getUserid();
	        int numericPart = 0; // Initialize the numeric part to 0 by default

	        if (userid != null && !userid.isEmpty()) {
	            // Extract the numeric part of the userid and increment it
	            try {
	                numericPart = Integer.parseInt(userid.substring(4)); // Assuming "USER" prefix
	                numericPart++; // Increment by one
	            } catch (NumberFormatException e) {
	                // Handle parsing error, if any
	                e.printStackTrace();
	            }
	        }

	        // Create the new userid with the incremented value
	        String newUserId = "USER" + numericPart;
	        userregistrationDto.setUserid(newUserId);
          System.out.println(userregistrationDto);
		    
		    service.save(userregistrationDto);
	        redirectAttributes.addFlashAttribute("register", "Registered Succesfully");
//changed register to login 
		    return "redirect:/login";
		} catch (Exception e) {
	        redirectAttributes.addFlashAttribute("message", "Username already exists");

		    return "redirect:/registration";}
	

	}
	

}
