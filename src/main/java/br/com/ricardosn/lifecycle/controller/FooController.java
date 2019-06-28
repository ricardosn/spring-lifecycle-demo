package br.com.ricardosn.lifecycle.controller;

import org.springframework.stereotype.Controller;

@Controller
public class FooController {
	
	public String bar() {
		System.out.println("FooController.bar()");
		
		return "bar";
	}
	
}
