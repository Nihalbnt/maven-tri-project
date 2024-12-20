package com.nihal;

import lombok.Data;

@Data
public class Person implements Comparable<Person> {
    private String lastName;
    private String firstName;

    public Person(String lastName, String firstName) {
        this.lastName = lastName.trim();
        this.firstName = firstName.trim();
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public int compareTo(Person other) {
        int lastNameComparison = this.lastName.compareToIgnoreCase(other.lastName);
        if (lastNameComparison != 0) {
            return lastNameComparison;
        } else {
            return this.firstName.compareToIgnoreCase(other.firstName);
        }
    }

    @Override
    public String toString() {
        return lastName + ", " + firstName;
    }
}
