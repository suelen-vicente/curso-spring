package suelen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//import suelen.animalExample.Animal;
//import suelen.animalExample.Cat;
//import suelen.animalExample.Dog;

//@SpringBootApplication

// Por padrão, todos as pastas desse pacote já são scaneados pelo SpringBoot
// A propriedade abaixo é utilizada apenas para mapear pacotes externos
//@ComponentScan(basePackages = {"suelen.repository", "suelen.service"})

//@RestController
//public class TestApplication {
//	
////	----***----
////	Usar o nome da aplicação que está configurada no MyConfiguration em forma de Bean
////	----
////	@Autowired
////	@Qualifier("applicationName")
////	private String applicationName;
////	----***----
//	
////	----***----
////	Usar o nome da aplicação que está configurada no application.properties
////	----
//	@Value("${application.name}")
//	private String applicationName;
////	----***----
//	
////	@Dog
//	@Cat
//	private Animal animal;
//	
//	@Bean
//	public CommandLineRunner makeNoise() {
//		return args -> {
//			animal.makeNoise();
//		};
//	}
//	
//	@GetMapping("/hello")
//	public String helloWorld() {
//		return applicationName;
//	}
//	public static void main(String[] args) {
//		SpringApplication.run(TestApplication.class, args);
//	}
//}
