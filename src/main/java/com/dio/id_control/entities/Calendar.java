package com.dio.id_control.entities;

import java.time.LocalDateTime;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class Calendar {

	private Long id;
	private String description;
	private LocalDateTime specialDate;
	private DateType dateType;
}
