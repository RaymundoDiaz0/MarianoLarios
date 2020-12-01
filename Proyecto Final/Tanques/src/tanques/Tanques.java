package tanques;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Tanques extends JFrame{
    
    private Agua agua;
    private Tanque tanqueMutex;
    private TanqueSem tanqueSem;
    private TanqueVC tanqueVC;
    private TanqueMonitor tanqueMon;
    private TanqueBarrera tanqueBar;
    private Productor p1;
    private Consumidor c1;
    private ProductorSem p2;
    private ConsumidorSem c2;
    private ProductorVC p3;
    private ConsumidorVC c3;
    private ProductorMonitor p4;
    private ConsumidorMonitor c4;
    private ProductorBarrera p5;
    private ConsumidorBarrera c5;
    
    Tanques(){
        
        setSize(1050,350);
        setLocation(500,400);
        setLayout(new GridLayout());
        
        p1 = new Productor();
        c1 = new Consumidor();
        p2 = new ProductorSem();
        c2 = new ConsumidorSem();
        p3 = new ProductorVC();
        c3 = new ConsumidorVC();
        p4 = new ProductorMonitor();
        c4 = new ConsumidorMonitor();
        p5 = new ProductorBarrera();
        c5 = new ConsumidorBarrera();
        tanqueMutex = new Tanque("Mutex",p1,c1);
        add(tanqueMutex);
        tanqueSem = new TanqueSem("Semáforo",p2,c2);
        add(tanqueSem);
        tanqueVC = new TanqueVC("V. Condición",p3,c3);
        add(tanqueVC);
        tanqueMon = new TanqueMonitor("Monitores",p4,c4);
        add(tanqueMon);
        tanqueBar = new TanqueBarrera("Barrera",p5,c5);
        add(tanqueBar);
        
    }
    
    public static void main(String[] args) {
        Tanques fr = new Tanques();
        fr.setTitle("Proyecto Final");
        fr.setVisible(true);
        fr.setResizable(false);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
