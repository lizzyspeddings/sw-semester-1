import java.lang.Math;
import java.awt.geom.Point2D;
import java.util.Arrays;

public class SpatialNetwork
{
	private int numberOfPoints;
	private int threshold;
	private Point2D.Double[] nodes;
	private int width;
	private int height;

	public SpatialNetwork(int numberOfPoints, int threshold, int width, int height)
	{
		this.numberOfPoints = numberOfPoints;
		this.threshold = threshold;
		nodes = new Point2D.Double[numberOfPoints];

		for (int i = 0; i < nodes.length; i ++)
		{
			int x = (int)(Math.random() * width);
			int y = (int)(Math.random() * height);
			nodes[i] = new Point2D.Double(x, y);
		}
	}

	public Point2D.Double[] getCoordinates()
	{
		return nodes;
	}

	//get coordinates of a point
	public int[] getTwoCoordinates(int i, int j)
	{
			int[] temp = new int[4];
			temp[0] = (int)nodes[i].getX();
			temp[1] = (int)nodes[i].getY();
			temp[2] = (int)nodes[j].getX();
			temp[3] = (int)nodes[j].getY();
			return temp;
	}

	//get number of points
	public int getNumberOfPoints()
	{
		return this.numberOfPoints;
	}

	//get threshold
	public int getThreshold()
	{
		return this.threshold;
	}

	//set numbers
	public void setNumberOfPoints(int numberOfPoints)
	{
		nodes = new Point2D.Double[numberOfPoints];

		for (int i = 0; i < nodes.length; i ++)
		{
			int x = (int)(Math.random() * width);
			int y = (int)(Math.random() * height);
			nodes[i] = new Point2D.Double(x, y);
		}
	}

	//set threshold
	public void setThreshold(int threshold)
	{
		this.threshold = threshold;
	}

	//determine if connected
	public boolean connected(int a, int b)
	{
		double xDif = nodes[a].getX() - nodes[b].getX();
		double yDif = nodes[a].getY() - nodes[b].getY();
		int distance = (int)(Math.sqrt((xDif*xDif) + (yDif*yDif)));
		if (distance <= threshold)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}