/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1edd;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import static practica1edd.Plantas.Nmod;

/**
 *
 * @author Ange
 */
public class Tablero extends javax.swing.JFrame {
Lista CatalogoPlantas=new Lista();
Lista ListaTabla=new Lista();
Lista ListaAux=new Lista();
int contador=0;
DefaultTableModel md;
Object data[][]={};
String cabecera[]={"Plantas"};
private Timer timer;
private ActionListener al;
    public Tablero() {
        initComponents();
        md=new DefaultTableModel(data,cabecera);
        jTablePlantas.setModel(md);
        jTablePlantas.setRowHeight(100);
        al=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                if(contador<ListaAux.ContadorLista()){
                    planta aux=(planta)ListaAux.GetNodo(contador).datos;
                    ListaTabla.agregarAlFinal(aux);
                    contador++;
                    Mostrar();
                }
            }
        };
        timer=new Timer(2000,al);
        
    }
    public void llenarAux(){
        Plantas p=new Plantas();
        Jugadores q=new Jugadores();
        Lista Lista=q.getListaJugadores();
        Jugador jugadorAux=Lista.buscarJugador("plantas");
        CatalogoPlantas=p.getListaPlantas();
        int n1=CatalogoPlantas.ContadorLista();
        for(int i=0;i<jugadorAux.getCantidad();i++){
            planta aux=(planta)CatalogoPlantas.GetNodo((int)(Math.random()*n1)+0).datos;
            ListaAux.agregarAlFinal(aux);
        }
    }
    public void Mostrar(){
final Class[] tiposColumnas = new Class[]{
            JLabel.class
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
                if(fila!=-1){
                    if (jTablePlantas.getModel().getColumnClass(columna).equals(JLabel.class)&&jTablePlantas.getModel().getColumnName(columna).equals("Plantas")) {
                        jLabel1.setText("hola");
                    }
//                    else if(jTablePlantas.getModel().getColumnClass(columna).equals(JButton.class)&&jTablePlantas.getModel().getColumnName(columna).equals("Modificar")){
//                        ModificarPlanta(jTablePlantas.getModel().getValueAt(fila,1).toString());
//                        Nmod=fila;
//                    }
            }
                
                
            }
        });

        
}
public Object[][] agregarInfo(){
    int n=ListaTabla.ContadorLista();
    Object datos[][]=new Object[n][1];
    for(int i=0;i<ListaTabla.ContadorLista();i++){
        planta p=new planta();
        p=(planta)ListaTabla.GetNodo(i).datos;
        datos[i][0]=p.getImagen();
    }
    return datos;
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePlantas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

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
        jScrollPane1.setViewportView(jTablePlantas);

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173)
                .addComponent(jLabel1)
                .addGap(0, 401, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
llenarAux();
for(int i=0;i<5;i++){
    planta aux=(planta)ListaAux.GetNodo(i).datos;
    ListaTabla.agregarAlFinal(aux);
}
contador=5;
Mostrar();
timer.start();
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePlantas;
    // End of variables declaration//GEN-END:variables
}
