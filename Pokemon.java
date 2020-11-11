package pokemon;

public abstract class Pokemon {                     // making a superclass for pokemon that holds common traits of all pokemon
	
	protected int healthPoints = 200;      
	protected int powerPoints = 20;
	protected String name;
	protected String type;
	protected String[] attackList;
	protected int[] attackListPoints;
	protected int[] attackListDamage;
	public Pokemon(String n, String t) {
		name = n;
		type = t;
		
	}
	public abstract void attack(Pokemon other, int input);
	public abstract void speak();
	public abstract void printAttacks();
	


}
