import javax.swing.JFrame;

public class HouseTest
{
	public static void main(String[] args)
	{
		int size = 4;
		int houseSize = 300;
	
		JFrame frame = new JFrame();
		int jFrameWidth = (20 * (size + 1)) + (houseSize * size);
		int jFrameHeight = (int)(1.5 * houseSize) + 60;
		frame.setSize(jFrameWidth, jFrameHeight);
		frame.setTitle("My House");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//HouseComponent comp = new HouseComponent(200, 100, 100);

		StreetComponent comp = new StreetComponent(size, houseSize);
		
		frame.add(comp); 
		frame.setVisible(true);
	}
}