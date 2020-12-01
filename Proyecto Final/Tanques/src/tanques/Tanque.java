package tanques;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Tanque extends JPanel{
    
    public Agua agua;
    private JLabel panel;
    private JLabel porcentaje;
    private Productor p;
    private Consumidor c;
    
    Tanque(String tanque, Productor productor, Consumidor consumidor){
        
        //Mutex
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
    

