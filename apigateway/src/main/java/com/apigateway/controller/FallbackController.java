package com.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
	
	@GetMapping("/userServiceFallback")
	public String userServiceFallback() {
		return "This user service down for this time";
		
	}
	
	@GetMapping("/contactServiceFallback")
	public String contactServiceFallback() {
		return "This contact service down for this time";
		
	}

}
