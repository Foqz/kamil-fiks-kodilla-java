package com.kodilla.testing.library;

import java.util.Objects;

public class LibraryUser {
    String firstName;
    String lastName;
    String paselId;

    public LibraryUser(String firstName, String lastName, String paselId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.paselId = paselId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPaselId() {
        return paselId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibraryUser that = (LibraryUser) o;
        return Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(paselId, that.paselId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(firstName, lastName, paselId);
    }
}
