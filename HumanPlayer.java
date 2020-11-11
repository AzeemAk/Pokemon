package pokemon;

public class HumanPlayer extends Player {          // subclass of the player class
	
	public HumanPlayer(Pokemon po, Item it) {
		p = po;
		i = it;
	}

	public Pokemon getPokemon() {
		return p;
	}
	
	public String getPokemonName() {
		return p.name;
	}
	
	public int getPokemonHp() {
		return p.healthPoints;
	}
	
	public Item getItem() {
		return i;
	}
	
	public void run() {
		System.out.println("You ran from the battle!");
		
	}
	

}
