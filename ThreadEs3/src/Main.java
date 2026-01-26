public class Main {
    public static void main(String[] args) {

        Incrementa i1 = new Incrementa();
        Incrementa i2 = new Incrementa();

        i1.start();
        i2.start();

        try {
            i1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            i2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Incrementa.i);
    }
}