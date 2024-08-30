package org.cabBooking.model;

public class DynamicPosition implements   Position{
    private double x ;
    private double y;

    @Override
    public String toString() {
        return "DynamicPosition{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public DynamicPosition(int x , int y){
        this.x = x;
        this.y = y;
    }



    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


}
