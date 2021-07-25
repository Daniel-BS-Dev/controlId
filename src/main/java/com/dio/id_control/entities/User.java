package com.dio.id_control.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.ManyToOne;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class User {

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
