import java.util.*;

public class Main {
    
    public static void main(String[] args) {

        List<Notebook> notebookList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            notebookList.add(new Notebook());
        }
        Collections.sort(notebookList, new RizeCostComparing());
        System.out.println(notebookList);
        Collections.sort(notebookList, new RiseRamComparing());
        Collections.sort(notebookList, new DownRamComparing());
    }
}