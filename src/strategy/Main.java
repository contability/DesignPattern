package strategy;

import weapon.Axe;
import weapon.Knife;
import weapon.Sword;

public class Main {
	
//	main method
	public static void main(String[] args) {
		GameCharacter character = new GameCharacter();
		
		character.attack();
		
		// Ä®
		character.setWeapon(new Knife());
		character.attack();

		// °Ë
		character.setWeapon(new Sword());
		character.attack();
		
		// µµ³¢
		character.setWeapon(new Axe());
		character.attack();
	}
}
