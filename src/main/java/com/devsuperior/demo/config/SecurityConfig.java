package com.devsuperior.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		//essa opção está sendo desabilitada por que a API Rest não guarda estado em sessão
		http.csrf(csrf -> csrf.disable()); 
		//essa opção está sendo configurada para habilitar a permissão para os endpoints
		http.authorizeHttpRequests(auth -> auth.anyRequest().permitAll());
		return http.build();
	}
	
}
