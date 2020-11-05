package mutex;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
public class Hilo extends Thread{
   
    private Mutex mutex;
    private JTextArea area;
    private rCompartido rc;
    boolean pausar;
    boolean inicio;
    boolean detener;
    boolean ejec;
    
    Hilo(JTextArea area, rCompartido rc){
        this.area = area;
        this.rc = rc;
        mutex = new Mutex();
        pausar=false;
        inicio=false;
    }
    
    public void run(){
       try{
          while(true){
                mutex.lock();
                rc.setRC(this.getName());
                area.append(rc.getRC() + "\n");
                Thread.sleep(500);
                mutex.unlock();
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
