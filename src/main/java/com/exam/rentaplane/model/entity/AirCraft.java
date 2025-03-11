package com.exam.rentaplane.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "aircrafts")
public class AirCraft extends BaseEntity{
    @Column(nullable = false)
    private AirCraftType type;
    @Column(nullable = false, name = "class_type")
    private ClassType classType;
    @Column(nullable = false)
    private int capacity;

    public AirCraft() {
    }

    public AirCraftType getType() {
        return type;
    }

    public void setType(AirCraftType type) {
        this.type = type;
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
}
