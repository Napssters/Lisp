/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
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
    private PseudoCodigo Pcode;
    private Codigos Codes;
    private Data data;
    private int count;
    //Inicializamos la clase (temporal para pruebas)
    private Enunciados Enun;

    public Controlador(HomePage home) {
        this.home = home;
        this.Enun = new Enunciados();
        this.data = new Data();
        this.count = 0;
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
        this.Algot = new Algoritmos();
        this.menu.Inicio.addActionListener((ActionEvent e) -> {
            menu.setVisible(false);
            home.setVisible(true);
            this.iniciar();
        });
        this.menu.Algoritmos.addActionListener((ActionEvent e) -> {
            menu.setVisible(false);
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
        this.Pcode = new PseudoCodigo();
        this.Codes = new Codigos();
        this.Algot.Inicio.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            home.setVisible(true);
            this.iniciar();
        });
        this.Algot.Menu.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            menu.setVisible(true);
            this.Menus();
        });
        this.Algot.b1.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(1);
        });
        this.Algot.b2.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(2);
        });
        this.Algot.b3.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(3);
        });
        this.Algot.b4.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(4);
        });
        this.Algot.b5.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(5);
        });
        this.Algot.b6.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(6);
        });
        this.Algot.b7.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(7);
        });
        this.Algot.b8.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(8);
        });
        this.Algot.b9.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(9);
        });
        this.Algot.b10.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(10);
        });
        this.Algot.b11.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(11);
        });
        this.Algot.b12.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(12);
        });
        this.Algot.b13.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(13);
        });
        this.Algot.b14.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(14);
        });
        this.Algot.b15.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(15);
        });
        this.Algot.b16.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(16);
        });
        this.Algot.b17.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(17);
        });
        this.Algot.b18.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(18);
        });
        this.Algot.b19.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(19);
        });
        this.Algot.b20.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(20);
        });
        this.Algot.b21.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(21);
        });
        this.Algot.b22.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(22);
        });
        this.Algot.b23.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(23);
        });
        this.Algot.b24.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(24);
        });
        this.Algot.b25.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(25);
        });
        this.Algot.b26.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(26);
        });
        this.Algot.b27.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(27);
        });
        this.Algot.b28.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(28);
        });
        this.Algot.b29.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(29);
        });
        this.Algot.b30.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(30);
        });
        this.Algot.b31.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(31);
        });
        this.Algot.b32.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(32);
        });
        this.Algot.b33.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(33);
        });
        this.Algot.b34.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(34);
        });
        this.Algot.b35.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(35);
        });
        this.Algot.b36.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(36);
        });
        this.Algot.b37.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(37);
        });
        this.Algot.b38.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(38);
        });
        this.Algot.b39.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(39);
        });
        this.Algot.b40.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(40);
        });
        this.Algot.b41.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(41);
        });
        this.Algot.b42.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(42);
        });
        this.Algot.b43.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(43);
        });
        this.Algot.b44.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(44);
        });
        this.Algot.b45.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(45);
        });
        this.Algot.b46.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(46);
        });
        this.Algot.b47.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(47);
        });
        this.Algot.b48.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(48);
        });
        this.Algot.b49.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(49);
        });
        this.Algot.b50.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(50);
        });
        this.Algot.b51.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(51);
        });
        this.Algot.b52.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(52);
        });
        this.Algot.b53.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(53);
        });
        this.Algot.b54.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(54);
        });
        this.Algot.b55.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(55);
        });
        this.Algot.b56.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(56);
        });
        this.Algot.b57.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(57);
        });
        this.Algot.b58.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(58);
        });
        this.Algot.b59.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(59);
        });
        this.Algot.b60.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(60);
        });
        this.Algot.b61.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(61);
        });
        this.Algot.b62.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(62);
        });
        this.Algot.b63.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(63);
        });
        this.Algot.b64.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(64);
        });
        this.Algot.b65.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(65);
        });
        this.Algot.b66.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(66);
        });
        this.Algot.b67.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(67);
        });
        this.Algot.b68.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(68);
        });
        this.Algot.b69.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(69);
        });
        this.Algot.b70.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(70);
        });
        this.Algot.b71.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(71);
        });
        this.Algot.b72.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(72);
        });
        this.Algot.b73.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(73);
        });
        this.Algot.b74.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(74);
        });
        this.Algot.b75.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(75);
        });
        this.Algot.b76.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(76);
        });
        this.Algot.b77.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(77);
        });
        this.Algot.b78.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(78);
        });
        this.Algot.b79.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(79);
        });
        this.Algot.b80.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(80);
        });
        this.Algot.b81.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(81);
        });
        this.Algot.b82.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(82);
        });
        this.Algot.b83.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(83);
        });
        this.Algot.b84.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(84);
        });
        this.Algot.b85.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(85);
        });
        this.Algot.b86.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(86);
        });
        this.Algot.b87.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(87);
        });
        this.Algot.b88.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(88);
        });
        this.Algot.b89.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(89);
        });
        this.Algot.b90.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(90);
        });
        this.Algot.b91.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(91);
        });
        this.Algot.b92.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(92);
        });
        this.Algot.b93.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(93);
        });
        this.Algot.b94.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(94);
        });
        this.Algot.b95.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(95);
        });
        this.Algot.b96.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(96);
        });
        this.Algot.b97.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(97);
        });
        this.Algot.b98.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(98);
        });
        this.Algot.b99.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(99);
        });
        this.Algot.b100.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(100);
        });
        this.Algot.b101.addActionListener((ActionEvent e) -> {
            Algot.setVisible(false);
            Pcode.setVisible(true);
            this.Pcodes(101);
        });
    }
    
    public void Pcodes(int vent){
        this.Pcode.setTitle("Enunciado Lisp");
        this.Pcode.setLocationRelativeTo(null);
        this.Pcode.Enunciado.setText(data.getAlgoritmos().get(vent - 1).get(0));
        this.Pcode.PsCode.setText(data.getAlgoritmos().get(vent - 1).get(1));
        this.Pcode.Inicio.addActionListener((ActionEvent e) -> {
            Pcode.setVisible(false);
            home.setVisible(true);
            this.iniciar();
        });
        this.Pcode.Menu.addActionListener((ActionEvent e) -> {
            Pcode.setVisible(false);
            menu.setVisible(true);
            this.Menus();
        });
        this.Pcode.Algoritmos.addActionListener((ActionEvent e) -> {
            Pcode.setVisible(false);
            Algot.setVisible(true);
            this.Algorithms();
        });
        this.Pcode.GoCode.addActionListener((ActionEvent e) -> {
            Pcode.setVisible(false);
            Codes.setVisible(true);
            this.GoCodigos((vent - 1));
        });
    }
    
    public void GoCodigos(int vent){
        this.Codes.setTitle("Codigos Lisp");
        this.Codes.setLocationRelativeTo(null);
        int pos = Integer.parseInt(data.getAlgoritmos().get(vent).get(3));
        int tam = data.getPasos().get(pos).get(1).size();
        Codes.CodigoFuente.setText(data.getAlgoritmos().get(vent).get(2));
        Codes.numero.setText((vent+1)+"");
        this.Codes.Inicio.addActionListener((ActionEvent e) -> {
            Codes.setVisible(false);
            home.setVisible(true);
            this.iniciar();
        });
        this.Codes.Menu.addActionListener((ActionEvent e) -> {
            Codes.setVisible(false);
            menu.setVisible(true);
            this.Menus();
        });
        this.Codes.Algoritmos.addActionListener((ActionEvent e) -> {
            Codes.setVisible(false);
            Algot.setVisible(true);
            this.Algorithms();
        });
        this.Codes.Run.addActionListener((ActionEvent e) -> {
            initCount();
            Codes.Explicacion.setText(Enun.getEnunciado(data.getPasos().get(pos).get(0).get(this.count)));
            Codes.Variables.setText(data.getPasos().get(pos).get(1).get(this.count));
            Codes.Siguiente.setEnabled(true);
        });
        this.Codes.Siguiente.addActionListener((ActionEvent e) -> {
            setCount();
            if(this.count < tam){
                System.out.println(this.count);
                Codes.Explicacion.setText(Enun.getEnunciado(data.getPasos().get(pos).get(0).get(this.count)));
                Codes.Variables.setText(data.getPasos().get(pos).get(1).get(this.count));
            }
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
            menu.setVisible(true);
            this.Menus();
        });
    }
    
    public void initCount(){
        this.count = 0;
    }
    
    public void setCount(){
        this.count+=1;
    }
    
    public void iniciar() {
        this.home.setTitle("Homepage Lisp");
        this.home.setLocationRelativeTo(null);
    }
    
}
