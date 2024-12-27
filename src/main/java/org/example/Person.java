package org.example;

import java.io.*;
import java.util.*;
abstract class Person implements Serializable {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void showDetails();
}