/*
 * Java Autoservice
 */
package autoservice;

import autoservice.car.Car;

/**
 *
 * @author Ovidiu
 */
public class Autoservice {
    
    static car m1, m2, m3;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             //5.a Create 3 instances of cars having different names, colors, speed, renting price and sale price
            // Create first car
            car m1 = new car("Mercedes", (short)130, Car.Color.YELLOW);
                m1.setRentPrice(100);
                m1.setSalePrice(15000);
             
             // Create second car
            car m2 = new car("Logan", (short)80, Car.Color.Blue);
                m2.setRentPrice(80);
                m2.setSalePrice(9000);
             
             // Create third car
            car m3 = new car("Renault", (short)80, Car.Color.BLACK);
                m3.setRentPrice(90);
                m3.setSalePrice(11000);
             
         
        /*
             5.b. Create a private method in Autoservice, methid named "void displayAutoservice()" that display all information about all cars in format:

                Car name: ......
                Car color: ......
                Car speed: ....
                Car renting price: ....
                Car sale price: ...... 
        */

        //5.c Display all informations about all cars calling the method displayAutoservice()
      

        //5.d Increase speed of first car with 10
        m1.increaseSpeed(m1.getSpeed()+10);
        //5.e Decrease speed of seco nd car with 10
        m2.decreaseSpeed(m2.getSpeed - 10);
        //5.f Increase renting price of third car with 15 and decrease its sale price with 1200

        //5.g Display all informations about all cars calling the method displayAutoservice()
    }
    /**
     * Method display all information in Autoservice
     */
    private static void displayAutoservice(){
        System.out.println("----------Autoservice----------");
        System.out.println("First car");
        System.out.println("Car name" + m1.getName());
        System.out.println("Car speed" + m1.getSpeed());
        System.out.println("Car color" + m1.getColor());
        System.out.println("Rentind price" + m1.getDailyRentPrice());
        System.out.println("Sale Price" + m1.getSalePrice());
        
        System.out.println("Second car");
        System.out.println("Car name" + m2.getName());
        System.out.println("Car speed" + m2.getSpeed());
        System.out.println("Car color" + m2.getColor());
        System.out.println("Rentind price" + m2.getDailyRentPrice());
        System.out.println("Sale Price" + m2.getSalePrice());
        
        System.out.println("Second car");
        System.out.println("Car name" + m3.getName());
        System.out.println("Car speed" + m3.getSpeed());
        System.out.println("Car color" + m3.getColor());
        System.out.println("Rentind price" + m3.getDailyRentPrice());
        System.out.println("Sale Price" + m3.getSalePrice());
    }
}

