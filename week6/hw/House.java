import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.Graphics2D;
import java.awt.Color;

/**
Construction of house graphics
*/
public class House
{
	private Line2D.Double roof1;
	private Line2D.Double roof2;
	private Rectangle building;
	private Rectangle door;
	private Rectangle window1;
	private Rectangle window2;
	private Rectangle window3;
	/**
	Create a house with a roof and door.
	*/
	public House(int xCoord, int yCoord, int size)
	{
		super();
		
		roof1 = new Line2D.Double(xCoord, yCoord, (xCoord + (size/2)), (yCoord - (size/2)));
		roof2 = new Line2D.Double((xCoord + size), yCoord, (xCoord + (size/2)), (yCoord - (size/2)));
		
		//door coordinates and size
		double door1 = xCoord + (0.6 * size);
		double door2 = yCoord + (0.6 * size);
		double door3 = 0.2 * size;
		double door4 = 0.4 * size;

		//window1 coordinates and size
		double window1a = xCoord + (0.2 * size);
		double window1b = yCoord + (0.2 * size);
		double window1c = 0.2 * size;
		double window1d = 0.2 * size;

		//window2 coordinates and size
		double window2a = xCoord + (0.6 * size);
		double window2b = yCoord + (0.2 * size);
		double window2c = 0.2 * size;
		double window2d = 0.2 * size;

		//window3 coordinates and size
		double window3a = xCoord + (0.2 * size);
		double window3b = yCoord + (0.6 * size);
		double window3c = 0.2 * size;
		double window3d = 0.2 * size;

		building = new Rectangle(xCoord, yCoord, size, size);
		
		door = new Rectangle((int)door1, (int)door2, (int)door3, (int)door4);

		window1 = new Rectangle((int)window1a, (int)window1b, (int)window1c, (int)window1d);

		window2 = new Rectangle((int)window2a, (int)window2b, (int)window2c, (int)window2d);

		window3 = new Rectangle((int)window3a, (int)window3b, (int)window3c, (int)window3d);

	}

	/**
	Draw the house onto a graphics component.
	*/
	public void draw(Graphics2D g)
	{
		g.setColor(Color.BLACK);
		g.draw(building);
		g.draw(roof1);
		g.draw(roof2);
		g.draw(door);
		g.draw(window1);
		g.draw(window2);
		g.draw(window3);

	}
}
