import java.util.LinkedList;
import java.util.concurrent.Semaphore;
import java.util.Queue;

public class Box {
    Semaphore semaforoProd = new Semaphore(5);
    Semaphore semaforoCons = new Semaphore(0);
    Queue<Integer> queue = new LinkedList<>();
}