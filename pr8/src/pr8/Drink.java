package pr8;

final public class Drink implements Item{
    private final int cost;
    private final String naming;
    private final String description;

    public Drink(int cost, String naming, String description){
        this.cost = cost;
        this.naming = naming;
        this.description = description;
    }

    public Drink(String naming, String description){
        this.cost = 0;
        this.naming = naming;
        this.description = description;
    }

    public int getCost(){
        return cost;
    }
    public String getNaming(){
        return naming;
    }
    public String getDescription(){
        return description;
    }
}
