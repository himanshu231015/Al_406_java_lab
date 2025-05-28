//convert temperature from Fahrenheit to celsius
import java.util.Scanner;
public class Assi11 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Name n = new Name();
        n.info();
        float Fahrenheit;
        System.out.print("Enter temperature in Fahrenheit : ");
        Fahrenheit = scr.nextFloat();   
        System.out.println("temperature in celsius is : " + (5*(Fahrenheit-32)/9));
    }
}
