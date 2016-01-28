public class Student
{
	private String name;
	private int id;
	private Module[] modules; 
	
        public Student(String name, int id)
	{
		this.name = name;
		this.id = id;
		this.modules = new Module[3];
	}
	
	public String toString()
	{
		return this.name + ", " + this.id;
	}

	public String getName()
	{
		return this.name;
	}
	
	public int getId()
	{
		return this.id;
	}

	public Module getModule (int index)
	{
		return modules[index];
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setId (int id)
	{
		this.id = id;
	}

	public void setModule (int index, Module m)
	{
		modules[index] = m;
	}
}