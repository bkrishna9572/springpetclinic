package com.beekay.springpetclinic.bootstrap;

import com.beekay.springpetclinic.model.Owner;
import com.beekay.springpetclinic.model.Vet;
import com.beekay.springpetclinic.services.OwnerService;
import com.beekay.springpetclinic.services.VetService;
import com.beekay.springpetclinic.services.mapServices.OwnerServiceMap;
import com.beekay.springpetclinic.services.mapServices.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        this.ownerService = new OwnerServiceMap();
        this.vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("bee");
        owner1.setLastName("kay");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Aarthi");
        owner2.setLastName("Gandhi");

        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("NewFirst");
        vet1.setLastName("NewLast");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("NextFirst");
        vet2.setLastName("NextLast");

        vetService.save(vet2);

        System.out.println("Loaded the startup data");

    }
}
