package org.cabBooking.repository;

import org.cabBooking.model.Rider;

import java.util.HashMap;
import java.util.Map;

public class RiderRepository {

    private Map<String, Rider> mapOfIdToRider;

    RiderRepository(){
        mapOfIdToRider = new HashMap<>();
    }

    public Rider findById(String id){
        return mapOfIdToRider.get(id);
    }


    public void save(Rider rider) {
        mapOfIdToRider.put(rider.getId(),rider);
    }
}
