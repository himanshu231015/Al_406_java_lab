class Demo{
	void m1(){
		System.out.println("Hello");
	}
	static class DD{
		void m2(){
			System.out.println("Hi India");
		}
	}
}

class InDemo{
	public static void main (String args[]){
	Demo D = new Demo();
	D.m1();
	//inner class DD is executed by Demo
	//Demo.DD d2 = d1.new DD();
	Demo.DD obj = new Demo.DD();
	obj.m2();
	}
}