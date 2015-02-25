package practica1edd;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class zombie {
    private JButton Eliminar;
    private JButton Modificar;
    
    private JLabel imagen;
    private String nombre;
    private int ataque;
    private int defensa;
    private String tipo;
public zombie() {
    Eliminar=new JButton();
    Modificar=new JButton();
    Eliminar.setSize(50,50);
    Modificar.setSize(50,50);
    imagen=new JLabel();
    Eliminar.setText("Eliminar");
    Modificar.setText("Modificar");
}
    
public void setImagen(String img){
        ImageIcon foto = new ImageIcon(img);
        imagen.setSize(100,100);
         ImageIcon icono = new ImageIcon(foto.getImage().getScaledInstance(imagen.getWidth(),imagen.getHeight(), Image.SCALE_DEFAULT));
         imagen.setIcon(icono);  
         imagen.setIcon(icono);
}
    public String getNombre() {
        return nombre;
    }
    

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
       
    }

    /**
     * @return the ataque
     */
    public int getAtaque() {
        return ataque;
    }

    /**
     * @param ataque the ataque to set
     */
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    /**
     * @return the defensa
     */
    public int getDefensa() {
        return defensa;
    }

    /**
     * @param defensa the defensa to set
     */
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the Eliminar
     */
    public JButton getEliminar() {
        return Eliminar;
    }

    /**
     * @return the Modificar
     */
    public JButton getModificar() {
        return Modificar;
    }

    /**
     * @return the imagen
     */
    public JLabel getImagen() {
        return imagen;
    }
}