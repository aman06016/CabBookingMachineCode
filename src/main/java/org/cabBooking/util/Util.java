package org.cabBooking.util;

import org.cabBooking.constants.Constants;
import org.cabBooking.model.Position;

public class Util {

    public static Boolean isDistanceAcceptable(Position drivePos, Position riderPos){
        double x1 = drivePos.getX();
        double y1 = drivePos.getY();

        double x2 = riderPos.getX();
        double y2 = riderPos.getY();

        double dist =  Math.sqrt(Math.abs(  Math.pow(x1-x2,2) - Math.pow(y1-y2,2)));

        return dist <= Constants.PreferredDistance.ACCEPTED_DISTANCE;

    }


}
