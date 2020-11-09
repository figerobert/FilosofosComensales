import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.concurrent.Semaphore;

//filosofos de mutex como se ve 
public class filosofosMutex extends Thread {

    private final int id;
    private final Semaphore[] semaforo;
    private final int[][] palillos;
    private final int palilloL;
    private final int palilloR;


    public filosofosMutex(int id, Semaphore[] semaforo, int[][] palillos){
        this.id=id;
        this.semaforo=semaforo;
        this.palillos=palillos;
        this.palilloL=palillos[id][0];
        this.palilloR=palillos[id][1];
    }

    protected void comer(){

        if(semaforo[palilloR].tryAcquire()){
            if(semaforo[palilloR].tryAcquire()){
                System.out.println("FILÓSOFO " + id + " ESTÁ COMIENDO. USA LOS PALILLOS "+palilloL+" Y "+palilloR);

                try{
                    int time=0;
                    while(time<=0)
                        time=new Random().nextInt()%2000;
                    sleep(time);
                }catch (InterruptedException ex){
                    System.out.println("Error : " + ex.toString());
                }
                System.out.println("Filósofo " + id + " terminó de comer. Liberó los palillos " + palilloL + " y " + palilloR);
                semaforo[palilloR].release();
            }
            semaforo[palilloL].release();
        }else{
            System.out.println("Filósofo " + id + " está hambriento.");
        }
    }

    protected void pensar(){
        System.out.println("Filósofo " + id + " está pensando.");
        try{
            int time=0;
            while(time<=0)
                time=new Random().nextInt()%2000;
            sleep(time);
        }catch(InterruptedException ex){
            System.out.println("Error en el método pensar(): " + ex.toString());
        }
    }

    @Override
    public void run(){
        while(true){
            pensar();
            comer();
        }
    }
}
