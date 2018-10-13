/*
 * Test calculator
 */
package oopcomputer;

import java.util.Scanner;

/**
 *
 * @author Ovidiu
 */
public class TescCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // carcasa calculator
    Carcasa calculator = new Carcasa();
    // Apasam pe butoane pana apare un operator
    //Scanner scanner = new Scanner(System.in);
    
        calculator.buton1.apasa();
        calculator.buton2.apasa();
        calculator.buton3.apasa();
        calculator.butonPlus.apasa();
        calculator.buton3.apasa();
        calculator.buton2.apasa();
        calculator.buton1.apasa();
        // Apasam butoane pana apare =
        calculator.butonEgal.apasa();

    // Apasam butoane pana apare =
    
    // cum afisam rezultatul? sa legam clasa buton de clasa ecran
    
    
    }
    
}
