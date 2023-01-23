package projektwocheA;

import java.util.ArrayList;
import java.util.Scanner;

public class CaeserCypher 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Scanner klar = new Scanner(System.in);
		Scanner geheim = new Scanner(System.in);
		Scanner schiebung = new Scanner(System.in);
		Scanner ok = new Scanner(System.in);
		
		
		ArrayList<Character> list = new ArrayList<Character>();
		ArrayList<Character> list2 = new ArrayList<Character>();
		
		String klartext = "";
		String geheimtext = "";
		int verschiebung = 0;
		int input = 0;
		String verschluesselt = klartext;
	
		System.out.println("(1) Eingabe Klartext");
		System.out.println("(2) Eingabe Geheimtext");
		System.out.println("(3) Verschiebung");
		System.out.println("(4) Verschluesseln");
		System.out.println("(5) Entschluesseln");
		System.out.println("(6) Entschluesseln Durchlauf");
		System.out.println("(7) Ende");
		
		
		while(input != 7)
		{
			input = sc.nextInt();
			if(input==1)
			{
				System.out.println("Geben sie ihren Klartext ein");
				klartext = klar.nextLine();
				System.out.println(klartext);
			}
			else if(input==2)
			{
				System.out.println("Geben sie ihren Geheimtext ein");
				geheimtext = geheim.nextLine();
				System.out.println(geheimtext);
			}
			else if(input==3)
			{
				System.out.println("Geben sie die Verschiebung ein (Zahl swischen 1 und 25)");
				verschiebung = schiebung.nextInt();
				if(verschiebung > 25 || verschiebung < 0)
				{
					System.out.println("Ungültige Eingabe");
					verschiebung = 0;
				}
				System.out.println(verschiebung);
			}
			else if(input==4)
			{
				if(klartext == "" || verschiebung == 0)
				{
					System.out.println("Bitte geben sie vorher einen Klartext und eine Verschiebung ein");
				}
				else
				{
					for(int i = 0; i<klartext.length();i++)
					{
						if(klartext.charAt(i) != ' ')
						{
							int korrektur = 55+verschiebung;
							if((Character.getNumericValue(klartext.charAt(i))+korrektur) >90)
							{
								korrektur = korrektur - 24;
							}
							list.add((char) (Character.getNumericValue(klartext.charAt(i))+korrektur));
						}
						else
						{
							
							list.add(klartext.charAt(i));
						}
					}
					for(int i = 0; i<list.size();i++)
						System.out.print(list.get(i));
				}
			}
			else if(input == 5)
			{
				if(geheimtext == "" || verschiebung == 0)
				{
					System.out.println("Bitte geben sie vorher einen Geheimtext und eine Verschiebung ein");
				}
				else
				{
					for(int i = 0; i<geheimtext.length();i++)
					{
						if(geheimtext.charAt(i) != ' ')
						{
							int korrektur = 55-verschiebung;
							if((Character.getNumericValue(geheimtext.charAt(i))+korrektur) < 65)
							{
								korrektur = korrektur + 26;
							}
							list2.add((char) (Character.getNumericValue(geheimtext.charAt(i))+korrektur));
							System.out.println(Character.getNumericValue(geheimtext.charAt(i))+korrektur);
						}
						else
						{
							
							list2.add(geheimtext.charAt(i));
						}
					}
					for(int i = 0; i<list2.size();i++)
						System.out.print(list2.get(i));
				}
			}
			else if(input == 6)
			{
				int zufrieden = 0;
				int test = 0;
				
				while(zufrieden==0)
				{
					if(geheimtext == "")
					{
						System.out.println("Bitte geben sie vorher einen Geheimtext ein");
					}
					else
					{
						for(int i = 0; i<geheimtext.length();i++)
						{
							if(geheimtext.charAt(i) != ' ')
							{
								int korrektur = 55-test;
								if((Character.getNumericValue(geheimtext.charAt(i))+korrektur) < 65)
								{
									korrektur = korrektur + 26;
								}
								list2.add((char) (Character.getNumericValue(geheimtext.charAt(i))+korrektur));
								System.out.println(Character.getNumericValue(geheimtext.charAt(i))+korrektur);
							}
							else
							{
								
								list2.add(geheimtext.charAt(i));
							}
						}
						for(int i = 0; i<list2.size();i++)
							System.out.print(list2.get(i));
					}
					
					list2.clear();
					System.out.println("Sind sie mit der Ausgabe zufrieden? (0 für nein und 1 für ja)");
					zufrieden = ok.nextInt();
					test++;
					
				}
			}
			System.out.println("(1) Eingabe Klartext");
			System.out.println("(2) Eingabe Geheimtext");
			System.out.println("(3) Verschiebung");
			System.out.println("(4) Verschluesseln");
			System.out.println("(5) Entschluesseln");
			System.out.println("(6) Entschluesseln Durchlauf");
			System.out.println("(7) Ende");
		}
	}
}
