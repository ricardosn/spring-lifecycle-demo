package br.com.ricardosn.lifecycle.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import br.com.ricardosn.lifecycle.services.DependencyInjectionService;

@Controller
public class PropertyBasedDependencyInjectionController {
	
	@Autowired
	@Qualifier("propertyBasedDependencyInjectionService")
	public DependencyInjectionService dependecyInjectionService;
	
	public String echo() {
		return dependecyInjectionService.echo();
	}
	
}
