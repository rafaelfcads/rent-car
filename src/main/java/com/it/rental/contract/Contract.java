package com.it.rental.contract;

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
public class Contract {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_contract_id")
	@SequenceGenerator(
	    name="seq_contract_id",
	    sequenceName="seq_contract_id",
	    allocationSize=20
	)

	private long id;

	@NonNull
	private String code;

}