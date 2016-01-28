public class Module 
{
	private String name;
	private String lecturer;
	
	public Module(String name, String lecturer)
	{
		this.name = name;		//this. shows that its referring to the attribute
		this.lecturer = lecturer;
	}
	
	public String toString()
	{
		return "Module: " + this.name + ", " + this.lecturer;
	}

	//get methods use naming conventions getMethod()

	public String getName()
	{
		return this.name;
	}
	
	public String getLecturer()
	{
		return this.lecturer;
	}

	//set methods	
	public void setName(String name) //void shows that its doesn't return anything
	{
		this.name = name;
	}

	public void setLecturer(String lecturer)
	{
		this.lecturer = lecturer;
	}
}