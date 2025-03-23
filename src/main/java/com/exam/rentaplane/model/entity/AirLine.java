package com.exam.rentaplane.model.entity;

import jakarta.persistence.*;

import java.util.List;

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
    @OneToMany
    private List<AirCraft> airCrafts;
    @OneToMany
    private List<Offer> offers;

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

    public List<AirCraft> getAirCrafts() {
        return airCrafts;
    }

    public void setAirCrafts(List<AirCraft> airCrafts) {
        this.airCrafts = airCrafts;
    }

    public List<Offer> getOffers() {
        return offers;
    }

    public void setOffers(List<Offer> offers) {
        this.offers = offers;
    }
}
