import javax.swing.JFrame;

public class SignalStrength
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Network Signal");
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Network net = new Network();
		
		Transmitter t1 = new Transmitter(5, 6, 60.0);
		net.add(t1);
		
		Transmitter t2 = new Transmitter(1, 2, 200.0);
		net.add(t2);
		
		Transmitter t3 = new Transmitter(9, 3, 90.0);
		net.add(t3);
		
		Transmitter t4 = new Transmitter(6, 1, 100.0);
		net.add(t4);
		
		Transmitter t5 = new Transmitter(5, 10, 130.0);
		net.add(t5);
		
		
		int mapSize = 10;
		int frameSize = 600;
		double maxStrength = 200.0;
		SignalComponent comp = new SignalComponent(net, mapSize, frameSize, maxStrength);
		
		frame.add(comp);
		frame.setVisible(true);
	}
}
