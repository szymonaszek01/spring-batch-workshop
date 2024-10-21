package com.app.entity.write;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "medical_appointments")
public class MedicalAppointment extends BaseEntity {

    @Column(name = "ailments", nullable = false)
    @Lob
    private String ailments;

    @Column(name = "recommendations", nullable = false)
    @Lob
    private String recommendations;

    @ManyToMany
    @JoinTable(
            name = "medical_appointments_users",
            joinColumns = @JoinColumn(name = "medical_appointment_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    private Set<User> users;
}
