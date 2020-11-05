package pExclusion;

public class condicionesCompetencias extends javax.swing.JFrame{
    
    public condicionesCompetencias()
    {
        setTitle("La cena de los perritos");
        initComponents();
        rc = new rCompartido();
        cerr = new Cerradura();
        mutex = new Mutex();
        t1 = new Hilo(area1,rc,cerr,1);
        t2 = new Hilo(area2,rc,cerr,2);
        t3 = new Hilo(area3,rc,cerr,3);
        t4 = new Hilo(area4,rc,cerr,4);
        
        t1.setName("Perrito 1");
        t2.setName("Perrito 2");
        t3.setName("Perrito 3");
        t4.setName("Perrito 4");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btCorrer = new javax.swing.JButton();
        btPausar = new javax.swing.JButton();
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
        btDetener = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        btDesactivar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuAlgoritmos = new javax.swing.JMenu();
        menuCondiciones = new javax.swing.JMenuItem();
        menuInt = new javax.swing.JMenuItem();
        menuCerradura = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btCorrer.setText("Correr");
        btCorrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCorrerActionPerformed(evt);
            }
        });

        btPausar.setText("Pausar");
        btPausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPausarActionPerformed(evt);
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

        btDetener.setText("Detener");
        btDetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDetenerActionPerformed(evt);
            }
        });

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

        menuAlgoritmos.setText("Algoritmo");

        menuCondiciones.setText("Condiciones Competencia");
        menuCondiciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCondicionesActionPerformed(evt);
            }
        });
        menuAlgoritmos.add(menuCondiciones);

        menuInt.setText("Desactivación de Interrupciones");
        menuInt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuIntActionPerformed(evt);
            }
        });
        menuAlgoritmos.add(menuInt);

        menuCerradura.setText("Variable Cerradura");
        menuCerradura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCerraduraActionPerformed(evt);
            }
        });
        menuAlgoritmos.add(menuCerradura);

        jMenuItem1.setText("Mutex");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuAlgoritmos.add(jMenuItem1);

        jMenuItem2.setText("Lock");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuAlgoritmos.add(jMenuItem2);

        jMenuItem3.setText("Dekker");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuAlgoritmos.add(jMenuItem3);

        jMenuBar1.add(menuAlgoritmos);

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
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(btDetener, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btPausar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btCorrer, btDesactivar, btDetener, btPausar, btSalir});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(btCorrer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btPausar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btDetener)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btDesactivar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btPausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPausarActionPerformed
        // TODO add your handling code here:
        t1.pausar();
        t2.pausar();
        t3.pausar();
        t4.pausar();
    }//GEN-LAST:event_btPausarActionPerformed

    private void btDetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDetenerActionPerformed
        // TODO add your handling code here:
        t1.detener();
        t2.detener();
        t3.detener();
        t4.detener();
    }//GEN-LAST:event_btDetenerActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btSalirActionPerformed

    private void menuIntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuIntActionPerformed
        // TODO add your handling code here:
        btDesactivar.setVisible(true);
        btDetener.setVisible(false);
        btPausar.setVisible(false);
        area1.setText(null);
        area2.setText(null);
        area3.setText(null);
        area4.setText(null);
        {
            t1.algCond = false;
            t2.algCond = false;
            t3.algCond = false;
            t4.algCond = false;
            t1.algInt = true;
            t2.algInt = true;
            t3.algInt = true;
            t4.algInt = true;
            t1.algCerr = false;
            t2.algCerr = false;
            t3.algCerr = false;
            t4.algCerr = false;
            t1.algMutex = false;
            t2.algMutex = false;
            t3.algMutex = false;
            t4.algMutex = false;
            t1.algLock = false;
            t2.algLock = false;
            t3.algLock = false;
            t4.algLock = false;
            t1.algDekker = false;
            t2.algDekker = false;
            t3.algDekker = false;
            t4.algDekker = false;
        }
    }//GEN-LAST:event_menuIntActionPerformed

    private void menuCondicionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCondicionesActionPerformed
        // TODO add your handling code here:
       btDesactivar.setVisible(false);
       btDetener.setVisible(true);
       btPausar.setVisible(true);
       {
            t1.algInt = false;
            t2.algInt = false;
            t3.algInt = false;
            t4.algInt = false;
            t1.algCond = true;
            t2.algCond = true;
            t3.algCond = true;
            t4.algCond = true;
            t1.algCerr = false;
            t2.algCerr = false;
            t3.algCerr = false;
            t4.algCerr = false;
            t1.algMutex = false;
            t2.algMutex = false;
            t3.algMutex = false;
            t4.algMutex = false;
            t1.algLock = false;
            t2.algLock = false;
            t3.algLock = false;
            t4.algLock = false;
            t1.algDekker = false;
            t2.algDekker = false;
            t3.algDekker = false;
            t4.algDekker = false;
       }
    }//GEN-LAST:event_menuCondicionesActionPerformed

    private void btDesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDesactivarActionPerformed
        // TODO add your handling code here:
        rc.i1.inter = false;
        rc.i2.inter = false;
        rc.i3.inter = false;
    }//GEN-LAST:event_btDesactivarActionPerformed

    private void menuCerraduraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCerraduraActionPerformed
        // TODO add your handling code here:
        btDesactivar.setVisible(false);
        btDetener.setVisible(true);
        btPausar.setVisible(false);
        {
            t1.algInt = false;
            t2.algInt = false;
            t3.algInt = false;
            t4.algInt = false;
            t1.algCond = false;
            t2.algCond = false;
            t3.algCond = false;
            t4.algCond = false;
            t1.algCerr = true;
            t2.algCerr = true;
            t3.algCerr = true;
            t4.algCerr = true;   
            t1.algMutex = false;
            t2.algMutex = false;
            t3.algMutex = false;
            t4.algMutex = false;
            t1.algLock = false;
            t2.algLock = false;
            t3.algLock = false;
            t4.algLock = false;
            t1.algDekker = false;
            t2.algDekker = false;
            t3.algDekker = false;
            t4.algDekker = false;
        }
    }//GEN-LAST:event_menuCerraduraActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        btDesactivar.setVisible(false);
        btDetener.setVisible(true);
        btPausar.setVisible(false);
        {
            t1.algInt = false;
            t2.algInt = false;
            t3.algInt = false;
            t4.algInt = false;
            t1.algCond = false;
            t2.algCond = false;
            t3.algCond = false;
            t4.algCond = false;
            t1.algCerr = false;
            t2.algCerr = false;
            t3.algCerr = false;
            t4.algCerr = false;   
            t1.algMutex = true;
            t2.algMutex = true;
            t3.algMutex = true;
            t4.algMutex = true;
            t1.algLock = false;
            t2.algLock = false;
            t3.algLock = false;
            t4.algLock = false;
            t1.algDekker = false;
            t2.algDekker = false;
            t3.algDekker = false;
            t4.algDekker = false;
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        btDesactivar.setVisible(false);
        btDetener.setVisible(true);
        btPausar.setVisible(false);
        {
            t1.algInt = false;
            t2.algInt = false;
            t3.algInt = false;
            t4.algInt = false;
            t1.algCond = false;
            t2.algCond = false;
            t3.algCond = false;
            t4.algCond = false;
            t1.algCerr = false;
            t2.algCerr = false;
            t3.algCerr = false;
            t4.algCerr = false;   
            t1.algMutex = false;
            t2.algMutex = false;
            t3.algMutex = false;
            t4.algMutex = false;
            t1.algLock = true;
            t2.algLock = true;
            t3.algLock = true;
            t4.algLock = true;
            t1.algDekker = false;
            t2.algDekker = false;
            t3.algDekker = false;
            t4.algDekker = false;
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        btDesactivar.setVisible(false);
        btDetener.setVisible(true);
        btPausar.setVisible(false);
        {
            t1.algInt = false;
            t2.algInt = false;
            t3.algInt = false;
            t4.algInt = false;
            t1.algCond = false;
            t2.algCond = false;
            t3.algCond = false;
            t4.algCond = false;
            t1.algCerr = false;
            t2.algCerr = false;
            t3.algCerr = false;
            t4.algCerr = false;   
            t1.algMutex = false;
            t2.algMutex = false;
            t3.algMutex = false;
            t4.algMutex = false;
            t1.algLock = false;
            t2.algLock = false;
            t3.algLock = false;
            t4.algLock = false;
            t1.algDekker = true;
            t2.algDekker = true;
            t3.algDekker = true;
            t4.algDekker = true;
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
    private javax.swing.JButton btDetener;
    private javax.swing.JButton btPausar;
    private javax.swing.JButton btSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JMenu menuAlgoritmos;
    private javax.swing.JMenuItem menuCerradura;
    private javax.swing.JMenuItem menuCondiciones;
    private javax.swing.JMenuItem menuInt;
    // End of variables declaration//GEN-END:variables
    private Hilo t1,t2,t3,t4;
    private rCompartido rc;
    private Interrupcion interrupcion;
    private Cerradura cerr;
    private Mutex mutex;
}

