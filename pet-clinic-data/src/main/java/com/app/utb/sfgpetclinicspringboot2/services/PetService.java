package com.app.utb.sfgpetclinicspringboot2.services;

import com.app.utb.sfgpetclinicspringboot2.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
