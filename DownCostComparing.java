public class DownCostComparing implements Comporator<Notebook> {

    @Override
    public int compare(Notebook a, Notebook b) {
        return b.getCost() - a.getCost();
    }
    
}
