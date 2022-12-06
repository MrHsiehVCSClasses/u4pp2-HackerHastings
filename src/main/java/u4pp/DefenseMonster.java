package u4pp;

public class DefenseMonster extends Monster {

    private int defense = 4;
    private int expGiven = 4;
    
    public DefenseMonster(String name, int health, int attack, int exp, int defense){
        super(name, health, attack, exp);
        this.defense = defense;
        this.expGiven = 4;
    }

    public void takeDamage(int damage){
        if(damage<= defense){
            return;
        } else{
            int shit = damage-defense;
            setHealth(health-shit);
        }
    }

    public int getDefense(){
        return defense;
    }

    public String toString(){
        return getName() + " " + getAttackPower() + " " + getDefense() + " " + getExpGiven() + " " + getHealth() + " " + getMaxHealth();
    }
}
