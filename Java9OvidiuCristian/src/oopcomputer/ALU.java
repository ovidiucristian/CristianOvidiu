/*
 *Aritmetical and logical unit
 */
package oopcomputer;

/**
 *
 * @author Ovidiu
 */
public class ALU {
    
    private Integer operantUnu;
    private Integer operantDoi;
    private Integer rezultat;
    private Character operator;

    public Character getOperator() {
        return operator;
    }

    public void setOperator(Character operator) {
        this.operator = this.operator;
    }

    public Integer getOperantUnu() {
        return operantUnu;
    }

    public void setOperantUnu(Integer operantUnu) {
        this.operantUnu = operantUnu;
    }

    public Integer getOperantDoi() {
        return operantDoi;
    }

    public void setOperantDoi(Integer operantDoi) {
        this.operantDoi = operantDoi;
    }

    public Integer getRezultat() {
        return rezultat;
    }

    public void setRezultat(Integer rezultat) {
        this.rezultat = rezultat;
    }

      public void calculeaza() {

        switch (operator) {
            case '+':
                rezultat = operantUnu + operantDoi;
                break;
            case '-':
                rezultat = operantUnu - operantDoi;
                break;
            case '*':
                rezultat = operantUnu + operantDoi;
            case '/':
                rezultat = operantUnu - operantDoi;
                break;
            default:
                System.out.println("Operatorul este incorect. Folositi +, -, * sau /");
        }

        
        
    }
    
    
    
}
