/*
 * Class HelloFrench
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
