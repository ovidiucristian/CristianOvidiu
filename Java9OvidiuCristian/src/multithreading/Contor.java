/*
 * 
 */
package multithreading;

/**
 *
 * @author Ovidiu
 */
public class Contor {
    
    private volatile double valoare =0.0;
    
    public synchronized void incrementeaza() {
        valoare ++;
    }
    


 public synchronized void decrementeaza() {
        valoare --;
    }
    


public double getValoare(){

return valoare;
}
}