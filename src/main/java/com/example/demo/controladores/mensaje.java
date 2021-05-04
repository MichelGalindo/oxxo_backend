package com.example.demo.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/devops")
public class mensaje {
	
	@GetMapping("/hola")
	public String mostrarhola() {
		return "Hola Devops";
	}

}
