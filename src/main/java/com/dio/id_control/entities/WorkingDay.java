package com.dio.id_control.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "working_day")
public class WorkingDay {
	
	private Long id;
	private String description;

}
