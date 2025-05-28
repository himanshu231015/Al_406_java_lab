interface Demo
{
	void sales();
}
class LambdaDemo
{
	public static void main(String args[])
	{
		int x = 9000;
		Demo d1 = () ->{
			System.out.println("Hello, Indore " +x);
		};
		d1.sales();
	}
}
