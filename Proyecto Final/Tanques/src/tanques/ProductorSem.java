package tanques;

import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;

public class ProductorSem extends Thread{
    
    private Semaphore sem;
    private TanqueSem tanque;
    
    public ProductorSem(){
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
            
            if(tanque.agua.rc<199)
            {
            tanque.agua.rc = tanque.agua.rc + 5;
            tanque.repaint();
            //System.out.println("Productor Semáforo");
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
   
