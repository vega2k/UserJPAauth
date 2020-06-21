package com.frodo.myspringboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/edit/**","/update/**","/delete/**").authenticated()
			.antMatchers("/**").permitAll()
			.and()
			.formLogin()
			.loginPage("/login-page")
            .loginProcessingUrl("/app-login")
            .usernameParameter("app_username")
            .passwordParameter("app_password")
            .defaultSuccessUrl("/index")
			.and()
			.httpBasic()
			.and()
			.logout()    //logout configuration
			.logoutUrl("/app-logout") 
			.deleteCookies("JSESSIONID")
			.logoutSuccessUrl("/");			
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		//return NoOpPasswordEncoder.getInstance();
		return PasswordEncoderFactories.createDelegatingPasswordEncoder();
	}
	
}
