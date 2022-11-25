package test;

public class Ueb06Aufgabe4c {

	public static void main(String[] args) 
	{
		char[][] array = {{'a','a','*'}, {'*','a','*'}, {'*','*','*'}, {'l','*','*'}};
		
		berechneMin2Sterne(array);
	}
	
	public static void berechneMin2Sterne(char[][] field)
	{
		int count = 0;
		System.out.println("--------------------------------");
		for(int i = 0; i < field.length; i++)
		{
			count = 0;
			for(int n = 0; n < field[i].length ; n++)
			{
				if(field[i][n] == '*')
				{
					count++;
				}
			}
			if(count >= 2)
				System.out.println("Zeile: " + i + " Hat mindestens 2 Sterne");
			else
				System.out.println("Zeile: " + i + " Hat weniger 2 Sterne");
			
			System.out.println("--------------------------------");
		}
	}
}
