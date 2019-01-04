package com.it.rental.vehicle;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@RequiredArgsConstructor
public class Vehicle {
	
	@Id
	@NonNull
	private long id;

	@NonNull
	private String name;
	
	@NonNull
	private String brand;
	
	@NonNull
	@Column(name = "manufacturing_year")
	private int manufacturingYear;
	
	@NonNull
	private float mileage;

}