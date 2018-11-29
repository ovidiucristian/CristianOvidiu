/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopcomputer;

/**
 *
 * @author Ovidiu
 */
public class Ecran {

    public Ecran(Carcasa nouaStapana) {
        this.stapana = nouaStapana;
    }

    private String afisaj = "0";

    private Carcasa stapana;


    public String getAfisaj() {
        return afisaj;
    }

    public void setAfisaj(String afisaj) {
        switch (afisaj) {
            case "+":
                operatiuneLocala('+');
                break;
            case "-":
                operatiuneLocala('-');
                break;
            case "/":
                operatiuneLocala('/');
                break;
            case "*":
                operatiuneLocala('*');
                break;
            case "=":
               
                System.out.println(this.afisaj);
                
                break;
            default:
                this.afisaj = this.afisaj + afisaj;
                int operandUnu = stapana.getAlu().getOperantUnu();
                int operandDoi = stapana.getAlu().getOperantDoi();
                int afisajInt = Integer.parseInt(this.afisaj);
                if (0 == operandUnu || ' ' == stapana.getAlu().getOperator()) {

                    stapana.getAlu().setOperantUnu(afisajInt);
                    System.out.println(this.afisaj);
                } else if (0 == operandDoi) {
                    stapana.getAlu().setOperantUnu(afisajInt);
                    System.out.println(this.afisaj);

                }
                 {
                    // if(stapana.getAlu().getOperantUnu() == '0')()
                }
                this.afisaj = afisaj;
        }
        /**
         * private method for computation
         *
         *
         */
        /**
         * private method for computation
         *
         * @param c
         */
        
    }
       private void operatiuneLocala (char c){
       // stapana.getAlu().setOperantUnu(Integer.getInteger(afisaj));
        stapana.getAlu().setOperator(c);
        afisaj = Character.toString(c);

    }
}