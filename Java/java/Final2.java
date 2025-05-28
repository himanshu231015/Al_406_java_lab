//program to demonstrate final keyword used for methods
class Final2
{
	final void m1(){
		System.out.print("hello, Inodre!");
	}
}
class FinalDemo extends Final2
{
	void m1(){
		System.out.print("hello, India");
	}

	public static void main(String args[]){
		FinalDemo d1 = new FinalDemo();
		d1.m1();
}
}