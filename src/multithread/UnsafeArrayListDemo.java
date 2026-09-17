package multithread;
import java.util.ArrayList;
import java.util.List;

public class UnsafeArrayListDemo {
    public static void main(String[] args) throws InterruptedException {

        List<Integer> numbers = new ArrayList<>();

        Runnable task = () -> {
            for (int i = 0; i < 100000; i++) {
                numbers.add(i);
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Expected: 200000");
        System.out.println("Actual: " + numbers.size());
    }
}
