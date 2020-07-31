package suelen;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

// Annotations antes da criação das Annotations Prod e Develop
//@Configuration
//@Profile("prod")

@Prod
public class MyConfiguration {
	
//	Criação de Bean
//	@Bean(name = "applicationName")
//	public String applicationName() {
//		return "Test App";
//	}
	
//	Método padrão que executa sempre que a aplicação inicia
	@Bean
	public CommandLineRunner exec() {
		return args -> {
			System.out.println("Running Prod Config");
		};
	}
}
