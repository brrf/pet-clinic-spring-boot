package moshe.dev.moshepetclinic.services;

import moshe.dev.moshepetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);

    Set<Pet> findAll();

}
