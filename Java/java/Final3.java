//program to demonstrate final keyword used for methods
class Final3
{
	final int x = 9000;
	void m1(){
		x = x + 2000;
		System.out.print("X = " +x);
	}
	public static void main(String args[]){
		Final3 f1 = new Final3();
		f1.m1();
	
	}
}