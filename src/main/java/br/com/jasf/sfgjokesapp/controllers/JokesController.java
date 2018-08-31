package br.com.jasf.sfgjokesapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.jasf.sfgjokesapp.services.JokesService;

@Controller
public class JokesController {

	private JokesService jokesService;

	public JokesController(JokesService jokesService) {
		this.jokesService = jokesService;
	}

	@RequestMapping({ "/", "" })
	public String getJoke(Model model) {
		model.addAttribute("joke", jokesService.getJoke());
		return "chucknorris";
	}

}
