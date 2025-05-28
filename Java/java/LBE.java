class LBE extends Exception
{
	static int bal = 0;
	void block()
	{
		System.out.println("message");
	}
	public static void main(String args[]){
		bal = bal+50000;
		loop{}
		try{
			if(bal<500){
				LBE lt = new LBE();
				throw lt;
			}catch (LBE lt)
			{
				lt.block();
			}
	}
	
}