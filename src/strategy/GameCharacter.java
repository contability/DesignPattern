package strategy;

import strategy.weapon.Weapon;

public class GameCharacter {
	
	//접근점
	Weapon weapon;
	
	//교환 가능하게 하기 위해 setWeapon 생성
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void attack() {
		//델리게이트
		//뭘 들고 있는지는 모르겠고 그냥 실행하면 WEAPON의 인스턴스로 설정되어 있는 무기의 공격이 나가게 될 것
		if(weapon != null) {
			weapon.attack();
		}else {
			System.out.println("맨 손 공격");
		}
		
	}
}
