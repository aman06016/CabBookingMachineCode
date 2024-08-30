package org.cabBooking.repository;

import org.cabBooking.model.Ride;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

    public List<Ride> findRidesByRiderId(String riderId) {
        List<Ride> listOfRidesByRiderId = new ArrayList<>();

        for(Ride ride:mapOfOIdToRide.values()){
            if(riderId.equals(ride.getRiderId())){
                listOfRidesByRiderId.add(ride);
            }
        }
        return listOfRidesByRiderId;
    }
}
