package tanques;

import static java.lang.Thread.sleep;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Consumidor extends Thread{
    
    private Lock mutex;
    private Tanque tanque;
    
    public Consumidor(){
        mutex = new ReentrantLock();
    }
    
    public void setTanque(Tanque tanque){
        this.tanque = tanque;
    }
    
    public void run(){
        while(true)
        {
            //if(mutex.tryLock())
            //{
                mutex.lock();
                if(tanque.agua.rc>0)
                {
                tanque.agua.rc = tanque.agua.rc - 5;
                tanque.repaint();
                //System.out.println("Consumidor Mutex");
                }
                mutex.unlock();
       //     }
            try
            {
                sleep((int) (500+Math.random()*200));
            }
            catch(Exception e){e.printStackTrace();}
        }
    }
    
}
