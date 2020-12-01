package tanques;

import static java.lang.Thread.sleep;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Productor extends Thread{
    
    private Lock mutex;
    private Tanque tanque;
    
    public Productor(){
        mutex = new ReentrantLock();
    }
    
    public void setTanque(Tanque tanque){
        this.tanque = tanque;
    }
    
    public void run(){
        while(true)
        {
            //if(mutex.tryLock())
           // {
                mutex.lock();
                if(tanque.agua.rc<199)
                {
                tanque.agua.rc = tanque.agua.rc + 5;
                tanque.repaint();
                //System.out.println("Productor Mutex");
                }
                mutex.unlock();
           // }
            try
            {
                sleep((int) (500+Math.random()*200));
            }
            catch(Exception e){e.printStackTrace();}
        }
    }

}
   
