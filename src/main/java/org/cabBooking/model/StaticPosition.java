package org.cabBooking.model;

public class StaticPosition implements Position{

    private final double x;
    private final double y;

    public StaticPosition(double x, double y){
        this.x = x;
        this.y = y;
    }
    public StaticPosition(Position position){
        this.x = position.getX();
        this.y = position.getY();
    }


    @Override
    public double getX() {
        return 0;
    }

    @Override
    public double getY() {
        return 0;
    }
}
