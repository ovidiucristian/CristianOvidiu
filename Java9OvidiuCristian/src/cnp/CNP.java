/*
 * Program for validate CNP
 */
package cnp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Ovidiu
 */
public class CNP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please write your CNP: ");

        String txt = input.next();

        String regex = "(^[1-2]((0[1-9]|1[012])(0[1-9]|1\\d|2[0-8])|((0[13578]|1[02])(29|3[01]))|((0[469]|11)(29|30)))\\d{8}$)"
                + "|(^[1-2]0229\\d{2}(04|08|[2468][048]|[13579][26])\\d{4}$)|(^[1-2]0229([02468][048]|[13579][26])00\\d{4}$)";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(txt);

        if (matcher.find()) {
            System.out.println("VALID");
        } else {
            System.out.println("INVALID");
        }
    }

}