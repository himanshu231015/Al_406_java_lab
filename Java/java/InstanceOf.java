class A{
}
class B extends A
{
}
class D
{
}
class Demo1
{
	public static void main(String args[]){
		A a1 = new A();
		System.out.println(a1 instanceof B);
		//System.out.println(a1 instanceof D);
		//System.out.println(a1 instanceof Demo1);
		System.out.println(a1 instanceof A);
	}
}