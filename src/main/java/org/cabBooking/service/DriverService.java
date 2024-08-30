package org.cabBooking.service;

import org.cabBooking.model.Driver;
import org.cabBooking.repository.DriverRepository;
import org.cabBooking.repository.InMemoryRepository;

public class DriverService {

    private final DriverRepository driverRepository = InMemoryRepository.driverRepository;

    public Driver registerDriver(String id, String driverName){
        Driver driver = new Driver();
        driver.setId(id);
        driver.setName(driverName);

        driverRepository.save(driver);
        System.out.printf("driver %s has been registered%n", driver.getName());
        return driver;
    }

    public void updateDriverAvailability(String driverId, Boolean isAvailable){
        Driver driver = driverRepository.findById(driverId);
        driver.setAvailable(isAvailable);
        driverRepository.save(driver);
    }


}
