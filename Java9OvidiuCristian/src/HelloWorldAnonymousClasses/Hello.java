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
