//package com.polarbookshop.catalogservice.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration(proxyBeanMethods = false)
//public class SecurityConfig {
//
//	@Bean
//	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//		return http
//				.authorizeHttpRequests(authorize -> authorize
//						.anyRequest().permitAll() // 모든 요청을 인증 없이 허용
//				)
//				.csrf().disable() // CSRF 보호 비활성화
//				.build();
//	}
//}
//
