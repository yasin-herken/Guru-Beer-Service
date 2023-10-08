package com.microservice.beer.beer.repository;

import java.util.UUID;

import com.microservice.beer.beer.entity.Beer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeerRepository extends JpaRepository<Beer, UUID>{
}
