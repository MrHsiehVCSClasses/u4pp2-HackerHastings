package u4pp;

public class Fighter extends Combatant {

    private int EXP;
    private int focusStacks;
    private int level;
    private boolean isBlocking;
    
    public Fighter(String name, int maxHealth, int attack){
        super(name, maxHealth, attack);
        focusStacks = 0;
        EXP = 0;
        level = 1;
        isBlocking = false;
    }
//makes other object take damage based on this object's stats
    public void attack(Combatant target){
        int finalDamage = attackPower;
        for (int i = 0; i < focusStacks; i++){
            finalDamage *=2;
        }
        target.takeDamage(finalDamage);
        focusStacks = 0;
    }
    //makes object block
    public void block(){
        isBlocking = true;
    } 
    //makes object focus
    public void focus(){
        focusStacks += 1;
    } 
    //makes object take damage and changes it based upon block status
    public void takeDamage(int damage){
        if(damage<0){
            setHealth(0);
        } else if (isBlocking = true){ 
            int blockDMG = damage / 2;
            setHealth(health-blockDMG);
            isBlocking = false;
        } else {
            setHealth(health-damage);
        }
    }
    public void gainEXP(int exp){
        EXP += exp;
        while(EXP >= level){
            EXP -= level;
            level += 1;
            maxHealth += 5;
            health = maxHealth;
            attackPower +=1;
        }
    } 

    public String toString(){
        return getName() + " " + getEXP() + " " + getFocusStacks() + " " + getLevel() + " " + getAttackPower() + " " + getHealth() + " " + getMaxHealth();
    }

    public int getEXP(){
        return EXP;
    }
    public int getFocusStacks(){
        return focusStacks;
    }
    public int getLevel(){
        return level;
    }
    public int getHealth(){
        return health;
    }
    public boolean getIsBlocking(){
        return isBlocking;
    }
}
