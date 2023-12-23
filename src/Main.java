public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread thread1 = new IncrementThead(counter);
        Thread thread2 = new  IncrementThead(counter);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println("count = " + counter.getValue());
    }


}
// При каждом запуске результат разный из-за того что потоки работают не слаженно и заменяют числа друг друга.
