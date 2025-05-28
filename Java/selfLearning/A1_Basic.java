import java.util.Scanner;
public class A1_Basic {
    public static void main(String[] args) {
        // output in java without new line
        System.out.print("first command :) \n");   //using newline char  

        // output in java with new line
        System.out.println("Hello world with java");

        // defining variable
        // java is a "typed language"
        int a = 25,b = 10;
        String name = "Harry";
        double price = 34.54;
        int sum = a+b;
        System.out.println(sum);
        System.out.println(a-b);

        Scanner sc = new Scanner(System.in);
        // String name1 =sc.next();   //takes only input before space or just single word
        String name2 = sc.nextLine();
        // System.out.println(name1);
        System.out.println(name2);


    }

}
