package u4pp;

public class Combatant {
    public String name;
    public int maxHealth = 10;
    public int health = 10;
    public int attackPower = 1;

    public Combatant(String name, int maxHealth, int attack){
        this.name = name;
        this.maxHealth = maxHealth;
        health = maxHealth;
        attackPower = attack;
    }
//takes damage based on parameter
    public void takeDamage(int damage){
        if(damage<=0){
            
        } else{
            setHealth(health-damage);
        }
    }

    public String getName(){
        return name;
    }
    public int getHealth(){
        return health;
    }
    public int getMaxHealth(){
        return maxHealth;
    }
    public int getAttackPower(){
        return attackPower;
    }
    public void setHealth(int health){
        int newHealth = health;
        if(newHealth > 0 && newHealth < maxHealth){
            this.health = newHealth;
        } else if (newHealth > maxHealth){
            this.health = maxHealth;
        } else {
            this.health = 0;
        }
    } 
    //sets max health
    public void setMaxHealth(int newMaxHealth){
        if(newMaxHealth <= 0){
            this.maxHealth = 1;
        } else{
            this.maxHealth = newMaxHealth;
        }
    }
    //sets attack power
    public void setAttackPower(int attackPower){
        if(attackPower<= 0){
            this.attackPower = 0;
        } else{
            this.attackPower = attackPower;
        }    } 
        //determines if object is 'alive'
    public boolean canFight(){
        if(health <= 0){
            return false;
        } else{
            return true;
        }
    } 
    public String toString(){
        return getName() + " " + getAttackPower() + " " + getMaxHealth() + " " + getHealth();
    }

}
