/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serie;

import MODELO.MODELO_SERIE;
import javax.swing.JOptionPane;

/**
 *
 * @author ivantc
 */
public class SERIE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int limite;
        limite = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un limite: "));
        MODELO_SERIE o1 = new MODELO_SERIE(limite);
        JOptionPane.showMessageDialog(null, o1.generar_serie());
        JOptionPane.showMessageDialog(null, "ESTE CAMBIO LO REALICE DESDE GITHUB");
        JOptionPane.showMessageDialog(null, "ESTE CAMBIO LO REALICE DESPUES DE CLONAR");
    }
    
}
