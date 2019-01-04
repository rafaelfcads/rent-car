package com.it.rental.contract;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ContractRepository extends PagingAndSortingRepository<Contract, Long> {}
