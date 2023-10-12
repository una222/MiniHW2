package oocminihw2;

import Vehicle.Airplane;
import Vehicle.Car;
import Vehicle.Boat;
import Vehicle.Drivable;
import Vehicle.Flyable;
import Vehicle.Sailable;

public class OOCMiniHW2 {

    public static void main(String[] args) {
        // Create a car (Drivable)
        Drivable car = new Car("Toyota", "Sedan", 4);
        car.accelerate(60); 
        car.turn(45); 
        System.out.println("Car make: " + car.getMake());
        System.out.println("Car type: " + car.getType());
        System.out.println("Car speed: " + car.getSpeed() + " km/h");
        System.out.println("Car direction: " + car.getDirection() + " degrees");
       

        // Create an airplane (Flyable)
        Flyable airplane = new Airplane();
        airplane.changeAltitude(10000); 
        System.out.println("Airplane altitude: " + airplane.getAltitude() + " feet");
  

        // Create a boat (Sailable)
        Sailable boat = new Boat();
        boat.hoistSail(); 
        System.out.println("Is the sail hoisted? " + boat.isSailHoisted());
        
    }
}
