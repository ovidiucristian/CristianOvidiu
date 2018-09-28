/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelloWorldAnonymousClasses;

/**
 *
 * @author Ovidiu
 */
public class HelloSpanish extends Hello{
      String name = "Mundo";
      
      @Override
            public void greet() {
                greetSomeone("Mundo");
            }

      @Override
      public String greeting() {
                return "Hola ";
            }

}
