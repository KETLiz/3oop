import java.util.concurrent.ThreadLocalRandom;

public class Notebook {
    private int cost;
    private int memory;
    
    public Notebook() {
        this.cost = ThreadLocalRandom.current().nextInt(100000);
        this.memory = ThreadLocalRandom.current().nextInt(1000);
    }
    
    public int getCost() {
        return cost;
    }

    public int getMemory() {
        return memory;
    }

    public String toString() {
        return "Цена: " + cost + ", RAM: " + memory;
    }
}
