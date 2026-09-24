
package detodosa;

import java.util.ArrayList;
import java.util.TreeSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ifrmProductos extends javax.swing.JInternalFrame {

    
    private GestionDeProductos gestionProductos;
      
    public ifrmProductos(GestionDeProductos gestionProductos) {
        
        initComponents();
        
        this.gestionProductos = gestionProductos;         
  
        cmbCategoria.addItem("Todas");
        cmbCategoria.addItem("COMESTIBLE");
        cmbCategoria.addItem("LIMPIEZA");
        cmbCategoria.addItem("PERFUMERIA");
        
        cmbRubro.addItem("COMESTIBLE");
        cmbRubro.addItem("LIMPIEZA");
        cmbRubro.addItem("PERFUMERIA");

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        panelIngresoDatos = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        cmbRubro = new javax.swing.JComboBox<>();
        spnStock = new javax.swing.JSpinner();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbCategoria = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();

        btnNuevo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(this::btnNuevoActionPerformed);

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(this::btnGuardarActionPerformed);

        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(this::btnActualizarActionPerformed);

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);

        panelIngresoDatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Código:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Descripción:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Precio:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Rubro:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Stock:");

        txtDescripcion.addActionListener(this::txtDescripcionActionPerformed);

        spnStock.setPreferredSize(new java.awt.Dimension(70, 22));

        javax.swing.GroupLayout panelIngresoDatosLayout = new javax.swing.GroupLayout(panelIngresoDatos);
        panelIngresoDatos.setLayout(panelIngresoDatosLayout);
        panelIngresoDatosLayout.setHorizontalGroup(
            panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresoDatosLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelIngresoDatosLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(63, 63, 63)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelIngresoDatosLayout.createSequentialGroup()
                        .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(39, 39, 39)
                        .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescripcion)
                            .addComponent(txtPrecio)
                            .addComponent(cmbRubro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelIngresoDatosLayout.createSequentialGroup()
                                .addComponent(spnStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        panelIngresoDatosLayout.setVerticalGroup(
            panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresoDatosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIngresoDatosLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel4))
                    .addGroup(panelIngresoDatosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(spnStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/detodosa/lupa.png"))); // NOI18N
        btnBuscar.addActionListener(this::btnBuscarActionPerformed);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Gestión de Productos");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Filtrar por Categoría:");

        cmbCategoria.addItemListener(this::cmbCategoriaItemStateChanged);
        cmbCategoria.addActionListener(this::cmbCategoriaActionPerformed);

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descripción", "Precio", "Categoría", "Stock"
            }
        ));
        tblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProductos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNuevo)
                                .addGap(70, 70, 70)
                                .addComponent(btnGuardar)
                                .addGap(70, 70, 70)
                                .addComponent(btnActualizar)
                                .addGap(70, 70, 70)
                                .addComponent(btnEliminar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panelIngresoDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(panelIngresoDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(180, 180, 180)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

        
        
    }//GEN-LAST:event_btnNuevoActionPerformed

    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        String codigoTexto = txtCodigo.getText().trim();
        String descripcion = txtDescripcion.getText().trim();
        String precioTexto = txtPrecio.getText().trim();
        String rubroTexto = cmbRubro.getSelectedItem().toString();

        // Validación de campos:
        if (codigoTexto.isEmpty()) {

            JOptionPane.showMessageDialog(this, "Debe ingresar un código.");
            txtCodigo.requestFocus();
            return;
        }

        if (descripcion.isEmpty()) {

            JOptionPane.showMessageDialog(this, "Debe ingresar una descripción.");
            txtDescripcion.requestFocus();
            return;
        }

        if (precioTexto.isEmpty()) {

            JOptionPane.showMessageDialog(this, "Debe ingresar un precio.");
            txtPrecio.requestFocus();
            return;
        }

        int codigo;

        try {

            codigo = Integer.parseInt(codigoTexto);

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "El código debe ser un número.");
            txtCodigo.requestFocus();
            return;
        }

        double precio;

        try {

            precio = Double.parseDouble(precioTexto);

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "El precio debe ser un número.");
            txtPrecio.requestFocus();
            return;
        }

        if (rubroTexto.isEmpty()) {

            JOptionPane.showMessageDialog(this, "Debe seleccionar un rubro.");
            cmbRubro.requestFocus();
            return;
        }

        Categoria rubro = Categoria.valueOf(rubroTexto);

        // Obtener stock:
        int stock = (int) spnStock.getValue();

        // Crear producto:
        Producto producto = new Producto(
                codigo,
                descripcion,
                precio,
                stock,
                rubro
        );

        // Agregar producto:
        if (gestionProductos.agregarProducto(producto)) {

            DefaultTableModel modelo = (DefaultTableModel) tblProductos.getModel();

            modelo.addRow(new Object[]{
                producto.getCodigo(),
                producto.getDescripcion(),
                producto.getPrecio(),
                producto.getRubro(),
                producto.getStock()
            });

            JOptionPane.showMessageDialog(this, "Producto agregado correctamente.");

        } else {

            JOptionPane.showMessageDialog(this,
                    "Ya existe un producto con ese código.");
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    
    
    // Evento que toma los datos modificados de los campos, modifica el objeto y actualiza la fila:
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        // Pedir al usuario, mediante ventana extra, que ingrese el código
        // del producto que desea buscar:
        String codigoTexto = JOptionPane.showInputDialog(
                this,
                "Ingrese el código del producto: "
        );

        // Si el usuario presionó Cancelar o cerró la ventana:
        if (codigoTexto == null) {
            return;
        }

        codigoTexto = codigoTexto.trim();

        // Validar campo vacío:
        if (codigoTexto.isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Debe ingresar un código."
            );
            return;
        }

        int codigo;

        try {

            codigo = Integer.parseInt(codigoTexto);

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(
                    this,
                    "El código debe ser un número."
            );
            return;
        }

        Producto producto = gestionProductos.buscarPorCodigo(codigo);

        if (producto == null) {

            JOptionPane.showMessageDialog(
                    this,
                    "No se encontró un producto con ese código."
            );
            return;
        }

        // Cargar en el formulario los datos del producto encontrado:
        txtCodigo.setText(String.valueOf(producto.getCodigo()));
        txtDescripcion.setText(producto.getDescripcion());
        txtPrecio.setText(String.valueOf(producto.getPrecio()));
        cmbRubro.setSelectedItem(producto.getRubro().toString());
        spnStock.setValue(producto.getStock());

    }//GEN-LAST:event_btnBuscarActionPerformed

    
    private void cmbCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCategoriaItemStateChanged

        // Solo actuar cuando se selecciona un elemento:
        if (evt.getStateChange() != java.awt.event.ItemEvent.SELECTED) {

            return;
        }

        String rubroTexto = cmbCategoria.getSelectedItem().toString();

        DefaultTableModel modelo = (DefaultTableModel) tblProductos.getModel();

        // Limpiar la tabla.
        modelo.setRowCount(0);

        ArrayList<Producto> productosEncontrados;

        // Si se seleccionó "Todas":
        if (rubroTexto.equals("Todas")) {

            productosEncontrados = gestionProductos.listarTodos();

        } else {

            Categoria categoria = Categoria.valueOf(rubroTexto);

            productosEncontrados = gestionProductos.buscarPorRubro(categoria);
        }

        for (Producto producto : productosEncontrados) {

            modelo.addRow(new Object[]{
                producto.getCodigo(),
                producto.getDescripcion(),
                producto.getPrecio(),
                producto.getRubro(),
                producto.getStock()
            });
        }

    }//GEN-LAST:event_cmbCategoriaItemStateChanged

    
    
    private void cmbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoriaActionPerformed

        String rubroTexto = cmbCategoria.getSelectedItem().toString();

        DefaultTableModel modelo
                = (DefaultTableModel) tblProductos.getModel();

        // Limpiar la tabla:
        modelo.setRowCount(0);

        ArrayList<Producto> productosEncontrados;

        // Si se seleccionó "Todas":
        if (rubroTexto.equals("Todas")) {

            productosEncontrados = gestionProductos.listarTodos();

        } else {

            Categoria rubro = Categoria.valueOf(rubroTexto);

            productosEncontrados = gestionProductos.buscarPorRubro(rubro);
        }

        for (Producto producto : productosEncontrados) {

            modelo.addRow(new Object[]{
                producto.getCodigo(),
                producto.getDescripcion(),
                producto.getPrecio(),
                producto.getRubro(),
                producto.getStock()
            });
        }

    }//GEN-LAST:event_cmbCategoriaActionPerformed

    
    // clic en fila -> obtengo código de columna 0 -> busco Producto por código -> cargo sus datos en los campos.
    private void tblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseClicked

        // Obtener la fila sobre la que hizo clic el usuario:
        int filaSeleccionada = tblProductos.getSelectedRow();

        if (filaSeleccionada == -1) {
            return;
        }

        // Obtener el código (columna 0) de la fila seleccionada:
        int codigo = (int) tblProductos.getValueAt(filaSeleccionada, 0);

        Producto producto = gestionProductos.buscarPorCodigo(codigo);

        if (producto == null) {
            return;
        }

        // Llenar campos:
        txtCodigo.setText(String.valueOf(producto.getCodigo()));
        txtDescripcion.setText(producto.getDescripcion());
        txtPrecio.setText(String.valueOf(producto.getPrecio()));
        cmbRubro.setSelectedItem(producto.getRubro().toString());
        spnStock.setValue(producto.getStock());

    }//GEN-LAST:event_tblProductosMouseClicked

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JComboBox<String> cmbRubro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelIngresoDatos;
    private javax.swing.JSpinner spnStock;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
