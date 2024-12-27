package org.example;

class Doctor extends Person {
    private String specialization;

    public Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    @Override
    public void showDetails() {
        System.out.println("Doctor Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Specialization: " + specialization);
    }
}
