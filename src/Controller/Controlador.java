 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import Views.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextPane;
import org.w3c.dom.events.EventException;

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
    private Data2 data2;
    private condicionales condis;
    private Coments Comentario;
    private Matematicas Mates;
    private Funciones Func;
    private Ciclos Cicl;
    private Meta101 Meta;
    private int count;
    private CuadroTexto ChangeColor;
    private Enunciados Enun;
    private JavaAlgorithms javaAlg;
    private List<String> reads;

    public Controlador(HomePage home) {
        this.home = home;
        this.Enun = new Enunciados();
        this.data = new Data();
        this.data2 = new Data2();
        this.Meta = new Meta101();
        this.Comentario = new Coments();
        this.Mates = new Matematicas();
        this.condis = new condicionales();
        this.Func = new Funciones();
        this.Cicl = new Ciclos();
        this.count = 0;
        this.home.Menu1.addActionListener((ActionEvent e) -> {
            try{
                 home.setVisible(false);
                this.menu = new Menu();
                menu.setVisible(true);
                this.Menus();
            }catch(EventException z){
                
            }
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
        this.Docs = new Documentatation();
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
            Meta.setVisible(true);
            this.meta();
        });
    }
    
    public void meta(){
        this.Meta.setTitle("MEta 101 Lisp");
        this.Meta.setLocationRelativeTo(null);
        this.Meta.Inicio.addActionListener((ActionEvent e) -> {
            Meta.setVisible(false);
            home.setVisible(true);
            this.iniciar();
        });
        this.Meta.Menu.addActionListener((ActionEvent e) -> {
            Meta.setVisible(false);
            menu.setVisible(true);
            this.Menus();
        });
    }
    
    public void Pcodes(int vent){
        this.Pcode.setTitle("Enunciado Lisp");
        this.Pcode.setLocationRelativeTo(null);
        String Enuns = "";
        String Pcods = "";
        int num = vent - 1;
        if(vent <= 75){
            Enuns = data.getAlgoritmos().get(vent - 1).get(0);
            Pcods = data.getAlgoritmos().get(vent - 1).get(1);
        }else{
            Enuns = data2.getAlgoritmos().get(num - 74).get(0);
            Pcods = data2.getAlgoritmos().get(num - 74).get(1);
        }
        this.Pcode.Enunciado.setText(Enuns);
        this.Pcode.PsCode.setText(Pcods);
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
            Codes.dispose();
            this.Codes = new Codigos();
            Codes.setVisible(true);
            this.GoCodigos((vent - 1));
        });
    }
    
    int opc = 0;
    int pos = 0;
    int counter = 0;
    public void GoCodigos(int vent){
        this.Codes.setTitle("Codigos Lisp");
        this.Codes.setLocationRelativeTo(null);
        this.javaAlg = new JavaAlgorithms();
        int pos2 = 0;
        String codigoLista = "";
        if(vent <= 74){
            pos2 = Integer.parseInt(data.getAlgoritmos().get(vent).get(3));
            codigoLista = data.getAlgoritmos().get(vent).get(2);
        }else{
            pos2 = Integer.parseInt(data2.getAlgoritmos().get(vent-74).get(3));
            codigoLista = data2.getAlgoritmos().get(vent-74).get(2);
        }
        pos = pos2;
        if(pos > 74){
            pos = pos - 74;
            opc = 1;
        }else{
            opc = 0;
            pos = pos2;
        }
        int tam = data.getPasos(opc).get(pos).get(1).size();
        Codes.CodigoFuente.setText("");
        PonerColor(Codes.CodigoFuente, codigoLista);
        Codes.numero.setText((vent+1)+"");
        this.Codes.Inicio.addActionListener((ActionEvent e) -> {
            Codes.dispose();
            home.setVisible(true);
            this.iniciar();
        });
        this.Codes.Menu.addActionListener((ActionEvent e) -> {
            Codes.dispose();
            menu.setVisible(true);
            this.Menus();
        });
        this.Codes.Algoritmos.addActionListener((ActionEvent e) -> {
            Codes.dispose(); 
            Algot.setVisible(true);
            this.Algorithms();
        });
        this.Codes.Run.addActionListener((ActionEvent e) -> {
            initCount();
            this.reads = new ArrayList<>();
            Codes.Explicacion.setText(Enun.getEnunciado(data.getPasos(opc).get(pos).get(0).get(this.count)));
            Codes.Variables.setText(data.getPasos(opc).get(pos).get(1).get(this.count));
            Codes.Resaltador(data.getPasos(opc).get(pos).get(1).get(this.count));
            Codes.Siguiente.setEnabled(true);
        });
        this.Codes.Siguiente.addActionListener((ActionEvent e) -> {
            setCount();
            if(this.count < tam){
                Codes.Explicacion.setText(Enun.getEnunciado(data.getPasos(opc).get(pos).get(0).get(this.count)));
                Codes.Resaltador(data.getPasos(opc).get(pos).get(1).get(this.count));
                Codes.Variables.setText(data.getPasos(opc).get(pos).get(1).get(this.count));
                if(data.getPasos(opc).get(pos).get(0).get(this.count).equals("Lectura")){
                    Codes.input.setEnabled(true);
                }else{
                    if(Codes.input.getText().equals("")){
                        //No hace nada
                    }else{
                        this.reads.add(Codes.input.getText());
                        Codes.input.setText("");
                        Codes.input.setEnabled(false);
                    }
                }
            }
            if(this.count == (tam - 1)){
                Codes.Salida.setText(this.javaAlg.getOut(vent, this.reads));
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
            Docs.setVisible(false);
            menu.setVisible(true);
            this.Menus();
        });
        this.Docs.comentarios.addActionListener((ActionEvent e) -> {
            Docs.setVisible(false);
            Comentario.setVisible(true);
            this.Comentarios();
        });
        this.Docs.matematicas.addActionListener((ActionEvent e) -> {
            Docs.setVisible(false);
            Mates.setVisible(true);
            this.Matematica();
        });
        this.Docs.logicas.addActionListener((ActionEvent e) -> {
            Docs.setVisible(false);
            condis.setVisible(true);
            this.Condicionales();
            
        });
        this.Docs.funciones.addActionListener((ActionEvent e) -> {
            Docs.setVisible(false);
            Func.setVisible(true);
            this.Functions();
        });
        this.Docs.control.addActionListener((ActionEvent e) -> {
            Docs.setVisible(false);
            Cicl.setVisible(true);
            Ciclo();
        });
    }
    
    public void Comentarios(){
        this.Comentario.setTitle("Comentarios Lisp");
        this.Comentario.setLocationRelativeTo(null);
        this.Comentario.Inicio.addActionListener((ActionEvent e) -> {
            Comentario.setVisible(false);
            home.setVisible(true);
            this.iniciar();
        });
        this.Comentario.Menu.addActionListener((ActionEvent e) -> {
            Comentario.setVisible(false);
            menu.setVisible(true);
            this.Menus();
        });
    }
    
    public void Matematica(){
        this.Mates.setTitle("Matematicas Lisp");
        this.Mates.setLocationRelativeTo(null);
        this.Mates.Inicio.addActionListener((ActionEvent e) -> {
            Mates.setVisible(false);
            home.setVisible(true);
            this.iniciar();
        });
        this.Mates.Menu.addActionListener((ActionEvent e) -> {
            Mates.setVisible(false);
            menu.setVisible(true);
            this.Menus();
        });
    }
    
    public void Condicionales(){
        this.condis.setTitle("Condicionales Lisp");
        this.condis.setLocationRelativeTo(null);
        this.condis.Inicio.addActionListener((ActionEvent e) -> {
            condis.setVisible(false);
            home.setVisible(true);
            this.iniciar();
        });
        this.condis.Menu.addActionListener((ActionEvent e) -> {
            condis.setVisible(false);
            menu.setVisible(true);
            this.Menus();
        });
    }
    
    public void Functions(){
        this.Func.setTitle("Funciones Lisp");
        this.Func.setLocationRelativeTo(null);
        this.Func.Inicio.addActionListener((ActionEvent e) -> {
            Func .setVisible(false);
            home.setVisible(true);
            this.iniciar();
        });
        this.Func.Menu.addActionListener((ActionEvent e) -> {
            Func.setVisible(false);
            menu.setVisible(true);
            this.Menus();
        });
    }
    
    public void Ciclo(){
        this.Cicl.setTitle("Ciclos Lisp");
        this.Cicl.setLocationRelativeTo(null);
        this.Cicl.Inicio.addActionListener((ActionEvent e) -> {
            Cicl .setVisible(false);
            home.setVisible(true);
            this.iniciar();
        });
        this.Cicl.Menu.addActionListener((ActionEvent e) -> {
            Cicl.setVisible(false);
            menu.setVisible(true);
            this.Menus();
        });
    }
    
    public void PonerColor(JTextPane modif, String str){
        //new Color(153,102,0) color cafe
        ChangeColor=new CuadroTexto();
        ChangeColor.setPrueva(modif);
        String an ="";    
        int d = 0;
        while(d < str.length()){
            if(str.charAt(d) == ';'){
                for(int i = d; i < str.length();i++){
                    if(str.charAt(d+1) != '('){
                        an += str.charAt(d);
                        d++;
                    }
                }
                ChangeColor.append(new Color(153,102,0), an);
                an = "";
            }
            if(str.charAt(d) == '#'){
                for(int i = d; i < str.length();i++){
                    if(str.charAt(d+1) != '('){
                        an += str.charAt(d);
                        d++;
                    }
                }
                ChangeColor.append(new Color(153,102,0), an);
                an = "";
            }
           if(str.charAt(d) == '('){
               ChangeColor.append(new Color(205, 92, 92), Character.toString(str.charAt(d)));
               d++;
               for(int i = d; i < str.length();i++){ 
                   if(d < str.length()){
                        if(str.charAt(d) == '('){
                            ChangeColor.append(new Color(205, 92, 92), Character.toString(str.charAt(d)));
                            d = (d++ < str.length())? d++ : d;
                            i = (i++ < str.length())? i++ : i;
                        }
                        if(str.charAt(d) == '/'){                               
                                ChangeColor.append(new Color(0, 128, 0), Character.toString(str.charAt(d)));
                                d = (d++ < str.length())? d++ : d;
                                i = (i++ < str.length())? i++ : i;
                        }
                        if(str.charAt(d) == '+'){                              
                                ChangeColor.append(new Color(0, 128, 0), Character.toString(str.charAt(d)));
                                d = (d++ < str.length())? d++ : d;
                                i = (i++ < str.length())? i++ : i;
                        }
                        if(str.charAt(d) == '-'){                                
                                ChangeColor.append(new Color(0, 128, 0), Character.toString(str.charAt(d)));
                                d = (d++ < str.length())? d++ : d;
                                i = (i++ < str.length())? i++ : i;
                        }
                        if(str.charAt(d) == '*'){                               
                                ChangeColor.append(new Color(0, 128, 0), Character.toString(str.charAt(d)));
                                d = (d++ < str.length())? d++ : d;
                                i = (i++ < str.length())? i++ : i;
                        }
                        if(str.charAt(d) == '~'){                               
                                ChangeColor.append(new Color(0, 128, 0), Character.toString(str.charAt(d)));
                                d = (d++ < str.length())? d++ : d;
                                i = (i++ < str.length())? i++ : i;
                                if(str.charAt(d) == 'd'){                                      
                                        ChangeColor.append(new Color(0, 128, 0), Character.toString(str.charAt(d)));
                                        d = (d++ < str.length())? d++ : d;
                                        i = (i++ < str.length())? i++ : i;
                                }
                                if(str.charAt(d) == 'a'){                                      
                                        ChangeColor.append(new Color(0, 128, 0), Character.toString(str.charAt(d)));
                                        d = (d++ < str.length())? d++ : d;
                                        i = (i++ < str.length())? i++ : i;
                                }
                                if(str.charAt(d) == 'c'){                                      
                                        ChangeColor.append(new Color(0, 128, 0), Character.toString(str.charAt(d)));
                                        d = (d++ < str.length())? d++ : d;
                                        i = (i++ < str.length())? i++ : i;
                                }
                        }
                        for(int z = 0; z<3;z++){
                            if(str.charAt(d) == '.'){                               
                                ChangeColor.append(new Color(0, 128, 0), Character.toString(str.charAt(d)));
                                d = (d++ < str.length())? d++ : d;
                                i = (i++ < str.length())? i++ : i;
                            }
                            for(int x = 0; x < str.length(); x++){
                                if(str.charAt(d) == '0'){                               
                                    ChangeColor.append(new Color(0, 128, 0), Character.toString(str.charAt(d)));
                                    d = (d++ < str.length())? d++ : d;
                                    i = (i++ < str.length())? i++ : i;
                                }
                            }
                            for(int x = 0; x < str.length(); x++){
                                if(str.charAt(d) == '1'){                               
                                    ChangeColor.append(new Color(0, 128, 0), Character.toString(str.charAt(d)));
                                    d = (d++ < str.length())? d++ : d;
                                    i = (i++ < str.length())? i++ : i;
                                }
                            }
                            for(int x = 0; x < str.length(); x++){
                                if(str.charAt(d) == '2'){                               
                                    ChangeColor.append(new Color(0, 128, 0), Character.toString(str.charAt(d)));
                                    d = (d++ < str.length())? d++ : d;
                                    i = (i++ < str.length())? i++ : i;
                                }
                            }
                            for(int x = 0; x < str.length(); x++){
                                if(str.charAt(d) == '3'){                               
                                    ChangeColor.append(new Color(0, 128, 0), Character.toString(str.charAt(d)));
                                    d = (d++ < str.length())? d++ : d;
                                    i = (i++ < str.length())? i++ : i;
                                }
                            }
                            for(int x = 0; x < str.length(); x++){
                                if(str.charAt(d) == '4'){                               
                                    ChangeColor.append(new Color(0, 128, 0), Character.toString(str.charAt(d)));
                                    d = (d++ < str.length())? d++ : d;
                                    i = (i++ < str.length())? i++ : i;
                                }
                            }
                            for(int x = 0; x < str.length(); x++){
                                if(str.charAt(d) == '5'){                               
                                    ChangeColor.append(new Color(0, 128, 0), Character.toString(str.charAt(d)));
                                    d = (d++ < str.length())? d++ : d;
                                    i = (i++ < str.length())? i++ : i;
                                }
                            }
                            for(int x = 0; x < str.length(); x++){
                                if(str.charAt(d) == '6'){                               
                                    ChangeColor.append(new Color(0, 128, 0), Character.toString(str.charAt(d)));
                                    d = (d++ < str.length())? d++ : d;
                                    i = (i++ < str.length())? i++ : i;
                                }
                            }
                            for(int x = 0; x < str.length(); x++){
                                if(str.charAt(d) == '7'){                               
                                    ChangeColor.append(new Color(0, 128, 0), Character.toString(str.charAt(d)));
                                    d = (d++ < str.length())? d++ : d;
                                    i = (i++ < str.length())? i++ : i;
                                }
                            }
                            for(int x = 0; x < str.length(); x++){
                                if(str.charAt(d) == '8'){                               
                                    ChangeColor.append(new Color(0, 128, 0), Character.toString(str.charAt(d)));
                                    d = (d++ < str.length())? d++ : d;
                                    i = (i++ < str.length())? i++ : i;
                                }
                            }
                            for(int x = 0; x < str.length(); x++){
                                if(str.charAt(d) == '9'){                               
                                    ChangeColor.append(new Color(0, 128, 0), Character.toString(str.charAt(d)));
                                    d = (d++ < str.length())? d++ : d;
                                    i = (i++ < str.length())? i++ : i;
                                }
                            }
                       }
                   }
                   if(d < str.length()){
                       for(int b = d; b < str.length();b++){
                            if(str.charAt(d) == ')'){
                                ChangeColor.append(new Color(205, 92, 92), Character.toString(str.charAt(d)));
                                d = (d++ < str.length())? d++ : d;
                                i = (i++ < str.length())? i++ : i;
                            }
                        }
                   }
                   
                   if(d < str.length()){
                       ChangeColor.append(new Color(25, 25, 112), Character.toString(str.charAt(d)));
                   }
                   d++;
                }
                an = "";
           }
           d++;
        }     
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
