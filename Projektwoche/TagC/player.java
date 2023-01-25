package AufgabeC;

public class player 
{
	private static int nrPlayers;
	private static final int maxPlayers = 8;
	
	private String name;
	private int number;
	private int points = 0;
	private int[] list = new int[14];
	
	player(String name, int number)
	{
		this.name = name;
		this.number = number;
	}
	player()
	{
		this.name = "";
		this.number = 0;
	}
	
	public void setName(String name)
	{
		this.name = name;
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
}
