import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class Manager {

    public Semaphore access;
    public Semaphore full;
    public Semaphore empty;

    public ArrayList<String> storage = new ArrayList<>();

    public Manager(int storageSize, int itemNumbers) {
        access = new Semaphore(1);
        full = new Semaphore(storageSize);
        empty = new Semaphore(0);

        // Додамо у сховище вказану кількість продукції
        for (int i = 0; i < itemNumbers; i++) {
            storage.add("item " + i);
        }
    }
}