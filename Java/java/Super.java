class Base
{
	int a;
	Base(int x){
		a = x;
	}
}
class Super extends Base
{
	int b,c;
	Super(int x, int y, int z)
	{
		super(x);
		b = y;
		c = z;
	}
	void m2()
	{
		System.out.println("A+B+C = "+(a+b+c));
	}
	public static void main(String args[])
	{
		Super d1 = new Super(1000,2000,3000);
		d1.m2();
	}
}