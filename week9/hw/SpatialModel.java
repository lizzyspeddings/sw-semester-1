import java.util.Observable;
import java.awt.geom.Point2D;

public class SpatialModel extends Observable
{
	private SpatialNetwork network;

	public SpatialModel(SpatialNetwork network)
	{
		super();
		this.network = network;
	}

	public Point2D.Double[] getCoordinates()
	{
		return network.getCoordinates();
	}

	public int[] getTwoCoordinates(int i, int j)
	{
		return network.getTwoCoordinates(i, j);
	}

	public int getNumberOfPoints()
	{
		return network.getNumberOfPoints();
	}

	public int getThreshold()
	{
		return network.getThreshold();
	}

	public void setNumberOfPoints(int numberOfPoints)
	{
		network.setNumberOfPoints(numberOfPoints);
	}

	public void setThreshold(int threshold)
	{
		network.setThreshold(threshold);
	}

	public boolean connected(int a, int b)
	{
		return network.connected(a, b);
	}
}