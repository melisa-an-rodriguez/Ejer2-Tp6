
package detodosa;

import java.util.TreeSet;


public class Menu extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Menu.class.getName());
    
    // Conexión entre vistas y eventos: elimino el public static TreeSet<Producto> listaProductos = new TreeSet<>();
    // porque ya existe un treeSet en GestionDeProductos, el cual permite utilizar los métodos internos
    // que están programados para que trabajen con su propio treeSet y no con uno de afuera.
    // El otro treeSet no está conectado con los métodos de GestionDeProductos.
    
    /*
    Menu
    └── GestionDeProductos
        └── setDeProductos  ← ÚNICOS datos
    */
    
    private GestionDeProductos gestionProductos;
    

    public Menu() {
        
        initComponents();
        gestionProductos = new GestionDeProductos();
        // Menu crea el objeto; el resto de las ventanas reciben instancia existente por constructor. 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuiProductos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuiConsultaRubro = new javax.swing.JMenuItem();
        mnuiConsultaNombre = new javax.swing.JMenuItem();
        mnuiConsultaPrecio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 600));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );

        jMenu1.setText("Administración");

        mnuiProductos.setText("Productos");
        mnuiProductos.addActionListener(this::mnuiProductosActionPerformed);
        jMenu1.add(mnuiProductos);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultas");
        jMenu2.addActionListener(this::jMenu2ActionPerformed);

        mnuiConsultaRubro.setText("Por Rubro");
        mnuiConsultaRubro.addActionListener(this::mnuiConsultaRubroActionPerformed);
        jMenu2.add(mnuiConsultaRubro);

        mnuiConsultaNombre.setText("Por Nombre");
        mnuiConsultaNombre.addActionListener(this::mnuiConsultaNombreActionPerformed);
        jMenu2.add(mnuiConsultaNombre);

        mnuiConsultaPrecio.setText("Por precio");
        mnuiConsultaPrecio.addActionListener(this::mnuiConsultaPrecioActionPerformed);
        jMenu2.add(mnuiConsultaPrecio);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        
        
        
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void mnuiConsultaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiConsultaNombreActionPerformed
   
        escritorio.removeAll();
        escritorio.repaint();
        
        BusquedaPorNombre bpn = new BusquedaPorNombre(gestionProductos);
        
        escritorio.add(bpn);// se agrega la ventana
        bpn.setVisible(true);  //que se muestre la ventana

        escritorio.moveToFront(bpn); // que traiga la evntana al frente
    }//GEN-LAST:event_mnuiConsultaNombreActionPerformed

    private void mnuiProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiProductosActionPerformed
        
        
        ifrmProductos ventana = new ifrmProductos(gestionProductos);

        escritorio.add(ventana);

        ventana.setVisible(true);
        
    }//GEN-LAST:event_mnuiProductosActionPerformed

    private void mnuiConsultaRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiConsultaRubroActionPerformed
        
        BusquedaPorRubro ventana = new BusquedaPorRubro(gestionProductos);

        escritorio.add(ventana);

        ventana.setVisible(true);
        
    }//GEN-LAST:event_mnuiConsultaRubroActionPerformed

    private void mnuiConsultaPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiConsultaPrecioActionPerformed
           
        BusquedaPorPrecio ventana = new BusquedaPorPrecio(gestionProductos);

        escritorio.add(ventana);

        ventana.setVisible(true);
        
    }//GEN-LAST:event_mnuiConsultaPrecioActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Menu().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnuiConsultaNombre;
    private javax.swing.JMenuItem mnuiConsultaPrecio;
    private javax.swing.JMenuItem mnuiConsultaRubro;
    private javax.swing.JMenuItem mnuiProductos;
    // End of variables declaration//GEN-END:variables
  
}
