package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlaygroundController {
	
	@RequestMapping(method = RequestMethod.GET, path = "/howisit")
	public String getMessage() {
		return "Sucess";
	}

}
