package com.app.batch.step;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class MedicalAppointmentStepConfig {

    @Bean
    public Step createMedicalAppointmentStep(JobRepository jobRepository, PlatformTransactionManager platformTransactionManager) {
        return new StepBuilder("createMedicalAppointmentStep", jobRepository)
                .chunk(10, platformTransactionManager)
                .build();
    }
}
