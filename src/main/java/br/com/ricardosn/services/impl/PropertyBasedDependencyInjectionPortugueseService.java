package br.com.ricardosn.services.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import br.com.ricardosn.services.DependencyInjectionService;

@Service
@Primary
@Profile("pt")
public class PropertyBasedDependencyInjectionPortugueseService implements DependencyInjectionService {

	public static final String MSG = "Serviço de Injeção de dependência via propriedade - Profile PT";

	@Override
	public String echo() {
		return MSG;
	}

}
