package com.dio.id_control.entities;


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
public class Locality {
	
	private Long id;
	private String description;
	
	@ManyToOne
	private AccessLevel accessLevel;
	

}
