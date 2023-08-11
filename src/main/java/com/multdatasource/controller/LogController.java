package com.multdatasource.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multdatasource.entities.LogEntity;
import com.multdatasource.service.LogService;

//LogController.java
@RestController
@RequestMapping("/logs")
public class LogController {
 @Autowired
 private LogService logService;
 
 @GetMapping("/h2")
 public List<LogEntity> getAllLogsFromH2() {
     return logService.getAllLogsFromH2();
 }
 
 @GetMapping("/postgres")
 public List<LogEntity> getAllLogsFromPostgreSQL() {
     return logService.getAllLogsFromPostgreSQL();
 }
 
 // Other controller methods...
}
