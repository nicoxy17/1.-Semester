package AufgabeC;

public class player 
{
	private static int nrPlayers;
	private static final int maxPlayers = 8;
	
	private String name;
	private int number;
	private int points = 0;
	private int[] list = new int[6];
	private boolean finish = false;
	
	player(String name, int number)
	{
		this.name = name;
		this.number = number;
		this.finish = false;
	}
	player()
	{
		this.name = "";
		this.number = 0;
		this.finish = false;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setFinish()
	{
		this.finish = true;
	}
	
	public boolean isFinish()
	{
		return finish;
	}
	
	public String getName()
	{
		return this.name;
	}
	public int getNumber() 
	{
		return number;
	}
	
	public void setNumber(int number)
	{
		this.number = number;
	}
	
	public static void setNrPlayers(int number)
	{
		if(number<=maxPlayers)
			nrPlayers = number;
		else
			System.out.println("Maximal können nur 8 Spieler teilnehmen");
	}
	
	public static int getNrPlayer()
	{
		return nrPlayers;
	}
	
	public static int getMaxPlayers()
	{
		return maxPlayers;
	}
	
	public void punkteVerwalten(int arr[], int option)
	{
		int summ = 0;
		
		for(int i = 0; i<arr.length; i++)
		{
			if(option == 1)
			{
				if(arr[i]==1)
				{
					this.list[0] = summ+1;		
				}
			}
			if(option == 2)
			{
				if(arr[i]==2)
				{
					this.list[1] = summ+2;
				}
			}
			if(option == 3)
			{
				if(arr[i]==3)
				{
					this.list[2] = summ+3;				}
			}
			if(option == 4)
			{
				if(arr[i]==4)
				{
					this.list[3] = summ+4;				}
			}
			if(option == 5)
			{
				if(arr[i]==5)
				{
					this.list[4] = summ+5;
				}
			}
			if(option == 6)
			{
				if(arr[i]==6)
				{
					this.list[5] = summ+6;
				}
			}
		}
	}
	
	public int getPoints()
	{
		return this.list[0]+this.list[1]+this.list[2]+this.list[3]+this.list[4]+this.list[5];
	}
}
