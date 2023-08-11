package com.multdatasource.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multdatasource.entities.LogEntity;
import com.multdatasource.repo.H2Repository;
import com.multdatasource.repo.PostgreSQLRepository;

//LogService.java
@Service
public class LogService {
 @Autowired
 private H2Repository h2Repository;
 
 @Autowired
 private PostgreSQLRepository postgreSQLRepository;
 
 public List<LogEntity> getAllLogsFromH2() {
     return h2Repository.findAll();
 }
 
 public List<LogEntity> getAllLogsFromPostgreSQL() {
     return postgreSQLRepository.findAll();
 }
 
 // Other service methods...
}
