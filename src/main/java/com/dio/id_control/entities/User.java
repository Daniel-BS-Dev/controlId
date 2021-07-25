package com.dio.id_control.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private BigDecimal tolerance;
	private LocalDateTime beginningOfWork;
	private LocalDateTime endOfWork;
	
	@ManyToOne
	private UserCategory userCategory;
	
	@ManyToOne
	private Company company;
	
	@ManyToOne
	private AccessLevel accessLevel;
	
	@ManyToOne
	private WorkingDay workingDay;
	
}
