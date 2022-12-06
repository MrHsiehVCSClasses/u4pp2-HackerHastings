package u4pp;

public class RandomMonster extends Monster {
    
    public RandomMonster(String name, int health, int attack, int exp){
        super(name, health, attack, exp);
    }
//takes turn as monster does, but 50% chance of missing.
    public void takeTurn(Combatant target){
        double i = Math.random() + 0.1;
        if(i > .6){
            target.takeDamage(attackPower);
        }
    }


    public String toString(){
        return getName() + " " + getAttackPower() + " " + getExpGiven() + " " + getHealth() + " " + getMaxHealth() + "This foo stupid he miss 50%";
    }
}
