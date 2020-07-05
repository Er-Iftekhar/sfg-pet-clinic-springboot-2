package com.app.utb.sfgpetclinicspringboot2.services;

import com.app.utb.sfgpetclinicspringboot2.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();

}
