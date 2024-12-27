package org.example;

class Patient extends Person {
    private String illness;

    public Patient(String name, int age, String illness) {
        super(name, age);
        this.illness = illness;
    }

    @Override
    public void showDetails() {
        System.out.println("Patient Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Illness: " + illness);
    }
}
