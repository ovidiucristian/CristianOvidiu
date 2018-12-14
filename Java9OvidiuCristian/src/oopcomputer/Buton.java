/*
 * Clasa buton din care vom creea butoanele
 */
package oopcomputer;

/**
 *
 * @author Ovidiu
 */
public class Buton {
    
    private Character simbol;
    private Carcasa stapana;
    
    public Buton(Character noulSimbol){
        simbol = noulSimbol;
    }
    public Buton(Character noulSimbol, Carcasa nouaCarcasa){
        simbol = noulSimbol;
        stapana = nouaCarcasa;
    }

    /**
     *
     */
    public void apasa(){
        Ecran ecranTemporar = stapana.getEcran();
        ecranTemporar.setAfisaj(simbol.toString());
    }
}
