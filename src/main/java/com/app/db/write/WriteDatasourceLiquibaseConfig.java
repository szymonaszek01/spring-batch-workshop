package com.app.db.write;

import liquibase.integration.spring.SpringLiquibase;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class WriteDatasourceLiquibaseConfig {

    @Bean
    public SpringLiquibase writeDatasourceLiquibase(@Qualifier("writeDataSource") DataSource writeDataSource) {
        SpringLiquibase liquibase = new SpringLiquibase();
        liquibase.setChangeLog("classpath:db/write/db-write-changelog.json");
        liquibase.setDataSource(writeDataSource);
        return liquibase;
    }
}
