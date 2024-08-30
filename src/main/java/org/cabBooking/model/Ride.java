package org.cabBooking.model;

public class Ride {

    private String id;
    private String cabId;
    private String riderId;

    private Position source;
    private Position destination;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCabId() {
        return cabId;
    }

    public void setCabId(String cabId) {
        this.cabId = cabId;
    }

    public String getRiderId() {
        return riderId;
    }

    public void setRiderId(String riderId) {
        this.riderId = riderId;
    }

    public Position getSource() {
        return source;
    }

    public void setSource(Position source) {
        this.source = source;
    }

    public Position getDestination() {
        return destination;
    }

    public void setDestination(Position destination) {
        this.destination = destination;
    }
}
