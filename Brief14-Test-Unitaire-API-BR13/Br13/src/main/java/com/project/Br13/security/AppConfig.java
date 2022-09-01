package com.project.Br13.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)

public class AppConfig extends WebSecurityConfigurerAdapter {

	private final PasswordEncoder passwordencoder;

	public AppConfig(PasswordEncoder passwordencoder) {
		super();
		this.passwordencoder = passwordencoder;
	}

	protected void configure(HttpSecurity http) throws Exception {
//		http .csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
		http.csrf().disable().authorizeRequests().antMatchers("/", "index", "/css/*", "/js/*").permitAll()
				.antMatchers("/*/**").hasRole(ApplicationUserRole.ADMIN.name()).anyRequest().authenticated().and()
				.formLogin();	}

	@Bean
	protected UserDetailsService UserDetailsService() {
//		UserDetails Admin1 = User.builder().username("admin1").password(passwordencoder.encode("admin123"))
////				.roles(ApplicationUserRole.ADMIN.name())
//				.authorities(ApplicationUserRole.ADMIN1.getGrantedAuthorities()).build();
 
		UserDetails Admin = User.builder().username("admin").password(passwordencoder.encode("admin123"))
//				.roles(ApplicationUserRole.ADMIN.name())
				.authorities(ApplicationUserRole.ADMIN.getGrantedAuthorities()).build();

		UserDetails JUSTVISITOR = User.builder().username("visitor").password(passwordencoder.encode("visitor123"))
//				.roles(ApplicationUserRole.VISITOR.name())
				.authorities(ApplicationUserRole.VISITOR.getGrantedAuthorities()).build();
		return new InMemoryUserDetailsManager(Admin, JUSTVISITOR); 
	}

}