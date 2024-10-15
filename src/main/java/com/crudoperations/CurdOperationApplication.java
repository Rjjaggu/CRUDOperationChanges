package com.crudoperations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CurdOperationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurdOperationApplication.class, args);
		
        System.out.println("CURD for Category and Product Operation Running..");	
	}

}
