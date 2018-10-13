/*
 * Boton
 */
package oopcomputer;

/**
 *
 * @author Ovidiu
 */
public class Buton {
    
    private Character simbol = ' ';
    private Carcasa stapana; 
    
    public Buton(Character noulSimbol){
        simbol = noulSimbol;
    }
    
    public Buton(Character noulSimbol, Carcasa nouaCarcasa){
        simbol = noulSimbol;
        stapana = nouaCarcasa;
    }

    Buton(char c, Carcasa aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void apasa(){
        Ecran ecranTemporar = stapana.getEcran();
        ecranTemporar.setAfisaj(simbol.toString());

    }
    
    
    
    
    
}
