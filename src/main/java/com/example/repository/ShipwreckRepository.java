package com.example.repository;

import com.example.model.Shipwreck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {

}
