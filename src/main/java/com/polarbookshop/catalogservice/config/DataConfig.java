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
		// 보안 컨텍스트를 사용하지 않고 기본 사용자 이름을 반환합니다.
		return () -> Optional.of("defaultUser"); // 기본 사용자 이름을 반환하거나, 필요에 따라 수정합니다.
	}

}
