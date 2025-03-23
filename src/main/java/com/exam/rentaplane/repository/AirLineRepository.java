package com.exam.rentaplane.repository;

import com.exam.rentaplane.model.entity.AirLine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirLineRepository extends JpaRepository<AirLine, Long> {
}
