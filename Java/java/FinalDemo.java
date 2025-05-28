class FinalDemo
{
	void m1(final int x){
		System.out.println("X = "+x);
	}
	public static void main(String args[]){
		FinalDemo d1 = new FinalDemo();
		for (int i=1;i<=10;i++)
		{
			d1.m1(i);
		}
	}
}