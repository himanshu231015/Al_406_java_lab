class ConsDemo
{
	int a,b,c;
	ConsDemo()
	{
		a = 9000;
	}
	ConsDemo(int x)
	{
		a = x;
	}
	ConsDemo(int x,int y)
	{
		a = x;
		b = y;
	}
	void m1(){
		System.out.println("A = " +a);
	}
	void m2(){
		System.out.println("A+B = "+(a+b));
	}
	public static void main(String args[]){
		ConsDemo d1 = new ConsDemo();
		ConsDemo d2 = new ConsDemo(1500);
		ConsDemo d3 = new ConsDemo(1500,4500);
		d1.m1();
		d2.m1();
		d3.m2();
	}
}