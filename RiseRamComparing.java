public class RiseRamComparing implements Comporator<Notebook> {

    @Override
    public int compare(Notebook a, Notebook b) {
        return a.getMemory() - b.getMemory();
    }
    
}
