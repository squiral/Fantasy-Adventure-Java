package Game.Players;

import Game.Behaviours.IAttackable;
import Game.Items.Item;

import java.util.ArrayList;

public abstract class Player implements IAttackable{

    private String name;
    private int health;
    private ArrayList<Item> inventory;
    private int inventoryCapacity;
    private int maxCarryWeight;
    private int currentWeightTotal;

    public Player(String name, int maxCarryWeight, int currentWeightTotal){
        this.name = name;
        this.health = 100;
        this.inventory = new ArrayList<Item>();
        this.inventoryCapacity = 4;
        this.maxCarryWeight = maxCarryWeight;
        this.currentWeightTotal = currentWeightTotal;
    }


    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getNumOfItemsInInventory(){
        return this.inventory.size();
    }

    public int getInventorySize() {
        return inventoryCapacity;
    }

    public int getMaxCarryWeight() {
        return maxCarryWeight;
    }

    public int getCurrentWeightTotal(){
        return this.currentWeightTotal;
    }

    public void addItem(Item item){
        if(this.inventory.size() < inventoryCapacity && currentWeightTotal + item.getWeight() <= maxCarryWeight) {
            this.inventory.add(item);
            this.currentWeightTotal += item.getWeight();
        }
    }

    public void takeDamage(int damage){
        this.health -= damage;
    }

    public void recover(int recovery){
        this.health += recovery;
        if(this.health > 100){
            this.health = 100;
        }
    }

}
