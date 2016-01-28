import javax.swing.JPanel;
import javax.swing.JSlider;

public class EasterComponent extends JPanel
{
	public EasterComponent(Easter easter, int min, int max, int initial)
	{
		super();
		EasterModel model = new EasterModel(easter);

		EasterView view = new EasterView(model);

		model.addObserver(view);

		JSlider slider = new JSlider(min, max, initial);
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing((max - min) / 4);
		slider.setPaintLabels(true);
		slider.setLabelTable(slider.createStandardLabels((max - min) / 4));
		

		SliderListener listen = new SliderListener(model, slider);
		
		slider.addChangeListener(listen);
		
		add(view);
		add(slider);
		
	}
}
