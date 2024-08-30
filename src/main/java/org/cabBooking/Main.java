package org.cabBooking;

import org.cabBooking.model.DynamicPosition;
import org.cabBooking.model.Ride;
import org.cabBooking.model.StaticPosition;
import org.cabBooking.repository.InMemoryRepository;
import org.cabBooking.service.CabService;
import org.cabBooking.service.DriverService;
import org.cabBooking.service.RideService;
import org.cabBooking.service.RiderService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        InMemoryRepository inMemoryRepository = new InMemoryRepository();

        CabService cabService = InMemoryRepository.cabService;
        DriverService driverService = InMemoryRepository.driverService;
        RiderService riderService = InMemoryRepository.riderService;
        RideService rideService = InMemoryRepository.rideService;


        // register driver
        var driver1 = driverService.registerDriver("1","sunil");

        // register cab
        var cab1 = cabService.registerCab("1","alto",driver1.getId(), new DynamicPosition(0,0));

        // register rider
        var rider1 = riderService.registerRider("1","aman","aman@mail.com");

        // book a ride
        var ride1 = rideService.bookRide("1",cab1,rider1,new StaticPosition(0,1),
                new StaticPosition(5,4));

        //update driver availability
        driverService.updateDriverAvailability(driver1.getId(),true);

        //update cab availability
        cabService.updateIsCabRiding(cab1.getId(),false);

        var ride2 = rideService.bookRide("2",cab1,rider1,new StaticPosition(10,5),
                new StaticPosition(3,4));


        // update cab localtion
        cabService.updateCabLocation(cab1.getId() , new DynamicPosition(3,4));

        //update driver availability
        driverService.updateDriverAvailability(driver1.getId(),false);

        //getting list of all rides by rider
        List<Ride> rides = riderService.listOfAllRides(rider1.getId());

        //end ride

        rideService.endRide(ride1.getId());
        rideService.endRide(ride2.getId());





    }

}