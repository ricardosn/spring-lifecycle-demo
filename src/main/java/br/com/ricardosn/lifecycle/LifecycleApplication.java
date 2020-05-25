package br.com.ricardosn.lifecycle;

import br.com.ricardosn.lifecycle.models.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import br.com.ricardosn.lifecycle.controllers.ConstructorBasedDependencyInjectionController;
import br.com.ricardosn.lifecycle.controllers.FooController;
import br.com.ricardosn.lifecycle.controllers.PropertyBasedDependencyInjectionController;
import br.com.ricardosn.lifecycle.controllers.SetterBasedDependencyInjectionController;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"br.com.ricardosn.services", "br.com.ricardosn.lifecycle"})
public class LifecycleApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(LifecycleApplication.class, args);
		FooController foo = ctx.getBean(FooController.class);
		foo.bar();
		
		System.out.println(ctx.getBean(PropertyBasedDependencyInjectionController.class).echo());
		System.out.println(ctx.getBean(SetterBasedDependencyInjectionController.class).echo());
		System.out.println(ctx.getBean(ConstructorBasedDependencyInjectionController.class).echo());

		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource);
	}

}
