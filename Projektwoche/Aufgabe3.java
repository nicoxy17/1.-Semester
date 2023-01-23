package projektwocheA;

import java.util.Scanner;

public class Tilgung 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Darlehenssumme (Euro): ");
		float darlehenssumme = sc.nextFloat();
		System.out.println("Jahreszinssatz im Prozent: ");
		float prozent = sc.nextFloat();
		prozent = prozent/100;
		System.out.println("Annuitaetsrate (Euro pro Jahr): ");
		float annuit = sc.nextFloat();
		sc.close();
		float tempDarlehenssumme = darlehenssumme;
		float zinsen = tempDarlehenssumme*prozent;	
		float tilgung = annuit-zinsen;
		float Restschulden = tempDarlehenssumme - tilgung;
		float gesammtzahlung = 0;
		int i = 1;
		int erneut = 0;
		
		while(erneut == 0)
		{
			System.out.println("Jahr\t\tZinsen\t\tTilgung\t\tRestschuld");
			System.out.println("==========================================================");
			while(Restschulden>annuit)
			{
				zinsen = tempDarlehenssumme*prozent;	
				tilgung = annuit-zinsen;
				Restschulden = tempDarlehenssumme - tilgung;
				tempDarlehenssumme = Restschulden;
				gesammtzahlung += tilgung;
				System.out.println(i+"\t\t"+Math.round(zinsen)+"\t\t"+Math.round(tilgung)+"\t\t"+Math.round(Restschulden));
				i++;
			}
			
			System.out.println("Restschulden: "+Restschulden);
			System.out.println("Gezahlter Betrag: "+(annuit*(i-1)+Restschulden));
			System.out.println("Anzahl der Raten: "+ (i-1));
			
			System.out.println("Noch einmal? j/n:");
			String nochmal = sc.next();
			if(nochmal=="j")
			{
				erneut = 1;
			}
		}
		
	}
}
