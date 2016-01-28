import javax.swing.JFrame;

public class SpatialGUI
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Spatial Network");
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		SpatialNetwork network = new SpatialNetwork(100, 100, frame.getWidth(), frame.getHeight());

		SpatialComponent comp = new SpatialComponent(network, 0, 100, 100);
		
		frame.add(comp);
		frame.setVisible(true);
	}
}