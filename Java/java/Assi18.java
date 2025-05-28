//Accept person age ,gender, then check whether person is eligible for marriage or not
import java.util.Scanner;
public class Assi18 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Name n = new Name();
        n.info();
        
        int age,gender;
        System.out.print("enter your age : ");
        age = scr.nextInt();
        System.out.print("your gender(1 for male & 0 for female) : ");
        gender = scr.nextInt();
        if (gender == 0){
            if (age > 18){
                System.out.println("eligible for marriage.");
            }else{
                System.out.println("not eligible for marriage.");
            }
        }else if (gender == 1){
            if (age > 21){
                System.out.println("eligible for marriage.");
            }else{
                System.out.println("not eligible for marriage.");
            }
        }else{
            System.out.println("invalid inputs.");
        }
    }
}