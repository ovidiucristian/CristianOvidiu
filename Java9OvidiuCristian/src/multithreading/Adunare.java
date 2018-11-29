/*
 *clasa este un thread paralale care va adauga o unitata de un obiect tip contor
 */
package multithreading;

/**
 *
 * @author Ovidiu
 */
public class Adunare extends Thread{
    
    private Contor contor;
    
    public Adunare (Contor contorulComun){
        
        contor = contorulComun;
    }
    @Override
    public void run(){
        
        for(int i=0; i<5000;i++){
        contor.incrementeaza();
       // System.out.println(contor.getValoare());
        }
    }
}
