package com.java.medrecord.controller;

import com.java.medrecord.entity.Patient;
import com.java.medrecord.service.PatientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/patient", method = RequestMethod.GET)
public class PatientHandler {

    @Autowired
    private PatientServices patientService;

    @PostMapping(value = "/create-patient")
    public String createPatient(@RequestBody Patient patient) {

        this.patientService.createPatient(patient);
        return "Patient created successfully";
    }

    @GetMapping(value = "/dashboard")
    public String home() {
        return "patient/dashboard";
    }
}