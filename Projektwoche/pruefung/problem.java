package Pruefung;

import java.util.Scanner;

public class problem 
{
	public static boolean posLeft = true;
	public static void main(String[] args) 
	{
		boolean aufgeben = false;
		diver d1 = new diver(5);
		diver d2 = new diver(10);
		diver d3 = new diver(35);
		diver d4 = new diver(40);
		diver[] divers = new diver[4];
		Scanner sc = new Scanner(System.in);
		String pepepopo = "";
		int test = 0;
		
		while(aufgeben == false)
		{
			posLeft=true;
			initialiseGame(divers,d1,d2,d3,d4);
			diver.resetTime();
			while((d1.isLeft==true||d2.isLeft==true||d3.isLeft==true||d4.isLeft==true))
			{
				showInterface(divers);
				pickDivers(divers);
				System.out.println("--------------------------------------------------");
			}
			if(diver.getTotalTime()>90)
			{
				System.out.println("Sie haben die zeit um "+ ((90-diver.getTotalTime())*-1) +"Minuten überzogen");
				System.out.println("Verloren");
			}
			else
				System.out.println("Gewonnen");
			
			
			
			System.out.println("Erneur Spielen? (j/n)");
			pepepopo = sc.next();
			
			if(pepepopo.charAt(0)=='n')
				aufgeben = true;
		}
	}
	
	public static void pickDivers(diver arr[])
	{
		String input = "";
		Scanner sc = new Scanner(System.in);
		int test[] = new int[2];

		System.out.println("\nVerbleibende zeit: "+(90-diver.getTotalTime())+ "Minuten");
		if(posLeft==true)
		{
			System.out.println("\nGeben sie die Taucher ein die von liNks nach Rechts tauchen sollen");
			for(int i = 0; i<2;i++)
			{
				input = sc.next();
				if(input.charAt(0)=='A'&&arr[0].isLeft==true)
				{
					arr[0].changeSide();
					test[i] = arr[0].getTime();
				}
				else if(input.charAt(0)=='B'&&arr[1].isLeft==true)
				{
					arr[1].changeSide();
					test[i] = arr[1].getTime();
				}
				else if(input.charAt(0)=='C'&&arr[2].isLeft==true)
				{
					arr[2].changeSide();
					test[i] = arr[2].getTime();
				}
				else if(input.charAt(0)=='D'&&arr[3].isLeft==true)
				{
					arr[3].changeSide();
					test[i] = arr[3].getTime();
				}
				else
				{
					System.out.println("Falsche Eingabe");
					i--;
				}
			}
		}
		else
		{
			System.out.println("\nGeben sie den Taucher ein der von rechts nach links tauchen sollen");
			
			for(int i = 0; i<1;i++)
			{
				input = sc.next();
				if(input.charAt(0)=='A'&&arr[0].isLeft==false)
				{
					arr[0].changeSide();
					test[0] = arr[0].getTime();
				}
				else if(input.charAt(0)=='B'&&arr[1].isLeft==false)
				{
					arr[1].changeSide();
					test[0] = arr[1].getTime();
				}
				else if(input.charAt(0)=='C'&&arr[2].isLeft==false)
				{
					arr[2].changeSide();
					test[0] = arr[2].getTime();
				}
				else if(input.charAt(0)=='D'&&arr[3].isLeft==false)
				{
					arr[3].changeSide();
					test[0] = arr[3].getTime();
				}
				else
				{
					System.out.println("Falsche Eingabe");
					i--;
				}
			}
		}
		
		diver.addtotalTime(calculateTime(test,posLeft));
		changeSide();
	}
	
	public static int calculateTime(int arr[], boolean posLeft)
	{
		int summ = 0;
		if(arr[0] > arr[1])
			summ = arr[0]+5;
		else
			summ = arr[1]+5;
		if(posLeft==true)
			return summ;
		else
			return arr[0];
	}
	
	public static void changeSide()
	{
		if(posLeft==true)
			posLeft = false;
		else
			posLeft = true;
	}
	
	public static void showInterface(diver arr[])
	{
		int zaehler = 0; 
		System.out.println("LINKS\t\t\tRECHTS");
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i].isLeft()==true&&arr[i].getTime()==5)
			{
				System.out.print("A(5) ");
				zaehler++;
			}
			if(arr[i].isLeft()==true&&arr[i].getTime()==10)
			{
				System.out.print("B(10) ");
				zaehler++;
			}
			if(arr[i].isLeft()==true&&arr[i].getTime()==35)
			{
				System.out.print("C(35) ");
				zaehler++;
			}
			if(arr[i].isLeft()==true&&arr[i].getTime()==40)
			{
				System.out.print("D(40)");
				zaehler++;
			}	
		}
		
		for(int i = zaehler; i<arr.length;i++)
			System.out.print("\t");
		
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i].isLeft()==false&&arr[i].getTime()==5)
			{
				System.out.print("A(5) ");
				zaehler++;
			}
			if(arr[i].isLeft()==false&&arr[i].getTime()==10)
			{
				System.out.print("B(10) ");
				zaehler++;
			}
			if(arr[i].isLeft()==false&&arr[i].getTime()==35)
			{
				System.out.print("C(35) ");
				zaehler++;
			}
			if(arr[i].isLeft()==false&&arr[i].getTime()==40)
			{
				System.out.print("D(40) ");
				zaehler++;
			}	
		}
		
	}
	
	public static void initialiseGame(diver arr[], diver a, diver b, diver c, diver d)
	{
		a.resetPos();
		b.resetPos();
		c.resetPos();
		d.resetPos();
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		arr[3] = d;
	}
}
