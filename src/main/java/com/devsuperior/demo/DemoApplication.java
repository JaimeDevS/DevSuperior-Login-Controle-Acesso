package com.devsuperior.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	/*
	@Autowired
	private PasswordEncoder passwordEncoder;
	*/
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	/*
	@Override
	public void run(String... args) throws Exception {
		System.out.println("ENCODE = " + passwordEncoder.encode("123456"));	
		
		boolean result = passwordEncoder.matches("123456", "$2a$10$bBuwcVeyuN04M2u5SKN3Z.As7rxVo5GpfV3LV2bHE4FeeZ7Z2LJee");
	
		System.out.println("RESULTADO = " + result);
	}
	//$2a$10$bBuwcVeyuN04M2u5SKN3Z.As7rxVo5GpfV3LV2bHE4FeeZ7Z2LJee
	*/

}
