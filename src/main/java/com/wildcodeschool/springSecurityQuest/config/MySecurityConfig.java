package com.wildcodeschool.springSecurityQuest.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	    http
	        .authorizeRequests()
	        .antMatchers("/").permitAll()
	        .antMatchers("/avengers/assemble").hasRole("AVENGER")
	        .antMatchers("/secret-bases").hasRole("DIRECTOR")
	        .and()
	        .formLogin()
	        .and()
	        .httpBasic();
	}

	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	
		PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
		auth.inMemoryAuthentication()
			.withUser("SteveGuy")
			.password(encoder.encode("123"))
			.roles("")
		.and()
			.withUser("TonyStark")
			.password(encoder.encode("123"))
			.roles("AVENGER")
		.and()
			.withUser("NickFury")
			.password(encoder.encode("123"))
			.roles("DIRECTOR");
	}
	
	

}
