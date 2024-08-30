package org.cabBooking.repository;

import org.cabBooking.model.Driver;

import java.util.HashMap;
import java.util.Map;

public class DriverRepository {

    private Map<String , Driver> mapOfIdToDriver ;

    DriverRepository(){
        mapOfIdToDriver = new HashMap<>();
    }

    public Driver findById(String id){
        return mapOfIdToDriver.get(id);
    }
    public Driver save(Driver driver){
        mapOfIdToDriver.put(driver.getId(),driver);
        return driver;
    }
}
