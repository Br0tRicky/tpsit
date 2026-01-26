public class Incrementa extends Thread{
    static int i=0;

    public void run(){
        for(int k=0; k<300000; k++){
            i++;
        }
    }
}