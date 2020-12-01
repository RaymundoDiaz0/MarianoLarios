package tanques;

import static java.lang.Thread.sleep;

public class ProductorMonitor extends Thread{
    
    private TanqueMonitor tanque;
    
    public ProductorMonitor(){
        
    }
    
    public void setTanque(TanqueMonitor tanque){
        this.tanque = tanque;
    }
    
    public void run(){
        while(true)
        {
            synchronized(this){
            if(tanque.agua.rc<199)
                {
                tanque.monitor.inc();
                tanque.repaint();
                //System.out.println("Productor Monitor");
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
