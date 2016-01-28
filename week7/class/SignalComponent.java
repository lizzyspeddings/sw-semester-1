/**
Creates a graphics JFrame which shows whether or not there is good signal at a given point in a network
*/

import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

public class SignalComponent extends JComponent
{
	//attributes
	private Network net;
	private int mapSize;
	private int frameSize;
	private double maxSignal;
	
	/**
	Create a constructor to show the signal of a network
	*/
	public SignalComponent(Network net, int mapSize, int frameSize, double maxSignal)
	{
		super();
		this.net = net;
		this.mapSize = mapSize;
		this.frameSize = frameSize;
		this.maxSignal = maxSignal;
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		frameSize = getWidth();
		
		for (int i = 0; i < frameSize; i ++)
		{
			for (int j = 0; j < frameSize; j ++)
			{
				double x = mapSize * ((double) i / frameSize);
				double y = mapSize * ((double) j / frameSize);
				double signal = net.getSignal(x, y); 
				int greyLevel = (int)(255 * (signal / maxSignal));
				Rectangle pixel = new Rectangle(i, j, 1, 1);
				try
				{
					Color grey = new Color(0, greyLevel, greyLevel);
					g2.setColor(grey);
				}
				catch(IllegalArgumentException e)
				{
					g2.setColor(Color.BLUE);
				}
				g2.fill(pixel);
				
			}
		}
	}
}
