import java.util.Observable;
import java.util.ArrayList;
import java.awt.geom.Point2D;

public class SunflowerModel extends Observable
{
	private Sunflower flower;
	
	public SunflowerModel(Sunflower flower)
	{
		super();
		this.flower = flower;
	}
	
	public ArrayList<Point2D.Double> getSeeds()
	{
		return flower.getSeeds();
	}
	
	public double getAngle()
	{
		return flower.getAngle();
	}
	
	public void setAngle(double angle)
	{
		flower.setAngle(angle);
		setChanged();
		notifyObservers();
	}
}
