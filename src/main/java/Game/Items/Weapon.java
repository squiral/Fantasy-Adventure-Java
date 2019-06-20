package Game.Items;

public class Weapon extends Item{

    private WeaponType type;

    public Weapon(WeaponType type){
        super(type.getWeight());
        this.type = type;
    }

    public WeaponType getType() {
        return this.type;
    }

    public int getDamage() {
        return this.type.getDamage();
    }

    public int getWeight() {
        return this.type.getWeight();
    }
}
