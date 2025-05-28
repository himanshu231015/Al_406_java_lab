interface Demo
{
	default void sales(){
		System.out.println("Sales");
	}
	default void stock(){
		System.out.println("Stock");
	}
}
class IntfceDemo2 implements Demo
{
	public static void main(String args[]){
		IntfceDemo2 d1 = new IntfceDemo2();
		d1.sales();
		d1.stock();
	}
}