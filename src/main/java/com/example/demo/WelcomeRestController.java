package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class WelcomeRestController {

	
	
	@Value("${msg: message is not coming form config server}")
	private String msg;
	
	@GetMapping("/")
	public String getMessage() {
		return msg;
	}
	
	
}
