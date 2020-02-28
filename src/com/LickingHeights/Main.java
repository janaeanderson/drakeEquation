package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    System.out.println("Drake Equation");
    drakeEquation();
    

    }

    public static void drakeEquation(){
/*Drake equation
N = number of intelligent species that can communicate with us
R∗ = 1 yr−1 (1 star formed per year, on the average over the life of the galaxy; this was regarded as conservative)
fp = 0.2 to 0.5 (one fifth to one half of all stars formed will have planets)
ne = 1 to 5 (stars with planets will have between 1 and 5 planets capable of developing life)
fl = 1 (100% of these planets will develop life)
fi = 1 (100% of which will develop intelligent life)
fc = 0.1 to 0.2 (10–20% of which will be able to communicate)
L = 1000 to 100,000,000 years (which will last somewhere between 1000 and 100,000,000 years)
 */

    int N;
    int rStar;
    double f_p;
    int numberOfExoplanets;
    double f_l;
    double f_i;
    double f_c;
    int L;

    Scanner
    Keyboard = new Scanner (System.in);


    System.out.println("How many stars are formed per year? options:1-6");
    rStar = Keyboard.nextInt();

    System.out.println("How many stars formed will have planets? options:0.2 or 0.5 ?");
    f_p = Keyboard.nextDouble();

    System.out.println("How many exoplanets are there?");
    numberOfExoplanets = Keyboard.nextInt();

    System.out.println("What percentage of these planets will develop life? options:100% ");
    f_l = Keyboard.nextDouble();

    System.out.println("What percentage of these plants will develop intelligent life? options:100%");
    f_i = Keyboard.nextDouble();

    System.out.println("what percentage of intelligent life will be able to communicate? options:10%-20%");
    f_c= Keyboard.nextDouble();

    System.out.println("How long will it last? options:1000-100,000 years");
    L = Keyboard.nextInt();

    System.out.println("How many intelligent species will be able to communicate with us?");
    N = Keyboard.nextInt();




    System.out.

    N = rStar * f_p * numberOfExoplanets * f_l * f_i * f_c * L;

    System.out.println("The number of intelligent species that are out there \n" +
            " that can communicate with us is: " + N);
    

    }

}
