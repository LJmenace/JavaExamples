package com.hemenace;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (hourOfDay < 0 || hourOfDay > 24){
            return false;
        }
        return barking && (hourOfDay < 8 || hourOfDay > 22);
    }
}
