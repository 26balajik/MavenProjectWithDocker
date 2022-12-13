package com.example.FirstSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	@GetMapping("/display")
	public String getDisplay()
	{
		return "Hellow World";
	}

}
