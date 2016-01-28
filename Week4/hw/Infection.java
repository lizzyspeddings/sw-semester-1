
public class Infection
{

	public static void main(String[] args)
	{
		Person p = new Person();
		System.out.println(p); // well person
		
		p.setInfected(true);
		System.out.println(p);  // sick person
		
		Population pop = new Population(100, 0.4, 0.85, 0.2, 0.23);
		System.out.println(pop);  // population of 100 people
		System.out.println(pop.howManyInfected()); // about 10
		
		//test get and set methods for deathRate
		System.out.println(pop.getDeathRate());
		pop.setDeathRate(0.32);
		System.out.println(pop.getDeathRate());
		
		//run simulation for several time steps
		for(int i = 0; i < 5; i++)
		{
			pop.update();
			System.out.println(pop.proportionInfected());
		}
		
		System.out.println(pop.getPopsize());
		
	}
}
