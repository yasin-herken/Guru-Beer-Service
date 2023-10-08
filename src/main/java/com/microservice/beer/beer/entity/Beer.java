package com.microservice.beer.beer.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import com.microservice.beer.beer.entity.enums.BeerStyleEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "beer")
public class Beer{

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(length = 36, columnDefinition = "varchar(36)", updatable = false, nullable = false)
	private UUID id;

	private String beerName;

	@Version
	private Long version;
	private BeerStyleEnum beerStyleEnum;

	@CreationTimestamp
	@Column(updatable = false)
	private Timestamp createdDate;

	@UpdateTimestamp
	private Timestamp lastModifiedDate;

	private Integer minOnHand;

	private Integer quantityToBrew;

	private BigDecimal price;

	@Column(unique = true)
	private String upc;
}
