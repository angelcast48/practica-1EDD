
package practica1edd;

import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Ange
 */
public class TableroPanel extends JPanel {
    private int x;
    private int y;
    JLabel[][] cuadros;
    public TableroPanel(int coordenadaX, int coordenadaY) {
        
        this.x = coordenadaX;
        this.y = coordenadaY;
        this.setLayout(new GridLayout(x,y));
        cuadros=new JLabel[x][y];
        for(int posY=0;posY<y;posY++){
       for(int posX=0;posX<x;posX++){
           cuadros[posX][posY]=new JLabel();
           cuadros[posX][posY].setSize(100, 100);
           ImageIcon foto = new ImageIcon("/imagenes/monte.jpg");
           ImageIcon icono = new ImageIcon(foto.getImage().getScaledInstance(cuadros[posX][posY].getWidth(),cuadros[posX][posY].getHeight(), Image.SCALE_DEFAULT));
           cuadros[posX][posY].setIcon(icono);
//           cuadros[posX][posY].setBounds(20,10,360,360);
//           PanelTablero.setBounds(100,100,270,300);
           add(cuadros[posX][posY]);
//             panelTab.add(cuadros[posX][posY]);
       }}
    }

   
}
