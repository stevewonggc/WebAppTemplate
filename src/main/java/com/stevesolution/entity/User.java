package com.stevesolution.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by steve on 2017/5/1.
 */
@Entity
public class User {

    private int id;
    private String name;
    private String age;

    public User() {}


    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Id: " + getId() + "\nName: " + getName() + ";\nAge: " + getAge();
    }
}
