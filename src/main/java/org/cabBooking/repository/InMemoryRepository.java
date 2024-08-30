package org.cabBooking.repository;

import org.cabBooking.service.CabService;
import org.cabBooking.service.DriverService;
import org.cabBooking.service.RideService;
import org.cabBooking.service.RiderService;

public class InMemoryRepository {

    public static CabRepository cabRepository ;
    public static DriverRepository driverRepository;
    public static RiderRepository riderRepository;
    public static RideRepository rideRepository;

    public static CabService cabService;
    public static DriverService driverService;
    public static RiderService riderService;
    public static RideService rideService;

    public InMemoryRepository(){
        cabRepository = new CabRepository();
        driverRepository = new DriverRepository();
        riderRepository = new RiderRepository();
        rideRepository = new RideRepository();

        cabService = new CabService();
        driverService= new DriverService();
        riderService = new RiderService();
        rideService = new RideService();
    }




}
