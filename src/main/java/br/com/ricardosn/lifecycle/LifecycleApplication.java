package br.com.ricardosn.lifecycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import br.com.ricardosn.lifecycle.controller.FooController;

@SpringBootApplication
public class LifecycleApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(LifecycleApplication.class, args);
		FooController foo = ctx.getBean(FooController.class);
		foo.bar();
	}

}
