package org.cabBooking.model;

public class Cab {
    private String id;
    private String modelName;
    private String driverId;

    private Position position;
    private Boolean isRiding;


    public Cab(String modelName) {
        this.modelName = modelName;
    }
    public Cab(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Position getCurrentPosition() {
        return position;
    }

    public void setCurrentPosition(Position position) {
        this.position = position;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public Boolean getRiding() {
        return isRiding;
    }

    public void setRiding(Boolean riding) {
        isRiding = riding;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
