package multiThread;

/**
 * Created by Alex Astakhov on 28.07.2016.
 */
public class MyThreadPart extends Thread {
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getId() + " alala делайте домашку" + i);
        }
    }
}
