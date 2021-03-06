package com.beekay.springpetclinic.repository;

import com.beekay.springpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);

    Iterable<Owner> findAllByLastNameLike(String lastName);

}
