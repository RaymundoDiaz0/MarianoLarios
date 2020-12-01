package tanques;

import static java.lang.Thread.sleep;

public class ConsumidorMonitor extends Thread{
    
    private TanqueMonitor tanque;
    
    public ConsumidorMonitor(){
        
    }
    
    public void setTanque(TanqueMonitor tanque){
        this.tanque = tanque;
    }
    
    public void run(){
        while(true)
        {
            synchronized(this){
            if(tanque.agua.rc>0)
                {
                tanque.monitor.dec();
                tanque.repaint();
                //System.out.println("Consumidor Monitor");
                }
            }
            
            try
            {
                sleep((int) (500+Math.random()*200));
            }
            catch(Exception e){e.printStackTrace();}
        }
    }
    
}
