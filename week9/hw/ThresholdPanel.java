import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JLabel;
import java.util.Observer;
import java.util.Observable;
import javax.swing.event.*;
import java.awt.event.*;

public class ThresholdPanel extends JPanel implements Observer
{
	private SpatialModel model;
	private JSlider slider;
	
	public ThresholdPanel(SpatialModel model, int min, int max, int value)
	{
		super();
		this.model = model;

		JSlider slider = new JSlider(min, max, value);
		
		slider.addChangeListener(e -> model.setThreshold(slider.getValue()));
		
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing((max - min) / 10);
		slider.setPaintLabels(true);
		slider.setLabelTable(slider.createStandardLabels((max - min) / 10));

		JLabel label = new JLabel("Threshold");
	}
	
	public void update(Observable obs, Object obj)
	{
		slider.setValue((int)(slider.getValue()));
	}
}