import java.util.Scanner;
class MatrixMltp
{
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int c[][] = new int[3][3];
		int i,j,k,sm = 0;
		
		System.out.println("Enter elements of first matrix: " );
		for (i = 0;i<3 ;i++ )
			for (j = 0; j<3 ;j++)
				a[i][j] = scr.nextInt();
		
		System.out.println("Enter elements of second matrix: ");
		for ( i=0;i<3 ;i++ )
			for(j = 0; j < 3;j++)
				b[i][j] = scr.nextInt();
		
		
		//logic for matrix multiplication
		for ( i = 0;i < 3;i++ ){
			for( j = 0;j < 3;j++){
				for(k = 0;k < 3;k++ ){ 
					sm = sm + a[i][k] * b[k][j];
				}
				c[i][j] = sm ;
				sm = 0;
			}
		}
		
		
		//Display result
		System.out.println("Resultant matrix: ");
		for (i = 0; i < 3; i++ ){
			for (j = 0; j < 3; j++ ){
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}