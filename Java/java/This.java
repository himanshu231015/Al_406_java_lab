class This
{
	int a, b;
	This()
	{
		this(1000);
	}
	This(int x)
	{
		this(x,2000);
	}
	This(int x, int y)
	{
		a = x;
		b = y;
	}
	 
	void m2()
	{
		System.out.println("Ans " +(a+b));
	}
	public static void main(String args[]){
		This s1 = new This();
		s1.m2();
	}
}