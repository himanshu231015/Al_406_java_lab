import java.util.Scanner;
class TDArray
{
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int c[][] = new int[3][3];
		int i,j,k,sm = 0;
		
		for (i = 0;i<3 ;i++ )
			for (j = 0; j<3 ;j++)
				a[i][j] = scr.nextInt();
	}
}