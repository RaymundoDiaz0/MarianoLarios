package tanques;

import static java.lang.Thread.sleep;

public class ConsumidorBarrera extends Thread{

    private TanqueBarrera tanque;
    
    public void setTanque(TanqueBarrera tanque){
        this.tanque = tanque;
    }
    
    public void run(){
        while(true)
        {   
            try{
            tanque.barrera.await();
            if(tanque.agua.rc>0)
            {
            tanque.agua.rc = tanque.agua.rc - 5;
            tanque.repaint();
            //System.out.println("Consumidor Barrera");
            }
            tanque.barrera.notify();
            }
            catch(Exception e){}
            
            try
            {
                sleep((int) (500+Math.random()*200));
            }
            catch(Exception e){e.printStackTrace();}
        }
    }
    
}
