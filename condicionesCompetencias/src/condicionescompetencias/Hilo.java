package condicionescompetencias;
import javax.swing.JTextArea;
public class Hilo extends Thread{
   
    private JTextArea area;
    private rCompartido rc;
    boolean pausar;
    boolean detener;
    boolean inicio;
    boolean ejec;
    
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
            area.append(rc.getRC()+": Eats\n");
            Thread.sleep(500);
            if(ejec == false){
                while(pausar == true)
                {
                    Thread.sleep(1);
                }
                if(detener == true)
                    break;
                }
            }
        }catch(Exception e ){ e.printStackTrace();}
    }
    
    public void pausar(){
       pausar=true;
   }
   
    void reanudar(){
        detener=false;
        pausar=false;
    }
    
    void detener(){
       detener=true;
       pausar=false;
    }
    
}
