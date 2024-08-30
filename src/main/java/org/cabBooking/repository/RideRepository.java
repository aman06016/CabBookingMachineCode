package org.cabBooking.repository;

import org.cabBooking.model.Ride;

import java.util.HashMap;
import java.util.Map;

public class RideRepository {

    private Map<String, Ride> mapOfOIdToRide ;

    public RideRepository(){
        mapOfOIdToRide = new HashMap<>();
    }
    public Ride findById(String id){
        return mapOfOIdToRide.get(id);
    }
    public Ride save(Ride ride){
        mapOfOIdToRide.put(ride.getId(),ride);
        return ride;
    }

}
