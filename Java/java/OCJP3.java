class OCJP3
{
	public static void main(String args[])
	{
		int i = 0,j = 10;
		do{
			if (i++ < --j)
			{
				continue;
			}
		}while(i<5);
		System.out.println("I = " +i);
		System.out.println("J = " +j);
	}
}