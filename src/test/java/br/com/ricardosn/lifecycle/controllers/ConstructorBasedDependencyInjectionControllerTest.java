package br.com.ricardosn.lifecycle.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.ricardosn.services.impl.ConstructorBasedDependencyInjectionService;

public class ConstructorBasedDependencyInjectionControllerTest {
	
	private ConstructorBasedDependencyInjectionController controller;
	
	@Before
	public void setUp() throws Exception {
		this.controller = new ConstructorBasedDependencyInjectionController(new ConstructorBasedDependencyInjectionService());
	}
	
	@Test
	public void testEcho() throws Exception {
		assertEquals(ConstructorBasedDependencyInjectionService.MSG, controller.echo());
	}
	
}
