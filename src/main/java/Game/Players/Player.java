package Game.Players;

import Game.Items.Item;

import java.util.ArrayList;

public abstract class Player {

    private String name;
    private int health;
    private ArrayList<Item> inventory;
    private int inventorySize;
    private int carryWeightMax;

    public Player(String name, int carryWeightMax){
        this.name = name;
        this.health = 100;
        this.inventorySize = 4;
        this.carryWeightMax = carryWeightMax;
    }


    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getInventorySize() {
        return inventorySize;
    }

    public int getCarryWeightMax() {
        return carryWeightMax;
    }

    public void addItem(Item item){
        if(this.inventory.size() < inventorySize) {
            this.inventory.add(item);
        }
    }

}
