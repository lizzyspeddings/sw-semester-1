public class Student
{

// data fields

	private String name;
	private int id;
	private Module[] modules;

// constructor

	public Student(String name, int id)
	{
		this.name = name;
		this.id = id;
		this.modules = new Module[3];
	}

// toString method

	public String toString()
	{
		return this.name + ", " + this.id;
	}

// get methods

	public String getName()
	{
		return this.name;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public Module getModule(int index)
	{
		return this.modules[index];
	}
		

// set methods

	public void setModule(int index, Module m)
	{
		this.modules[index] = m;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}


// check if a student is on the module

	public boolean onModule(Module module)
	{
		boolean same = false;		
		for (int i = 0; i < modules.length; i ++)
		{
			if (modules[i].equals(module))
			{
				same = true;	
			}
			else
			{
				continue;
			}
		}

		return same;
	}

}
