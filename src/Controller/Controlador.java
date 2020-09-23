/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Views.HomePage;

/**
 *
 * @author Niko
 */
public class Controlador {
    private HomePage home;

    public Controlador(HomePage home) {
        this.home = home;
    }

    public void iniciar() {
        this.home.setTitle("HomePage Lisp");
        this.home.setLocationRelativeTo(null);
    }
    
}
