package br.com.ricardosn.services.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import br.com.ricardosn.services.DependencyInjectionService;

@Service
@Primary
@Profile({"en", "default"})
public class PropertyBasedDependencyInjectionEnglishService implements DependencyInjectionService {

	public static final String MSG = "Property based dependency injection service - Profile EN";

	@Override
	public String echo() {
		return MSG;
	}

}
