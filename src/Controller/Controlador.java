/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Views.*;
import java.awt.event.ActionEvent;

/**
 *
 * @author Niko
 */
public class Controlador {
    private HomePage home;
    private Menu menu;
    private StepByStep stsps;
    private Exercices ejericios;

    public Controlador(HomePage home) {
        this.home = home;
        this.home.Menu1.addActionListener((ActionEvent e) -> {
            home.setVisible(false);
            this.menu = new Menu();
            menu.setVisible(true);
            this.Menus();
        });
        this.home.Menu.addActionListener((ActionEvent e) -> {
            home.setVisible(false);
            this.menu = new Menu();
            menu.setVisible(true);
            this.Menus();
        });
    }
    
    public void Menus() {
        this.menu.setTitle("Menu Lisp");
        this.menu.setLocationRelativeTo(null);
    }

    public void iniciar() {
        this.home.setTitle("Homepage Lisp");
        this.home.setLocationRelativeTo(null);
    }
    
}
