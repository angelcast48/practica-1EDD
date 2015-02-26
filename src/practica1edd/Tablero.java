/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1edd;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Ange
 */
public class Tablero extends javax.swing.JFrame {
Lista CatalogoPlantas=new Lista();
Lista CatalogoZombies=new Lista();
Lista ListaTabla2=new Lista();
Lista ListaAux2=new Lista();
Lista ListaTabla=new Lista();
Lista ListaAux=new Lista();
int contador=0;
int contador2=0;
DefaultTableModel md;
Object data[][]={};
String cabecera[]={"Plantas"};
DefaultTableModel md2;
Object data2[][]={};
String cabecera2[]={"Zombies"};
private Timer timer;
private ActionListener al;
    public Tablero() {
        initComponents();
        md=new DefaultTableModel(data,cabecera);
        jTablePlantas.setModel(md);
        jTablePlantas.setRowHeight(100);
        md2=new DefaultTableModel(data2,cabecera2);
        jTableZombies.setModel(md2);
        jTableZombies.setRowHeight(100);
        al=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                if(contador<ListaAux.ContadorLista()){
                    planta aux=(planta)ListaAux.GetNodo(contador).datos;
                    ListaTabla.agregarAlFinal(aux);
                    contador++;
                    Mostrar();
                }
                if(contador2<ListaAux2.ContadorLista()){
                    zombie aux=(zombie)ListaAux2.GetNodo(contador2).datos;
                    ListaTabla2.agregarAlFinal(aux);
                    contador2++;
                    Mostrar2();
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
public void llenarAux2(){
        catalogoZombies p=new catalogoZombies();
        Jugadores q=new Jugadores();
        Lista Lista=q.getListaJugadores();
        Jugador jugadorAux=Lista.buscarJugador("zombies");
        CatalogoZombies =p.getListaZombies();
        int n1=CatalogoZombies.ContadorLista();
        for(int i=0;i<jugadorAux.getCantidad();i++){
            zombie aux=(zombie)CatalogoZombies.GetNodo((int)(Math.random()*n1)+0).datos;
            ListaAux2.agregarAlFinal(aux);
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
                        
                    }
            }
                
                
            }
        });

        
}
public void Mostrar2(){
final Class[] tiposColumnas = new Class[]{
            JLabel.class
        };

Object datos[][]= agregarInfo2();


 jTableZombies.setModel(new javax.swing.table.DefaultTableModel(
                datos,
                cabecera2) {
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
        jTableZombies.setDefaultRenderer(JButton.class, new TableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object objeto, boolean estaSeleccionado, boolean tieneElFoco, int fila, int columna) {

                return (Component) objeto;
            }
        });
          jTableZombies.setDefaultRenderer(JLabel.class, new TableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object objeto, boolean estaSeleccionado, boolean tieneElFoco, int fila, int columna) {

                return (Component) objeto;
            }
        });
        
        jTableZombies.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = jTableZombies.rowAtPoint(e.getPoint());
                int columna = jTableZombies.columnAtPoint(e.getPoint());
                if(fila!=-1){
                    if (jTableZombies.getModel().getColumnClass(columna).equals(JLabel.class)&&jTableZombies.getModel().getColumnName(columna).equals("Zombies")) {
                        
                    }
            }
                
                
            }
        });        
}
public void CrearTablero(int x,int y){
panelTab.setLayout(new GridLayout(x,y));
   JLabel[][] cuadros=new JLabel[x][y];
   for(int posY=0;posY<y;posY++){
       for(int posX=0;posX<x;posX++){
           cuadros[posX][posY]=new JLabel();
           cuadros[posX][posY].setSize(50, 50);
           ImageIcon foto = new ImageIcon("C:\\Users\\Ange\\Documents\\aplicaada 1\\monte.jpg");
           ImageIcon icono = new ImageIcon(foto.getImage().getScaledInstance(cuadros[posX][posY].getWidth(),cuadros[posX][posY].getHeight(), Image.SCALE_DEFAULT));
           cuadros[posX][posY].setIcon(icono);
//           cuadros[posX][posY].setBounds(20,10,360,360);
//           PanelTablero.setBounds(100,100,270,300);
         
           panelTab.add(cuadros[posX][posY]);
       }
   }
//           for (int PosY=0;PosY<y;PosY++){
//                for (int PosX=0;PosX<x;PosX++){
//                    cuadros[PosX][PosY]=new JButton();
//                    cuadros[PosX][PosY].setIcon(new ImageIcon("C:\\Users\\Ange\\Documents\\aplicaada 1\\monte.jpg"));
//                    panelTab.add(cuadros[PosX][PosY]);
//                }
//            }
           

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
public Object[][] agregarInfo2(){
    int n=ListaTabla2.ContadorLista();
    Object datos[][]=new Object[n][1];
    for(int i=0;i<ListaTabla2.ContadorLista();i++){
        zombie p=new zombie();
        p=(zombie)ListaTabla2.GetNodo(i).datos;
        datos[i][0]=p.getImagen();
    }
    return datos;
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePlantas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableZombies = new javax.swing.JTable();
        panelTab = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

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

        jTableZombies.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTableZombies);

        javax.swing.GroupLayout panelTabLayout = new javax.swing.GroupLayout(panelTab);
        panelTab.setLayout(panelTabLayout);
        panelTabLayout.setHorizontalGroup(
            panelTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 476, Short.MAX_VALUE)
        );
        panelTabLayout.setVerticalGroup(
            panelTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );

        jMenu1.setText("Reportes");

        jMenuItem1.setText("Catalogo Plantas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Catalogo Zombies");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Jugadores");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Salir");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(panelTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(panelTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(101, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
llenarAux();
llenarAux2();
for(int i=0;i<5;i++){
    planta aux=(planta)ListaAux.GetNodo(i).datos;
    ListaTabla.agregarAlFinal(aux);
}
for(int i=0;i<5;i++){
    zombie aux=(zombie)ListaAux2.GetNodo(i).datos;
    ListaTabla2.agregarAlFinal(aux);
}
contador=5;
contador2=5;
Mostrar();
Mostrar2();
timer.start();
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        String inicio = "digraph tabla {";
        String fin = "}";
        String nodo = "";
        String puntero = "";
        String titulo="catalogo de plantas";
        String cadenaCompleta = "";
        Plantas p=new Plantas();
        Lista lista = p.getListaPlantas();
        Nodo nodoLista = lista.primerNodo;

        for (int i = 0; i < lista.ContadorLista(); i++) {



            planta planta = (planta) nodoLista.datos;

            nodo = nodo + " node [shape=record];nodo" + i + "[label=\"" + "{Nombre|" + planta.getNombre() + "}|{Tipo|" + planta.getTipo() + "}|{Defensa|" + planta.getDefensa() + "}|{Ataque|" + planta.getAtaque() + "}" + "\"];";
            puntero = puntero + "nodo" + (i) + "->";

            nodoLista = nodoLista.siguienteNodo;

        }
        nodo = nodo + "node [shape=record];nodoNull[label=\"NULL\"];";
        puntero = puntero + "nodoNull;";
        cadenaCompleta = inicio + nodo+puntero + fin;

        graficar repo=new graficar(titulo, cadenaCompleta);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
         String inicio = "digraph tabla {";
        String fin = "}";
        String nodo = "";
        String puntero = "";
        String titulo="catalogo de Zombies";
        String cadenaCompleta = "";
        catalogoZombies p=new catalogoZombies();
        Lista lista = p.getListaZombies();
        Nodo nodoLista = lista.primerNodo;

        for (int i = 0; i < lista.ContadorLista(); i++) {



            zombie zombie = (zombie) nodoLista.datos;

            nodo = nodo + " node [shape=record];nodo" + i + "[label=\"" + "{Nombre|" + zombie.getNombre() + "}|{Tipo|" + zombie.getTipo() + "}|{Defensa|" + zombie.getDefensa() + "}|{Ataque|" + zombie.getAtaque() + "}" + "\"];";
            puntero = puntero + "nodo" + (i) + "->";

            nodoLista = nodoLista.siguienteNodo;

        }
        nodo = nodo + "node [shape=record];nodoNull[label=\"NULL\"];";
        puntero = puntero + "nodoNull;";
        cadenaCompleta = inicio + nodo+puntero + fin;

        graficar repo=new graficar(titulo, cadenaCompleta);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
String inicio = "digraph tabla {";
        String fin = "}";
        String nodo = "";
        String titulo="Jugadores";
        String punteroi = "";
        String punteroj = "";
        //this.titulo="node [shape=record];Titulo[label=\""+titulo+"\"];";
        String cadenaCompleta = "";
        Jugadores p=new Jugadores();
        Lista lista =p.getListaJugadores();
        Nodo nodoLista = lista.primerNodo;

        for (int i = 0; i < lista.ContadorLista(); i++) {



            Jugador jugador = (Jugador) nodoLista.datos;
            nodo = nodo + " node [shape=record];nodo" + i + "[label=\"" + "{Jugador|" + jugador.getNombre() + "}|{Tipo|" + jugador.getTipo() + "}|{Cantiad|" + jugador.getCantidad() + "}" + "\"];";

            //punteroi=punteroi+"nodo"+i+"->";
            Nodo nodoCampos = jugador.getCampos().primerNodo;
            String punteroTemporal = "";
            for (int j = 0; j < jugador.getCampos().ContadorLista(); j++) {
                nodo = nodo + " node [shape=record];nodo" + i + "" + j + "[label=\"" + "{" + (String) nodoCampos.datos + "}\"];";

                punteroTemporal = punteroTemporal + "nodo" + (i) + "" + (j) + "->";
                nodoCampos = nodoCampos.siguienteNodo;
            }
            if (i == 0) {
                punteroi = punteroTemporal;
            } else {
                punteroj = punteroTemporal;
            }
            //nodo=nodo+" node [shape=record];nodo"+i+"[label=\""+"{Nombre|"+jugador.getNombre()+"}|{Tipo|"+jugador.getTipoAtaque()+"}|{Vida|"+jugador.getVida()+"}|{Ataque|"+jugador.getAtaque()+"}"+"\"];";
            //punteroi=punteroi+"nodo"+(i)+"->";

            nodoLista = nodoLista.siguienteNodo;

        }

        nodo = nodo + "node [shape=record];nodoNulli[label=\"NULL\"];node [shape=record];nodoNullj[label=\"NULL\"];";
        punteroi = "{nodo0 ->" + punteroi + "nodoNulli};";
        punteroj = "{nodo1 ->" + punteroj + "nodoNullj};";
        // punteroi=punteroi+"nodoNulli};{nodo0->nodo00};{nodo1->nodo10};";
        // punteroj=punteroj+"nodoNullj};";
        cadenaCompleta = inicio + nodo + punteroi + punteroj + fin;

        graficar graf=new graficar(titulo, cadenaCompleta);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePlantas;
    private javax.swing.JTable jTableZombies;
    private javax.swing.JPanel panelTab;
    // End of variables declaration//GEN-END:variables
}
