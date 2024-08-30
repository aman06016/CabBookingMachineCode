package org.cabBooking.service;

import org.cabBooking.model.*;
import org.cabBooking.repository.CabRepository;
import org.cabBooking.repository.DriverRepository;
import org.cabBooking.repository.InMemoryRepository;
import org.cabBooking.repository.RideRepository;
import org.cabBooking.util.Util;

public class RideService {

    RideRepository rideRepository = InMemoryRepository.rideRepository;
    DriverRepository driverRepository = InMemoryRepository.driverRepository;
    CabRepository cabRepository = InMemoryRepository.cabRepository;


    public Ride bookRide(String id, Cab cab, Rider rider, Position source , Position destination){

        boolean isRidePossibleDistanceWise = Util.isDistanceAcceptable(cab.getCurrentPosition(),source);
        Driver driver = driverRepository.findById(cab.getDriverId());

        if(Boolean.TRUE.equals(isRidePossibleDistanceWise)
                && !Boolean.TRUE.equals(cab.getRiding())
                && Boolean.TRUE.equals(driver.getAvailable())){


            System.out.printf("driver %s is ready for the ride for rider %s%n",driver.getName(),rider.getName());
            Position startPosition = new StaticPosition(source);

            Ride ride = new Ride();
            ride.setId(id);
            ride.setCabId(cab.getId());
            ride.setRiderId(rider.getId());
            ride.setSource(startPosition);
            ride.setDestination(destination);
            ride.setEnded(false);
            rideRepository.save(ride);

            cab.setRiding(true);
            cabRepository.save(cab);

            driver.setAvailable(false);
            driverRepository.save(driver);


            System.out.printf("ride is booked by %s in %s model car%n",rider.getName(),cab.getModelName());
            return ride;

        }
        else {
            System.out.println("rider is too far away , can't give a ride");
            return null;
        }

    }

    public void endRide(String rideId){
        Ride ride = rideRepository.findById(rideId);
        ride.setEnded(true);
        rideRepository.save(ride);



        System.out.printf("ride %s  has been ended",ride.getId());
        System.out.println();
    }


}
