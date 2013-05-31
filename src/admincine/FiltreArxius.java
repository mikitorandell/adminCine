package admincine;
import java.io.File;
/*
 * Sobreescriu el filtre da'arxius per validar només les imatges
 */

public class FiltreArxius extends javax.swing.filechooser.FileFilter {

    public FiltreArxius(){
        super();
    }
    @Override
    /**
     * S'assegura de només acceptar arxius jpeg.
     */
    public boolean accept(File file) {
        if (file.isDirectory()) {
            return true;
        } else {
            return (file.getName().endsWith(".jpg") || file.getName().endsWith(".jpeg") || file.getName().endsWith(".JPG") || file.getName().endsWith(".JPEG"));

        }
    }

    @Override
    public String getDescription() {
        return "Arxius d'imatge (.JPG i .JPEG)";
    }
}