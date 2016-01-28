import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

/**
Creates a graphics JFrame which shows the effect that a virus has on a population over time
*/

public class VirusComponent extends JComponent
{
	private double[] proportionInfected; 
	private int frameWidth;
	private int frameHeight;
	private Population pop;

	/**
	Create a constructor to shows how a virus infects a popuation over time
	*/
	public VirusComponent(Population pop, int frameWidth, int frameHeight)
	{
		super();
		this.proportionInfected = new double[1000];
		this.frameWidth = frameWidth;
		this.frameHeight = frameHeight;
		this.pop = pop;

		for(int i = 0; i < proportionInfected.length; i ++)
		{
			proportionInfected[i] = pop.proportionInfected();
			pop.update();
		}
	}
	/**
	Paint the array of the proportion infected onto a JFrame
	*/
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		this.frameWidth = getWidth();
		this.frameHeight = getHeight();
		for(int i = 0; i < frameWidth; i ++)
		{
			int yCoord = (int)((frameHeight - 40) - ((frameHeight - 40) * proportionInfected[i]));
			Rectangle pixel = new Rectangle((i + 20), yCoord, 1, 1);
			g2.setColor(Color.BLACK);
			g2.draw(pixel);
		}

		g2.drawLine(20,20,20, frameHeight -40);
		g2.drawLine(20, frameHeight - 40, frameWidth - 40, frameHeight - 40);
	}
}