package com.project.Br13.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class AppConfig extends WebSecurityConfigurerAdapter {
		
	private final PasswordEncoder passwordencoder;
	
	public AppConfig(PasswordEncoder passwordencoder) {
		super();
		this.passwordencoder = passwordencoder;
	}

	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/", "index", "/css/*", "/js/*").permitAll()
		.antMatchers("/admin/**").hasRole(ApplicationUserRole.ADMIN.name())
				.anyRequest().authenticated().and().httpBasic();
	}
	
	
	@Bean
	protected UserDetailsService UserDetailsService() {
			
			
			UserDetails Admin = User.builder()
			.username("admin")
			.password(passwordencoder.encode("admin123"))
			.roles(ApplicationUserRole.ADMIN.name())
			.build();
			
			UserDetails JUSTVISITOR = User.builder()
					.username("visitor")
					.password(passwordencoder.encode("visitor123"))
					.roles(ApplicationUserRole.VISITOR.name())
					.build();
			
			return new InMemoryUserDetailsManager(
					Admin,JUSTVISITOR
					);
	}
	
	
	
}
