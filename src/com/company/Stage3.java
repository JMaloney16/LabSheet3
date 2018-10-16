package com.company;

public class Stage3 {

    public static void main(String[] args) {
        // Create variables for each attribute
        int carCost = 12000;
        int serviceCost = 100;
        int serviceInterval = 15000;
        int kmPerLitre = 20;
        double fuelCostPerLitre = 1.1;
        int distanceDriven = 0;

        //System.out.println(12000 + 100000*((100/15000) + (1.1/20)));

        // Print out the total cost
        System.out.println(carCost + distanceDriven*((serviceCost/serviceInterval) + (fuelCostPerLitre/kmPerLitre)));
    }
}
