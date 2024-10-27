package com.app.repository.read;

import com.app.entity.read.MedicalAppointment;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MedicalAppointmentReadOnlyRepository extends ReadOnlyRepository<MedicalAppointment, UUID> {
}
