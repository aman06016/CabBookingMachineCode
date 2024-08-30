package org.cabBooking.service;

import org.cabBooking.model.Position;
import org.cabBooking.model.Rider;
import org.cabBooking.repository.InMemoryRepository;
import org.cabBooking.repository.RiderRepository;

public class RiderService {

    private RiderRepository riderRepository = InMemoryRepository.riderRepository;

    public Rider registerRider(String id , String name, String email){
        Rider rider = new Rider();
        rider.setId(id);
        rider.setName(name);
        rider.setEmail(email);


        riderRepository.save(rider);
        System.out.println(String.format("rider %s has been registered",name));
        return rider;
    }


}
