class TH1 implements Runnable
{
	public void run()
	{
		while(true)
		{
			System.out.println("Hello");
		}
	}
}
class TH2 implements Runnable
{
	public void run()
	{
		while(true)
		{
			System.out.println("Bye");
		}
	}
}

class THDemo2
{
	public static void main(String args[])
	{	
		//way of creating object
		TH1 t1 = new TH1();
		Thread p1 = new Thread(t1);         //first way
		Thread p2 = new Thread(new TH2());  //second way
		p1.start();
		p2.start();
	}
}