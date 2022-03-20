package strategy;

import strategy.weapon.Weapon;

public class GameCharacter {
	
	//������
	Weapon weapon;
	
	//��ȯ �����ϰ� �ϱ� ���� setWeapon ����
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void attack() {
		//��������Ʈ
		//�� ��� �ִ����� �𸣰ڰ� �׳� �����ϸ� WEAPON�� �ν��Ͻ��� �����Ǿ� �ִ� ������ ������ ������ �� ��
		if(weapon != null) {
			weapon.attack();
		}else {
			System.out.println("�� �� ����");
		}
		
	}
}
