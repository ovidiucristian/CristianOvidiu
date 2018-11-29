/*
 * clasa este un thread paralale care o sa scada o unitata de un obiect tip contor
 */
package multithreading;

/**
 *
 * @author Ovidiu
 */
public class Scadere extends Thread{
    
    private Contor contor;
    
    public Scadere (Contor contorulComun){
        
        contor = contorulComun;
    }
    @Override
    public void run(){
               
        for(int i=0; i<5000;i++){
        contor.decrementeaza();
       // System.out.println(contor.getValoare());
        }
    }
}

