package lock;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Hilo extends Thread{
    private JTextArea area;
    private rCompartido rc;
    private ReentrantLock lock;
    boolean pausar;
    boolean inicio;
    boolean detener;
    boolean ejec;
    
    Hilo(JTextArea area, rCompartido rc){
        this.area = area;
        this.rc = rc;
        lock = new ReentrantLock();
        pausar=false;
        inicio=false;
    }
    
    public void run(){
       try{
          while(true){
                lock.lock();
                rc.setRC(this.getName());
                area.append(rc.getRC() + "\n");
                if(detener == true)
                    break;
            }
        }catch(Exception e ){ e.printStackTrace();}
    }
    
    void detener(){
       detener=true; 
       pausar=false;
       ejec=false;
    }
   
}
