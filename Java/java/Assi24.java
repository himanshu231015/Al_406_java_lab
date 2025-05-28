import java.util.Scanner;

public class Assi24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number : ");
        int num1 = sc.nextInt();
        System.out.printf("enter number greater than %d : ",num1);
        int num2 = sc.nextInt();
        boolean isPrime = true;
        if (num2 < num1){
            System.out.println("num2 is less than num1");
        }else{
            int i,half = num2/2;
            if(num2 <= 1){
                isPrime = false;
            }else{
                for(i = num1;i<=num2;i++){
                    if(num1%i == 0 ){
                        // isPrime = false;
                        System.out.println(i);
                        // break;
                    }
                }
            }
        }
        

    }
}
