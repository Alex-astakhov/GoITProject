package multiThread;

/**
 * Created by Alex Astakhov on 28.07.2016.
 */
public class StartProgram {
    public static void main(String[] args) {

        MyThreadPart myThreadPart1 = new MyThreadPart();
        myThreadPart1.start();

        System.out.println("Main thread");
        Thread thread1 = new Thread(new MyRunnablePart());
        thread1.start();
        thread1.setDaemon(true);

        Thread thread2 = new Thread(new MyRunnablePart());
        thread2.start();
        System.out.println("End of Main thread");

    }
}
