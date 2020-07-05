package com.app.utb.sfgpetclinicspringboot2.services;

import com.app.utb.sfgpetclinicspringboot2.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
