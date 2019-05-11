package com.company;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Decimal_Comparator {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
    }

    public static boolean areEqualByThreeDecimalPlaces( double num1, double num2){

        DecimalFormat threeDP = new DecimalFormat("##.000");

        if (num1 > 0)
            threeDP.setRoundingMode(RoundingMode.FLOOR);
        else
            threeDP.setRoundingMode(RoundingMode.CEILING);

        System.out.println(threeDP.format(num1));
        System.out.println(threeDP.format(num2));

        if (threeDP.format(num1).equals(threeDP.format(num2))){
            return true;
        }

        return false;
    }
}
