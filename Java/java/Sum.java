//Program to get sum of digits of entered integer.
import java.util.Scanner;
public class Sum
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num,sum = 0,rem;
		System.out.print("enter integer value : ");
		num = sc.nextInt();
		if(num>0){
			while(num!=0){
				rem = num%10;
				sum += rem;
				num /=10;
			}
			System.out.println("sum : " +sum);
		}else{
			System.out.println("invalid input");
		}
	}
	
}