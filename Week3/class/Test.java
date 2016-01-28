public class Test {

	public static void main(String[] args) {
		
		Module sw = new Module("Software Workshop", "Jon Rowe");
		System.out.println(sw);

		sw.setName("Java Workshop");
		sw.setLecturer("Your mum");		

		System.out.println(sw.getName());
		System.out.println(sw.getLecturer());

		Student liz = new Student("Lizzy Speddings", 1544980);
		System.out.println(liz);
		liz.setModule(0, sw);
		liz.setModule(1, new Module("Essentials", "Dan Ghica"));
		liz.setModule(2, new Module("AI", "V. Sorge"));
	
		for (int i = 0; i < 3; i ++)
		{
			System.out.println(liz.getModule(i));
		}
	}
		
}
