/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consultoriomedico;

import javax.swing.JOptionPane;

/**
 *
 * @author 640800408
 */
public class ConsultorioMedico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int i = JOptionPane.showConfirmDialog(null, "Confirma?");
       String s = JOptionPane.showInputDialog("Digite o nome:");
       JOptionPane.showMessageDialog(null, "Olá "+s);
               
    }
}
