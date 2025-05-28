interface Demo
{
	void sales();
	void stock();
}
class IntfceDemo implements Demo
{
	public void sales(){
		System.out.println("Sales");
	}
	public void stock(){
		System.out.println("Stock");
	}
	public static void main(String args[]){
		IntfceDemo d1 = new IntfceDemo();
		d1.sales();
	}
}