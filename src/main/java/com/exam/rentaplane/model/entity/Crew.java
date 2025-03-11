package com.exam.rentaplane.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "crew")
public class Crew extends BaseEntity{
    @Column(nullable = false)
    private CrewRole crewRole;
    @Column(nullable = false, name = "first_name")
    private String firstname;
    @Column(nullable = false, name = "last_name")
    private String lastName;
    @Column(nullable = false)
    private int age;
    @Column(nullable = false)
    private int experience;
    @Column(nullable = false)
    private String nationality;
    @Column(nullable = false)
    private String gender;

    public Crew() {
    }

    public CrewRole getCrewRole() {
        return crewRole;
    }

    public void setCrewRole(CrewRole crewRole) {
        this.crewRole = crewRole;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
