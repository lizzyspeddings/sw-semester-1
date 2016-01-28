import javax.swing.JFrame;

public class EasterGUI extends JFrame
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Easter Day Calculator");
		frame.setSize(500,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Easter easter = new Easter(1961);
		EasterComponent comp = new EasterComponent(easter, 1900, 2100, easter.getYear()); 
		
		frame.add(comp);
		frame.setVisible(true);
	}
}