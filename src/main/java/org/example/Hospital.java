package org.example;
import java.io.*;
import java.util.*;
class Hospital implements Serializable {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void showDetails() {
        System.out.println("Hospital Name: " + name);
        System.out.println("--- Doctors ---");
        for (Doctor doctor : doctors) {
            doctor.showDetails();
            System.out.println();
        }
        System.out.println("--- Patients ---");
        for (Patient patient : patients) {
            patient.showDetails();
            System.out.println();
        }
    }
}
