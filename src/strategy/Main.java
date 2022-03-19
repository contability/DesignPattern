package strategy;

import weapon.Axe;
import weapon.Knife;
import weapon.Sword;

public class Main {
	
//	main method
	public static void main(String[] args) {
		GameCharacter character = new GameCharacter();
		
		character.attack();
		
		// Į
		character.setWeapon(new Knife());
		character.attack();

		// ��
		character.setWeapon(new Sword());
		character.attack();
		
		// ����
		character.setWeapon(new Axe());
		character.attack();
	}
}
