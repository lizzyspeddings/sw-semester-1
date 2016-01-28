import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.BorderLayout;

public class SpatialComponent extends JPanel
{
	private SpatialNetwork network;

	public SpatialComponent(SpatialNetwork network, int min, int max, int value)
	{
		super();
		this.network = network;
		SpatialModel model = new SpatialModel(network);
		SpatialView view = new SpatialView(model);

		ThresholdPanel threshold = new ThresholdPanel(model, min, max, value);
		
		model.addObserver(view);
		model.addObserver(threshold);
		
		setLayout(new BorderLayout());
		add(view, BorderLayout.CENTER);
		add(threshold, BorderLayout.SOUTH);
	}
}
