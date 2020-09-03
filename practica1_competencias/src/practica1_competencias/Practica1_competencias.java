package practica1_competencias;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Practica1_competencias extends JFrame {
    private JButton bRun, bPausa, bDetener, bReanudar;
    private JLabel etHilo1, etHilo2;
    private JTextArea areaHilo1, areaHilo2;
    private JScrollPane jspHilo1, jspHilo2;
    
    
    public Practica1_competencias(){
        setSize(400,400);
        setTitle("Condiciones de Competencia");
        MisComponentes();
    }
    private void MisComponentes(){
        bRun = new JButton("Run");
        bPausa = new JButton("Pausa");
        bDetener = new JButton("Detener");
        bReanudar = new JButton("Reanudar");
        etHilo1 = new JLabel("Hilo 1");
        etHilo2 = new JLabel("Hilo 2");
        areaHilo1 = new JTextArea();
        areaHilo1.setEditable(false);
        areaHilo2 = new JTextArea();
        areaHilo2.setEditable(false);
        jspHilo1 = new JScrollPane(areaHilo1);
        jspHilo2 = new JScrollPane(areaHilo2);
        
        setLayout(null);
        bRun.setBounds(10,100,100,25);
        bPausa.setBounds(10,150,100,25);
        bReanudar.setBounds(10,200,100,25);
        bDetener.setBounds(10,250,100,25);
        etHilo1.setBounds(150,10,100,25);
        etHilo2.setBounds(250,10,100,25);
        jspHilo1.setBounds(150,50,100,300);
        jspHilo2.setBounds(250,50,100,300);
        
        add(bRun);
        add(bPausa);
        add(bDetener);
        add(bReanudar);
        add(etHilo1);
        add(etHilo2);
        add(jspHilo1);
        add(jspHilo2);
        
        Hilo1 t1 = new Hilo1(areaHilo1);
        Hilo2 t2 = new Hilo2(areaHilo2); 
        
        bRun.addActionListener((ActionEvent e) -> {
            t1.start();
            t2.start();
        });
        
        bPausa.addActionListener((ActionEvent e) -> {
            t1.pausar();
            t2.pausar();
        });

        bReanudar.addActionListener((ActionEvent e) -> {
            t1.reanudar();
            t2.reanudar();
        });
        
        bDetener.addActionListener((ActionEvent e) -> {
            t1.detener();
            t2.detener();
        });
        
    }
    public static void main(String[] args) {
       Practica1_competencias fr = new Practica1_competencias();
       fr.setVisible(true);
       fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
  
}
