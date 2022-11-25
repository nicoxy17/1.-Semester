package test;

public class Ueb06Aufgabe4a {

	public static void main(String[] args) 
	{
		char[][] array = {{'a','a','*'}, {'*','a','*'}, {'*','*','*'}, {'l','k','l'}};
		
		berechneSterneProZeile(array);
	}
	
	public static void berechneSterneProZeile(char[][] field)
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
			System.out.println("Zeile: " + i + " Hat insgesamt " + count + " Sterne");
			System.out.println("--------------------------------");
		}
	}
}
