class OCJP1
{
	public static boolean foo(char p)
	{
		System.out.print(p);
		return true;
	}
	public static void main(String args[])
	{
		int i = 0 ;
		for(foo('A');i<3 && foo('B');foo('D'))
		{
			foo('C');
			i++;
		}
	}
}