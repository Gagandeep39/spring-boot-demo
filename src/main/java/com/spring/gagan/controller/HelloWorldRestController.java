/**
 * Gagandeep
 * 7:11:51 pm
 * 12-Apr-2020
 */
package com.spring.gagan.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * URL: http://localhost:4444/demoapp/
 */
@RestController
public class HelloWorldRestController {
	
	/**
	 * Accessing property value and storing it in varile
	 */
	@Value("${student.name}")
	private String studentName;
	
	@Value("${student.age}")
	private int studentAge;
	
	/**
	 * URL: http://localhost:4444/demoapp/
	 */
	@GetMapping("/")
	public String helloWorld() {
		return "Hello World " + LocalDate.now();
	}
	
	/**
	 * This method was only created to test if spring-devtools jupdate project on making an ychanges
	 * Result: It works, it gets evertime i press savep
	 * URL: http://localhost:4444/demoapp/gagan
	 * @return String
	 */
	@GetMapping("/gagan")
	public String howMyName() {
		return "<h1>Hiiii Gagan~</h1>";
	}
	
	/**
	 * Testing property value using @Value
	 * URL: http://localhost:4444/demoapp/property
	 */
	@GetMapping("/property")
	public String showProperty() {
		return "Student Name: " + studentName + ", Age: " + studentAge;
	}

}
