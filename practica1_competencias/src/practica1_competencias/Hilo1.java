package practica1_competencias;
import javax.swing.JTextArea;

public class Hilo1 extends Thread{
    private JTextArea area;
    boolean detener;
    boolean pausar;
    
    Hilo1(JTextArea area){
    this.area=area;
    detener=false;
    pausar=false;
}
    public void run(){
    int i=0;
       
    try
    {
        while(true)
        {
            area.append(i+"\n");
            i++;
            synchronized(this)
            {
            while(pausar)
                {
                wait();
                }
            if(detener)
            {
                break;
            }
            }
        }
    }
    catch(InterruptedException exc)
    {
        System.out.println("interrumpido.");
        System.out.println("finalizado.");
    }
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
