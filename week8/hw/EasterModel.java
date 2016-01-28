import java.util.Observable;

public class EasterModel extends Observable
{
	private Easter easter;
	
	public EasterModel(Easter easter)
	{
		super();
		this.easter = easter;
	}
	
	public int getYear()
	{
		return easter.getYear();
	}

	public int getDay()
	{
		return easter.getDay();
	}

	public String getMonth()
	{
		return easter.getMonth();
	}

	public void setYear(int year)
	{
		easter.setYear(year);
		setChanged();
		notifyObservers();
	}
}