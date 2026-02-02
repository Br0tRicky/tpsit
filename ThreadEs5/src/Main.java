// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Produttore prod = new Produttore();
        Consumatore cons = new Consumatore();

        Thread t1 = new Thread(prod);
        Thread t2 = new Thread(cons);

        t1.start();
        t2.start();
    }
}