/*
 * This program will create a new note pad file on the desktop
 */
package JavaNotepad;

/**
 *
 * @author Ovidiu
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class writer {
    public void writing() {
        try {
            //Whatever the file path is.
            File statText1 = new File(System.getProperty("user.home") + "/Desktop" + "/statsTest1.txt");
            FileOutputStream is = new FileOutputStream(statText1);
            OutputStreamWriter osw = new OutputStreamWriter(is);    
            Writer w = new BufferedWriter(osw);
            w.write("Hello Notepad !!!");
            w.close();
            File statText2 = new File(System.getProperty("user.home") + "/Desktop" + "/statsTest2.txt");
            FileOutputStream isd = new FileOutputStream(statText2);
            OutputStreamWriter oswd = new OutputStreamWriter(isd);    
            Writer wd = new BufferedWriter(oswd);
            wd.write("Hello Notepad 2 !!!");
            wd.close();
            File statText3 = new File(System.getProperty("user.home") + "/Desktop" + "/statsTest3.txt");
            FileOutputStream ist = new FileOutputStream(statText3);
            OutputStreamWriter oswt = new OutputStreamWriter(ist);    
            Writer wt = new BufferedWriter(oswt);
            wt.write("Hello Notepad 3 !!!");
            wt.close();
        } catch (IOException e) {
            System.err.println("Problem writing to the file statsTest1.txt");
            System.err.println("Problem writing to the file statsTest2.txt");
            System.err.println("Problem writing to the file statsTest3.txt");
        }
    }

    public static void main(String[]args) {
        writer write = new writer();
        write.writing();
    }
}
