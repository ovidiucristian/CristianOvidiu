/*
 * Class Patrulater
 */
package tdd;

/**
 *
 * @author Ovidiu
 */
public class Patrulater extends Plana {
    
    public static final String PATRULATER= " with four straight sides";
    
    @Override
    public String getDefinition(){
        
       String definitie =  super.getDefinition() + PATRULATER;
       return definitie;
    }
    
}
