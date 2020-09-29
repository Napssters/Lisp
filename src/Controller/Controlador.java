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
    private Algoritmos Algot;
    private Documentatation Docs;

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
        this.menu.Inicio.addActionListener((ActionEvent e) -> {
            menu.setVisible(false);
            home.setVisible(true);
            this.iniciar();
        });
        this.menu.Algoritmos.addActionListener((ActionEvent e) -> {
            menu.setVisible(false);
            this.Algot = new Algoritmos();
            Algot.setVisible(true);
            this.Algorithms();
        });
        this.menu.LispDocs.addActionListener((ActionEvent e) -> {
            menu.setVisible(false);
            this.Docs = new Documentatation();
            Docs.setVisible(true);
            this.Documentation();
        });
    }
    
    public void Algorithms(){
        this.Algot.setTitle("Algoritmos Lisp");
        this.Algot.setLocationRelativeTo(null);
        this.Algot.Inicio.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            home.setVisible(true);
            this.iniciar();
        });
        this.Algot.Menu.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            this.menu = new Menu();
            menu.setVisible(true);
            this.Menus();
        });
    }
    
    public void Documentation(){
        this.Docs.setTitle("Documentacion Lisp");
        this.Docs.setLocationRelativeTo(null);
        this.Docs.Inicio.addActionListener((ActionEvent e) -> {
            Docs.setVisible(false);
            home.setVisible(true);
            this.iniciar();
        });
        this.Docs.Menu.addActionListener((ActionEvent e) -> {
            Docs .setVisible(false);
            this.menu = new Menu();
            menu.setVisible(true);
            this.Menus();
        });
    }
    
    public void iniciar() {
        this.home.setTitle("Homepage Lisp");
        this.home.setLocationRelativeTo(null);
    }
    
}
