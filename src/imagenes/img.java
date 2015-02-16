package imagenes;


import imagenes.Panel;
import java.awt.Image;
import javax.swing.JFrame;
/**
 *
 * @author francisco
 */
public class img extends JFrame {
    private final Panel modelo = new Panel();
    public img (){
        setContentPane(modelo);
    }
public void setImage (String nombreImagen){
    modelo.setImage(nombreImagen);
}
public void setImage (Image nombreImagen){
 modelo.setImage(nombreImagen);   
}
}
