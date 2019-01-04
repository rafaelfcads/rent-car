package com.it.rental.vehicle;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface VehicleRepository extends PagingAndSortingRepository<Vehicle, Long> {}
