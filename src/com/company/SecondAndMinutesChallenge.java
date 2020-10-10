package com.company;

public class SecondAndMinutesChallenge {

    public static void main(String[] args) {

       String result = getDurationString(61,60);
        System.out.println(result);
    }

    public static String getDurationString(double minutes, double seconds) {

            int  hours =  (int) minutes / 60;
           int minutesLeftAfterHours =(int) minutes % 60;
            int secondsToMinutes =(int) seconds / 60;
            int secondsLeftAfterMinutes =(int) seconds % 60;

            if (seconds >= 3600){
                hours = hours + ((int) seconds / 3600);
                return hours + "h " + minutesLeftAfterHours + "m " + secondsLeftAfterMinutes + "s";
            }

        if (seconds >= 60){
            minutesLeftAfterHours = minutesLeftAfterHours + secondsToMinutes;
            return hours + "h " + minutesLeftAfterHours + "m " + secondsLeftAfterMinutes + "s";
        }

        if ((minutes >= 0) || (seconds < 59)) {

            return hours + "h " + minutesLeftAfterHours + "m " + secondsLeftAfterMinutes + "s";

           }

            /*
           60 seconds = 1 minute
           3600 seconds = 1 hour
           60 minutes = 1 hour
            */

           /* Create a method called getDurationString with two parameters,
           first parameter minutes and 2nd parameter seconds.

            You should validate that the first parameter minutes is >= 0.

            You should validate that the 2nd parameter seconds is >= 0 and <= 59.

            The method should return Invalid value in the method if either of the above are not true.

            If the parameters are valid then calculate
            how many hours minutes and seconds equal the minutes and seconds passed to this method
            and return that value as string in format "XXh YYm ZZs"
            where XX represents a number of hours, YY the minutes and ZZ the seconds.

            Create a 2nd method of the same name but with only one parameter seconds.
            Validate that it is >= 0, and return ÅgInvalid valueÅh if it is not true.

            If it is valid, then calculate how many minutes are in the seconds value and
            then call the other overloaded method passing the correct minutes and seconds calculated so that it can calculate correctly.

            Call both methods to print values to the console.

            Tips:
            Use int or long for your number data types is probably a good idea.
            1 minute = 60 seconds and 1 hour = 60 minutes or 3600 seconds.
           Methods should be static as we have used previously.

                    Bonus:
            For the input 61 minutes output should be 01h 01m 00s, but it is ok if it is 1h 1m 0s (Tip: use if-else)
            Create a new console project and call it SecondsAndMinutesChallenge

*/



        return "Invalid value";
    }

}
