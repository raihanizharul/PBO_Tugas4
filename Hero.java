package Nusput.P4;

public class Hero {
    private String nama;
    private double health;
    private double attack;

    //Overloading Constructor
    Hero(String nama,double health, double attack){
        this.nama=nama;
        this.health=health;
        this.attack=attack;
    }
    Hero(String nama){
        this.nama=nama;
        this.health=200;
        this.attack=30;
    }

    public String getName(){
        return this.nama;
    }

    public double getHealth(){
        return this.health;
    }

    public double getAttack(){
        return this.attack;
    }

    public void infoHero(){
        System.out.println("Hero "+getName()+" :\n");
        System.out.println("\tHealth : "+getHealth());
        System.out.println("\tAttack : "+getAttack());
    }
}

class Marksman extends Hero{
    private double critDamage=0.4;
    private double finalAttack;
    Marksman(String nama,double health, double attack){
        super(nama, health, attack);
        setFinalAttack();
    }
    Marksman(String nama){
        super(nama);
        setFinalAttack();
    }

    public double getCritDamage(){
        return this.critDamage;
    }
    
    public void setFinalAttack(){
        this.finalAttack=getAttack()+(getAttack()*getCritDamage());
    }

    public double getFinalAttack(){
        return this.finalAttack;
    }
    
    //Overriding Method
    //Untuk Hero Marksman mendapatkan tambahan damage sebesar 0.4 dari base Attack 
    @Override
    public void infoHero(){
        System.out.println("Hero "+getName()+" :\n");
        System.out.println("\tHealth : "+getHealth());
        System.out.println("\tAttack : "+getFinalAttack());
    }

    public static void main(String[] args) {
        Marksman Lesley=new Marksman("Lesley");
        Lesley.infoHero();
    }

}
