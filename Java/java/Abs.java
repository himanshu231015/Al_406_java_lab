abstract class Abs
{
	void m1()
	{
		System.out.println("hello, Indore!");
	}
}
class Demo extends Abs
{
	void m2()
	{
		System.out.println("Hi, India!");
	}
	public static void main(String args[])
		{
		Abs d1 = new Demo();
		d1.m1();
		//d1.m2();
		}
}