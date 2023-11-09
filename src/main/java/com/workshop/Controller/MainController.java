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
	
	@GetMapping("/error")
	public String error() {
		return "error";
	}
	 
	
	@GetMapping("/Mumbai")
	public String mumbai() {
		return "Mumbai";
	}
	@GetMapping("/Panchagani")
	public String Panchagani() {
		return "Panchagani";
	}
	 
	@GetMapping("/Nashik")
	public String nashik() {
		return "Nashik";
	}
	 
	 
		@GetMapping("/Satara")
		public String satara() {
			return "Satara";
		}
		 
		@GetMapping("/Kolhapur")
		public String kolhapur() {
			return "Kolhapur";
		}
		
		 
		@GetMapping("/Shirdi")
		public String shirdi() {
			return "Shirdi";
		}
		
		 
		@GetMapping("/Ahmednagar")
		public String ahmednagar() {
			return "Ahmednagar";
		}
		
		 
		@GetMapping("/Sangamner")
		public String sangamner() {
			return "Sangamner";
		}
		
		 
		@GetMapping("/Ratnagiri")
		public String ratnagiri() {
			return "Ratnagiri";
		}
		
		 
		@GetMapping("/Jalana")
		public String jalana() {
			return "Jalana";
		}
		
		@GetMapping("/Lonavala")
		public String lonavala() {
			return "Lonavala";
		}
		@GetMapping("/Trimbkeshwar")
		public String Trimbkeshwar() {
			return "Trimbkeshwar";
		}
		@GetMapping("/Lgatpuri")
		public String Lgatpuri() {
			return " Lgatpuri";
		}
		@GetMapping("/Alibag")
		public String Alibag() {
			return "Alibag";
		}
		@GetMapping("/Dapoli")
		public String Dapoli() {
			return "Dapoli";
		}
		@GetMapping("/Mahabaleshwar")
		public String Mahabaleshwar() {
			return "Mahabaleshwar";
		}
		@GetMapping("/Une")
		public String Une() {
			return "Une";
		}
		
		@GetMapping("/Bhimashankar")
		public String bhimashankar() {
			return "Bhimashankar";
		}
	
		
		@GetMapping ("/Corporate")
		public String  Corporate() {
			return "Corporate";
		}
		
		@GetMapping ("/Corporate1")
		public String  Mumbai1() {
			return "Corporate1";
		}
		@GetMapping ("/Corporate2")
		public String  Bangalore1() {
			return "Corporate2";
		}
		
		@GetMapping ("/Corporate3")
		public String  Pune1() {
			return "Corporate3";
		}
		
		@GetMapping ("/Telangana")
		public String  Telangana1() {
			return "Telangana";
		}
		
		@GetMapping ("/Corporate5")
		public String  Chennai1() {
			return "Corporate5";
		}
		
		@GetMapping ("/Corporate6")
		public String  Indor1() {
			return "Corporate6";
		}
		
		@GetMapping ("/Corporate7")
		public String  Surat1() {
			return "Corporate7";
		}
		
		@GetMapping ("/Airport")
		public String  Delhi2() {
			return "Airport";
		}
		
		@GetMapping ("/Airport1")
		public String  Mumbai2() {
			return "Airport1";
		}
		
		@GetMapping ("/Airport2")
		public String  Bangalore2() {
			return "Airport2";
		}
		
		@GetMapping ("/Airport3")
		public String  Pune2() {
			return "Airport3";
		}
		
		@GetMapping ("/Airport4")
		public String  Hyderabad2() {
			return "Airport4";
		}
		
		
		@GetMapping ("/Airport5")
		public String Chennai2() {
			return "Airport5";
		}
		
		
		@GetMapping ("/Airport6")
		public String  Indor2() {
			return "Airport6";
		}
		
		@GetMapping ("/Airport7")
		public String  Surat2() {
			return "Airport7";
		}

		@GetMapping ("/Bangaloer")
		public String  Bangaloer() {
			return "Bangaloer";
		}
		@GetMapping ("/Goa")
		public String  Goa() {
			return "Goa";
		}
		@GetMapping ("/Delhi")
		public String  Delhi() {
			return "Delhi";
		}
		@GetMapping ("/Surat")
		public String  Surat() {
			return "Surat";
		}
		
		@GetMapping ("/Indor")
		public String  Indor() {
			return "Indor";
		}
		@GetMapping ("/Pune")
		public String  Pune() {
			return "pune";
		}
	 
	
}
