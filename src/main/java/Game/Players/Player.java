package Game.Players;

import java.util.ArrayList;

public abstract class Player {

    private String name;
    private int health;
//    private ArrayList<Item> inventory;
    private int inventorySize;
    private int carryWeightMax;

    public Player(String name, int health, int inventorySize, int carryWeightMax){
        this.name = name;
        this.health = health;
        this.inventorySize = inventorySize;
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

//    public void addItem(Item item){
//        if(this.inventory.size() < inventorySize) {
//            this.inventory.add(item);
//        }
//    }

}
