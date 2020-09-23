/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg101.lips.algorithms;

import Controller.Controlador;
import Views.HomePage;

/**
 *
 * @author Niko
 */
public class LipsAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HomePage home = new HomePage();
        Controlador controller = new Controlador(home);
        home.setVisible(true);
        controller.iniciar();
    }
    
}
