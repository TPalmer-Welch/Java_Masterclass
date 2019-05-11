package com.company;

public class Speed_Conversion {

    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }

    public static long toMilesPerHour( double kilometresPerHour ){

        if ( kilometresPerHour >= 0 )
            return Math.round( kilometresPerHour / 1.609 );

        return -1;
    }

    public static void printConversion( double kilometresPerHour ){

        if ( kilometresPerHour >= 0) {
            System.out.println( kilometresPerHour  + " km/h = " + toMilesPerHour( kilometresPerHour ) + " mi/h");
        }
        else{
            System.out.println("Invalid Value");
        }
    }
}
