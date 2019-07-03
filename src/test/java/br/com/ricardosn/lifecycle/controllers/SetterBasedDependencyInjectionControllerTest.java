package br.com.ricardosn.lifecycle.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.ricardosn.lifecycle.services.impl.SetterBasedDependencyInjectionService;

public class SetterBasedDependencyInjectionControllerTest {
	
	private SetterBasedDependencyInjectionController controller;
	
	@Before
	public void setUp() throws Exception {
		this.controller = new SetterBasedDependencyInjectionController();
		this.controller.setDependencyInjectionService(new SetterBasedDependencyInjectionService());
	}
	
	@Test
	public void testEcho() throws Exception {
		assertEquals(SetterBasedDependencyInjectionService.MSG, controller.echo());
	}
}
