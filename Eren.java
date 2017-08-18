package BatlheOfObject;

public class Eren extends Personagem{
    
    public Eren(String name, int stamina, double life){
	super(name, stamina, life);
    }
    @Override
	public void attack(IWeapon weapon, Personagem personagem) {
		if (this.stamina > 0) {
			weapon.damage(personagem);
			this.stamina -= (int) (this.stamina * 0.15);
		}
        }
}