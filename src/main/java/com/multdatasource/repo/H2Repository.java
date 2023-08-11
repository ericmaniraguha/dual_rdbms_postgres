package com.multdatasource.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.multdatasource.entities.LogEntity;

//H2Repository.java
public interface H2Repository extends JpaRepository<LogEntity, Long> {
}

