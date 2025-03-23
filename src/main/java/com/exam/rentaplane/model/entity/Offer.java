package com.exam.rentaplane.model.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "offers")
public class Offer extends BaseEntity{
    @Column(nullable = false, unique = true)
    private String Company;
    @Column(nullable = false)
    private AirCraftType model;
    @Column(nullable = false, name = "class_type")
    private ClassType classType;
    @Column(nullable = false)
    private int capacity;
    @Column(nullable = false)
    private BigDecimal rate;
    @Column(nullable = false, name = "lease_type")
    private LeaseType leaseType;
    @Column(nullable = false)
    private int availability;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private AirLine airLine;

    public Offer() {
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public AirCraftType getModel() {
        return model;
    }

    public void setModel(AirCraftType model) {
        this.model = model;
    }

    public ClassType getClassType() {
        return classType;
    }

    public void setClassType(ClassType classType) {
        this.classType = classType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public LeaseType getLeaseType() {
        return leaseType;
    }

    public void setLeaseType(LeaseType leaseType) {
        this.leaseType = leaseType;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public AirLine getAirLine() {
        return airLine;
    }

    public void setAirLine(AirLine airLine) {
        this.airLine = airLine;
    }
}
