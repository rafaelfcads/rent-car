package com.it.rental.user;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

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
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_user_id")
	@SequenceGenerator(
	    name="seq_user_id",
	    sequenceName="seq_user_id",
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
	private String lastName;
	
	@NonNull
	@Email
	private String email;
	
	@NonNull
	@OneToMany(
		mappedBy = "user",
        cascade = CascadeType.ALL,
        orphanRemoval = true
    )
    private List<Contract> contracts = new ArrayList<Contract>();

}