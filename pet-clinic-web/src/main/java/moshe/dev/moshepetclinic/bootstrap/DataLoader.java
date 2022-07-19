package moshe.dev.moshepetclinic.bootstrap;

import moshe.dev.moshepetclinic.model.Owner;
import moshe.dev.moshepetclinic.model.Vet;
import moshe.dev.moshepetclinic.services.VetService;
import moshe.dev.moshepetclinic.services.map.OwnerServiceMap;
import moshe.dev.moshepetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import moshe.dev.moshepetclinic.services.OwnerService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        ownerService.save(owner2);
        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
