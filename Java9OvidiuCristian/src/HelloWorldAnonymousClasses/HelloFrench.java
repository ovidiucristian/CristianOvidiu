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
public class HelloFrench extends Hello{
      String name = "tot le monde";
      
      @Override
            public void greet() {
                greetSomeone("Tot le monde");
            }

      @Override
      public String greeting() {
                return "Salute ";
            }

}
