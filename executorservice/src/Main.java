import java.util.concurrent.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.test();
    }

    public void test() {
        // If we define corepoolsize as 1 here only one thread will be created and here you could see the waiting time while executing display method.
        // If we define corepoolsize as 2 here two threads will be created and here you could see the 2nd task gets completed and 3rd will also be completed then then 1st task which is in waiting state for 5 seconds will be finished.
        ExecutorService executor = new ThreadPoolExecutor(2, 3,
                5L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>());
        CompletableFuture<Void> future = CompletableFuture.runAsync(this::display, executor);
        CompletableFuture<Void> future1 = CompletableFuture.runAsync(this::disp, executor);
        CompletableFuture<Void> future2 = CompletableFuture.runAsync(this::disp2, executor);
    }

    public void display() {
        try {
            Thread.sleep(5000);
            System.out.println("Hello World");
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

    public void disp() {
        System.out.println("Hello World 1");
    }

    public void disp2() {
        System.out.println("Hello World 2");
    }

}