package pokemon;

public abstract class Player {                  // a superclass for players that holds common traits to all players
	protected Pokemon p;
	protected Item i;
	public abstract Pokemon getPokemon();
	public abstract String getPokemonName();
	public abstract int getPokemonHp();
	public abstract Item getItem();
	public abstract void run();


}
