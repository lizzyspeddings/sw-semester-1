import javax.swing.JFrame;

public class VirusViewer extends JFrame
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Virus Infection History");
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Population pop = new Population(800, 0.5, 0.5, 0.5);	//population size, the proportion initially infected, infection rate, recovery rate

		VirusComponent comp = new VirusComponent(pop, 400, 400);	//population, framesize

		frame.add(comp);
		frame.setVisible(true);
	}
}