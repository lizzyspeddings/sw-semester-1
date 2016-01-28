import java.util.ArrayList;

public class TutorGroup
{
	// data fields
	
	private String tutor;
	private ArrayList<Student> students ;

	// constructors
		
	public TutorGroup(String tutor)
	{
		this.tutor = tutor;
		this.students = new ArrayList<Student>();

	}

	// get method
	
	public String getTutor()
	{
		return this.tutor;
	}
	
	// set method

	public void setTutor(String tutor)
	{
		this.tutor = tutor;
	}	
	
	// toString method

	public String toString()
	{
		String stud = "";
		for( int i = 0; i < students.size(); i ++) 
		{
			stud += students.get(i) + ", ";
		}
		return "Tutor: " + this.tutor + " Students: " + stud;

	//not printing out
	}

	//add students
	
	public void addStudent(Student student)	
	{
		this.students.add(student);
	}


	//get a list of students

	public ArrayList<Student> getStudents()
	{
		return this.students;	
	}












}
