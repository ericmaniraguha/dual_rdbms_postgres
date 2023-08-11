package com.multdatasource.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//LogEntity.java
@Entity
@Table(name = "log_table")
public class LogEntity {
	
 @Id
 private Long id;
 
 private String message;
 
 
}

