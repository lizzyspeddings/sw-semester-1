import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
Component containing a house
*/
public class HouseComponent extends JComponent
{
	private House house;

	/**
	Create a component with a particular house location and size
	@param xCoord x coordinate of the house
	@param y coordinate of the house
	@param size the size of the house
	*/
	public HouseComponent(int xCoord, int yCoord, int size)
	{
		super();
		house = new House(xCoord, yCoord, size);
	}

	/**
	paint component on graphics object
	@param g the graphics object
	*/
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		
		house.draw(g2);
	}
}