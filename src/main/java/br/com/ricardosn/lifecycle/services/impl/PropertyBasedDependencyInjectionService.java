package br.com.ricardosn.lifecycle.services.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import br.com.ricardosn.lifecycle.services.DependencyInjectionService;

@Service
@Primary
public class PropertyBasedDependencyInjectionService implements DependencyInjectionService {

	public static final String MSG = "Property based dependency injection service";

	@Override
	public String echo() {
		return MSG;
	}

}
