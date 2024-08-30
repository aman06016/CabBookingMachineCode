package org.cabBooking.service;

import org.cabBooking.model.Cab;
import org.cabBooking.model.Position;
import org.cabBooking.repository.CabRepository;
import org.cabBooking.repository.DriverRepository;
import org.cabBooking.repository.InMemoryRepository;

public class CabService {

    private CabRepository cabRepository = InMemoryRepository.cabRepository;
    private DriverRepository driverRepository =InMemoryRepository.driverRepository;

    public Cab registerCab(String id , String model, String driverId, Position position){
        Cab cab = new Cab();
        cab.setId(id);
        cab.setModelName(model);
        cab.setDriverId(driverId);
        cab.setCurrentPosition(position);
        var driver = driverRepository.findById(driverId);
        cabRepository.save(cab);
        System.out.println(String.format("cab %s has been registered with driver %s",cab.getModelName() , driver.getName()));
        return cab;
    }
}
