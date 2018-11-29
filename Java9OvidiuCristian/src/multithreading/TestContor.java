/*
 * Testeaza incrementarea si devrementarea unui contor de catre doua threaduri
 *paralele
 */
package multithreading;

import com.sun.org.apache.xerces.internal.impl.io.ASCIIReader;


/**
 *
 * @author Ovidiu
 */
public class TestContor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Contor contor = new Contor();
        Adunare aduna = new Adunare(contor);
        Scadere scade = new Scadere(contor);
        
    try {
        //for(int i=0; i<500;i++){
        
                                      
            aduna.start();
        System.out.println(contor.getValoare());
            scade.start();
        System.out.println(contor.getValoare());
        
            
    //}
    }
        catch (java.lang.IllegalThreadStateException e){
        System.out.println(e.getMessage());
    }
}
    }

  
 
