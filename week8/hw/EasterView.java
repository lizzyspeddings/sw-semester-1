import javax.swing.JLabel;
import java.util.Observer;
import java.util.Observable;

public class EasterView extends JLabel implements Observer
{
	private EasterModel model;
	
	public EasterView(EasterModel model)
	{
		super();
		this.model = model;
		
		setText("The date of easter in the year " + model.getYear() + " is " + model.getDay() + " " + model.getMonth() + ".");
	}
	
	public void update(Observable obs, Object obj)
	{
				setText("The date of easter in the year " + model.getYear() + " is " + model.getDay() + " " + model.getMonth() + ".");
	}
}