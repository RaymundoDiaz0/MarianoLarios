package tanques;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.concurrent.CyclicBarrier;

public class TanqueBarrera extends JPanel{
    
    public Agua agua;
    public CyclicBarrier barrera;
    private JLabel panel;
    private JLabel porcentaje;
    private ProductorBarrera p;
    private ConsumidorBarrera c;
    
    TanqueBarrera(String tanque, ProductorBarrera productor, ConsumidorBarrera consumidor){
        
        //Barrera
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
        barrera = new CyclicBarrier(2);
        
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
    

