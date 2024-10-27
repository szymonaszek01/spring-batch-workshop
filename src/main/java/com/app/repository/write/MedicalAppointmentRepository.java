package com.app.repository.write;

import com.app.entity.write.MedicalAppointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MedicalAppointmentRepository extends JpaRepository<MedicalAppointment, UUID> {
}