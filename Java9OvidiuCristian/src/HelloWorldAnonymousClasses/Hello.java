/*
 * Class Hello
 */
package HelloWorldAnonymousClasses;

/**
 *
 * @author Ovidiu
 */
public class Hello implements Greet{
    String name = "world";

            @Override
            public void greet() {
                greetSomeone("World");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println(greeting() + name);
            }
    
            public String greeting() {
                return "HELLO ";
            }
}
