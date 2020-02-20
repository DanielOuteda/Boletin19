/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

import javax.swing.JOptionPane;

/**
 *
 * @author doutedasolla
 */
public class PedirDato {

    public static int pedirInt() {
        return Integer.parseInt(JOptionPane.showInputDialog("Teclea int :"));
    }

    public static String pedirNome() {
        return JOptionPane.showInputDialog("Teclea nome :");
    }
}
