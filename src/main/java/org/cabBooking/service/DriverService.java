package org.cabBooking.service;

import org.cabBooking.model.Driver;
import org.cabBooking.repository.DriverRepository;
import org.cabBooking.repository.InMemoryRepository;

public class DriverService {

    private DriverRepository driverRepository = InMemoryRepository.driverRepository;

    public Driver registerDriver(String id, String driverName){
        Driver driver = new Driver();
        driver.setId(id);
        driver.setName(driverName);

        driverRepository.save(driver);
        System.out.println(String.format("driver %s has been registered", driver.getName()));
        return driver;
    }


}
