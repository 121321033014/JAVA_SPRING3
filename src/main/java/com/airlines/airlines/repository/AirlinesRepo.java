package com.airlines.airlines.repository;

import com.airlines.airlines.entity.Airlines;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirlinesRepo extends JpaRepository<Airlines,Integer> {
    Airlines findById(int id);
}
