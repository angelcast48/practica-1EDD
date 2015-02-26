package practica1edd;


import java.io.FileWriter;
import java.io.IOException;
public class graficar {

    public graficar(String nombreArchivo,String imprimir) {
        //Escribimos un fichero
        try {
            //Abro stream, crea el fichero si no existe
            FileWriter fw = new FileWriter("Reporte1.txt");
            //Escribimos en el fichero un String y un caracter 97 (a)
            fw.write(imprimir);
            //Cierro el stream
            fw.close();

        } catch (IOException e) {
            System.out.println("Error E/S: " + e);
        }


        try {


            String dotPath = "C:\\Program Files (x86)\\Graphviz2.30\\bin\\dot.exe";

            String fileInputPath = "Reporte1.txt";
            String fileOutputPath = "" + nombreArchivo + ".jpg";

            String tParam = "-Tjpg";
            String tOParam = "-o";

            String[] cmd = new String[5];
            cmd[0] = dotPath;
            cmd[1] = tParam;
            cmd[2] = fileInputPath;
            cmd[3] = tOParam;
            cmd[4] = fileOutputPath;

            Runtime rt = Runtime.getRuntime();

            rt.exec(cmd);

        } catch (Exception ex) {
            ex.printStackTrace();

        } finally {
//            JOptionPane.showMessageDialog(this,"Imagen generada con éxito en I:\\"+nomArchivo+".jpg"); 
        }

    
    }
    
}
