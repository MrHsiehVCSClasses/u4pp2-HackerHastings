package u4pp;

public class Monster extends Combatant {

    private int expGiven;
    
    public Monster(String name, int health, int attack, int exp){
        super(name, health, attack);
        this.expGiven = exp;
    }
    public int getExpGiven(){
        return expGiven;
    }
    //does what monster does on its turn
    public void takeTurn(Combatant target){
        target.takeDamage(attackPower);
    }    
    public String toString(){
        return getAttackPower() + " " + getHealth() + " " + getMaxHealth() + " " + getExpGiven() + " " + getName();
    }


}
