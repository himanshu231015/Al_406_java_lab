//program for geting marks then analyze and then return result as atkt,fail,first,second,third. 
import java.util.Scanner;
public class Assignment1{
	public static void main(String args[]){
		Scanner scr = new Scanner(System.in);
		float sub1,sub2,sub3,sub4,sub5,total;
		int count=0;
		System.out.print("Enter number of subject1 : ");
		sub1 = scr.nextFloat();
		if(sub1 < 40){
			count += 1;
		}System.out.print("Enter number of subject2 : ");
		sub2 = scr.nextFloat();
		if(sub2 < 40){
			count += 1;
		}System.out.print("Enter number of subject3 : ");
		sub3 = scr.nextFloat();
		if(sub3 < 40){
			count += 1;
		}
		System.out.print("Enter number of subject4 : ");
		sub4 = scr.nextFloat();
		if(sub4 < 40){
			count += 1;
		}System.out.print("Enter number of subject5 : ");
		sub5 = scr.nextFloat();
		if(sub5 < 40){
			count += 1;
		}
		total = (sub1 + sub2 + sub3 + sub4 + sub5)/5;
		if (count == 0){
			if (60<=total && total<=100)
			{
				System.out.println("FINAL RESULT : First Division");
			}
				else if ( 50<=total && total<60)
			{
				System.out.println("FINAL RESULT : Second Division");
			}
				else
			{
				System.out.println("FINAL RESULT : Third Division");
			}
		}
		else if(count<=2){
			System.out.println("FINAL RESULT : atkt");
		}
		else{
			System.out.println("FINAL RESULT : Fail");
		}
		
	}	
}