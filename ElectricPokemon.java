package pokemon;

import java.util.Scanner;

public class ElectricPokemon extends Pokemon {  //subclass of the pokemon class

	protected String name;
	protected String type;
	protected String[] attackList = {"Thunderbolt" , "Thunder"};
	protected int[] attackListPoints = {3, 5};
	protected int[] attackListDamage = {25, 50};             // using parallel arrays to keep relevant info together at the same index in different arrays.
	
	public ElectricPokemon(String n, String t) {
		super(n, t);
		
	}
	
	public void attack(Pokemon other, int i) {         // attack funtion using the other pokemon and the index of the specific attack.
		int secondChoice;
		if(powerPoints >= attackListPoints[i]) {
			powerPoints -= attackListPoints[i];
			if(other.type == "Ground") {
				other.healthPoints -= (attackListDamage[i] * 0);          // calculating damage based upon type matchups.
				System.out.println("There is no effect. " + other.name + " has " + other.healthPoints + " HP remaining.");
				
			}
		}
		else {
			Scanner kb = new Scanner(System.in);  
			System.out.println("There is not enough PP for that move.");       // if user picks option that the pokemon can't perform it will ask for another input
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
			System.out.println(i + ". " + attackList[i] + ", PP needed: " + attackListPoints[i] + ", Damage: " + attackListDamage[i] + "\n");
		}
		
		
	}
	

}
