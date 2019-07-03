package br.com.ricardosn.lifecycle.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.ricardosn.lifecycle.services.impl.PropertyBasedDependencyInjectionService;

public class PropertyBasedDependencyInjectionControllerTest {
	
	private PropertyBasedDependencyInjectionController controller;
	
	@Before
	public void setUp() throws Exception {
		this.controller = new PropertyBasedDependencyInjectionController();
		this.controller.dependecyInjectionService = new PropertyBasedDependencyInjectionService();
	}
	
	@Test
	public void testEcho() throws Exception {
		assertEquals(PropertyBasedDependencyInjectionService.MSG, controller.echo());
	}
	
}