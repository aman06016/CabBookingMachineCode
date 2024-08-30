package org.cabBooking.service;

import org.cabBooking.model.Position;
import org.cabBooking.model.Ride;
import org.cabBooking.model.Rider;
import org.cabBooking.repository.InMemoryRepository;
import org.cabBooking.repository.RideRepository;
import org.cabBooking.repository.RiderRepository;

import java.util.List;

public class RiderService {

    private final RiderRepository riderRepository = InMemoryRepository.riderRepository;
    private final RideRepository rideRepository = InMemoryRepository.rideRepository;

    public Rider registerRider(String id , String name, String email){
        Rider rider = new Rider();
        rider.setId(id);
        rider.setName(name);
        rider.setEmail(email);


        riderRepository.save(rider);
        System.out.printf("rider %s has been registered%n",name);
        return rider;
    }

    public List<Ride> listOfAllRides(String riderId){
        List<Ride> rides =  rideRepository.findRidesByRiderId(riderId);

        rides.forEach(System.out::println);
        return rides;

    }


}
