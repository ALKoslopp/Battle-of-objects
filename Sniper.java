package BatlheOfObject;

public class Sniper extends Personagem {

	public Sniper(String name, int stamina, double life) {
		super(name, stamina, life);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack(IWeapon weapon, Personagem personagem) {

		if (this.stamina > 0) {
			weapon.damage(personagem);
			this.stamina -= (int) (this.stamina * 0.1);
		}
	}

}
