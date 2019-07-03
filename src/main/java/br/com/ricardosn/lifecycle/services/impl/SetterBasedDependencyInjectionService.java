package br.com.ricardosn.lifecycle.services.impl;

import org.springframework.stereotype.Service;

import br.com.ricardosn.lifecycle.services.DependencyInjectionService;

@Service
public class SetterBasedDependencyInjectionService implements DependencyInjectionService {

	public static final String MSG = "Setter based dependency injection service";

	@Override
	public String echo() {
		return MSG;
	}

}
