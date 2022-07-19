package moshe.dev.moshepetclinic.services.map;

import moshe.dev.moshepetclinic.model.Pet;
import moshe.dev.moshepetclinic.services.CrudService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById((id));
    }

    @Override
    public void delete(Pet object) {
        super.delete((object));
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById((id));
    }
}
