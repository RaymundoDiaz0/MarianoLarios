package practicainterrupcion;
import javax.swing.JTextArea;

public class Hilo extends Thread{
    private JTextArea area;
    private rCompartido rc;
    boolean pausar;
    boolean detener;
    boolean ejec;
    boolean inicio;
    boolean sc;
    
    Hilo(JTextArea area, rCompartido rc){
        this.area = area;
        this.rc = rc;
        detener=false;
        pausar=false;
        inicio=false;
    }
    
    public void run(){
//*************************************************
        //interrupcion
        try{
           inicio=true;
           while(true){
                if(rc.i1.inter == false && rc.i2.inter == false && rc.i3.inter == false)
                {
                    if(this.getName()=="Perrito 1"){
                        while(true){
                            rc.setRC(this.getName());
                            area.append(rc.getRC()+": Eats\n");
                            Thread.sleep(500);
                        }
                    }
                sc=true;
                }
                if(sc == true){ 
                System.out.println("Recurso Compartido ocupado\n");
                exit();
                }
                rc.setRC(this.getName());
                area.append(rc.getRC()+": Eats\n");
                Thread.sleep(500);
            }
        }catch(Exception e ){ e.printStackTrace();}
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
        stop();
       }catch(Exception e){
       e.printStackTrace();}
   }
    
}
