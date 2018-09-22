
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ovidiu
 */
public class Autoservice {

    private static Object displayAutoserviceObject;

public static class Car {
    
    String name;
    Short speed;
    String color;
    int rentingPrice;
    int salePrice;
}
    /**
     */

public static void main(String[] args) {
        // TODO code application logic here
          
   Car c1 = new Car();
    
    c1.name = "Logan";
    c1.color = "white";
    c1.speed = 110;
    c1.rentingPrice = 200;
    c1.salePrice = 9800;
    
   Car c2 = new Car();
    
    c2.name = "Duster";
    c2.color = "blue";
    c2.speed = 100;
    c2.rentingPrice = 350;
    c2.salePrice = 14000;
    
   Car c3 =new Car ();
    
    c3.name = "Sandero";
    c3.color = "red";
    c3.speed = 80;
    c3.rentingPrice = 270;
    c3.salePrice = 11000;
    

    
   
    
   // System.out.println("Car Color:" + c1.name);//

    
 }
    void displayAutoservice(){
       
    
}
   System.out.println(displayAutoservice())
}

    
    
    


    


