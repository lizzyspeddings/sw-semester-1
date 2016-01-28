public class MyArrayList
{

//data fields

	private String[] myArrayList;	
	private int size;
	private int stored;

//constructors

	public MyArrayList()
	{
		this.size = 10;		
		this.myArrayList = new String[size];
		this.stored = 0;
	}

//add method

	public void addString(String str)
	{
		if( stored < size )
		{		
			this.myArrayList[stored] = str;
		}
		else
		{
			this.size = size + 10;
			String[] b = new String[size];
			for (int i = 0; i < myArrayList.length; i++) 
				{
            				b[i] = myArrayList[i];
				}
			this.myArrayList = b;
			this.myArrayList[stored] = str;
		}			
		
		this.stored++;
	}

//get method

	public String getIndex(int index)
	{
		if (index >= 0 && index < stored)
		{
			return myArrayList[index];
		}

		else
		{
			return "null: the index is out of bounds";
		}
	}




}
