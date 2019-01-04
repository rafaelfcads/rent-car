package com.it.rental.vehicle;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

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
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_vehicle_id")
	@SequenceGenerator(
	    name="seq_vehicle_id",
	    sequenceName="seq_vehicle_id",
	    allocationSize=20
	)
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