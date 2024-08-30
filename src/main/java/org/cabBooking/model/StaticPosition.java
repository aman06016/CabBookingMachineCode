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
    public String toString() {
        return "StaticPosition{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public double getX() {
        return this.x;
    }

    @Override
    public double getY() {
        return this.y;
    }
}
