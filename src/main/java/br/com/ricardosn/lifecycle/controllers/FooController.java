package br.com.ricardosn.lifecycle.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class FooController {
	
	public String bar() {
		System.out.println("FooController.bar()");
		
		return "bar";
	}
	
}
