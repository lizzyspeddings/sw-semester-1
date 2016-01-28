
public class Test
{
	public static void main(String[] args)
	{
	
		Module sw = new Module("Software Workshop", "Jon Rowe");
		Module ai = new Module("Artificial Intelligence", "Volker Sorge");	
		Module ll = new Module("Language & Logic", "Mark Lee");	

		System.out.println(sw);
		
		System.out.println(sw.getName());
		System.out.println(sw.getLecturer());
		
		System.out.println("changing lecturer");
		sw.setLecturer("Martin Escardo");
		
		System.out.println(sw);
		
		Student alf = new Student("Alfred Smith", 12345);
		
		System.out.println(alf);
		System.out.println(alf.getName());
		System.out.println(alf.getId());
		
		System.out.println("changing id");
		alf.setId(54321);
		System.out.println(alf);
		
		alf.setModule(0, sw);
		alf.setModule(1, new Module("Foundations", "Dan Ghica"));
		alf.setModule(2, ai);
		
		
		for(int i = 0; i < 3; i++)
		{
			System.out.println(alf.getModule(i));
		}		
		
		//Question 1		
		System.out.println("Does sw == sw? " + sw.equals(sw));
		System.out.println("Does sw == ai? " + sw.equals(ai));

		//Question2
		System.out.println("Is alfred on the sw module? " + alf.onModule(sw));
		System.out.println("Is alfred on the ll module? " + alf.onModule(ll));
		
		//Question3
		
		TutorGroup cs = new TutorGroup("Mark Lee");
		
		System.out.println(cs.getTutor());

		System.out.println("changing tutor");		

		cs.setTutor("Jon Rowe");

		System.out.println(cs.getTutor());
		
		cs.addStudent(new Student("Ben", 12346));
		
		cs.addStudent(alf);
		
		System.out.println(cs.toString());

		System.out.println(cs.getStudents());

		
		
	}
}
