package adekker;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import javax.swing.JTextArea;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Random;

public class Hilo extends Thread{
    private JTextArea area;
    private rCompartido rc;
    boolean pausar;
    boolean detener;
    boolean ejec;
    boolean inicio;
    boolean sc;
    int turno;
    
    Hilo(JTextArea area, rCompartido rc, int turno){
        this.area = area;
        this.rc = rc;
        detener=false;
        pausar=false;
        inicio=false;
        this.turno = turno;
    }
    
    public void run(){
        //Dekker
        try
         {
            while(true){
                rc.pDesea = true;
                rc.pDentro = false;
                while(rc.pDesea){
                    if(rc.turno==this.turno && rc.pDentro == false){
                        rc.pDentro=true;
                        rc.setRc(this.getName());
                        area.append(rc.getRc() + "\n");
                        Thread.sleep(1000);
                        rc.turno = (int) Math.floor(Math.random()*(1-4+1)+1);
                    }
                    Thread.sleep(1000);
                    rc.pDentro=false;
                    rc.pDesea=true;
                    turno= (int) Math.floor(Math.random()*(1-4+1)+1);
                    if(detener == true)
                    break;
                }
                if(detener == true)
                    break;
            }
         }catch(Exception e){e.printStackTrace();}
    }
    
    public void pausar(){
       pausar=true;
       ejec=false;
    }
   
    void reanudar(){
        pausar=false; 
        ejec=true;
    }
   
    void detener(){
       detener=true; 
       pausar=false;
       ejec=false;
    }
    
    public void exit(){
       try{
           //System.out.println(rc.getRC()+":En espera de liberación");
        //wait();
        stop();
       }catch(Exception e){
       e.printStackTrace();}
   }
    
}
