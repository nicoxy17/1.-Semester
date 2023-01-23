package projektwocheA;

import java.util.ArrayList;
import java.util.Scanner;

public class Messwerte 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Wie viele Zahlen wollen sie Eingeben?");
		int maxNumbers = sc.nextInt();
		int list[] = new int[maxNumbers];
		
		System.out.println("Geben sie Ihre Messwerte ein.");
		
		for(int i = 0; i<maxNumbers; i++)
		{
			
			int x = sc.nextInt();
			list[i]=x;
		}
		sc.close();
		System.out.println("Summe = "+ summe(list));
		System.out.println("Maximum = "+ maximum(list));
		System.out.println("Minimum = "+ minimum(list));
		System.out.println("Mittelwert = "+ mittelwert(list));
		forward(list);
		System.out.println();
		backwards(list);

	}
	
	public static int summe(int field[])
	{
		int summ = 0;
		for(int i =0; i<field.length;i++)
		{
			summ += field[i];
		}
		return summ;
	}
	
	public static int maximum(int field[])
	{
		int max = field[1];
		for(int i = 0; i<field.length-1;i++)
		{
			if(field[i]<field[i+1] && field[i+1]>max)
				max = field[i+1];
		}
		return max;
	}
	
	public static int minimum(int field[])
	{
		int min = field[1];
		for(int i = 0; i<field.length-1;i++)
		{
			if(field[i]<field[i+1] && field[i]<min)
				min = field[i];
		}
		return min;
	}
	
	public static float mittelwert(int field[])
	{
		return (float)summe(field)/field.length;
	}
	
	public static void forward(int field[])
	{
		for(int i = 0; i<field.length;i++)
			System.out.print(field[i]+" ");
	}
	
	public static void backwards(int field[])
	{
		for(int i = field.length-1; i>=0;i--)
			System.out.print(field[i]+" ");
	}

}
