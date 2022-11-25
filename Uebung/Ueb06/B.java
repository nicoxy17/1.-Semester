package test;

public class Ueb06Aufgabe4b {

	public static void main(String[] args) 
	{
		char[][] array = {{'a','a','a'}, 
						  {'*','a','a'}, 
						  {'*','*','a'}, 
						  {'*','*','l'}};
		
		berechneSterneProSpalte(array);
	}
	
	public static void berechneSterneProSpalte(char[][] field)
	{
		int count = 0;
		System.out.println("--------------------------------");
		for(int i = 0; i < field[i].length; i++)
		{
			count = 0;
			for(int n = 0; n < field.length ; n++)
			{
				if(field[n][i] == '*')
				{
					count++;
				}
			}
			System.out.println("Spalte: " + i + " Hat insgesamt " + count + " Sterne");
			System.out.println("--------------------------------");
		}
	}
}
