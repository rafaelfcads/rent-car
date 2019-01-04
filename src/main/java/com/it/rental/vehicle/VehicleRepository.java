package com.it.rental.vehicle;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface VehicleRepository extends CrudRepository<Vehicle, String> {}
