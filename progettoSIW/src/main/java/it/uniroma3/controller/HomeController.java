package it.uniroma3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	

	@RequestMapping("/index")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/registra")
	public String registra() {
		return "registrazioneForm";
	}
}
