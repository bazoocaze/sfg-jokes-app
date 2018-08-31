package br.com.jasf.sfgjokesapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

	@RequestMapping(value = { "/", ""})
	public String getRandomQuote(Model model)
	{		
		return "chucknorris";
	}
}
