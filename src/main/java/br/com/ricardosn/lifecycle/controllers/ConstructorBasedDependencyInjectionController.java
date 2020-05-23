package br.com.ricardosn.lifecycle.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import br.com.ricardosn.services.DependencyInjectionService;

@Controller
public class ConstructorBasedDependencyInjectionController {
	
	private DependencyInjectionService dependecyInjectionService;
	
	@Autowired
	public ConstructorBasedDependencyInjectionController(
			@Qualifier("constructorBasedDependencyInjectionService") DependencyInjectionService dependecyInjectionService) {
		this.dependecyInjectionService = dependecyInjectionService;
	}
	
	public String echo() {
		return dependecyInjectionService.echo();
	}
	
}
