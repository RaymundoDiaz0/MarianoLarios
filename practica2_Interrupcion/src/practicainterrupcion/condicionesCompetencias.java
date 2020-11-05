package practicainterrupcion;

public class condicionesCompetencias extends javax.swing.JFrame{
    
    public condicionesCompetencias()
    {
        setTitle("La cena de los perritos");
        initComponents();
        rc = new rCompartido();
   
        t1 = new Hilo(area1,rc);
        t2 = new Hilo(area2,rc);
        t3 = new Hilo(area3,rc);
        t4 = new Hilo(area4,rc);
        
        t1.setName("Perrito 1");
        t2.setName("Perrito 2");
        t3.setName("Perrito 3");
        t4.setName("Perrito 4");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btCorrer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        area1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        area2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        area3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        area4 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btSalir = new javax.swing.JButton();
        btDesactivar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btCorrer.setText("Correr");
        btCorrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCorrerActionPerformed(evt);
            }
        });

        area1.setEditable(false);
        area1.setColumns(20);
        area1.setRows(5);
        jScrollPane1.setViewportView(area1);

        area2.setEditable(false);
        area2.setColumns(20);
        area2.setRows(5);
        jScrollPane2.setViewportView(area2);

        area3.setEditable(false);
        area3.setColumns(20);
        area3.setRows(5);
        jScrollPane3.setViewportView(area3);

        area4.setEditable(false);
        area4.setColumns(20);
        area4.setRows(5);
        jScrollPane4.setViewportView(area4);

        jLabel1.setText("Plato 1");

        jLabel2.setText("Plato 2");

        jLabel3.setText("Plato 3");

        jLabel4.setText("Plato 4");

        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        btDesactivar.setText("Desactivar");
        btDesactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDesactivarActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(111, 111, 111)
                .addComponent(jLabel2)
                .addGap(115, 115, 115)
                .addComponent(jLabel3)
                .addGap(106, 106, 106)
                .addComponent(jLabel4)
                .addGap(128, 128, 128))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btDesactivar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCorrer, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btCorrer, btDesactivar, btSalir});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(btCorrer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btDesactivar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCorrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCorrerActionPerformed

        if(!t1.inicio && !t2.inicio && !t3.inicio && !t4.inicio)
        {
            t1.start();
            t2.start();
            t3.start();
            t4.start();
        }
        else
        {
            t1.reanudar();
            t2.reanudar();
            t3.reanudar();
            t4.reanudar();
        }
                                                     
    }//GEN-LAST:event_btCorrerActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btSalirActionPerformed

    private void btDesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDesactivarActionPerformed
        // TODO add your handling code here:
        rc.i1.inter = false;
        rc.i2.inter = false;
        rc.i3.inter = false;
    }//GEN-LAST:event_btDesactivarActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                condicionesCompetencias a = new condicionesCompetencias();      
                a.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area1;
    private javax.swing.JTextArea area2;
    private javax.swing.JTextArea area3;
    private javax.swing.JTextArea area4;
    private javax.swing.JButton btCorrer;
    private javax.swing.JButton btDesactivar;
    private javax.swing.JButton btSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
    private Hilo t1,t2,t3,t4;
    private rCompartido rc;
    private Interrupcion interrupcion;
}

