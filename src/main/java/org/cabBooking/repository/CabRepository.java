package org.cabBooking.repository;

import org.cabBooking.model.Cab;

import java.util.HashMap;
import java.util.Map;

public class CabRepository {

    private Map<String , Cab> mapOfIdToCab ;
    CabRepository(){
        mapOfIdToCab = new HashMap<>();
    }

    public Cab findById(String id){
        return mapOfIdToCab.get(id);
    }


    public void save(Cab cab) {
        mapOfIdToCab.put(cab.getId(),cab);
    }
}
