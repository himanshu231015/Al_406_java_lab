import java.io.*;
class Demo
{
	String file1 (String nm) throws IOException
	{
		return ("Data of file = " +nm);
	}
}
class ChkDemo
{
	public static void main(String args[])
	{
		Demo d1 = new Demo();
		try{
			d1.file1("AB.txt");
			}catch(IOException tt)
		{
			System.out.println(tt);
		}
	}
}