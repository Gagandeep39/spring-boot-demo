/**
 * Gagandeep
 * 7:11:51 pm
 * 12-Apr-2020
 */
package com.spring.gagan.controller;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {
	
	@GetMapping("/")
	public String helloWorld() {
		return "Hello World " + LocalDate.now();
	}

}
