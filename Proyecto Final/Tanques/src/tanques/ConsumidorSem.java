package tanques;

import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;

public class ConsumidorSem extends Thread{
    
    private Semaphore sem;
    private TanqueSem tanque;
    
    public ConsumidorSem(){
        sem = new Semaphore(1);
    }
    
    public void setTanque(TanqueSem tanque){
        this.tanque = tanque;
    }
    
    public void run(){
        while(true)
        {
            try
            {
            sem.acquire();
            }catch(Exception e){}
            
            if(tanque.agua.rc>0)
            {
            tanque.agua.rc = tanque.agua.rc - 5;
            tanque.repaint();
            //System.out.println("Consumidor Semáforo");
            }
            sem.release();
            
            try
            {
                sleep((int) (500+Math.random()*200));
            }
            catch(Exception e){e.printStackTrace();}
        }
    }
    
}
