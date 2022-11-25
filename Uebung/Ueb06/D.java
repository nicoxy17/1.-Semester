package test;

public class Ueb06Aufgabe4d {

	public static void main(String[] args) 
	{
		char[][] array1 = {{'a','a','*'}, {'*','a','*'}, {'a','a','*'}, {'a','*','a'}};
		char[][] array2 = {{'a','a','*'}, {'a','a','a'}, {'*','*','a'}, {'a','*','*'}};
		char[][] array3 = {{'*','a','a'}, {'*','a','*'}, {'a','*','*'}, {'*','*','*'}};
		char[][] array4 = {{'a','a','*'}, {'a','*','a'}, {'*','a','a'}, {'a','a','a'}};
		char[][] array5 = {{'a','a','a'}, {'a','*','*'}, {'a','a','a'}, {'*','a','a'}};
		
		char[][][]array = new char[5][4][3];
		array[0] = array1;
		array[1] = array2;
		array[2] = array3;
		array[3] = array4;
		array[4] = array5;
		
		System.out.println("BERECHNE STERNE PRO ZEILE\n");
		for(int i = 0; i <= array.length-1; i++)
		{
			System.out.println("Array "+(i+1)+":");
			Ueb06Aufgabe4a.berechneSterneProZeile(array[i]);
			System.out.println();
		}
		
		System.out.println("BERECHNE STERNE PRO SPALTE\n");
		for(int i = 0; i <= array.length-1; i++)
		{
			System.out.println("Array "+(i+1)+":");
			Ueb06Aufgabe4b.berechneSterneProSpalte(array[i]);
			System.out.println();
		}
		
		System.out.println("BERECHNE ANZAHL ZEILEN MIT MINDESTENS 2 STERNEN\n");
		for(int i = 0; i <= array.length-1; i++)
		{
			System.out.println("Array "+(i+1)+":");
			Ueb06Aufgabe4c.berechneMin2Sterne(array[i]);
			System.out.println();
		}
	}

}
