import java.lang.Math;
import java.awt.geom.Point2D.Double;
import java.util.Array;

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
			int x = Math.random() * width;
			int y = Math.random() * height;
			nodes[i] = Point2D.Double(x, y);
		}

	}

	//get coordinates of a point


	//get number of points

	//get threshold

	//set numbers

	//set thrshold

	//determine if connected

}