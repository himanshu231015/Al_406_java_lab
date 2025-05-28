import java.io.Console;
import java.util.*;
public class ScannerDemo {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        // System.out.println("What's your name? ");
        // String name = scr.nextLine();                  //reads a line of input

        // String name = scr.next();                      // to read a single word or reads next word of input

        Console cons = System.console();
        String username = cons.readLine("User name : ");
        char[] pass = cons.readPassword("Password : ");
        System.out.println(pass);
    }
}
