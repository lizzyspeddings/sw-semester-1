/**
Represents a population of people and an infection that passes between between them.
*/
import java.util.Random;
import java.util.ArrayList;

public class Population
{
	private ArrayList<Person> pop;
	private double infect; // infection rate of the disease
	private double recover; //recovery rate for the disease
	private Random generator; // random number generator
	private double deathRate;
	
	/**
	Create a population, some of whom may be infected
	@param popsize the population size
	@param initial the proportion of the population initially infected
	@param infect the infection rate
	@param recover the recovery rate
	*/
	public Population(int popsize, double initial, double infect, double recover)
	{
		this.infect = infect;
		this.recover = recover;
		this.pop = new ArrayList<Person>();
		this.generator = new Random();
		this.deathRate = 0.0;
		
		for(int i = 0; i < popsize; i++)
		{
			Person p = new Person();
			if(generator.nextDouble() < initial)
			{
				p.setInfected(true);
			}
			pop.add(p);
		}
	
	}
	
	/**
	Create a population, some of whom may be infected
	@param popsize the population size
	@param initial the proportion of the population initially infected
	@param infect the infection rate
	@param recover the recovery rate
	@param deathRate the death rate
	*/
	public Population(int popsize, double initial, double infect, double recover, double deathRate)
	{
		this.infect = infect;
		this.recover = recover;
		this.pop = new ArrayList<Person>();
		this.generator = new Random();
		this.deathRate = deathRate;

		for(int i = 0; i < popsize; i++)
		{
			Person p = new Person();
			if(generator.nextDouble() < initial)
			{
				p.setInfected(true);
			}
			pop.add(p);
		}
	
	}

	/** 
	Get the population size
	@return population size
	*/
	public int getPopsize()
	{
		return pop.size();
	}
	
	
	public String toString()
	{
		return "population of " + this.getPopsize() + " people";
	}
	
	/**
	Get infection rate
	@return infection rate
	*/
	public double getInfect()
	{
		return this.infect;
	}
	
	/**
	Get recovery rate
	@return recovery rate
	*/
	public double getRecover()
	{
		return this.recover;
	}
	
	/**
	Change infection rate
	@param infect new infection rate
	*/
	public void setInfect(double infect)
	{
		this.infect = infect;
	}
	
	/**
	Change recovery rate
	@param recover new recovery rate
	*/
	public void setRecover(double recover)
	{
		this.recover = recover;
	}
	
	/**
	Is the person at a specific index infected?
	@param index index of the person concerned
	@return whether or not this person is infected
	*/
	public boolean isInfected(int index)
	{
		return pop.get(index).isInfected();
	}
	
	
	/**
	How many people are infected?
	@return how many infected people in the population?
	*/
	public int howManyInfected()
	{
		int count = 0;
		for(int i = 0; i < getPopsize(); i++)
		{
			if(isInfected(i))
			{
				count++;
			}
		}
		return count;
	}
	
	/**
	What proportion of population are infected?
	@return proportion infected
	*/
	public double proportionInfected()
	{
		return ((double)howManyInfected())/getPopsize();
	}
	
	/**
	Update status of population following a period of time
	*/
	public void update()
	{
		ArrayList<Integer> dead = new ArrayList<Integer>();
		for(int i = 0; i < getPopsize(); i++)
		{
			if (isInfected(i))
			{
				if(generator.nextDouble() < deathRate)
				{
					dead.add(i);
				}
				
				else if(generator.nextDouble() < recover)
				{
					pop.get(i).setInfected(false);
				}
			}

			else
			{
				// choose someone to meet
				int j = generator.nextInt(getPopsize());
				if(isInfected(j))
				{
					if(generator.nextDouble() < infect)
					{
						pop.get(i).setInfected(true);
					}
				}
			}
		}
		
		System.out.println(dead);
		for(int i = dead.size() - 1; i >= 0; i --)
		{	
			pop.remove((int) dead.get(i));
		}
	}
	
	/** 
	What is the death rate?
	@return the death rate
	*/
	public double getDeathRate()
	{
		return this.deathRate;
	}	


	/**
	Set a new death rate
	@param deathRate the new death rate
	*/
	public void setDeathRate(double deathRate)
	{
		this.deathRate = deathRate;
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
