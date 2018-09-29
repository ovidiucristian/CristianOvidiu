/*
 *Main Class 
 */
package HelloWorldAnonymousClasses;

/**
 *
 * @author Ovidiu
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    // TODO code application logic here
    public void sayHello() {
        Greet englishGreeting = new Hello();
        englishGreeting.greet();
        
        Greet frenchGreeting = new HelloFrench();
                frenchGreeting.greet();
        frenchGreeting.greetSomeone("Fred");
        
        Greet spanishGreeting = new HelloSpanish();
        spanishGreeting.greet();
    }

// main method
    public static void main(String... args) {
        HelloWorld myApp = new HelloWorld();
        myApp.sayHello();
    }
}
