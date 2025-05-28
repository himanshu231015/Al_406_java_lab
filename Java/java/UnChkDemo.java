class UnChkDemo
{
	void m1()
	{
		System.out.print("A ");
		throw new NumberFormatException();
	}
public static void main(String args[]){
	System.out.print("B ");
	UnChkDemo d2 = new UnChkDemo();
	try{
		d2.m1();
		System.out.print
			("D ");
	}catch (Exception tt)
	{
		System.out.print("C ");
	}
	System.out.println("E ");
	}
}