class StaDemo
{
	static int x;
	public static void main(String agrs[]){
		StaDemo d1 = new StaDemo();
		StaDemo d2 = new StaDemo();
		StaDemo d3 = new StaDemo();
		d1.x = 1000;
		d2.x = 3000;
		d3.x = 5000;
	//	x = 9000;
		System.out.println(d1.x);
		System.out.println(d2.x);
		System.out.println(d3.x);
	}
}