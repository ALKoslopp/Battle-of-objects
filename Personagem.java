package BatlheOfObject;

public abstract class Personagem {
	
	protected String name;
	protected int stamina;
	protected double life;
	
	
	
	public Personagem(String name, int stamina, double life) {
		super();
		this.name = name;
		this.stamina = stamina;
		this.life = life;
	}


	

	public int getStamina() {
		return stamina;
	}




	public void setStamina(int stamina) {
		this.stamina = stamina;
	}




	public double getLife() {
		return life;
	}




	public void setLife(double life) {
		this.life = life;
	}

    @Override
    public String toString() {
        return "Personagem{" + "name=" + name + ", stamina=" + stamina + ", life=" + life + '}';
    }


        

	public abstract void attack(IWeapon weapon, Personagem personagem);
	
	

}
