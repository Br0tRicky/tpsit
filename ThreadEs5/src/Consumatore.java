import static java.lang.Thread.sleep;

public class Consumatore extends Scatola implements Runnable {

    @Override
    public void run(){
        for(int i=0;i<20;i++){

            try {
                Scatola.semaforoCons.acquire(); //aspetta che il producer finisca

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            //Per controllare se il producer aspetta che il consumer prelevi il valore dalla scatola
             /* try {
                sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } */

            System.out.println("Consumer: "+ scatola);
            System.out.println("");

            Scatola.semaforoProd.release(); //dice al producer che ha finito di usare scatola

        }
    }
}