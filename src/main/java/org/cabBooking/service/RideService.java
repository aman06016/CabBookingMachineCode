package org.cabBooking.service;

import org.cabBooking.model.*;
import org.cabBooking.repository.DriverRepository;
import org.cabBooking.repository.InMemoryRepository;
import org.cabBooking.repository.RideRepository;
import org.cabBooking.util.Util;

public class RideService {

    RideRepository rideRepository = InMemoryRepository.rideRepository;
    DriverRepository driverRepository = InMemoryRepository.driverRepository;


    public Ride bookRide(String id, Cab cab, Rider rider, Position source , Position destination){

        boolean isRidePossible = Util.isDistanceAcceptable(cab.getCurrentPosition(),source);
        if(Boolean.TRUE.equals(isRidePossible)){
            Driver driver = driverRepository.findById(cab.getDriverId());
            System.out.println(String.format("driver %s is ready for the ride for rider %s",driver.getName(),rider.getName()));
            Position startPosition = new StaticPosition(source);
            Ride ride = new Ride();
            ride.setId(id);
            ride.setCabId(cab.getId());
            ride.setRiderId(rider.getId());
            ride.setSource(startPosition);
            ride.setDestination(destination);
            rideRepository.save(ride);
            System.out.println(String.format("ride is booked by %s in %s model car",rider.getName(),cab.getModelName()));
            return ride;

        }
        else {
            System.out.println("rider is too far away , can't give a ride");
            return null;
        }

    }
}
