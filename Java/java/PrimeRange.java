import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the starting number (num1): ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter the ending number (num2): ");
        int num2 = sc.nextInt();
        
        if(num2<num1){
            System.out.println("num2 is smaller.");
        }else{
            System.out.println("Prime numbers between " + num1 + " and " + num2 + " are:");
            
            for (int i = num1; i <= num2; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }
}
