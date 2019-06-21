package Game.Players;

import Game.Items.Weapon;
import Game.Items.WeaponType;

public abstract class Fighter extends Player {

    private Weapon weapon;

    public Fighter(String name, Weapon weapon){
        super(name, 50, weapon.getWeight());
        this.weapon = weapon;
    }

    public Weapon getWeapon(){
        return this.weapon;
    }

    public void equipWeapon(Weapon newWeapon) {
        this.weapon = newWeapon;
    }
}
