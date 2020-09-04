package condicionescompetencias;
import javax.swing.JTextArea;
public class Hilo extends Thread{
   
    private JTextArea area;
    private rCompartido rc;
    boolean pausar;
    boolean detener;
    boolean inicio;
    
    Hilo(JTextArea area, rCompartido rc){
        this.area = area;
        this.rc = rc;
        detener=false;
        pausar=false;
        inicio=false;
    }
    
    public void run(){
       try{
           inicio=true;
            while(true){
                rc.setRC(this.getName());
                area.append(rc.getRC()+": Eats"+"\n");
                Thread.sleep(2000);
                synchronized(this){
                    while(pausar){
                        wait();
                    }
                    if(detener){
                        break;
                    }
                }
            }
        }catch(Exception e ){ e.printStackTrace();}
    }
    
    synchronized public void pausar()
   {
       pausar=true;
       detener=false;
       notify();
   }
   
   synchronized void reanudar(){
        detener=false;
        pausar=false;
        notify();
    }
   
   synchronized void detener(){
       detener=true;
       pausar=false;
       notify();
   }
    
}
