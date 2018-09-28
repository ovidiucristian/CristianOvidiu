/*
 * Java Autoservice
 */
package autoservice;

/**
 *
 * @author Ovidiu
 */
public class Autoservice {

    static Car m1, m2, m3;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //5.a Create 3 instances of Cars having different names, colors, speed, renting price and sale price
        // Create first Car
        m1 = new Car("Mercedes", (short) 100 , Car.Color.YELLOW);
        m1.setRentPrice(100);
        m1.setSalePrice(15000);

        // Create second Car
        m2 = new Car("Logan", (short) 80, Car.Color.BLUE);
        m2.setRentPrice(80);
        m2.setSalePrice(9000);

        // Create third Car
        m3 = new Car("Renault", (short) 80, Car.Color.BLACK);
        m3.setRentPrice(90);
        m3.setSalePrice(11000);

        /*
             5.b. Create a private method in Autoservice, methid named "void displayAutoservice()" that display all information about all Cars in format:

                Car name: ......
                Car color: ......
                Car speed: ....
                Car renting price: ....
                Car sale price: ...... 
         */
        //5.c Display all informations about all Cars calling the method displayAutoservice()
        //5.d Increase speed of first Car with 10
        m1.increaseSpeed((short) (m1.getSpeed() + 10));
        //5.e Decrease speed of seco nd Car with 10
        m2.decreaseSpeed((short) (m2.getSpeed() - 10));
        //5.f Increase renting price of third Car with 15 and decrease its sale price with 1200

        //5.g Display all informations about all Cars calling the method displayAutoservice()
        displayAutoservice();
    }

    public Autoservice() {
    }

    public static void setM1(Car m1) {
        Autoservice.m1 = m1;
    }

    public static void setM2(Car m2) {
        Autoservice.m2 = m2;
    }

    public static void setM3(Car m3) {
        Autoservice.m3 = m3;
    }

    /**
     * Method display all information in Autoservice
     */
    private static void displayAutoservice() {
        System.out.println("----------Autoservice----------");
        System.out.println("First Car");
        System.out.println("Car name" + m1.getName());
        System.out.println("Car speed" + m1.getSpeed());
        System.out.println("Car color" + m1.getColor());
        System.out.println("Rentind price" + m1.getDailyRentPrice());
        System.out.println("Sale Price" + m1.getSalePrice());

        System.out.println("Second Car");
        System.out.println("Car name" + m2.getName());
        System.out.println("Car speed" + m2.getSpeed());
        System.out.println("Car color" + m2.getColor());
        System.out.println("Rentind price" + m2.getDailyRentPrice());
        System.out.println("Sale Price" + m2.getSalePrice());

        System.out.println("Second Car");
        System.out.println("Car name" + m3.getName());
        System.out.println("Car speed" + m3.getSpeed());
        System.out.println("Car color" + m3.getColor());
        System.out.println("Rentind price" + m3.getDailyRentPrice());
        System.out.println("Sale Price" + m3.getSalePrice());
    }
}
