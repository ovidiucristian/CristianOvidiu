/*
 *Class HelloSpanish
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
