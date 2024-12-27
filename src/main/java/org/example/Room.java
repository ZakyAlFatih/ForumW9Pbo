package org.example;

import java.io.*;
import java.util.*;
class Room implements Serializable {
    private int roomNumber;
    private Doctor doctorInCharge;

    public Room(int roomNumber, Doctor doctorInCharge) {
        this.roomNumber = roomNumber;
        this.doctorInCharge = doctorInCharge;
    }

    public void showDetails() {
        System.out.println("Room Number: " + roomNumber);
        doctorInCharge.showDetails();
    }
}