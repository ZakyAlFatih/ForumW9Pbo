package org.example;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Serialize Data");
        System.out.println("2. Deserialize Data");
        int choice = scanner.nextInt();

        if (choice == 1) {
            // Serialization
            Doctor doc1 = new Doctor("Dr. Fulan", 45, "Skin");
            Doctor doc2 = new Doctor("Dr. Joko", 50, "Blood");

            Patient pat1 = new Patient("John Doe", 30, "Flu");
            Patient pat2 = new Patient("Jane Roe", 25, "Migraine");

            Hospital hospital = new Hospital("City Hospital");
            hospital.addDoctor(doc1);
            hospital.addDoctor(doc2);
            hospital.addPatient(pat1);
            hospital.addPatient(pat2);

            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("hospital_data.ser"))) {
                oos.writeObject(hospital);
                System.out.println("Hospital data saved successfully.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (choice == 2) {
            // Deserialization
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("hospital_data.ser"))) {
                Hospital loadedHospital = (Hospital) ois.readObject();
                System.out.println("\nLoaded Hospital Data:");
                loadedHospital.showDetails();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Invalid choice.");
        }
        scanner.close();
    }
}

