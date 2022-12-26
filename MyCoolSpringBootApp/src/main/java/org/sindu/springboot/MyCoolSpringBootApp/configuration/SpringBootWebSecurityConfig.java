package org.sindu.springboot.MyCoolSpringBootApp.configuration;

import java.util.Arrays;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
@EnableWebSecurity
public class SpringBootWebSecurityConfig {

	@Bean
	public UserDetailsService userDetailsManager(DataSource myDataSource) {
		return new JdbcUserDetailsManager(myDataSource);
	}
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		CorsConfiguration configuration = new CorsConfiguration();
		configuration.setAllowedOrigins(Arrays.asList("*"));
		configuration.setAllowedMethods(Arrays.asList("GET","POST"));
//		configuration.setAllowCredentials(false);
		System.out.println(configuration.getAllowedMethods());
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", configuration);
		
		http.httpBasic()
		.and()
		.cors().configurationSource(source)
		.and().csrf().disable()
		.headers().frameOptions().disable()
		.and().headers().cacheControl().disable();
		
		http.authorizeHttpRequests()
		.requestMatchers("/**").hasAnyRole("EMPLOYEE","ADMIN")
		.requestMatchers("/actuator/**").hasRole("ADMIN")
		.anyRequest().authenticated()
		.and()
		.formLogin().permitAll()
		.and().exceptionHandling().accessDeniedPage("/rest/error");
		
		return http.build();
	}
	
}
