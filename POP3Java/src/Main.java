public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        int storageSize = 3;
        int itemNumbers = 10;
        int consumerCount = 2;
        int producerCount = 2;
        main.starter(storageSize, itemNumbers, consumerCount, producerCount);
    }

    private void starter(int storageSize, int itemNumbers, int consumerCount, int producerCount) {
        Manager manager = new Manager(storageSize, itemNumbers);

        for (int i = 0; i < consumerCount; i++) {
            new Thread(new Consumer(itemNumbers, manager)).start();
        }

        for (int i = 0; i < producerCount; i++) {
            new Thread(new Producer(itemNumbers, manager)).start();
        }
    }
}