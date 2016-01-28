public class TestArrayList
{
	public static void main(String[] args)
	{
		MyArrayList test = new MyArrayList();
		
		for (int i = 0; i < 50; i ++)
		{
			test.addString(i+"");
		}

		System.out.println(test.getIndex(16));

		System.out.println(test.getIndex(67));

		System.out.println(test.getIndex(-8));
	}		
}
