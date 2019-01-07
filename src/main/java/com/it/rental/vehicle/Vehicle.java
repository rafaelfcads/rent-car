package com.it.rental.vehicle;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.it.rental.contract.Contract;

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
	private long id;

	@NonNull
	@NotBlank
    @Size(min = 1, max = 20)
	private String name;
	
	@NonNull
	@NotBlank
    @Size(min = 1, max = 20)
	private String brand;
	
	@Column(name = "manufacturing_year")
	private int manufacturingYear;
	
	private float mileage;
	
	@NonNull
	@ManyToMany(mappedBy = "vehicles")
    private List<Contract> contracts = new ArrayList<Contract>();

}