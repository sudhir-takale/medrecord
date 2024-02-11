package com.java.medrecord.service;

import com.java.medrecord.dao.PatientRepository;
import com.java.medrecord.entity.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServices {

    @Autowired
    private PatientRepository patientRepository;

    public void createPatient(Patient patient) {
        patientRepository.save(patient);

    }


}
