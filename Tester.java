package BatlheOfObject;

public class Tester {

	public static void main(String[] args) {
            
            Personagem sniper = new Sniper("Frederick",100,1000);
            Personagem wizard = new Wizard("Bentley Wittman",250, 1000);
            Personagem knight = new Knight("Misty Knight",130,1000);
            Personagem eren = new Eren("Eren Yeager", 500, 1000);
            Personagem kakaroto = new Kakaroto("Son Goku", 8001, 1000);
            
            Personagem fighters[] = new Personagem[5];
            fighters[0]= sniper;
            fighters[1]= wizard;
            fighters[2]= knight;
            fighters[3]= eren;
            fighters[4]= kakaroto;
            
            for(Personagem p:fighters){
                for(double i=0.0;i < p.getLife();i+=0.10){
                    p.attack(new AwpRifle(), sniper);
                    p.attack(new Spell(), wizard);
                    p.attack(new Sword(), knight);
                    p.attack(new SuperSaiyajin4(), kakaroto);
                    p.attack(new ViraTita(), eren);
                }
                if(p.getLife() < 1.50)
                    p = null;
                System.out.println("O ganhador e: " + p);
            }
        }
}