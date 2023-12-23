public class Counter {

    private int count;

    public void increment() {
        count++;
    }

    public int getValue() {
        return count;
    }
}
class IncrementThead extends Thread {
    private Counter counter;
    public IncrementThead(Counter counter) {
        this.counter = counter;
    }
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

