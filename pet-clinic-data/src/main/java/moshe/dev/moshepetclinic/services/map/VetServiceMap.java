package moshe.dev.moshepetclinic.services.map;

import moshe.dev.moshepetclinic.model.Vet;
import moshe.dev.moshepetclinic.services.CrudService;
import moshe.dev.moshepetclinic.services.VetService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById((id));
    }

    @Override
    public void delete(Vet object) {
        super.delete((object));
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById((id));
    }
}
