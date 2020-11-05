package condicionescompetencias;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
public class Hilo extends Thread{
   
    private Cerradura cerr;
    private JTextArea area;
    private rCompartido rc;
    boolean pausar;
    boolean inicio;
    boolean detener;
    boolean ejec;
    
    Hilo(JTextArea area, rCompartido rc, Cerradura cerr){
        this.area = area;
        this.rc = rc;
        this.cerr = cerr;
        pausar=false;
        inicio=false;
    }
    
    public void run(){
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
        }catch(Exception e ){ e.printStackTrace();}
    }
    
    void detener(){
       detener=true; 
       pausar=false;
       ejec=false;
    }
   
}
