import java.util.Scanner;
public class Assi17 {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        Name n = new Name();
        n.info();
        int year;
        System.out.print("enter year to check leap or not : ");
        year = scr.nextInt();
        if ((year % 400 == 0) || (year%4 == 0 && year%100 !=0)){
                System.out.println("leap year");
        }else{
            System.out.println("not a leap year");
        }
    }
}
