/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package admincine;

import UI.Inicial;
import java.io.FileInputStream;
import org.apache.commons.net.ftp.FTPClient;

/**
 *
 * @author torandell9
 */
public class AdminCine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Inicial ini = new Inicial();
      ini.setVisible(true);

    }
}

  /*
         * 
        FTPClient client = new FTPClient();

        String sFTP = "port-au-prince.dreamhost.com";
        String sUser = "cartasmodelos";
        String sPassword = "motherfucker";
        FileInputStream fis;
        try {
            client.connect(sFTP);

            boolean login = client.login(sUser, sPassword);


            if (login) {
                String filename = "NOTICE.txt";
                fis = new FileInputStream(filename);

                client.storeFile("hola.txt", fis);
                fis.close();
                client.logout();
            } else {
                System.out.println("no s'ha conectat");
            }
        } catch (Exception ioe) {
            ioe.printStackTrace();
        }**/
