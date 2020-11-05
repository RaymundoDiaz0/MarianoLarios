package pExclusion;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import javax.swing.JTextArea;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Random;

public class Hilo extends Thread{
    boolean algCond;
    boolean algInt;
    boolean algCerr;
    boolean algMutex;
    boolean algLock;
    boolean algDekker;
    private Cerradura cerr;
    private JTextArea area;
    private rCompartido rc;
    private Mutex mutex;
    private ReentrantLock lock;
    boolean pausar;
    boolean detener;
    boolean ejec;
    boolean inicio;
    boolean sc;
    int turno;
    
    Hilo(JTextArea area, rCompartido rc, Cerradura cerr, int turno){
        this.area = area;
        this.rc = rc;
        this.cerr = cerr;
        mutex = new Mutex();
        lock = new ReentrantLock();
        detener=false;
        pausar=false;
        inicio=false;
        algCond = false;
        algInt = false;
        algCerr = false;
        algMutex = false;
        algDekker = false;
        this.turno = turno;
    }
    
    public void run(){
        
        //condiciones competencia
        if(this.algCond == true){
           
        try{
           inicio=true;
           ejec=true;
            while(true){
                rc.setRc(this.getName());
                area.append(rc.getRc()+": Eats\n");
                Thread.sleep(500);
                if(ejec == false){
                    while(pausar == true)
                    {
                       Thread.sleep(1);
                    }
                    if(detener == true){
                        break;
                    }
                }
            }
        }catch(Exception e ){ e.printStackTrace();}
    }
        
//*************************************************
        //interrupcion
        if(this.algInt == true){
            
        try{
           inicio=true;
           while(true){
                if(rc.i1.inter == false && rc.i2.inter == false && rc.i3.inter == false)
                {
                    if(this.getName()=="Perrito 1"){
                        while(true){
                            rc.setRc(this.getName());
                            area.append(rc.getRc()+": Eats\n");
                            Thread.sleep(500);
                        }
                    }
                sc=true;
                }
                if(sc == true){ 
                exit();
                }
                rc.setRc(this.getName());
                area.append(rc.getRc()+": Eats\n");
                Thread.sleep(500);
            }
        }catch(Exception e ){ e.printStackTrace();}
    }
        
//*************************************************
        //cerradura 
        if(this.algCerr == true){
           
        try{
            inicio=true;
            while(true){
                if(!cerr.isCerr()){
                cerr.Cierra();                        
                rc.setCerradura(this.getName());
                this.area.append(rc.getCerradura()+": Eats\n");
                cerr.Abre();
                }
                Thread.sleep(500);
                if(detener == true)
                    break;
            }  
        }catch(Exception e ){e.printStackTrace();}                
    }
        
//*************************************************
        //Mutex
        if(this.algMutex == true){
            
        try{ 
            while(true){
                mutex.lock();
                rc.setRc(this.getName());
                area.append(rc.getRc() + "\n");
                Thread.sleep(500);
                mutex.unlock();
                if(detener == true)
                    break;
            }
            }catch(Exception e){System.out.println("err");} 
        }
        
        //Lock
        if(this.algLock == true){
            
        try{
            while(true){
                lock.lock();
                rc.setRc(this.getName());
                area.append(rc.getRc() + "\n");
                if(detener == true)
                    break;
            }
            }catch(Exception e){e.printStackTrace();}
        finally{lock.unlock();}
        }
        
        //Dekker
        if(this.algDekker == true){
           
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
