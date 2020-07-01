package com.codecool.emualapitvany.repository;

import com.codecool.emualapitvany.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
