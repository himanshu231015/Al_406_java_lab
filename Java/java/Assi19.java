import java.util.Scanner;

public class Assi19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Name n = new Name();
        n.info();
        int num;
        System.out.print("Enter number to print table : ");
        num = sc.nextInt();
        for(int i = 1;i<=10;i++){
            int result = i*num;
            System.out.printf("%d X %d = %d\n",num,i,result);
        }
    }
}
