package moshe.dev.moshepetclinic.services;

import moshe.dev.moshepetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
