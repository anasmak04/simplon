package com.project.Br13.security;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class AppConfig extends WebSecurityConfigurerAdapter {

	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/", "index", "/css/*", "/js/*").permitAll()
//		.antMatchers("/api/**").hasRole(ApplicationuserRole.ADMIN.name())
				.anyRequest().authenticated().and().httpBasic();
	}
	
	
}
