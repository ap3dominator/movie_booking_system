package com.ap3dominator.bookMyShow.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EntityScan("com.ap3dominator.bookMyShow.domain")
@EnableJpaRepositories("com.ap3dominator.bookMyShow.repos")
@EnableTransactionManagement
public class DomainConfig {
}
