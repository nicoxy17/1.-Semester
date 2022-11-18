package vorlesung2;
import java.util.Scanner;

public class Scan {

	public static void main(String[] args) 
	{
		byte n = 0; //Eingabe
		byte newN = 0;
		String d = "0000000"; //String Speicher
		char[] newD =d.toCharArray(); //Char Array für Zugriff auf bestimmte chars in String d (Sting = Char Array)
		
		int i = 6; // Zählervariable
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Geben sie eine zahl von 1 bis 127 ein");
		n = sc.nextByte();
		
		newN = n;
		
		while(newN!=0)
		{
			if(n<0)
			{
				break; //Break beendet die momentane schleife (wenn n negativ ist soll das programm nicht weiterarbeiten)
			}
			else if(newN%2 == 0)
			{
				newD[i] = '0';
			}
			else if(newN%2 != 0)
			{
				newD[i] = '1';
			}
			i--;
			newN= (byte) (newN/2); //Type cast
		}
		if(i == 6)
			System.out.println(0);
		else 
		{
			d = String.valueOf(newD);
			System.out.println(d);
		}
	}

}
