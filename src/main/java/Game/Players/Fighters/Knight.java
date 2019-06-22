package Game.Players.Fighters;

import Game.Items.Weapon;

public class Knight extends Fighter {

    private int armourDefence;

    public Knight(String name, Weapon weapon){
        super(name, weapon);
        this.armourDefence = 5;
        }

    public void takeDamage(int damage){
        damage -= this.armourDefence;
        this.health -= damage;
    }

}
