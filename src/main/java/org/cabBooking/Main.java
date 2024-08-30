package org.cabBooking;

import org.cabBooking.model.DynamicPosition;
import org.cabBooking.model.Position;
import org.cabBooking.model.StaticPosition;
import org.cabBooking.repository.InMemoryRepository;
import org.cabBooking.service.CabService;
import org.cabBooking.service.DriverService;
import org.cabBooking.service.RideService;
import org.cabBooking.service.RiderService;

public class Main {
    public static void main(String[] args) {
        InMemoryRepository inMemoryRepository = new InMemoryRepository();

        CabService cabService = InMemoryRepository.cabService;
        DriverService driverService = InMemoryRepository.driverService;
        RiderService riderService = InMemoryRepository.riderService;
        RideService rideService = InMemoryRepository.rideService;


        // register driver
        var d1 = driverService.registerDriver("1","sunil");

        // register cab
        var c1 = cabService.registerCab("1","alto",d1.getId(), new DynamicPosition(3,4));

        // register rider
        var r1 = riderService.registerRider("1","aman","aman@mail.com");


        // book a ride
        var ride1 = rideService.bookRide("1",c1,r1,new StaticPosition(0,0),new StaticPosition(3,4));





    }

}