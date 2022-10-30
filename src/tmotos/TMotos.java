
package tmotos;

import CapaAplicacion.frmAutos;

/**
 *
 * @author Elian Villa
 */
public class TMotos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAutos().setVisible(true);
            }
        });
    }
    
}
