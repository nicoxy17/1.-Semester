package AufgabeC;

import java.util.*;

public class Kniffel {

	public static void main(String[] args) 
	{
		player[] players  = new player[player.getMaxPlayers()];
		int anzahlWuerfel = 5;
		int[] dice = new int[anzahlWuerfel];
		int[] savedDice = new int[anzahlWuerfel];
		boolean finish = false;
		int turn = 1;
		int zuege = 3;
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Wie viele Spieler sollen teilnehmen?");
		player.setNrPlayers(sc.nextInt());
		System.out.println("====================================");
		
		for(int i = 1; i<player.getNrPlayer()+1;i++)
		{
			System.out.println("Geben sie den Namen von Spieler " + i+ " ein");
			String name = sc.next();
			players[i]= new player(); 	//Array wird oben initialisiert, jedoch wird nichts erstellt
			players[i].setName(name);
			players[i].setNumber(i);
			sc.reset();
		}
		
		while(finish==false)
		{
			int reDice = dice.length;
			System.out.println();
			System.out.println("Spieler "+ turn+" ist am zug");
			zuege = 3;
			
			
			while(reDice != 0&&zuege != 1)
			{
				for(int i = 0; i<reDice;i++)
					dice[i] = rand.nextInt(6)+1;
				
				System.out.print("NUMMER DES WÜRFELS:\t\t\t");
				for(int i = 0; i<reDice;i++)
					System.out.print((i+1)+"\t");
				
				System.out.println();
				for(int i = 0; i<reDice;i++)
					System.out.print("====================");
				
				System.out.print("\nWERT DES WÜRFELS:\t\t\t");
				for(int i = 0; i<reDice;i++)
				{
					System.out.print(dice[i]+"\t");
				}
				
				System.out.println();
				System.out.println("\nWelche würfel wollen sie behalten? (Drücken sie 0 um zu beenden)");
				
				for(int i = dice.length-reDice; i<dice.length; i++)
				{
					int pickDice = sc.nextInt();
					
					System.out.println("\n\n*******"+ pickDice+"********\n\n");
					if(pickDice != 0)
					{
						if(zuege!=1)
						{
							savedDice[i] = dice[pickDice-1];
							reDice--;
							sc.reset();
							zuege--;
						}
						else
						{
							int x = 1;
							savedDice[i] = dice[x];
							x++;
						}
					}
					else
					{
						break;
					}
					
				}
				System.out.println("----------------");
				for(int i = 0; i<savedDice.length;i++)
				{
					System.out.print(savedDice[i]);
				}
				System.out.println("\n");
				System.out.println(dice[0]+"->"+savedDice[0]);
				System.out.println(dice[1]+"->"+savedDice[1]);
				System.out.println(dice[2]+"->"+savedDice[2]);
				System.out.println(dice[3]+"->"+savedDice[3]);
				System.out.println(dice[4]+"->"+savedDice[4]);
				
			}
			
			
			turn++;
			if(turn>player.getNrPlayer())
				turn = 1;
		}
		
		
	}
	
	public static void clearScreen() {  
	    System.out.print("\033[H\033[2J");  
	    System.out.flush();  
	}  

}
