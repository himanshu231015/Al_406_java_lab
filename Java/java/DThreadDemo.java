class ABC
{
	XYZ x1;                //reference variable of XYZ
	synchronized void m1()
	{
		System.out.println("I'm M1");
		x1.m4();
	}
	synchronized void m2()
	{
		System.out.println("I'm M2");
	}
}
class XYZ
{
	ABC a1;               //reference variable of ABC
	synchronized void m3()
	{
		System.out.println("I'm M3");
		a1.m2();
	}
	synchronized void m4()
	{
		System.out.println("I'm M4");
		
	}
}
class TH1 extends Thread
{
	ABC a2;
	public void run()
	{
		while(true)
		{
			a2.m1();
		}
	}
}
class TH2 extends Thread 
{
	XYZ x2;
	public void run()
	{
		while(true)
		{
			x2.m3();
		}
	}
}
class DThreadDemo
{
	public static void main(String args[])
	{
		ABC ab = new ABC();
		XYZ xy = new XYZ();
		TH1 t1 = new TH1();
		TH2 t2 = new TH2();
		ab.x1 = xy;
		xy.a1 = ab;
		t2.x2 = xy;
			t1.start();
			t2.start();
	}
}	
//deadlock can be avoided if a syncronized method of a class will not envoke another syncronized method of other class
//