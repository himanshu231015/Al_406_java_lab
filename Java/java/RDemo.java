class RDemo
{
	public static void main(String[] args) 
	{
		Runtime r1=Runtime.getRuntime();
		
		try{
		Process p1=	r1.exec("notepad.exe");
        //p1.destroy();
		}catch(Exception tt)
		{System.out.println(tt);}
		
	}
}