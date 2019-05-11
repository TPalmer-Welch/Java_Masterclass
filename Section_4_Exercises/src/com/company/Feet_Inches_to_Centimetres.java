package com.company;

public class Feet_Inches_to_Centimetres {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimetres(6,2));
        System.out.println(calcFeetAndInchesToCentimetres(157));
    }

    public static double calcFeetAndInchesToCentimetres( int feet, double inches ){

        double cm = 0;

        if ( feet >= 0 && inches >=0 && inches <= 12 ){
            cm += feet * 30.48;
            cm += inches * 2.54;
            return cm;
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimetres( double inches ){
        int feet;
        double remInches;
        if (inches >=0 ){
            feet =  (int) inches / 12;
            remInches = inches % 12;
            return calcFeetAndInchesToCentimetres( feet, remInches );
        }
        return -1;
    }
}
