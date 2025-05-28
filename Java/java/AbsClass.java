abstract class Abs
{
	abstract void m1();
}
class AbsClass extends Abs
{
	void m1()
	{
		System.out.println("hello, world");
	}
	public static void main(String args[]){
		Abs d1 = new AbsClass();
		d1.m1();
	}
}