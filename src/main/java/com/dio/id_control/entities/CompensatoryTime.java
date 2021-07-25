package com.dio.id_control.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class CompensatoryTime {
	
	@EqualsAndHashCode
	@NoArgsConstructor
	@AllArgsConstructor
    @Embeddable
	public class CompensatoryTimeId implements Serializable{
		private static final long serialVersionUID = 1L;
		
		private Long id;
		private Long movimentId;
		private Long userId;
		
	}
    @EmbeddedId
	private CompensatoryTimeId id;
	private LocalDateTime dateWorked;
	private BigDecimal numberHoursWorked;
	private BigDecimal balanceHoursworked;
}
