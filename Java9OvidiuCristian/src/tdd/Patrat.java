/*
 * Class Dreptunghi
 */
package tdd;

/**
 *
 * @author Ovidiu
 */
public class Patrat extends PatrulaterDreptunghic {
    
    public static final String  PATRAT = " equal";
    public static final String  PATRAT_BEGIN = " SQUARE:";
    
    
    @Override
    public String getDefinition (){
        
        String definition =PATRAT_BEGIN+ super.getDefinition().substring(0, 21) + PATRAT + super.getDefinition().substring(25);
        return definition;
    }
    
    
    
}
