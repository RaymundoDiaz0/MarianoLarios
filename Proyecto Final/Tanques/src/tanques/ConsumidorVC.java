package tanques;

import java.util.*;
import static java.lang.Thread.sleep;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ConsumidorVC extends Thread{
   
    private TanqueVC tanque;
    
    public ConsumidorVC(){
        
    }
    
    public void setTanque(TanqueVC tanque){
        this.tanque = tanque;
    }
    
    public void run(){
        while(true)
        {  
            tanque.mutex.lock();
            if(!tanque.v)
            {
                try{
                    System.out.println("espera  c");
                tanque.vc.await();
                }catch(InterruptedException ex){}
            }
            tanque.v = false;
            if(tanque.agua.rc>0)
            {
            tanque.agua.rc = tanque.agua.rc - 5;
            tanque.repaint();
           // System.out.println("Consumidor VC");
            tanque.vc.signalAll();
            }
            tanque.mutex.unlock();
            
            try
            {
                sleep((int) (500+Math.random()*200));
            }
            catch(Exception e){e.printStackTrace();}
        }
    }
    
}
