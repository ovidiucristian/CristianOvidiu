/*
 * Aritmetical and Logical Unit
 */
package oopcomputer;

/**
 *
 * @author Ovidiu
 */
public class Alu {
    
    private Integer operandUnu = 0;
    private Integer operandDoi = 0;
    private Character operator = ' ';
    private Integer rezultat = 0;

    public Character getOperator() {
        return operator;
    }

    public void setOperator(Character operator) {
        this.operator = operator;
    }

    public Integer getOperandUnu() {
        return operandUnu;
    }

    public void setOperandUnu(Integer operandUnu) {
        this.operandUnu = operandUnu;
    }

    public Integer getOperandDoi() {
        return operandDoi;
    }

    public void setOperandDoi(Integer operandDoi) {
        this.operandDoi = operandDoi;
    }

    public Integer getRezultat() {
        return rezultat;
    }

    public void setRezultat(Integer rezultat) {
        this.rezultat = rezultat;
    }

    
    public void calculeaza(){
        
        switch (operator){
        
            case '+': 
                rezultat = operandUnu + operandDoi;
                break;
            case '-': 
                rezultat = operandUnu - operandDoi;
                break;
            case '*': 
                rezultat = operandUnu * operandDoi;
                break;
            case '/': 
                rezultat = operandUnu / operandDoi;
                break;
            default: 
                System.out.println("Operatorul este incorect. Folositi +, -, * sau /");
        }
    }
}
