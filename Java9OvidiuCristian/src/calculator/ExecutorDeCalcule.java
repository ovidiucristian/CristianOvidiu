/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author Ovidiu
 */
public class ExecutorDeCalcule {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculator unCalculator = new Calculator();
        
        System.out.println("Introduceti primul numar:");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        
        System.out.println("Introduceti al doilea numar:");
        Scanner sc1 = new Scanner(System.in);
        int j = sc1.nextInt();
        
               
        System.out.println("Rezultatul este:");
        
        System.out.println("Adunare:");
        int iesireAdunare = unCalculator.aduna(i, j);
        System.out.println(iesireAdunare);
        
        System.out.println("Scadere:");
        int iesireScadere = unCalculator.scadere(i, j);
        System.out.println(iesireScadere);
        
        System.out.println("Inmultire:");
        int iesireInmultire = unCalculator.inmultire(i, j);
        System.out.println(iesireInmultire);
        
        System.out.println("Impartire:");
        int iesireImpartire = unCalculator.impartire(i, j);
        System.out.println(iesireImpartire);
        
      
    }
    
}