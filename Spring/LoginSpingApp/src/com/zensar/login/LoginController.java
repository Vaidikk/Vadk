package com.zensar.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
	
	@PostMapping("/valid")
	public String validate(User user, ModelMap map) {
		if(user.getUsername().equals("tiny") && user.getPassword().equals("chiggi")) {
			map.addAttribute("user", user);
			return "success";
		}
		else {
			map.addAttribute("loginerror", "Invalid Credentials");
			return "login";
		}
		
	}
}
