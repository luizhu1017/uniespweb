package br.edu.uniesp.api;

import br.edu.uniesp.api.model.Usuario;
import br.edu.uniesp.api.repository.UsuarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	@Bean
	CommandLineRunner init(UsuarioRepository userRepository) {
		return args -> {
			Stream.of("Fuji", "Marcelo", "Ana", "Lobão", "Jaspion").forEach(name -> {
				Usuario user = new Usuario();
				user.setNome(name);
				user.setEmail(name.toLowerCase() + "@unipes.edu.br");
				userRepository.save(user);
			});
			// userRepository.findAll().forEach(System.out::println);
		};
	}

}
