public class Consumer extends Thread{
    Box box = new Box();
    public Consumer(Box box) {
        this.box=box;
    }
    @Override
    public void run() {
        for(int i=0; i<20; i++){
            try {
                box.semaforoCons.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(box.queue.remove());
            box.semaforoProd.release();
        }
    }
}