package pokemon;

import java.util.Scanner;

public class GroundPokemon extends Pokemon {          //subclass of the pokemon class
	
	protected String name;
	protected String type;
	protected String[] attackList = {"Earthquake", "Fissure"};
	protected int[] attackListPoints = {3, 5};
	protected int[] attackListDamage= {25, 50};      // using parallel arrays to keep relevant info together at the same index in different arrays.
	public GroundPokemon(String n, String t) {             
		super(n, t);
	
	}
	
	public void attack(Pokemon other, int i) {                    // attack funtion using the other pokemon and the index of the specific attack.
		int secondChoice;
		if(powerPoints >= attackListPoints[i]){
			powerPoints -= attackListPoints[i];
			if(other.type == "Electric") {
				other.healthPoints -= (attackListDamage[i] * 2);          // calculating damage based upon type matchups.
				System.out.println("It is super effective! " + other.name + " has " + other.healthPoints + " HP remaining.");
			}
		}
		else {                                                    // if user picks option that the pokemon can't perform it will ask for another input
				Scanner kb = new Scanner(System.in);
				System.out.println("There is not enough PP for that move.");
				secondChoice = kb.nextInt();
				attack(other, secondChoice);
		}
		
		
	}
	public String getName() {
		return name;
	}
	
	public void speak() {
		System.out.println(name + ": " + name + "! \n");
		
	}

	public void printAttacks() {
		for(int i = 0; i < attackList.length; i++) {
			System.out.println((i+1) + ". " + attackList[i] + ", PP needed: " + attackListPoints[i] + ", Damage: " + attackListDamage[i] + "\n");
		}
		
	}

	

}
