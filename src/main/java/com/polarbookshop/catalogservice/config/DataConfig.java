package com.polarbookshop.catalogservice.config;

import java.util.Optional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jdbc.repository.config.EnableJdbcAuditing;

@Configuration
@EnableJdbcAuditing
public class DataConfig {

	@Bean
	AuditorAware<String> auditorAware() {
		// 인증 없이 기본 사용자 이름 "system" 반환
		return () -> Optional.of("system");
	}

}
