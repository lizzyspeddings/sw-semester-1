public class Test
{
	public static void main(String[] args)
	{
		Easter easter = new Easter(1961);

		System.out.println(easter.getDay());
		System.out.println(easter.getMonth());
		System.out.println(easter.getYear());

		easter.setYear(2015);
		System.out.println(easter.getDay());
		System.out.println(easter.getMonth());
		System.out.println(easter.getYear());
	}
}