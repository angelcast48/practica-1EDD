/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1edd;

import imagenes.img;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Ange
 */
public class Plantas extends img {
Lista ListaPlantas=new Lista();
DefaultTableModel md;
Object data[][]={};
static int Nmod;//numero de planta a modificar
String cabecera[]={"Imagen","Nombre","Ataque","Defensa","Tipo","Eliminar","Modificar"};
int contador=0;
String info="";
    public Plantas() {
        initComponents();
        md=new DefaultTableModel(data,cabecera);
        jTablePlantas.setModel(md);
        jTablePlantas.setRowHeight(100);
        btnModificar.setVisible(false);
      
        
    }
public void EliminarPlanta(String nombre){
ListaPlantas.eliminarPlanta(nombre);
Mostrar();
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePlantas = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDefensa = new javax.swing.JTextField();
        BtnBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtImagen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAtaque = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox();
        btnModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 51));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTablePlantas.setBackground(new java.awt.Color(51, 255, 51));
        jTablePlantas.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jTablePlantas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTablePlantas);

        jLabel4.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Defensa:");

        BtnBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tipo:");

        jLabel2.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");

        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Imagen:");

        jLabel3.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ataque:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Planta");

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Disparo", "Directo" }));

        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnModificar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                        .addGap(7, 7, 7)
                                        .addComponent(BtnBuscar)))
                                .addGap(27, 27, 27))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDefensa, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboTipo, javax.swing.GroupLayout.Alignment.LEADING, 0, 135, Short.MAX_VALUE)
                                    .addComponent(txtAtaque, javax.swing.GroupLayout.Alignment.LEADING))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel6))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(BtnBuscar))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDefensa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        JFileChooser p=new JFileChooser();
        p.showOpenDialog(p);
        txtImagen.setText(p.getSelectedFile().getPath());
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String imagen=txtImagen.getText();
        String nombre=txtNombre.getText();
        int ataque= Integer.parseInt(txtAtaque.getText());
        int defensa= Integer.parseInt(txtDefensa.getText());
        String tipo=comboTipo.getSelectedItem().toString();
        agregar(imagen, nombre, ataque, defensa, tipo);
        txtImagen.setText("");
        txtNombre.setText("");
        txtAtaque.setText("");
        txtDefensa.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
 setImage("/imagenes/plants-v-zombies-screenshot-4.jpg");
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
planta aux=(planta)ListaPlantas.GetNodo(Nmod).datos;
aux.setImagen(txtImagen.getText());
aux.setNombre(txtNombre.getText());
aux.setAtaque(Integer.parseInt(txtAtaque.getText()));
aux.setDefensa(Integer.parseInt(txtDefensa.getText()));
aux.setTipo(comboTipo.getSelectedItem().toString());
Mostrar();
btnModificar.setVisible(false);
btnAgregar.setVisible(true);
        txtImagen.setText("");
        txtNombre.setText("");
        txtAtaque.setText("");
        txtDefensa.setText("");
        
    }//GEN-LAST:event_btnModificarActionPerformed
public void Mostrar(){
final Class[] tiposColumnas = new Class[]{
            JLabel.class,
            java.lang.String.class,
            java.lang.Integer.class,
            java.lang.Integer.class,
            java.lang.String.class,
            JButton.class,
            JButton.class
        };

Object datos[][]= agregarInfo();


 jTablePlantas.setModel(new javax.swing.table.DefaultTableModel(
                datos,
                cabecera) {
            // Esta variable nos permite conocer de antemano los tipos de datos de cada columna, dentro del TableModel
            Class[] tipos = tiposColumnas;

            @Override
            public Class getColumnClass(int columnIndex) {
                // Este método es invocado por el CellRenderer para saber que dibujar en la celda,
                // observen que estamos retornando la clase que definimos de antemano.
                return tipos[columnIndex];
            }

            @Override
            public boolean isCellEditable(int row, int column) {
                // Sobrescribimos este método para evitar que la columna que contiene los botones sea editada.
                return !(this.getColumnClass(column).equals(JButton.class));
            }
        });


        // El objetivo de la siguiente línea es indicar el CellRenderer que será utilizado para dibujar el botón
        jTablePlantas.setDefaultRenderer(JButton.class, new TableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object objeto, boolean estaSeleccionado, boolean tieneElFoco, int fila, int columna) {

                return (Component) objeto;
            }
        });
          jTablePlantas.setDefaultRenderer(JLabel.class, new TableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object objeto, boolean estaSeleccionado, boolean tieneElFoco, int fila, int columna) {

                return (Component) objeto;
            }
        });

        jTablePlantas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = jTablePlantas.rowAtPoint(e.getPoint());
                int columna = jTablePlantas.columnAtPoint(e.getPoint());
                if (jTablePlantas.getModel().getColumnClass(columna).equals(JButton.class)&&jTablePlantas.getModel().getColumnName(columna).equals("Eliminar")&&columna==5) {

                    EliminarPlanta(jTablePlantas.getModel().getValueAt(fila,1).toString());
                    
                    
                }
                else if(jTablePlantas.getModel().getColumnClass(columna).equals(JButton.class)&&jTablePlantas.getModel().getColumnName(columna).equals("Modificar")&&columna==6){
                    ModificarPlanta(jTablePlantas.getModel().getValueAt(fila,1).toString());
                    Nmod=fila;
                    
                }
//                if(contador==0){
//                    contador++;
//                }
//                else{
//                    contador=0;
//                }
            }
        });

        
}
public Object[][] agregarInfo(){
    int n=ListaPlantas.ContadorLista();
    Object datos[][]=new Object[n][7];
    for(int i=0;i<ListaPlantas.ContadorLista();i++){
        planta p=new planta();
        p=(planta)ListaPlantas.GetNodo(i).datos;
        datos[i][0]=p.getImagen();
        datos[i][1]=p.getNombre();
        datos[i][2]=p.getAtaque();
        datos[i][3]=p.getDefensa();
        datos[i][4]=p.getTipo();
        datos[i][5]=p.getEliminar();
        datos[i][6]=p.getModificar();
        
    }
    return datos;
}
public void ModificarPlanta(String nombre){
    btnModificar.setVisible(true);
    btnAgregar.setVisible(false);
    planta p=ListaPlantas.buscarPlanta(nombre);
    txtImagen.setText(p.getRuta());
    txtNombre.setText(p.getNombre());
    txtAtaque.setText(""+p.getAtaque());
    txtDefensa.setText(""+p.getDefensa());
    comboTipo.setSelectedItem(p.getTipo());
    btnAgregar.setVisible(false);
   
    
}
public void agregar(String imagen,String nombre,int ataque,int defensa,String tipo){
      planta p=new planta();
      p.setImagen(imagen);
      p.setNombre(nombre);
      p.setAtaque(ataque);
      p.setDefensa(defensa);
      p.setTipo(tipo);
      try{
      ListaPlantas.agregarAlFinal(p);
      Mostrar();
      }catch(Exception e){
      }
}
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Plantas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Plantas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Plantas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Plantas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Plantas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox comboTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePlantas;
    private javax.swing.JTextField txtAtaque;
    private javax.swing.JTextField txtDefensa;
    private javax.swing.JTextField txtImagen;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
