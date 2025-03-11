package com.exam.rentaplane.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "airlines")
public class AirLine extends BaseEntity{
    @Column(nullable = false, unique = true)
    private String name;
    @Column(nullable = false)
    private String location;
    @Column(nullable = false, name = "number_of_aircrafts")
    private int numberOfAirCrafts;
    @Column(name = "number_of_customers")
    private int numberOfCustomers;
    @Column(name = "years_of_service")
    private int yearsOfService;
    @Column(name = "rating")
    private int rating;

    public AirLine() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfAirCrafts() {
        return numberOfAirCrafts;
    }

    public void setNumberOfAirCrafts(int numberOfAirCrafts) {
        this.numberOfAirCrafts = numberOfAirCrafts;
    }

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public void setNumberOfCustomers(int numberOfCustomers) {
        this.numberOfCustomers = numberOfCustomers;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
