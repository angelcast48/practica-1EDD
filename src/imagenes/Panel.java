package imagenes;



import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ange
 */

    public class Panel extends JPanel {
    private Image imagen;
    
    public Panel(){
    imagen = null;
}
    
    public  Panel (String NombreImagen)
    {
        if (NombreImagen!=null) {
            imagen = new ImageIcon(getClass().getResource(NombreImagen)).getImage();
        } 
    }
    public Panel (Image img)
    {
        if (img!=null) {
            imagen=img;
        }
    }
    public void setImage (String NombreImagen)
    {
        if (NombreImagen!=null) {
            imagen = new ImageIcon(getClass().getResource(NombreImagen)).getImage();
        }
        else {
            imagen = null;
        }
    repaint ();
    }
    
    public void setImage (Image nuevaImagen){
        if (nuevaImagen!=null) {
            imagen=nuevaImagen;
        }
        else{
            imagen=null;
        }
    repaint();
    } 
    @Override
    public void paint (Graphics g){
        if (imagen!=null) {
            g.drawImage(imagen, 0, 0,getWidth(),getHeight(), this);
            setOpaque(false);
        }
        else{
            setOpaque(true);
        }
        super.paint(g);
    }
}
