package com.app.entity.read;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "medical_appointments")
public class MedicalAppointment {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "doctor_email", nullable = false)
    private String doctorEmail;

    @Column(name = "doctor_firstname", nullable = false)
    private String doctorFirstname;

    @Column(name = "doctor_lastname", nullable = false)
    private String doctorLastname;

    @Column(name = "patient_email", nullable = false)
    private String patientEmail;

    @Column(name = "patient_firstname", nullable = false)
    private String patientFirstname;

    @Column(name = "patient_lastname", nullable = false)
    private String patientLastname;

    @Column(name = "ailments", nullable = false)
    @Lob
    private String ailments;

    @Column(name = "recommendations", nullable = false)
    @Lob
    private String recommendations;
}
