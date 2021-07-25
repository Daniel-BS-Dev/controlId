package com.dio.id_control.entities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class Company {
	
	private Long id;
	private String description;
	private String cnpj;
	private String address;
	private String district;
	private String city;
	private String state;
	private String phone;

}
