package Game.Players.Fighters;

import Game.Behaviours.IFightable;
import Game.Items.Weapon;
import Game.Players.Player;

public abstract class Fighter extends Player implements IFightable{

    protected Weapon weapon;

    public Fighter(String name, Weapon weapon){
        super(name, 50, weapon.getWeight());
        this.weapon = weapon;
    }

    public Weapon getWeapon(){
        return this.weapon;
    }


    public int fight(){
        return  this.weapon.getDamage();
    }

    public void equipWeapon(Weapon newWeapon) {
        this.weapon = newWeapon;
    }

}
