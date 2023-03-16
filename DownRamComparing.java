public class DownRamComparing implements Comporator<Notebook> {

    @Override
    public int compare(Notebook a, Notebook b) {
        if (a.getMemory() > b.getMemory()) {
            return -1;
        } else if (a.getMemory() == b.getMemory()) {
            if (a.getCost() > b.getCost())
            {
                return -1;
            } else if (a.getCost() == b.getCost()) {
                return 0;
            } 
            return 1;
        }
        return 1;
    }
    
}
