package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SenderController {

	@RequestMapping("/")
	public String index() {
		return "Message from Sender Microservice! - v2.0";
	}

}
