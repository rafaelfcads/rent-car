package com.it.rental.contract;

import javax.persistence.Entity;

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
	
	@NonNull
	private long id;

	@NonNull
	private String code;

}