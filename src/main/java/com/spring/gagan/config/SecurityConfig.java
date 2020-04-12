/**
 * Gagandeep
 * 10:30:38 pm
 * 12-Apr-2020
 */
package com.spring.gagan.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * TO configure security
 *
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	/**
	 * TO enable role based security
	 * NOTE: Enable formLogin() when role based authentication is on (else user will get 403 error or unauthorized access )
	 * Login page is dilayed when role based pages are accessed and no user is logged in
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/actuator/**").hasRole("ADMIN")
		.and()
		.formLogin().permitAll();
	}

}
