package com.dio.id_control.entities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class AccessLevel {
	
	private Long id;
	private String description;

}
