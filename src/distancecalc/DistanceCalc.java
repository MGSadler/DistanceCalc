package distancecalc;

import java.util.Scanner;

public class DistanceCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fuel;
        double milesPerGallon;
        
        System.out.print("Enter present fuel (in gallons) in vehicle: ");
        fuel = input.nextDouble();
        
        System.out.print("Enter vehicle fuel efficiency (miles per gallon): ");
        milesPerGallon = input.nextDouble();
        
        System.out.println("You are able to travel " + String.format("%.2f", fuel * milesPerGallon) + " miles on remaining fuel");
    }
    
}
