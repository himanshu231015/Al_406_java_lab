
import java.util.*
;public class A2_parity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        try{
            System.out.print("enter number : ");
            num = sc.nextInt();
        }catch(Exception tt){
            System.out.println(tt);
        }

        if(num%2==0){
            System.out.println("Even number");
        }else if (num%2 != 0){
            System.out.println("odd number");
        }else{
            System.out.println("wrong input");
        }
    }
}
