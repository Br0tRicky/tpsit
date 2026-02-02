import java.util.concurrent.Semaphore;

public class Scatola {

    static Semaphore semaforoProd = new Semaphore(1);
    static Semaphore semaforoCons = new Semaphore(0);

    static public int scatola;
}