package com.exam.rentaplane.repository;

import com.exam.rentaplane.model.entity.AirCraft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirCraftRepository extends JpaRepository<AirCraft, Long> {
}
