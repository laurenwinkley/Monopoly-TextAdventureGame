import java.util.Scanner;

public class TextAdventureGame {
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		// introduction
		System.out.println("Welcome to Monopoly! \n");
		System.out.println("In this game, you are a monopolist. As you roll the dice,");
		System.out.println("you will move around the game board. Depending on where");
		System.out.println("you land will determine your opportunites to buy property,");
		System.out.println("pay taxes, buy utilities, and take your chances by drawing");
		System.out.println("a community chest or chance card.");
		System.out.println("The goal of this game is to remain ");
		System.out.println("financially solvent while forcing your oponent (the computer)");
		System.out.println("into bankruptsy by buying and developing pieces of property. \n");
		System.out.println("The game will end when the first person completes 1 turn around");
		System.out.println("the board. Whoever ends with more money will win.");
		System.out.println("You will start off $1,500.");
		System.out.println("Good luck!");
		System.out.println("");
		// starting things
		int userBank = 1500;
		int compBank = 1500;
		int userSpot = 0;
		int compSpot = 0;
		int roll = 0;
		Boolean med = false;
		Boolean waterWorks = false;
		Boolean oriental = false;
		Boolean stCharles = false;
		Boolean electricCompany = false;
		Boolean tennessee = false;
		Boolean BORailroad = false;
		Boolean kentucky = false;
		Boolean marvinGardens = false;
		Boolean northCarolina = false;
		Boolean boardwalk = false;
		// dice role
		String response = "yes";
		while(response.equalsIgnoreCase("yes") && userSpot < 19 && compSpot < 19) {
			System.out.println("To roll the dice, type and enter \"roll\"");
			String willRoll = kb.nextLine();
			if(willRoll.equalsIgnoreCase("roll")) {
				roll = (int)(Math.random()*8)+1;
			}
			else {
				break;
			}
			System.out.println("You rolled: " + roll + "\n");
			userSpot+=roll;
			if (userSpot > 19) {
				System.out.println("You have completed the game of monopoly! \n");
				break;
			}
			
			
			//Mediterranean Ave
			if(userSpot==1) {
				System.out.println("You have landed on Mediterranian Avenue! \n");
				if (med == false) {
					System.out.println("Would you like to buy this property for $60? Yes or no \n");
					String medBuy = kb.nextLine();
					if(medBuy.equalsIgnoreCase("yes")) {
						med = true;
						userBank-=60;
					}
				}
				else {
					System.out.println("This property is owned. Pay the rent of $2. \n");
					userBank-=2;
					compBank+=2;
				}
			}
			
			// Community Chest
			if(userSpot==2) {
				System.out.println("You have landed on the Community Chest! Your card reads: \n");
				int x = (int)(Math.random()*3)+1;
				if(x==1) {
					System.out.println("\"From sale of stock, you get $50.\" \n");
					userBank+=50;
				}
				if(x==2) {
					System.out.println("\"Life insurance matures. You get $50\" \n");
					userBank+=50;
				}
				if(x==3) {
					System.out.println("\"Pay hospital fees of $100\" \n");
					userBank-=100;
				}
				if(x==4) {
					System.out.println("\"You won the lottery! Collect $100\" \n");
					userBank+=100;
				}
			}
			//Water Works
			if(userSpot==3) {
				System.out.println("You have landed on Water Works! \n");
				if (waterWorks == false) {
					System.out.println("Would you like to buy this utility for $150? yes or no \n");
					String wwBuy = kb.nextLine();
					if(wwBuy.equalsIgnoreCase("yes")) {
						waterWorks = true;
						userBank-=150;
					}
				}
				else {
					int x = roll*10;
					System.out.println("This utility is owned already! pay rent of $" + x + "\n");
					userBank-=x;
					compBank+=x;
				}
			}
			//Oriental Ave
			if(userSpot==4) {
				System.out.println("You have landed on Oriental Avenue! \n");
				if(oriental == false) {
					System.out.println("Would you like to buy this property for $100? yes or no \n");
					String oBuy = kb.nextLine();
					if(oBuy.equalsIgnoreCase("yes")) {
						oriental = true;
						userBank-=100;
					}
				}
				else {
					System.out.println("This property is already owned! Pay rent of $6 \n");
					userBank-=6;
					compBank+=6;
				}
			}
			//Jail
			if(userSpot==5) {
				System.out.println("Welcome to jail! You are just visiting, don't worry :) \n");
			}
			//St Charles Place
			if(userSpot==6) {
				System.out.println("You have landed on St. Charles place! \n");
				if(stCharles == false) {
					System.out.println("Would you like to buy this property for $140? yes or no \n");
					String stCharlesBuy = kb.nextLine();
					if(stCharlesBuy.equalsIgnoreCase("yes")) {
						stCharles = true;
						userBank-=140;
					}
				}
				else {
					System.out.println("This property is already owned! Pay rent of $10. \n");
					userBank-=10;
					compBank+=10;
				}
			}
			//Electric Company
			if(userSpot==7) {
				System.out.println("You have landed on the Electric Company. \n");
				if(electricCompany == false) {
					System.out.println("Would you like to buy this utility for $150? yes or no \n");
					String ecBuy = kb.nextLine();
					if(ecBuy.equalsIgnoreCase("yes")) {
						electricCompany = true;
						userBank-=150;
					}
				}
				else {
					int x = roll*10;
					System.out.println("This utility is already owned :( Pay rent of $" + x + "\n");
					userBank-=x;
					compBank+=x;
				}
			}
			//Tennessee Ave
			if(userSpot==8) {
				System.out.println("You have landed on Tennessee Avenue. \n");
				if (tennessee == false) {
					System.out.println("Would you like to buy this property for $180? yes or no \n");
					String tBuy = kb.nextLine();
					if (tBuy.equalsIgnoreCase("yes")) {
						tennessee = true;
						userBank -= 180;
					}
				}
				else {
					System.out.println("This property is already owned! Pay rent of $14. \n");
					userBank-=14;
					compBank+=14;
				}
			}
			//chance
			if(userSpot==9) {
				System.out.println("You have landed on chance! Your card reads: \n");
				int x = (int)(Math.random()*3)+1;
				if (x==1) {
					System.out.println("\"You have been elected chairman of the board. Pay the computer $50\" \n");
					userBank -= 50;
					compBank += 50;
				}
				if (x==2) {
					System.out.println("\"Your child needs braces! Pay child support of $100.\" \n");
					userBank -= 100;
				}
				if (x==3) {
					System.out.println("\"Life insurance matures. Collect $100. \n");
					userBank += 100;
				}
				if (x==4) {
					System.out.println("\"Bank pays you a divedend of $75\" \n");
					userBank += 75;
				}
			}
			//free parking
			if(userSpot==10) {
				System.out.println("Free parking! Enjoy your stay :) \n");
			}
			//B & O Railroad
			if(userSpot==11) {
				System.out.println("You have landed on B & O Railroad! \n");
				if(BORailroad == false) {
					System.out.println("Would you like to buy this railroad for $200? yes or no \n");
					String boBuy = kb.nextLine();
					if(boBuy.equalsIgnoreCase("yes")) {
						userBank-=200;
						BORailroad = true;
					}
				}
				else {
					System.out.println("This railroad is already owned! Pay rent of $25. \n");
					userBank -= 25;
					compBank+=25;
				}
			}
			//Community Chest
			if(userSpot==12) {
				System.out.println("You have landed on the Community Chest! Your card reads: \n");
				int x = (int)(Math.random()*3)+1;
				if(x==1) {
					System.out.println("\"From sale of stock, you get $50.\" \n");
					userBank+=50;
				}
				if(x==2) {
					System.out.println("\"Life insurance matures. You get $50\" \n");
					userBank+=50;
				}
				if(x==3) {
					System.out.println("\"Pay hospital fees of $100\" \n");
					userBank-=100;
				}
				if(x==4) {
					System.out.println("\"You won the lottery! Collect $100\" \n");
					userBank+=100;
				}
			}
			//Kentucky Ave
			if(userSpot==13) {
				System.out.println("You have landed on Kentucky Avenue! \n");
				if(kentucky == false) {
					System.out.println("Would you like to buy this property for $220? yes or no \n");
					String kBuy = kb.nextLine();
					if (kBuy.equalsIgnoreCase("yes")) {
						kentucky = true;
						userBank -= 220;
					}
				}
				else {
					System.out.println("This property is already owned :( pay rent of $18 \n");
					userBank -= 14;
					compBank+=14;
				}
			}
			//Marvin Gardens
			if(userSpot==14) {
				System.out.println("You have landed on Marvin Gardens! \n");
				if (marvinGardens == false) {
					System.out.println("Would you like to buy this property for $280? yes or no \n");
					String mgBuy = kb.nextLine();
					if (mgBuy.equalsIgnoreCase("yes")) {
						marvinGardens = true;
						userBank -= 280;
					}
				}
				else {
					System.out.println("This property is owned! Pay rent of $24 \n");
					userBank -= 24;
					compBank+=24;
				}
			}
			//go to jail
			if(userSpot==15) {
				System.out.println("You've landed in jail! Skip this turn. \n");
			}
			//chance
			if(userSpot==16) {
				System.out.println("You have landed on chance! Your card reads: \n");
				int x = (int)(Math.random()*3)+1;
				if (x==1) {
					System.out.println("\"You have been elected chairman of the board. Pay the computer $50\" \n");
					userBank -= 50;
					compBank += 50;
				}
				if (x==2) {
					System.out.println("\"Your child needs braces! Pay child support of $100.\" \n");
					userBank -= 100;
				}
				if (x==3) {
					System.out.println("\"Life insurance matures. Collect $100. \n");
					userBank += 100;
				}
				if (x==4) {
					System.out.println("\"Bank pays you a divedend of $75\" \n");
					userBank += 75;
				}
			}
			//north carolina ave
			if(userSpot==17) {
				System.out.println("You've landed on North Carolina Avenue! \n");
				if (northCarolina == false) {
					System.out.println("Would you like to buy this property for $300? yes or no \n");
					String ncBuy = kb.nextLine();
					if (ncBuy.equalsIgnoreCase("yes")) {
						northCarolina = true;
						userBank -= 300;
					}
				}
				else {
					System.out.println("This property is already owned! pay rent of $26. \n");
					userBank -= 26;
					compBank+=26;
				}
			}
			//income tax
			if(userSpot==18) {
				System.out.println("You've landed on an income tax! In order to reside here, pay $200. \n");
				userBank -= 200;
			}
			//boardwalk
			if(userSpot==19) {
				System.out.println("You've landed on the Boardwalk! \n");
				if (boardwalk == false) {
					System.out.println("Would you like to buy this property for $400? yes or no \n");
					String bwBuy = kb.nextLine();
					if (bwBuy.equalsIgnoreCase("yes")) {
						boardwalk = true;
						userBank -= 400;
					}
				}
				else {
					System.out.println("This property is already owned :( Pay rent of $50. \n");
					userBank -= 50;
					compBank+=50;
					
				}
			}
			
			//COMPUTER TURN
			roll = (int)(Math.random()*8)+1;
			System.out.println("The computer rolled: " + roll + "\n");
			compSpot+=roll;
			
			//Mediterranean Ave
			if(compSpot==1) {
				System.out.println("The computer has landed on Mediterranian Avenue! \n");
				if (med == false) {
					int compMed = (int)(Math.random()*2)+1;
					if (compMed == 1) {
						System.out.println("The computer would like to buy this property for $60. \n");
						compBank -= 60;
						med = true;
					}
					else {
						System.out.println("The computer has decided not to buy this property. \n");
					}

				}
				else {
					System.out.println("You own this property! The computer must pay you a rent of $2. \n");
					compBank-=2;
					userBank +=2;
				}
			}
			// Community Chest
			if(compSpot==2) {
				System.out.println("The computer has landed on community chest! Their card reads: \n");
				int x = (int)(Math.random()*3)+1;
				if(x==1) {
					System.out.println("\"From sale of stock, you get $50.\" \n");
					compBank+=50;
				}
				if(x==2) {
					System.out.println("\"Life insurance matures. You get $50\" \n");
					compBank+=50;
				}
				if(x==3) {
					System.out.println("\"Pay hospital fees of $100\" \n");
					compBank-=100;
				}
				if(x==4) {
					System.out.println("\"You won the lottery! Collect $100\" \n");
					compBank+=100;
				}
			}
			//Water Works
			if(compSpot==3) {
				System.out.println("The computer has landed on Water Works! \n");
				if (waterWorks == false) {
					int wwComp = (int)(Math.random()*2)+1;
					if (wwComp == 1) {
						System.out.println("The computer has decided to buy this utility for $150. \n");
						compBank -= 150;
						waterWorks = true;
					}
					else {
						System.out.println("The computer has decided not to buy this utility. \n");
					}
				}
				else {
					int x = roll*10;
					System.out.println("You own this utility! The computer will pay a rent of $" + x + "\n");
					compBank-=x;
					userBank+=x;
				}
			}
			//Oriental Ave
			if(compSpot==4) {
				System.out.println("The computer has landed on Oriental Avenue! \n");
				if(oriental == false) {
					int oComp = (int)(Math.random()*2)+1;
					if (oComp == 1) {
						System.out.println("The computer has decided to buy this property for $100. \n");
						oriental = true;
						compBank -= 100;
					}
					else {
						System.out.println("The computer has decided not to buy this property. \n");
					}
				}
				else {
					System.out.println("You own this property! The computer will pay a rent of $6 \n");
					compBank-=6;
					userBank+=6;
				}
			}
			//Jail
			if(compSpot==5) {
				System.out.println("The computer has landed on jail! Just visiting :) \n");
			}
			//St Charles Place
			if(compSpot==6) {
				System.out.println("The computer has landed on St. Charles place! \n");
				if(stCharles == false) {
					int scComp = (int)(Math.random()*2)+1;
					if (scComp == 1) {
						System.out.println("The computer has decided to buy this property for $140. \n");
						compBank -= 140;
						stCharles = true;
					}
					else {
						System.out.println("The computer has decided not to buy this property. \n");
					}
				}
				else {
					System.out.println("You own this property! The computer will pay a rent of $10. \n");
					compBank-=10;
					userBank+=10;
				}
			}
			//Electric Company
			if(compSpot==7) {
				System.out.println("The computer has landed on the Electric Company. \n");
				if(electricCompany == false) {
					int ecComp = (int)(Math.random()*2)+1;
					if (ecComp == 1) {
						System.out.println("The computer has decided to buy this property for $150. \n");
						compBank -= 150;
						electricCompany = true;
					}
					else {
						System.out.println("The computer had decided not to buy this property. \n");
					}
				}
				else {
					int x = roll*10;
					System.out.println("You own this utility! The computer will pay a rent of $" + x + "\n");
					compBank-=x;
					userBank+=x;
				}
			}
			//Tennessee Ave
			if(compSpot==8) {
				System.out.println("The computer has landed on Tennessee Avenue! \n");
				if (tennessee == false) {
					int tComp = (int)(Math.random()*2)+1;
					if (tComp == 1) {
						System.out.println("The computer has decided to buy this property for $180. \n");
						compBank -= 180;
						tennessee = true;
					}
					else {
						System.out.println("The computer has decided not to buy this property. \n");
					}
				}
				else {
					System.out.println("You already own this property. The computer will pay a rent of $14. \n");
					compBank -= 14;
					userBank += 14;
				}
			}
			//chance
			if(compSpot==9) {
				System.out.println("The computer has landed on chance! Their card reads: \n");
				int x = (int)(Math.random()*3)+1;
				if (x==1) {
					System.out.println("\"You have been elected chairman of the board. Pay the user $50\" \n");
					compBank -= 50;
					userBank += 50;
				}
				if (x==2) {
					System.out.println("\"Your child needs braces! Pay child support of $100.\" \n");
					compBank -= 100;
				}
				if (x==3) {
					System.out.println("\"Life insurance matures. Collect $100. \n");
					compBank += 100;
				}
				if (x==4) {
					System.out.println("\"Bank pays you a divedend of $75\" \n");
					compBank += 75;
				}
			}
			//free parking
			if(compSpot==10) {
				System.out.println("The computer has landed on free parking! \n");
			}
			//B & O Railroad
			if(compSpot==11) {
				System.out.println("The computer has landed on B & O Railroad. \n");
				if (BORailroad == false) {
					int boComp = (int)(Math.random()*2)+1;
					if (boComp == 1) {
						System.out.println("The computer has decided to buy this railroad for $200. \n");
						compBank -= 200;
						BORailroad = true;
					}
					else {
						System.out.println("The computer has decided not to buy the railroad. \n");
					}
				}
				else {
					System.out.println("You own this railroad! The computer will pay a rent of $25. \n");
					compBank -= 25;
					userBank += 25;
				}
			}
			//Community Chest
			if(compSpot==12) {
				System.out.println("The computer has landed on community chest! Their card reads: \n");
				int x = (int)(Math.random()*3)+1;
				if(x==1) {
					System.out.println("\"From sale of stock, you get $50.\" \n");
					compBank+=50;
				}
				if(x==2) {
					System.out.println("\"Life insurance matures. You get $50\"\n");
					compBank+=50;
				}
				if(x==3) {
					System.out.println("\"Pay hospital fees of $100\" \n");
					compBank-=100;
				}
				if(x==4) {
					System.out.println("\"You won the lottery! Collect $100\" \n");
					compBank+=100;
				}
			}
			//Kentucky Ave
			if(compSpot==13) {
				System.out.println("The computer has landed on Kentucky Avenue. \n");
				if (kentucky == false) {
					int kBuy = (int)(Math.random()*2)+1;
					if (kBuy == 1) {
						System.out.println("The compueter has desided to buy this property for $220. \n");
						compBank -= 220;
						kentucky = true;
					}
					else {
						System.out.println("The computer has decided not to buy this property. \n");
					}
				}
				else {
					System.out.println("You own this property! The computer will pay you a rent of $18. \n");
					compBank -= 18;
					userBank += 18;
				}
			}
			//Marvin Gardens
			if(compSpot==14) {
				System.out.println("The computer has landed on Marvin Gardens! \n");
				if (marvinGardens == false) {
					int mBuy = (int)(Math.random()*2)+1;
					if (mBuy == 1) {
						System.out.println("The computer has decided to buy this property for $280. \n");
						compBank -= 280;
						marvinGardens = true;
					}
					else {
						System.out.println("The computer has decided not to buy this property. \n");
					}
				}
				else {
					System.out.println("You own Marvin Gardens! The computer will pay you a rent of $24. \n");
					compBank -= 24;
					userBank += 24;
				}
			}
			//go to jail
			if(compSpot==15) {
				System.out.println("The computer has landed in jail! They must skip this turn. \n");
			}
			//chance
			if(compSpot==16) {
				System.out.println("The computer has landed on chance! Their card reads: \n");
				int x = (int)(Math.random()*3)+1;
				if (x==1) {
					System.out.println("\"You have been elected chairman of the board. Pay the user $50\" \n");
					compBank -= 50;
					userBank += 50;
				}
				if (x==2) {
					System.out.println("\"Your child needs braces! Pay child support of $100.\" \n");
					compBank -= 100;
				}
				if (x==3) {
					System.out.println("\"Life insurance matures. Collect $100. \n");
					compBank += 100;
				}
				if (x==4) {
					System.out.println("\"Bank pays you a divedend of $75\" \n");
					compBank += 75;
				}
			}
			//north carolina ave
			if(compSpot==17) {
				System.out.println("The computer has landed on North Carolina Avenue! \n");
				if (northCarolina == false) {
					int ncBuy = (int)(Math.random()*2)+1;
					if (ncBuy == 1) {
						System.out.println("The computer will buy this property for $300. \n");
						northCarolina = true; 
						compBank -= 300;
					}
					else {
						System.out.println("The computer has decided not to buy this property. \n");
					}
				}
				else {
					System.out.println("You own this property! The computer will pay a rent of $26. \n");
					compBank -= 24;
					userBank += 24;
				}
			}
			//income tax
			if(compSpot==18) {
				System.out.println("The computer has landed on an income tax! They mus pay $200. \n");
				compBank -= 200;
			}
			//boardwalk
			if(compSpot==19) {
				System.out.println("The computer has landed on the Board Walk! \n");
				if (boardwalk == false) {
					int bBuy = (int)(Math.random()*2)+1;
					if (bBuy == 1) {
						System.out.println("The computer has decided to buy the Boardwalk for $400. \n");
						compBank -= 400;
						boardwalk = true;
					}
					else {
						System.out.println("The computer has decided not to buy this property. \n");
					}
				}
				else {
					System.out.println("You own the boardwalk! The computer will pay a rent of $50. \n");
					compBank -= 50;
					userBank += 50;
				}
			}
			
			
			System.out.println("Your bank account: $" + userBank);
			System.out.println("The computer's bank account is: $" + compBank + "\n");
			if(userSpot < 19 && compSpot < 19) {
				System.out.println("Would you like to keep playing? Yes or no");
				response = kb.nextLine();	
			}
		}
		if (userBank > compBank) {
			System.out.println("Congratulations, you won!");
		}
		else if (userBank < compBank) {
			System.out.println("The computer beat you:( Better luck next time!");
		}
		else if (userBank == compBank) {
			System.out.println("You and the computer tied! Crazy!");
		}
		System.out.println("Thank you for playing!");
		
	} //main
} // class
