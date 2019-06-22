package Game.Players.Fighters;

import Game.Items.Weapon;

import java.util.Random;

public class Barbarian extends Fighter {

    private Boolean berzerker;

    public Barbarian(String name, Weapon weapon) {
        super(name, weapon);
        this.berzerker = false;
    }

    public void goBerzerk(){
        Random rand = new Random();
        int n = rand.nextInt(15);
        if(n > 10) {
            this.berzerker = true;
        }
    }

    public int fight(){
        if(!this.berzerker){
            return  this.weapon.getDamage();
        }else{
            return  this.weapon.getDamage()*5;
        }
    }
}

