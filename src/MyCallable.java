import java.util.concurrent.Callable;
import static java.lang.Thread.currentThread;

public class MyCallable implements Callable<Integer> {
    int sum = 0;
    int numberOfMessages = 4;

    @Override
    public Integer call() throws Exception {
        try {
            for (int i = 0; i < numberOfMessages; i++) {


                System.out.println("Я " + currentThread().getName() + ". Всем привет!");
                sum++;
                Thread.sleep(2500);
            }
        } catch (InterruptedException err) {
        }
        return sum;
    }
}
