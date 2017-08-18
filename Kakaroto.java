package BatlheOfObject;

public class Kakaroto extends Personagem{
    
    public Kakaroto(String nome, int stamina, double life){
        super(nome, stamina, life);
    }

    @Override
    public void attack(IWeapon weapon, Personagem personagem) {
        if (this.stamina > 0) {
            weapon.damage(personagem);
            this.stamina -= (int) (this.stamina * 0.15);
	}
    }
    
    
    
}
