package tanques;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TanqueMonitor extends JPanel{
    
    public Agua agua;
    public Monitor monitor;
    private JLabel panel;
    private JLabel porcentaje;
    private ProductorMonitor p;
    private ConsumidorMonitor c;
    
    TanqueMonitor(String tanque, ProductorMonitor productor, ConsumidorMonitor consumidor){
        
        //Mutex
        this.agua = new Agua();
        this.monitor = new Monitor();
        p = productor;
        c = consumidor;
        p.setTanque(this);
        c.setTanque(this);
        monitor.setAgua(this.agua);
        
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
