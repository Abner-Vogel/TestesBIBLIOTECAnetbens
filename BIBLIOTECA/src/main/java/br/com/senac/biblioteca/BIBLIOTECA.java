
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.senac.biblioteca;

import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme;

/**
 *
 * @author Aluno TDS
 */
public class BIBLIOTECA {

    public static void main(String[] args) {
        
        FlatDarkPurpleIJTheme.setup(); // Dark Purple
        MENUprincipal menu = new MENUprincipal();
        menu.setVisible(true);
        
    }
}
