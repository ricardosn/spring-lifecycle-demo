package br.com.ricardosn.lifecycle.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.ricardosn.services.impl.PropertyBasedDependencyInjectionEnglishService;

public class PropertyBasedDependencyInjectionControllerTest {
	
	private PropertyBasedDependencyInjectionController controller;
	
	@Before
	public void setUp() throws Exception {
		this.controller = new PropertyBasedDependencyInjectionController();
		this.controller.dependecyInjectionService = new PropertyBasedDependencyInjectionEnglishService();
	}
	
	@Test
	public void testEcho() throws Exception {
		assertEquals(PropertyBasedDependencyInjectionEnglishService.MSG, controller.echo());
	}
	
}
