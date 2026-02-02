import java.util.Random;

import static java.lang.Thread.sleep;

public class Produttore extends Scatola implements Runnable {

    Random random = new Random();

    @Override
    public void run() {

        // inizializzo il semaforo2 a 0 per far partire prima il producer


        for(int i=0;i<20;i++){

            try {
                Scatola.semaforoProd.acquire(); //parte quando il consumer gli dice che ha scritto il valore in scatola
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            scatola = random.nextInt(100);
            System.out.println("Producer: " + scatola);

            Scatola.semaforoCons.release(); //dice al consumer che ha messo un valore nella scatola



            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}