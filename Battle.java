package pokemon;

import java.util.Scanner;

public class Battle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ElectricPokemon pikachu = new ElectricPokemon("Pikachu", "Electric");  // creating out instances of the different pokemon subclasses.
		Pokemon geodude = new GroundPokemon("Geodude", "Ground");          
		SuperPotion sP = new SuperPotion();                                           // creating an item to be used in battle.
		HumanPlayer ash = new HumanPlayer(geodude, sP);
		ComputerPlayer gary = new ComputerPlayer(pikachu, sP);                        // creating our different players.
		System.out.println("Welcome to Pokemon: Garbage Edition!");
		Scanner kb = new Scanner(System.in);                                          // setting up user input from keyboard for user choices in the game.
		int input = 0;
		int battleInput = 0;
		int attackInput = 0;
		int cpuBattleInput;                                                      // initializing variables to hold user inputs and random CPU inputs.
		int cpuAttackInput;
		while(input != 2) {                                                         
			System.out.println("Press 1 to start a new battle!" + "\n");                   // printing menu
			System.out.println("Press 2 to exit" + "\n");
			System.out.println("Enter Your Choice: ");
			input = kb.nextInt();
			System.out.println("\n");
			if(input == 1) {
				System.out.println("Gary: Hold it! Let's battle!" + "\n");                       //proceeding with the game based on user input
				System.out.println("Ash: Bring it on!" + "\n");
				System.out.println("Gary sent out " + gary.getPokemonName() + "!\n");
				System.out.println("Go! " + ash.getPokemonName() + "!\n");
				while(battleInput != 3) {
					System.out.println("Press 1 to attack!" + "\n" + "Press 2 to use an item!");               // battle menu
					System.out.println("Press 3 to run!" + "\n");
					System.out.println("Enter your choice: ");
					battleInput = kb.nextInt();
					
					if(battleInput == 1) {                                                    // if player chooses to attack
						ash.p.printAttacks();
						System.out.println("HP: " + ash.p.healthPoints);                        
						System.out.println("PP: " + ash.p.powerPoints);
						System.out.println("Enter your choice: ");
						attackInput = (kb.nextInt() - 1);                                     // choosing the specific attack
						ash.p.attack(gary.p, attackInput);
						if(gary.getPokemonHp() <= 0) {                                     // checking if the enemy pokemon fainted.
							break;
						}
						
					}
			
					else if(battleInput == 2) {
						ash.i.use(ash.p);
					}
					
					else if(battleInput == 3) {
                    	ash.run();
                    
                    }
					else {
						System.out.println("Invalid Input.");
						
					}
					cpuBattleInput = (int) (Math.random() * (2 - 1) + 1);                        // using random choices to simulate the CPU's actions
					System.out.println("CPU choose option " + cpuBattleInput + "\n");
					if(cpuBattleInput == 1) {
						cpuAttackInput = (int) (Math.random());
						gary.p.attack(ash.p, cpuAttackInput);
						if(ash.getPokemonHp() <= 0) {                                          //checking if the player pokemon has fainted.
							break;
						}
					}
					else if(cpuBattleInput == 2) {
						gary.i.use(gary.p);
					}
					
				}
				if(ash.p.healthPoints <= 0) {                                              // victory / defeat messages
					System.out.println(ash.p.name + " fainted! ");
                	System.out.println("You were defeated! Better luck next time! You gained no exp." + "\n");
                }
                else if(gary.p.healthPoints <= 0) {
                	System.out.println(gary.p.name + " fainted! ");
                	System.out.println("You won! Good job! You gained no exp.");
                }
				
			if(input == 2) {
				System.exit(0);
			}
		}
	  }
	}
		

	

} 
