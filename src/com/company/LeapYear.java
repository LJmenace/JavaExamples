package com.company;

public class LeapYear {

    public static boolean isLeapYear(int year) {
        if ((year >= 1 && year <= 9999)) {
            return (year % 400 == 0 || year % 4 == 0) && (year % 100 != 0);
        }
        return false;
    }
}
