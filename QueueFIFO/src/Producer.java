import java.util.Random;

public class Producer extends Thread{
    Box box = new Box();
    Random random = new Random();
    public Producer(Box box) {
        this.box =box;
    }
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                box.semaforoProd.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            box.queue.add(random.nextInt(100));
            box.semaforoCons.release();
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}