package AufgabeB;

import java.util.Scanner;

public class Aufgabe1
{
	public static final int size = 5;
	
	public static void main(String[] args) {
		char[][] grid = new char[size][size];
		boolean gewonnen = false;
		
		starteSpiel(grid);
		
		while(gewonnen==false)
		{
			zug(grid);
		}
		
	}
	
	public static void Spielfeld(char field[][])
	{
		System.out.print("  ");
		for(int i = 0; i<size;i++) {
			System.out.print(i+" ");
		}
		
		System.out.print("\n  ");
		for(int i = 0; i<size;i++) {
			System.out.print("--");
		}
		System.out.println();
		for(int i = 0; i<size;i++) {
			System.out.print(i+"|");
			for(int x = 0; x<size;x++) {
				System.out.print(field[x][i]+" ");
			}
			System.out.println();
		}
	}
	
	public static void starteSpiel(char field[][])
	{
		for(int i = 0;i < size;i++)
		{
			for(int x = 0;x<size;x++) {
				field[i][x]='#';
			}
		}
		
		field[2][3] = '_';
		Spielfeld(field);
	}
	
	public static boolean zug(char field[][])
	{
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		char richtung = ' ';
		int anzahlFiguren = 0;
		
		System.out.println("Bitte geben sie ihre X Koordinate ein");
		x = sc.nextInt();
		System.out.println("Bitte geben sie nun ihre Y Koorddinate ein");
		y = sc.nextInt();
		if(field[x][y]!='_')
		{
			System.out.println("Wählen sie eine Richtung in die sie Springen möchten (u=unten, o=oben, l=links, r=rechts");
			richtung = sc.next().charAt(0);
			if(richtung == 'r' || richtung=='l' || richtung=='u' || richtung=='o')
			{
				System.out.println('1');
				if(richtung=='r')
				{
					if((x+2)<=size&&field[x+2][y]=='_')
					{
						field[x+2][y]='#';
						field[x+1][y]='_';
						field[x][y] ='_';
					}	
					else
						System.out.println("Das Feld ist nicht Frei oder ausserhalb des Spielfeldes");
				}
				else if(richtung=='l')
				{
					if((x-2)>=0&&field[x-2][y]=='_')
					{
						field[x-2][y]='#';
						field[x-1][y]='_';
						field[x][y] ='_';
					}
					else
						System.out.println("Das Feld ist nicht Frei oder ausserhalb des Spielfeldes");
				}
				else if(richtung=='u')
				{
					System.out.println('2');

					if((y+2)<=size&&field[x][y+2]=='_')
					{
						field[x][y+2]='#';
						field[x][y+1]='_';
						field[x][y] ='_';
					}
					else
						System.out.println("Das Feld ist nicht Frei oder ausserhalb des Spielfeldes");
				}
				else if(richtung=='o')
				{
					if((y-2)>=0&&field[x][y-2]=='_')
					{
						field[x][y-2]='#';
						field[x][y-1]='_';
						field[x][y] ='_';
					}
					else
						System.out.println("Das Feld ist nicht Frei oder ausserhalb des Spielfeldes");
				}
				else
				{
					System.out.println("Falsche Eingabe");
				}
				Spielfeld(field);
			}
			else
			{
				System.out.println(richtung);
			}
			
		}
		else
		{
			System.out.println(field[x][y]);
		}
		
		for(int i = 0; i<size;i++)
		{
			for(int z = 0;z<size;z++)
			{
				if(field[i][z] == '#')
				{
					anzahlFiguren++;
				}
					
			}
		}
		if(anzahlFiguren==1)
			return true;
		return false;
	}
		
}
