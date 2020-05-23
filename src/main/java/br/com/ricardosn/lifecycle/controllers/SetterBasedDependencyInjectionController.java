package br.com.ricardosn.lifecycle.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import br.com.ricardosn.services.DependencyInjectionService;

@Controller
public class SetterBasedDependencyInjectionController {
	
	private DependencyInjectionService dependecyInjectionService;
	
	public String echo() {
		return dependecyInjectionService.echo();
	}
	
	@Autowired
	public void setDependencyInjectionService(
			@Qualifier("setterBasedDependencyInjectionService") DependencyInjectionService dependecyInjectionService) {
		this.dependecyInjectionService = dependecyInjectionService;
	}
	
}
