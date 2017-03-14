package com.pedroaugust8.usercrud;

import java.util.Objects;

/**
 * @author Pedro Barros
 */
public class User {
    private String id;
    private String name;
    private String password;

    User() {
    }

    public User(String name) {
        this.name = name;
    }

    public User(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(name, user.name) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "User{ownerId='" + id + "', name='" + name + "', password='" + password + "'}";
    }
}