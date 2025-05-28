//program to print pattern

//    #
//   ###
//  #####
// #######


import java.util.Scanner;
public class Pattern5
{
	public static void main(String args[]){
		Scanner scr = new Scanner(System.in);
		int n,i,j,k;
		System.out.print("enter number : ");
		n = scr.nextInt();
		for (i=0;i<n ; i++)
		{
			for (j=0;j< n-i ;j++ )
			{
				System.out.print(" ");
			}
			for (k=0;k<=i+i ;k++ )
			{
				System.out.print("#");
			}
		System.out.println();
		}
		
	}
}