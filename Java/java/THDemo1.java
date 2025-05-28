class TH1 extends Thread
{
	public void run()
	{
		while(true)
		{
			System.out.println("Hello");
		}
	}
}
class TH2 extends Thread
{
	public void run()
	{
		while(true)
		{
			System.out.println("Bye!");
		}
	}
}

class THDemo1
{
	public static void main(String args[])
	{
		TH1 t1 = new TH1();
		TH2 t2 = new TH2();
		t1.start();
		t2.start();
	}
}