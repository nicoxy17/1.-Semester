package test;

public class demo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Abteilung abt = new Abteilung("Test");
		Abteilung abt2 = new Abteilung("Test2");
		
		Mitarbeiter mit = new Mitarbeiter("Joe", abt);
		Mitarbeiter mit2 = new Mitarbeiter("Entrup", abt);
		Mitarbeiter mit3 = new Mitarbeiter("Max", abt2);
		Mitarbeiter mit4 = new Mitarbeiter("Bob", abt2);
		
		abt.addMitarbeiter(mit);
		abt.addMitarbeiter(mit2);
		abt.addMitarbeiter(mit3);
		abt.addMitarbeiter(mit4);
		mit.bestimmeKollegen(abt.Mit);
	}

}
