/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package admincine;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author torandell9
 */
public class CustomModel extends DefaultTableModel {
    /*
     * Constructor
     */

    public CustomModel(String[] valors) {
        super(new Object[][]{}, valors);
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }
}
