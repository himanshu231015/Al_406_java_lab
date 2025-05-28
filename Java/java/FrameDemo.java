import javax.swing.JFrame;    //importing Jframe from swing
// javax is an extende version of awt , swing
// in swings we use J as prefix used for components and event programming
import java.awt.BorderLayout; //abstract window toolkit ,provides borders 
import java.awt.Canvas;   //canvas is a component of awt
import java.awt.Graphics;
//components = buttons,checkbox...
//canvas is used for grafix programming
/*
in canvas paint method is used for 

*/
class FrameDemo
{
	public static void main(String[] args) 
	{
		JFrame jf = new JFrame("Game");        //object of frame named game
		jf.setLayout(new BorderLayout());      //
		jf.setSize(500,500);                   //frmae size
		Can c1 = new Can();                    //inner class object
		jf.add(c1);                             
		jf.setVisible(true); //frame dikhne lagegi
	}
static class Can extends Canvas implements Runnable   //
{
	int x = 100,y = 250,ct = 0;
	Can()
	{
		Thread t1 = new Thread(this);
		t1.start();
	}
	public void paint(Graphics g)
	{
		//g.drawString("Welcome",200,200);  //print welcome on frame
		//g.fillOval(100,100,30,30);
		g.drawRect(100,100,300,300);
		g.fillOval(x,y,30,30);
	}
	public void run()
	{
		while(true)
		{
			if(ct == 0)
			{
				x = x+2;
				y = y-2;
					if(x == 250)
				    {
					ct = 1;
			     }
				 }else
					if(ct == 1)
				    {
					x = x + 2;
					y = y + 2;
						if(x ==370)
					{
						ct = 2;
					}
				}else 
					if(ct == 2)
				     {
					  x = x-2;
					  y = y+2;
						if(x == 220)
					{
						ct = 3;
					}
				}else{
					   x = x -2;
					   y = y-2;
							if(x == 100)
								{
									ct = 0;
								}
				}
			
			try{
				Thread.sleep(50);
				repaint();
			}catch(Exception tt)
			{}
		}//while
	}
}}

//canvas closed
// frameDemo claso
/*
desktop application are built on frames
*/