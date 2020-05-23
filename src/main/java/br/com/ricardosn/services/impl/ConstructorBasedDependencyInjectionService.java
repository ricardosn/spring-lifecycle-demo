package br.com.ricardosn.services.impl;

import org.springframework.stereotype.Service;

import br.com.ricardosn.services.DependencyInjectionService;

@Service
public class ConstructorBasedDependencyInjectionService implements DependencyInjectionService {

	public static final String MSG = "Constructor based dependency injection service";

	@Override
	public String echo() {
		return MSG;
	}

}
