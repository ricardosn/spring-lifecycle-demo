package br.com.ricardosn.lifecycle.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.ricardosn.services.DependencyInjectionService;

@Controller
public class PropertyBasedDependencyInjectionController {
	
	@Autowired
	public DependencyInjectionService dependecyInjectionService;
	
	public String echo() {
		return dependecyInjectionService.echo();
	}
	
}
