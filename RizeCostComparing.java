public class RizeCostComparing implements Comporator<Notebook>{
    
    public int compare(Notebook x, Notebook y) {
        if(x.getCost() > y.getCost()) {
            return 1;
        } else if (x.getCost() == y.getCost()) {
            return 0;
        } else {
            return -1;
        }
    }
}
