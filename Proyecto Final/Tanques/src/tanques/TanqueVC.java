package tanques;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TanqueVC extends JPanel{
    
    public Agua agua;
    private JLabel panel;
    private JLabel porcentaje;
    private ProductorVC p;
    private ConsumidorVC c;  
    public Condition vc;
    public boolean v;
    public Lock mutex;
    
    TanqueVC(String tanque, ProductorVC productor, ConsumidorVC consumidor){
        
        //Mutex
        v =false;
        mutex = new ReentrantLock();
        vc = mutex.newCondition();
        this.agua = new Agua();
        p = productor;
        c = consumidor;
        p.setTanque(this);
        c.setTanque(this);
        
        panel = new JLabel(tanque);
        porcentaje = new JLabel();
        add(panel);
        add(porcentaje);
        
        p.start();
        c.start();
             
}
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.black);
        g2.draw(new Rectangle2D.Double(50,50,100,200));
        g2.setColor(Color.blue); 
        porcentaje.setText(((agua.rc/5)*100)/40+"%");
        g2.fill(agua.Agua());
    }
    
}
    

