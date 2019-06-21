package Game.Players;

import Game.Items.Weapon;

public class Barbarian extends Fighter {

    private Boolean berzerker;

    public Barbarian(String name, Weapon weapon) {
        super(name, weapon);
        this.berzerker = false;
    }

    public void goBerzerk(){
        this.berzerker = true;
    }

    public int fight(){
        if(!this.berzerker){
            return  this.weapon.getDamage();
        }else{
            return  this.weapon.getDamage()*5;
        }
    }
}

