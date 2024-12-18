import java.util.Scanner;
import java.util.Random;
public class Main
{

	public static void main(String[]args)
	{
		
		Scanner Key = new Scanner(System.in);
		
	System.out.println("Hi! lets play a game of Tic Tac Toe. Choose bewteen X and O!");
	String userchoice = Key.nextLine();
	System.out.print(userchoice);
	
	

	gamess(userchoice);

	}
	
	
	
	
	
	
	

	
	public static void gamess(String newchoice) 
	{
		Scanner Key = new Scanner(System.in);
		Random rand = new Random();
		String gameboard [][] = 
				
			{ {" ", " ", "A"," ", "B"," ","C", " "},
			   {" ", " ","-"," ", "-"," ", "-"},
			   {"0","|" ," ", "|", " ", "|", " ", "|"},
			   {" ", " ","-"," ", "-"," ", "-"},
			   {"1","|" ," ", "|", " ", "|", " ", "|"},
			   {" ", " ","-"," ", "-"," ", "-"},
			   {"2","|" ," ", "|", " ", "|", " ", "|"},
			   {" ", " ","-"," ", "-"," ", "-"},
			   
			 };
		String[] machineChoices =
			{"A0","B0", "C0"
			,"A1","B1", "C1" 
			,"A2","B2", "C2"};

		
		
			
			
		String Cpuchoice = null;
		String Symbol_X="X";
		String Symbol_O="O";
		if(newchoice.equals("X"))
		{
			Cpuchoice=Symbol_O;
		}
		else if (newchoice.equals("O"))
		{
			Cpuchoice=Symbol_X;
		}
		System.out.println(" ");
		System.out.println("Great I will play as  "+Cpuchoice);
		
		
			int cpu = rand.nextInt(machineChoices.length);
			String play1=machineChoices[cpu];
			
			
			

			for(String []Row:gameboard)
			{
				System.out.println(" ");

				for( String C:Row)
				{

					System.out.print(C);

					
				}

			}

			
			for(int i = 0; i<8;i++)
			{

				System.out.println(" ");
				System.out.println("Okay.Lets play");
				String choice1 = Key.nextLine();
				player1(gameboard,newchoice);
				


				for(String []Row:gameboard)
				{
					System.out.println(" ");

					for( String C:Row)
					{

						//{		
							if(choice1.equals("A0"))
							{
								removeChoice(machineChoices, choice1);
								gameboard[2][2] =newchoice;

							}
								else if(choice1.equals("B0"))
								{
									removeChoice(machineChoices, choice1);
									gameboard[2][4]=newchoice;

								}
									else if(choice1.equals("C0"))
									{
										removeChoice(machineChoices, choice1);
										gameboard[2][6]=newchoice;


									}
										else if(choice1.equals("A1"))
										{
											removeChoice(machineChoices, choice1);
											gameboard[4][2]=newchoice;


										}
											else if(choice1.equals("B1"))
											{
												removeChoice(machineChoices, choice1);
												gameboard[4][4]=newchoice;

							

											}
												else if(choice1.equals("C1"))
												{
													removeChoice(machineChoices, choice1);
														gameboard[4][6]=newchoice;


												}
													else if(choice1.equals("A2"))
													{
														removeChoice(machineChoices, choice1);
														gameboard[6][2]=newchoice;


													}
														else if(choice1.equals("B2"))
														{
															removeChoice(machineChoices, choice1);
														gameboard[6][4]=newchoice;


														}
															else if(choice1.equals("C2"))
															{
																removeChoice(machineChoices, choice1);
																gameboard[6][6]=newchoice;

															}
						


						//}
						
						
						System.out.print(C);
						
						
					}
				
				
				}
				
				if(gameboard[2][2]==newchoice && gameboard[2][4]==newchoice && gameboard[2][6]==newchoice)
				{
					System.out.println(" ");
					System.out.println("You win!!!");
					break;
				}
				else if(gameboard[4][2]==newchoice && gameboard[4][4]==newchoice && gameboard[4][6]==newchoice)
				{
					System.out.println(" ");
					System.out.println("You Win!!");
					break;

				}
				else if(gameboard[6][2]==newchoice && gameboard[6][4]==newchoice && gameboard[6][6]==newchoice)
				{
					System.out.println(" ");
					System.out.println("You Win!!");
					break;

				}
				else if(gameboard[2][2]==newchoice && gameboard[4][2]==newchoice && gameboard[6][2]==newchoice)
				{
					System.out.println(" ");
					System.out.println("You Win!!");
					break;

				}
				else if(gameboard[2][4]==newchoice && gameboard[4][4]==newchoice && gameboard[6][4]==newchoice)
				{
					System.out.println(" ");
					System.out.println("You Win!!");
					break;

				}
				else if(gameboard[6][2]==newchoice && gameboard[6][4]==newchoice && gameboard[6][6]==newchoice)
				{
					System.out.println(" ");
					System.out.println("You Win!!");
					break;

				}
				
				else if(gameboard[2][2]==newchoice && gameboard[4][4]==newchoice && gameboard[6][6]==newchoice)
				{
					System.out.println(" ");
					System.out.println("You Win!!");
					break;

				}
				else if(gameboard[6][2]==newchoice && gameboard[4][4]==newchoice && gameboard[6][2]==newchoice)
				{
					System.out.println(" ");
					System.out.println("You Win!!");
					break;

				}
			   

			}
			
			
			
			
			
			
			
			
			
			
			
			
			
	}
	
	
public static void player1(String [][]gameboard,String newchoice)
	{
	Scanner Key = new Scanner(System.in);
	Random rand = new Random();
	
	
	String[] machineChoices = {"A0","B0", "C0"
			,"A1","B1", "C1" 
			,"A2","B2", "C2"};
	



	    
		
	String cho = null;
	String Symbolx="X";
	String Symbolo="O";
	if(newchoice.equals("X"))
	{
	  cho=Symbolo;
	}
	else if (newchoice.equals("O"))
	{
	cho=Symbolx;
	}
	
	System.out.println(" ");
	
	

		System.out.println("Mine turn........: ");
		 int cpuchoices = rand.nextInt(machineChoices.length);
		String play1=machineChoices[cpuchoices];
		System.out.print(machineChoices[cpuchoices]);
		
		

		

			

		

			
		
		

		
	removeChoice(machineChoices, play1);

	for(int z= 0; z<8;z++)
	{
		if(play1.equals("A0"))
		{
			removeChoice(machineChoices, play1);
					gameboard[2][2]=cho;
		}
		 else if(play1.equals("B0"))
			{
				removeChoice(machineChoices, play1);
				gameboard[2][4]=cho;

			}
		 else if(play1.equals("C0"))
			{
				removeChoice(machineChoices, play1);
				gameboard[2][6]=cho;

			}
		 else if(play1.equals("A1"))
			{
				removeChoice(machineChoices, play1);
				gameboard[4][2]=cho;

			}
		 else if(play1.equals("B1"))
			{
				removeChoice(machineChoices, play1);
				gameboard[4][4]=cho;

			}
		 else if(play1.equals("C1"))
			{
				removeChoice(machineChoices, play1);
				gameboard[4][6]=cho;

			}
		 else if(play1.equals("A2"))
			{
				removeChoice(machineChoices, play1);
				gameboard[6][2]=cho;

			}
		 else if(play1.equals("B2"))
			{
				removeChoice(machineChoices, play1);
				gameboard[6][4]=cho;

			}
		 else if(play1.equals("C2"))
			{
				removeChoice(machineChoices, play1);
				gameboard[6][6]=cho;

			}
		
		
		if(gameboard[2][2]==cho && gameboard[2][4]==cho && gameboard[2][6]==cho)
		{
			System.out.println(" ");
			System.out.println("I win try again!!!");
			break;
		}
		else if(gameboard[4][2]==cho && gameboard[4][4]==cho && gameboard[4][6]==cho)
		{
			System.out.println(" ");
			System.out.println("I win try again!!!");
			break;

		}
		else if(gameboard[6][2]==cho && gameboard[6][4]==cho && gameboard[6][6]==cho)
		{
			System.out.println(" ");
			System.out.println("I win try again!!!");
			break;

		}
		else if(gameboard[2][2]==cho && gameboard[4][2]==cho && gameboard[6][2]==cho)
		{
			System.out.println(" ");
			System.out.println("I win try again!!!");
			break;

		}
		else if(gameboard[2][4]==cho && gameboard[4][4]==cho && gameboard[6][4]==cho)
		{
			System.out.println(" ");
			System.out.println("I win try again!!!");
			break;

		}
		else if(gameboard[6][2]==cho && gameboard[6][4]==cho && gameboard[6][6]==cho)
		{
			System.out.println(" ");
			System.out.println("I win try again!!!");
			break;

		}
		
		else if(gameboard[2][2]==cho && gameboard[4][4]==cho && gameboard[6][6]==cho)
		{
			System.out.println(" ");
			System.out.println("I win try again!!!");
			break;

		}
		else if(gameboard[6][2]==cho && gameboard[4][4]==cho && gameboard[2][6]==cho)
		{
			System.out.println(" ");
			System.out.println("I win try again!!!");
			break;

		}
	}  

	
		
		

		
						
		
		

	
	
	}

public static void  removeChoice(String[] choices, String choice) {
    String[] newChoices = new String[choices.length - 1];
    int index = 0;
    for (String element : choices) {
        if (!element.equals(choice)) {
            newChoices[index++] = element;
            choices=newChoices;
            
        }
    }
    //return newChoices;
}

}
	
	




	
	
	
	
	
	

