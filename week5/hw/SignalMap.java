/**
Map showing which areas have bad signal
*/

import java.util.ArrayList;
public class SignalMap
{
	
	//attributes		
	private boolean[][] map;
	private double threshold;
	private int size;
	private Network network;

	/**
	Creates a signal map indicating where there is poor signal	
	@param threshold The limit below which the signal is considered poor
	@param size The size of the network
	@param network The network for which the signal is being assessed
	*/
	public SignalMap(double threshold, int size, Network network)
	{
		this.threshold = threshold;
		this.size = size;
		this.network = network;
		map = new boolean[size][size];
		
		for(int i = 0; i < size; i++)
		{			
			for(int j = 0; j < size; j++)
			{
				if(network.getSignal(i, j) < threshold)
				{
					map[i][j] = true;
				}
				else
				{
					map[i][j] = false;
				}
			}
		}
	}


	/**
	This prints the map as an array showing an x where there is poor signal
	*/
	public void display()
	{
		for(int i = 0; i < size; i++)
		{			
			for(int j = 0; j < size; j++)
			{
				if(map[i][j])
				{
					System.out.print("X");
				}
				else
				{
					System.out.print("O");
				}
			}
			System.out.println();
		}
	}


	/**
	This calculates the fraction of the map which has a poor signal
	@return The fraction of the map with a poor signal
	*/
	public double poorSignal()
	{
		int count = 0;
		for(int i = 0; i < size; i++)
		{			
			for(int j = 0; j < size; j++)
			{
				if(map[i][j])
				{
					count ++;
				}
				else
				{
					continue;
				}
			}
		}
		return (double) count / (double) (size * size);
	}

	/**
	Works out which transmitter in the network contributes to the most coverage
	@return The most "important" transmitter
	*/
	public Transmitter important()
	{	
		Transmitter important = null; 
		double worst = 0; 
		for (int i = 0; i < this.network.size(); i ++)
		{
			Network tempNet = new Network();	

			for (int j = 0; j < this.network.size(); j++)
			{
				if (i != j)
				{
					tempNet.add(network.getTransmitter(i)); 
				}
			}
			
			SignalMap tempMap = new SignalMap(this.threshold, this.size, tempNet);
			
			if(tempMap.poorSignal() > worst)
			{
				important = network.getTransmitter(i);
			}	
		}
		
		return important;
	}

	/**
	Prints out a map and prints X if the new network has better signal than the original one
	@param newNetwork This is the network that is being compared
	*/
	public void compare(Network newNetwork)
	{
		for (int i = 0; i < this.size; i ++)
		{
			for(int j = 0; j < this.size; j ++)
			{
				if(this.network.getSignal(i,j) < newNetwork.getSignal(i,j)) 
				{
					System.out.print("X");
				}

				else 
				{
					System.out.print("O");
				}
			}
			System.out.println();
		}
	}



}
