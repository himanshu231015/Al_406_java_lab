import java.util.Scanner;
public class Table{
	public static void main(String args[]){
		int num;
		Scanner scr = new Scanner(System.in);
		System.out.print("enter number to get table : ");
		num = scr.nextInt();
		for (int i = 1;i <= 10 ;i++){
			System.out.println(num+ " X " +i+ " = "  +i*num);
		}
	}
}