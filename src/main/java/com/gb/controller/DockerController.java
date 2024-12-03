package com.gb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class DockerController {
	
	@GetMapping("/demo")
	public String dockerDemo() {
		return "Dockerizing Spring Boot App";
	}

}
