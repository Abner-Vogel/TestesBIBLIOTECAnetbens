/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.senac.biblioteca;

import com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme;

/**
 *
 * @author abner
 */
public class Biblioteca {

    public static void main(String[] args) {
        
        FlatCarbonIJTheme.setup(); // Carbon
        telaINICIAL tela = new telaINICIAL();
        tela.setVisible(true);
        
       try {
    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
            javax.swing.UIManager.setLookAndFeel(info.getClassName());
            break;
        }
    }
} catch (ClassNotFoundException ex) {
    java.util.logging.Logger.getLogger(telaINICIAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (InstantiationException ex) {
    java.util.logging.Logger.getLogger(telaINICIAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (IllegalAccessException ex) {
    java.util.logging.Logger.getLogger(telaINICIAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (javax.swing.UnsupportedLookAndFeelException ex) {
    java.util.logging.Logger.getLogger(telaINICIAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}     
        
    }
}
