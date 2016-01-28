/** 
Creates a street of objects of type house
*/
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class StreetComponent extends JComponent
{
	//attributes
	private House[] street;
	private int size;
	private int houseSize;

	//
	public StreetComponent(int size, int houseSize)
	{
		this.size = size;
		street = new House[size];
		int xCoord = 20;
		for(int i = 0; i < size; i ++)
		{
			House h = new House(xCoord, 20 + (houseSize/2), houseSize);
			street[i] = h;
			xCoord += houseSize + 20;
		}
	}

	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;

		for(int i = 0; i < size; i ++)
		{
			street[i].draw(g2);
		}
	}
}