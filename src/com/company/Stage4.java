package com.company;

public class Stage4 {

    public static void main(String[] args) {
        // Create variables for each attribute
        final int DISTANCE_INTERVAL = 100000; // The interval at which the costs of the cars will be checked
        int distanceDriven = 0;

        // Car one's attributes
        int carCost = 12000;
        double fuelCostPerLitre = 1.1;
        int kmPerLitre = 20;
        int serviceInterval = 15000;
        int serviceCost = 100;

        // Car two's attributes
        int secondCarCost = 18000;
        double secondFuelCostPerLitre = 1.4;
        int secondKmPerLitre = 35;
        int secondServiceInterval = 25000;
        int secondServiceCost = 100;

        // Compares the cost of each car until
        while (distanceDriven <= 1000000){
            double carOneTotalCost = (carCost + distanceDriven*((serviceCost/serviceInterval) + (fuelCostPerLitre/kmPerLitre)));
            double carTwoTotalCost = (secondCarCost + distanceDriven*((secondServiceCost/secondServiceInterval) + (secondFuelCostPerLitre/secondKmPerLitre)));
            System.out.printf("Car one total cost at %d km: %f%n", distanceDriven, carOneTotalCost);
            System.out.printf("Car two total cost at %d km: %f%n", distanceDriven, carTwoTotalCost);
            if (carOneTotalCost > carTwoTotalCost){
                System.out.printf("Car two becomes cheaper at %d kilometres.", distanceDriven);
                break;
            }
            distanceDriven += DISTANCE_INTERVAL;
        }
    }
}
