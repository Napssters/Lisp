/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import java.util.*;

/**
 *
 * @author Nico
 */
public class Data {
    private final List<List<String>> algoritmos;
    private final List<List<List<String>>> pasos;
    
    public Data() {
        this.algoritmos = new ArrayList<>();
        this.pasos = new ArrayList<>();
        CreateList();
    }
    
    private void CreateList(){
        for(int i = 0; i < 101; i++){
            this.algoritmos.add(new ArrayList<>());
            this.pasos.add(new ArrayList<>());
            this.pasos.get(i).add(new ArrayList<>());
        }
        this.algoritmos.get(0).add("#|\nConstruir un algoritmo en Lisp que calcule\nla  suma  de  la  resta  de  (a – b)  y (c -d),\ndonde a, b, c y d son  iguales  a  3, 7, 1, 9.\n|#");
        this.algoritmos.get(0).add("definir a = 3\ndefinir b = 7\ndefinir c = 1\ndefinir d = 9\ndefinir suma = (a - b) + (c - d)\n");
        this.algoritmos.get(0).add("(defvar a 3)(defvar b 7)\n(defvar c 1)(defvar d 9)\n(defvar suma (+ (- a b) (- c d)))");
        this.algoritmos.get(0).add("0");
        this.pasos.get(0).get(0).add("Asignación");
        this.pasos.get(0).get(0).add("Suma");
        this.pasos.get(0).get(0).add("Resta");
        /////////////////////////////////
        /*this.pasos.get(0).get(1).add("(defvar a 3)(defvar b 7)");
        this.pasos.get(0).get(1).add("(+ (- a b) (- c d)))");
        this.pasos.get(0).get(1).add("(- a b)");*/
    }
    
    public List<List<String>> getAlgoritmos() {
        return algoritmos;
    }

    public List<List<List<String>>> getPasos() {
        return pasos;
    }
}
