package pokemon;

public class SuperPotion implements Item {  // making a new item using the item interface.

	
	public void use(Pokemon p) {
		System.out.println("Super Potion used on " + p.name + ".\n");
		p.healthPoints += 50; 
		if(p.healthPoints > 200) {
			System.out.println("You overhealed! Don't waste items.");
			p.healthPoints = 200;
		}
		
	}
	

}
