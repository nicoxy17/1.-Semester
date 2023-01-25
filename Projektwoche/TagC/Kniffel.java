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
		int turn = 0;
		int uebergebe = 0;
		int test = 0;
		int bestPlayer = 0;
		int zuege = 2;
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Wie viele Spieler sollen teilnehmen?");
		player.setNrPlayers(sc.nextInt());
		System.out.println("====================================");
		
		for(int i = 0; i<player.getNrPlayer();i++)
		{
			System.out.println("Geben sie den Namen von Spieler " + (i+1)+ " ein");
			String name = sc.next();
			players[i]= new player(name, (i+1)); 	//Array wird oben initialisiert, jedoch wird nichts erstellt
			sc.reset();
		}
		boolean[][] taken = new boolean[player.getNrPlayer()][6];
		while(finish==false)
		{
			int reDice = dice.length;
			System.out.println();
			if(turn>=player.getNrPlayer())
				turn = 0;
			
			System.out.println("Spieler "+ (turn+1)+" ist am zug");
			zuege = 2;
			int x = 1;
			
			
			while(reDice != 0&&zuege != 0)
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
						int pickDice = 0;
						uebergebe = i;
						if(zuege!=0)
							pickDice = sc.nextInt();
						else
							pickDice = i+1;
						
						System.out.println("\n\n*******"+ pickDice+"********\n\n");
						if(pickDice != 0)
						{
							savedDice[i] = dice[pickDice-1];
							reDice--;
							sc.reset();
						}
						else
						{
							break;
						}
						
					}
				
				
					zuege--;
					
					
				}
				
				
				
				for(int i = dice.length-reDice; i<dice.length; i++)
				{
						System.out.println("AWDNWADIANDIUWANDUAWIDN");
						reDice--;
						savedDice[uebergebe] = dice[x];
						x++;
						uebergebe++;
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

				System.out.println("Welche Würfel wollen sie nehmen?");
				System.out.println("Verfügbare Optionen sind: ");
				System.out.println("'*'*'*'*'*'*''*''''*"+turn);
				for(int i = 0;i<taken[1].length;i++)
				{
					if(taken[turn][i]==false)
					{
						System.out.print((i+1)+", ");
					}
					else
						test++;
					
					if(test == 6)
						players[turn].setFinish();
						
				}
				if (finish == false)
				{
					System.out.println(finish);
					System.out.println("~~~~~~~~~~~~~"+test);
					int option = sc.nextInt()-1;
					taken[turn][option] = true;
					players[turn].punkteVerwalten(savedDice, option);
				}
				
				for(int i = 0; i<player.getNrPlayer(); i++)
				{
					if(players[i].isFinish() == true)
					{
						finish=true;
					}
				}
				turn++;
				
			}
		
		for(int i = 0; i<player.getNrPlayer(); i++)
		{
			bestPlayer = 0;
			if(i!=player.getNrPlayer()&&players[bestPlayer].getPoints()<players[bestPlayer+1].getNumber())
			{
				bestPlayer = players[bestPlayer+1].getNumber();
			}
		}
		
		System.out.println("Gewonnen hat spieler "+bestPlayer+" mit" +players[bestPlayer].getPoints()+" punkten");
			
		}
		
		
	
	
	public static void clearScreen() {  
	    System.out.print("\033[H\033[2J");  
	    System.out.flush();  
	}  

}
