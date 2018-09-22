/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoservice;

/**
 *
 * @author Ovidiu
 */
public class car {

    int getSpeed;

    car(String mercedes, short s, Car.Color color) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setRentPrice(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setSalePrice(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getSpeed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getColor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getDailyRentPrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getSalePrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void decreaseSpeed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void decreaseSpeed(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void increaseSpeed(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static class Car implements Saleable, Rentable{
 /**
 @enum enumeration of accepted car colors
 */
        public enum Color { WHITE, RED, YELLOW, GREEN, GRAY, BLACK, Blue };
 /**
 Internal hidden fields / attributes
 */
 private Color color;
 private String name;
 private short speed;

        public int getRentPrice() {
            return rentPrice;
        }

        public static boolean isRENTABLE() {
            return RENTABLE;
        }

        public static boolean isSALEABLE() {
            return SALEABLE;
        }
 private int salePrice;

        public void setSalePrice(int salePrice) {
            this.salePrice = salePrice;
        }

        public void setRentPrice(int rentPrice) {
            this.rentPrice = rentPrice;
        }
 private int rentPrice;
 /**
 Constructors
 */
 public Car(){
 name = "Default car name";
 speed = 90;
 }
 public Car(String carName, short carSpeed, Color carColor){
 name = carName;
 speed = carSpeed;
 color = carColor;
 }
 /*get-ers and set-ers*/
 public String getName(){
 return(name);
 }
 public Color getColor(){
 return(color);
 }
 public short getSpeed(){
 return(speed);
 }
 public void setName(String newName){
 name = newName;
 }
 public void setColor(Color newColor){
 color = newColor;
 }
 public void setSpeed(short newSpeed){
 speed = newSpeed;
 }
 /**
 The method increase actual speed of Car until final speed specified.
 * @param newSpeed is new speed
 */
 public void increaseSpeed(short newSpeed){
 if(newSpeed > speed){
 speed = newSpeed;
 }
 else if (newSpeed < speed){
 decreaseSpeed(newSpeed);
 }
 }
 /**
 The method decrease actual speed of Car until final speed specified.
 * @param newSpeed is new speed
 */
 public void decreaseSpeed(short newSpeed){
 if(newSpeed < speed){
 speed = newSpeed;
 }
 else if (newSpeed < speed){
 increaseSpeed(newSpeed);
 }
 }
 /**
 Abstract method defined in Saleable interface implemented by class car
 * is implemented here.
 * @override Saleable.getSalePrice() method
 */
 @Override
 public int getSalePrice(){
 return(salePrice);
 }
 /**
 Abstract method defined in Rentable interface implemented by class car
 * is implemented here.
 * @override Rentable.getDailyRentPrice() method
 */
 public int getDailyRentPrice(){
 return(rentPrice);
 }
    }
}