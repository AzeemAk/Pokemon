package pokemon;

public class ComputerPlayer extends Player {     // subclass of the player class
	
	public ComputerPlayer(Pokemon po, Item it) {
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
		System.out.println("Gary ran from the battle!");
	}

}
