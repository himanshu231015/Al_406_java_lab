interface Demo
{
	void sales();
	void stock();
}
class IntfceDemo1 
{
	public static void main(String args[]){
	Demo d1 = new Demo(){
		public void sales(){
			System.out.println("Sales");
		}
		public void stock(){
			System.out.println("Stock");
		}
	};
	d1.sales();
	d1.stock();
	}
}
