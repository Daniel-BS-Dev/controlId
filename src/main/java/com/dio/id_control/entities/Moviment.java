package com.dio.id_control.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Moviment {
	
	@NoArgsConstructor
	@AllArgsConstructor
	@EqualsAndHashCode
	@Embeddable
	public class MovimentId implements Serializable {
		private static final long serialVersionUID = 1L;
	
		private Long MovimentId;
		private Long UserId;
	}
	
	@EmbeddedId
	private MovimentId id;
	private LocalDateTime dateOfEntry;
	private LocalDateTime outDate;
	private BigDecimal period;
	
	@ManyToOne
	private Occurrence occurrence;
	
	@ManyToOne
	private Calendar calendar;

}
