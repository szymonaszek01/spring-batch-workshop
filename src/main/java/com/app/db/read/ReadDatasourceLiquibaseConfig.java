package com.app.db.read;

import liquibase.integration.spring.SpringLiquibase;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class ReadDatasourceLiquibaseConfig {

    @Bean
    public SpringLiquibase readDatasourceLiquibase(@Qualifier("readDataSource") DataSource readDataSource) {
        SpringLiquibase liquibase = new SpringLiquibase();
        liquibase.setChangeLog("classpath:db/read/db-read-changelog.json");
        liquibase.setDataSource(readDataSource);
        return liquibase;
    }
}
