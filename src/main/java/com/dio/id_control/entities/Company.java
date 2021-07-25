package com.dio.id_control.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Company {
	
	@Id
	private Long id;
	private String description;
	private String cnpj;
	private String address;
	private String district;
	private String city;
	private String state;
	private String phone;

}
