package com.dio.id_control.entities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class Occurrence {

	private Long id;
	private String name;
	private String description;
}
