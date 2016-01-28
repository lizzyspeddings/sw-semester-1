import javax.swing.JPanel;
import java.util.Observer;
import java.util.Observable;
import java.util.Arrays;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class SpatialView extends JPanel implements Observer
{
	private SpatialModel model;

	public SpatialView(SpatialModel model)
	{
		super();
		this.model = model;
	}

	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;

		int height = getHeight();
		int width = getWidth();

		g2.clearRect(0, 0, width, height);
		double diameter = Math.min(height, width);

		g2.setColor(Color.BLACK);
		
		Point2D.Double[] nodes = model.getCoordinates();
		
		for(int i = 0; 	i < nodes.length; i ++)
		{
			double x = nodes[i].getX();
			double y = nodes[i].getY();
			Spot p = new Spot((x), (y), 1);
			g2.fill(p);
		}

		for (int i = 0; i < nodes.length; i ++)
		{
			for (int j = 0; j < nodes.length; j ++)
			{
				if(model.connected(i, j))
				{
					g2.drawLine(model.getTwoCoordinates(i,j)[0],model.getTwoCoordinates(i,j)[1], model.getTwoCoordinates(i,j)[2], model.getTwoCoordinates(i,j)[3]);
				}
			}		
		}
	}

	public void update(Observable obs, Object obj)
	{
		repaint();
	}
}