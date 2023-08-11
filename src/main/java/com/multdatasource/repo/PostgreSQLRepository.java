package com.multdatasource.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multdatasource.entities.LogEntity;

//PostgreSQLRepository.java
public interface PostgreSQLRepository extends JpaRepository<LogEntity, Long> {
}
