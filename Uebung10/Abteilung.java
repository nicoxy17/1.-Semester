package test;

public class Abteilung 
{
	public Mitarbeiter Mit[] = new Mitarbeiter[15];
	String bezeichnung;
	Abteilung(String bezeichnung)
	{
		bezeichnung = this.bezeichnung;
	}
	
	String getBezeichnung()
	{
		return this.bezeichnung;
	}
	
	int getAnzahlMitarbeiter()
	{
		return Mitarbeiter.anzahlMitarbeiter;
	}
	
	public void addMitarbeiter(Mitarbeiter mit)
	{
		if(Mitarbeiter.anzahlMitarbeiter <= this.Mit.length)
		{
			this.Mit[Mitarbeiter.anzahlMitarbeiter] = mit;
			Mitarbeiter.anzahlMitarbeiter++;
		}
	}
	
	public Mitarbeiter getMitarbeiter(int i)
	{
		return this.Mit[i];
	}
	
	public void ausgabeMitarbeiter()
	{
	 	for(int i = 0; i<Mitarbeiter.anzahlMitarbeiter; i++)
		{
			System.out.println(this.Mit[i].getName() + " "+ this.Mit[i].getPersonalnummer());
		}
	}
	
	
}
