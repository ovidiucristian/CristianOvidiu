/*
 * Clasa Plana
*/
package tdd;

/**
 *
 * @author Ovidiu
 */
public class Plana extends FiguraGeometrica{
    
    public static final String PLANA = " plane";
    
    /**
     * 
     * @return definition 
     */
    
    @Override
    public String getDefinition(){
        String definition = super.O + PLANA + super.Figura;
        return definition;
    }
    
}

