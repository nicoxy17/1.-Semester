package test;

public class Mitarbeiter 
{
	private Abteilung abteil;
	
	private String name = "";
	private int personalnummer = 1;
	private static int pers = 1;
	public static int anzahlMitarbeiter = 0;
	
	Mitarbeiter(String name, Abteilung abt)
	{
	 	this.name = name;
	 	this.abteil = abt;
		this.personalnummer = pers;
		pers++;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getPersonalnummer()
	{
		return this.personalnummer;
	}
	
	public Abteilung getAbteilung()
	{
		return this.abteil;
	}
	
	public boolean iskollege(Mitarbeiter mit)
	{
		if(this.personalnummer != mit.personalnummer && this.abteil == mit.abteil)
		{
			return true;
		}
		return false;
	}
	
	public void bestimmeKollegen(Mitarbeiter mit[])
	{
		for(int i = 0; i<anzahlMitarbeiter;i++)
		{
			if(iskollege(mit[i]))
			{
				System.out.println(mit[i].name);
			}
		}
	}
	
	
}
