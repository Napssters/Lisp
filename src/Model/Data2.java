/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nico
 */
public class Data2 {
    private final List<List<String>> algoritmos;
    private final List<List<List<String>>> pasos;
    
    public Data2() {
        this.algoritmos = new ArrayList<>();
        this.pasos = new ArrayList<>();
        CreateList();
    }
    
    private void CreateList(){
        for(int i = 0; i < 101; i++){
            this.algoritmos.add(new ArrayList<>());
            this.pasos.add(new ArrayList<>());
            this.pasos.get(i).add(new ArrayList<>());
            this.pasos.get(i).add(new ArrayList<>());
        }
        ////////////////   76    /////////////////
        this.algoritmos.get(1).add("#|\nConstruir un algoritmo en Lisp que almacene\nla seria de fibonacci en un vector. \n|#");
        this.algoritmos.get(1).add("Funcion FibonacciVector\n    inicializar numeros = hacer-vector 1 (0)\n    inicializar n1 = 0\n    inicializar n2 = 1\n    inicializar n3 = 0\n    agregar(nuemro, n2)\n    desde i = 0 hasta 10 hacer:\n           n3 = n1 + n2\n           agregar(nuemro, n3)\n           imprimir n3\n           n1 = n2\n           n2 = n3\n    imprimir \"El vector es: \", nuemros\n    \nllamar Funcion FibonacciVector");
        this.algoritmos.get(1).add("(defun FibonacciVector()\n    (setq nuemros (make-vector 1 (0)))\n    (setq n1 0)\n    (setq n2 1)\n    (setq n3 0)\n    (append numeros n2)\n    (println n2)\n    (loop for i from 0 to 10\n        do(set n3 (+ n1 n2))\n        do(append numeros n3)\n        do(set n1 n2)\n        do(set n2 n3)\n	)\n    (print \"El vector es: ~d\" nuemros)\n)\n\n(FibonacciVector)");
        this.algoritmos.get(1).add("75");
        this.pasos.get(1).get(0).add("Llamado");
        this.pasos.get(1).get(0).add("Funcion");
        this.pasos.get(1).get(0).add("Asignación");
        this.pasos.get(1).get(0).add("hacervector");
        this.pasos.get(1).get(0).add("Asignación");
        this.pasos.get(1).get(0).add("Asignación");
        this.pasos.get(1).get(0).add("Asignación");
        this.pasos.get(1).get(0).add("añadir");
        this.pasos.get(1).get(0).add("Impresión");
        this.pasos.get(1).get(0).add("for");
        this.pasos.get(1).get(0).add("Actualizar");
        this.pasos.get(1).get(0).add("añadir");
        this.pasos.get(1).get(0).add("Actualizar");
        this.pasos.get(1).get(0).add("Actualizar");
        this.pasos.get(1).get(0).add("for");
        this.pasos.get(1).get(0).add("Actualizar");
        this.pasos.get(1).get(0).add("añadir");
        this.pasos.get(1).get(0).add("Actualizar");
        this.pasos.get(1).get(0).add("Actualizar");
        this.pasos.get(1).get(0).add("for");
        this.pasos.get(1).get(0).add("Actualizar");
        this.pasos.get(1).get(0).add("añadir");
        this.pasos.get(1).get(0).add("Actualizar");
        this.pasos.get(1).get(0).add("Actualizar");
        this.pasos.get(1).get(0).add("Impresión");
        /////////////////////////////////
        this.pasos.get(1).get(1).add("(FibonacciVector)");
        this.pasos.get(1).get(1).add("(defun FibonacciVector()");
        this.pasos.get(1).get(1).add("(setq nuemros (make-vector 1 (0)))");
        this.pasos.get(1).get(1).add("(setq n1 0)");
        this.pasos.get(1).get(1).add("(setq n2 1)");
        this.pasos.get(1).get(1).add("(setq n3 0)");
        this.pasos.get(1).get(1).add("(append numeros n2)");
        this.pasos.get(1).get(1).add("(println n2)");
        this.pasos.get(1).get(1).add("(loop for i from 0 to 10");
        this.pasos.get(1).get(1).add("do(set n3 (+ n1 n2))");
        this.pasos.get(1).get(1).add("do(append numeros n3)");
        this.pasos.get(1).get(1).add("do(set n1 n2)");
        this.pasos.get(1).get(1).add("do(set n2 n3)");
        this.pasos.get(1).get(1).add("(loop for i from 0 to 10");
        this.pasos.get(1).get(1).add("do(set n3 (+ n1 n2))");
        this.pasos.get(1).get(1).add("do(append numeros n3)");
        this.pasos.get(1).get(1).add("do(set n1 n2)");
        this.pasos.get(1).get(1).add("do(set n2 n3)");
        this.pasos.get(1).get(1).add("(loop for i from 0 to 10");
        this.pasos.get(1).get(1).add("do(set n3 (+ n1 n2))");
        this.pasos.get(1).get(1).add("do(append numeros n3)");
        this.pasos.get(1).get(1).add("do(set n1 n2)");
        this.pasos.get(1).get(1).add("do(set n2 n3)");
        this.pasos.get(1).get(1).add("(print \"El vector es: ~d\" nuemros)")
        ;////////////////   77    /////////////////
        this.algoritmos.get(2).add("#|\nConstruir un algoritmo en Lisp que sume\ntodos  los  números primos  de un vector\npreviamente  llenado  con   numeros   del \n1 al 10.\n|#");
        this.algoritmos.get(2).add("Funcion SumaPrimosVector\n    inicializar nuemros = hacer-vector(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)\n    inicializar sum = 0\n    desde i = 1 hasta 10 hacer:\n        desde j = 1 hasta 10 hacer:\n            si (modulo(nuemros[i], j) != 0)\n                sum = sum + nuemros[i]\n    imprimir \"Suma primos: \", sum\n\nllamar Funcion SumaPrimosVector");
        this.algoritmos.get(2).add("(defun SumaPrimosVector()\n (setq nuemros \n    (1 2 3 4 5 6 7 8 9 10)\n  )\n  (setq sum 0)\n  (loop for i from 1 to 10\n    do(loop for j from 1 to 10\n      do(if(!= remainder((vector-ref nuemros i)j)0)\n          (set sum (+ sum (vector-ref nuemros i)))\n        )\n     )\n   )\n   (print \"Suma primos: ~d\" sum)\n)\n\n(SumaPrimosVector)");
        this.algoritmos.get(2).add("76");
        this.pasos.get(2).get(0).add("Llamado");
        this.pasos.get(2).get(0).add("Funcion");
        this.pasos.get(2).get(0).add("Asignación");
        this.pasos.get(2).get(0).add("Asignación");
        this.pasos.get(2).get(0).add("for");
        this.pasos.get(2).get(0).add("for");
        this.pasos.get(2).get(0).add("Condicional");
        this.pasos.get(2).get(0).add("Actualizar");
        this.pasos.get(2).get(0).add("for");
        this.pasos.get(2).get(0).add("for");
        this.pasos.get(2).get(0).add("Condicional");
        this.pasos.get(2).get(0).add("Actualizar");
        this.pasos.get(2).get(0).add("for");
        this.pasos.get(2).get(0).add("for");
        this.pasos.get(2).get(0).add("Condicional");
        this.pasos.get(2).get(0).add("Actualizar");
        this.pasos.get(2).get(0).add("Impresión");
        /////////////////////////////////
        this.pasos.get(2).get(1).add("(SumaPrimosVector)");
        this.pasos.get(2).get(1).add("(defun SumaPrimosVector()");
        this.pasos.get(2).get(1).add("(setq nuemros ");
        this.pasos.get(2).get(1).add("(setq sum 0)");
        this.pasos.get(2).get(1).add("(loop for i from 1 to 10");
        this.pasos.get(2).get(1).add("do(loop for j from 1 to 10");
        this.pasos.get(2).get(1).add("do(if(!= remainder((vector-ref nuemros i)j)0)");
        this.pasos.get(2).get(1).add("(set sum (+ sum (vector-ref nuemros i)))");
        this.pasos.get(2).get(1).add("(loop for i from 1 to 10");
        this.pasos.get(2).get(1).add("do(loop for j from 1 to 10");
        this.pasos.get(2).get(1).add("do(if(!= remainder((vector-ref nuemros i)j)0)");
        this.pasos.get(2).get(1).add("(set sum (+ sum (vector-ref nuemros i)))");
        this.pasos.get(2).get(1).add("(loop for i from 1 to 10");
        this.pasos.get(2).get(1).add("do(loop for j from 1 to 10");
        this.pasos.get(2).get(1).add("do(if(!= remainder((vector-ref nuemros i)j)0)");
        this.pasos.get(2).get(1).add("(set sum (+ sum (vector-ref nuemros i)))");
        this.pasos.get(2).get(1).add("(print \"Suma primos: ~d\" sum)")
        ;////////////////   78    /////////////////
        this.algoritmos.get(3).add("#|\nConstruir un algoritmo en Lisp que almacene\nen  un  vecotr  secundario los numeros pares\ncontenidos en un vector de 10 elementos.\n|#");
        this.algoritmos.get(3).add("Funcion ParesVector\n    inicializar nuemros = hacer-vector(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)\n    inicializar pares = hacer-vector()\n    desde i = 1 hasta 10 hacer:\n        si (modulo(nuemros[i], 2) = 0)\n            agregar(pares, nuemros[i])\n    imprimir \"Vector pares: \", pares\n\nllamar Funcion ParesVector");
        this.algoritmos.get(3).add("(defun ParesVector()\n  (setq nuemros \n     (1 2 3 4 5 6 7 8 9 10)\n  )\n  (setq pares (make-vector))\n  (loop for i from 1 to 10\n    do(loop for j from 1 to 10\n      do(if (= remainder((vector-ref nuemros i)2)0)\n            (append pares (vector-ref nuemros i))\n        )\n     )\n   )\n   (print \"Vector pares: ~d\" pares)\n)\n\n(ParesVector)");
        this.algoritmos.get(3).add("77");
        this.pasos.get(3).get(0).add("Llamado");
        this.pasos.get(3).get(0).add("Funcion");
        this.pasos.get(3).get(0).add("Asignación");
        this.pasos.get(3).get(0).add("hacervector");
        this.pasos.get(3).get(0).add("for");
        this.pasos.get(3).get(0).add("for");
        this.pasos.get(3).get(0).add("Condicional");
        this.pasos.get(3).get(0).add("añadir");
        this.pasos.get(3).get(0).add("for");
        this.pasos.get(3).get(0).add("for");
        this.pasos.get(3).get(0).add("Condicional");
        this.pasos.get(3).get(0).add("añadir");
        this.pasos.get(3).get(0).add("Impresión");
        /////////////////////////////////
        this.pasos.get(3).get(1).add("(ParesVector)");
        this.pasos.get(3).get(1).add("(defun ParesVector()");
        this.pasos.get(3).get(1).add("(setq nuemros ");
        this.pasos.get(3).get(1).add("(setq pares (make-vector))");
        this.pasos.get(3).get(1).add("(loop for i from 1 to 10");
        this.pasos.get(3).get(1).add("do(loop for j from 1 to 10");
        this.pasos.get(3).get(1).add("do(if (= remainder((vector-ref nuemros i)2)0)");
        this.pasos.get(3).get(1).add("(append pares (vector-ref nuemros i))");
        this.pasos.get(3).get(1).add("(loop for i from 1 to 10");
        this.pasos.get(3).get(1).add("do(loop for j from 1 to 10");
        this.pasos.get(3).get(1).add("do(if (= remainder((vector-ref nuemros i)2)0)");
        this.pasos.get(3).get(1).add("(append pares (vector-ref nuemros i))");
        this.pasos.get(3).get(1).add("(print \"Vector pares: ~d\" pares)")
        ;////////////////   79    /////////////////
        this.algoritmos.get(4).add("#|\nConstruir  un  algoritmo  en Lisp donde se\nalmacenen   datos  en  un vector de fomra\naleatoria , y reciba un número X y escriba \nen  la  pantalla   todos  los  índices  de  las \nposiciones   del   arreglo   donde   está  X. \nPor    ejemplo,   si   el  arreglo  e s el  que \naparece   enseguida   y   X   es   2:\n             a. 1-2-3-100-23-2-2-1\n        b. escribir: 1 5 6 (INDICES).\n|#");
        this.algoritmos.get(4).add("Funcion Indices\n    inicializar numeros = hacer-vector 10 (random(5))\n    desde i = 0 hasta 10 hacer:\n        si(numeros[i] = num)\n            imprimir i\n    imprimir \" INDICES\"\n\nllamar Funcion Indices");
        this.algoritmos.get(4).add("(defun Indices()\n    (print \"Ingrese un numero: \")\n    (setq num (read))\n    (setq nuemros (make-vector 10 (random 5)))\n    (loop for i from 1 to 10\n        do(if(= (vector-ref numeros i) num)\n             (print i)\n        )\n    )\n    (print \" INDICES\")\n)\n\n(Indices)");
        this.algoritmos.get(4).add("78");
        this.pasos.get(4).get(0).add("Llamado");
        this.pasos.get(4).get(0).add("Funcion");
        this.pasos.get(4).get(0).add("Impresión");
        this.pasos.get(4).get(0).add("Lectura");
        this.pasos.get(4).get(0).add("Asignación");
        this.pasos.get(4).get(0).add("for");
        this.pasos.get(4).get(0).add("Condicional");
        this.pasos.get(4).get(0).add("Impresión");
        this.pasos.get(4).get(0).add("for");
        this.pasos.get(4).get(0).add("Condicional");
        this.pasos.get(4).get(0).add("Impresión");
        this.pasos.get(4).get(0).add("for");
        this.pasos.get(4).get(0).add("Condicional");
        this.pasos.get(4).get(0).add("Impresión");
        this.pasos.get(4).get(0).add("Impresión");
        /////////////////////////////////
        this.pasos.get(4).get(1).add("(Indices)");
        this.pasos.get(4).get(1).add("(defun Indices()");
        this.pasos.get(4).get(1).add("(print \"Ingrese un numero: \")");
        this.pasos.get(4).get(1).add("(setq num (read))");
        this.pasos.get(4).get(1).add("(setq nuemros (make-vector 10 (random 5)))");
        this.pasos.get(4).get(1).add("(loop for i from 1 to 10");
        this.pasos.get(4).get(1).add("do(if(= (vector-ref numeros i) num)");
        this.pasos.get(4).get(1).add("(print i)");
        this.pasos.get(4).get(1).add("(loop for i from 1 to 10");
        this.pasos.get(4).get(1).add("do(if(= (vector-ref numeros i) num)");
        this.pasos.get(4).get(1).add("(print i)");
        this.pasos.get(4).get(1).add("(loop for i from 1 to 10");
        this.pasos.get(4).get(1).add("do(if(= (vector-ref numeros i) num)");
        this.pasos.get(4).get(1).add("(print i)");
        this.pasos.get(4).get(1).add("(print \" INDICES\")")
        ;////////////////   80    /////////////////
        this.algoritmos.get(5).add("#|\nConstruir un algoritmo en Lisp que Sume de\nun   vector   todos   los   números negativos\npares. \n|#");
        this.algoritmos.get(5).add("Funcion SumaNegativos\n    inicializar nuemros = hacer-vector(3, -2, 6, 5, -4, -8, 2, -1)\n    inicializar pares = hacer-vector()\n    suma = 0\n    desde i = 1 hasta 10 hacer:\n        si(nuemros[i] < 0)\n            si(modulo(nuemros[i], 2) = 0)\n                suma = suma + nuemros[i]\n    imprimir \"La suma es: \", suma\n\nllamar Funcion SumaNegativos");
        this.algoritmos.get(5).add("(defun SumaNegativos()\n (setq nuemros \n   (3 -2 6 5 -4 -8 2 -1)\n )\n (setq suma 0)\n (loop for i from 1 to 10\n  do(loop for j from 1 to 10\n    do(if(< (vector-ref nuemros i) 0)\n        (if (= remainder((vector-ref nuemros i)2)0)\n           (set suma(+ suma(vector-ref nuemros i)))\n         )\n      )\n    )\n  )\n  (print \"La suma es:  ~d\" suma)\n)\n\n(SumaNegativos)");
        this.algoritmos.get(5).add("79");
        this.pasos.get(5).get(0).add("Llamado");
        this.pasos.get(5).get(0).add("Funcion");
        this.pasos.get(5).get(0).add("Asignación");
        this.pasos.get(5).get(0).add("Asignación");
        this.pasos.get(5).get(0).add("for");
        this.pasos.get(5).get(0).add("for");
        this.pasos.get(5).get(0).add("Condicional");
        this.pasos.get(5).get(0).add("CondiAnidado");
        this.pasos.get(5).get(0).add("Actualizar");
        this.pasos.get(5).get(0).add("for");
        this.pasos.get(5).get(0).add("for");
        this.pasos.get(5).get(0).add("Condicional");
        this.pasos.get(5).get(0).add("CondiAnidado");
        this.pasos.get(5).get(0).add("Actualizar");
        this.pasos.get(5).get(0).add("Impresión");
        /////////////////////////////////
        this.pasos.get(5).get(1).add("(SumaNegativos)");
        this.pasos.get(5).get(1).add("(defun SumaNegativos()");
        this.pasos.get(5).get(1).add("(setq nuemros ");
        this.pasos.get(5).get(1).add("(setq suma 0)");
        this.pasos.get(5).get(1).add("(loop for i from 1 to 10");
        this.pasos.get(5).get(1).add("do(loop for j from 1 to 10");
        this.pasos.get(5).get(1).add("do(if(< (vector-ref nuemros i) 0)");
        this.pasos.get(5).get(1).add("(if (= remainder((vector-ref nuemros i)2)0)");
        this.pasos.get(5).get(1).add("(set suma(+ suma(vector-ref nuemros i)))");
        this.pasos.get(5).get(1).add("(loop for i from 1 to 10");
        this.pasos.get(5).get(1).add("do(loop for j from 1 to 10");
        this.pasos.get(5).get(1).add("do(if(< (vector-ref nuemros i) 0)");
        this.pasos.get(5).get(1).add("(if (= remainder((vector-ref nuemros i)2)0)");
        this.pasos.get(5).get(1).add("(set suma(+ suma(vector-ref nuemros i)))");
        this.pasos.get(5).get(1).add("(print \"La suma es:  ~d\" suma)");
        ////////////////   81    /////////////////
        this.algoritmos.get(6).add("");
        this.algoritmos.get(6).add("");
        this.algoritmos.get(6).add("");
        this.algoritmos.get(6).add("80");
        this.pasos.get(6).get(0).add("");
        this.pasos.get(6).get(0).add("");
        this.pasos.get(6).get(0).add("");
        /////////////////////////////////
        this.pasos.get(6).get(1).add("");
        this.pasos.get(6).get(1).add("");
        this.pasos.get(6).get(1).add("")
        ;////////////////   82    /////////////////
        this.algoritmos.get(7).add("");
        this.algoritmos.get(7).add("");
        this.algoritmos.get(7).add("");
        this.algoritmos.get(7).add("81");
        this.pasos.get(7).get(0).add("");
        this.pasos.get(7).get(0).add("");
        this.pasos.get(7).get(0).add("");
        /////////////////////////////////
        this.pasos.get(7).get(1).add("");
        this.pasos.get(7).get(1).add("");
        this.pasos.get(7).get(1).add("")
        ;////////////////   83    /////////////////
        this.algoritmos.get(8).add("");
        this.algoritmos.get(8).add("");
        this.algoritmos.get(8).add("");
        this.algoritmos.get(8).add("82");
        this.pasos.get(8).get(0).add("");
        this.pasos.get(8).get(0).add("");
        this.pasos.get(8).get(0).add("");
        /////////////////////////////////
        this.pasos.get(8).get(1).add("");
        this.pasos.get(8).get(1).add("");
        this.pasos.get(8).get(1).add("")
        ;////////////////   84    /////////////////
        this.algoritmos.get(9).add("");
        this.algoritmos.get(9).add("");
        this.algoritmos.get(9).add("");
        this.algoritmos.get(9).add("83");
        this.pasos.get(9).get(0).add("");
        this.pasos.get(9).get(0).add("");
        this.pasos.get(9).get(0).add("");
        /////////////////////////////////
        this.pasos.get(9).get(1).add("");
        this.pasos.get(9).get(1).add("");
        this.pasos.get(9).get(1).add("")
        ;////////////////   85    /////////////////
        this.algoritmos.get(10).add("");
        this.algoritmos.get(10).add("");
        this.algoritmos.get(10).add("");
        this.algoritmos.get(10).add("84");
        this.pasos.get(10).get(0).add("");
        this.pasos.get(10).get(0).add("");
        this.pasos.get(10).get(0).add("");
        /////////////////////////////////
        this.pasos.get(10).get(1).add("");
        this.pasos.get(10).get(1).add("");
        this.pasos.get(10).get(1).add("")
        ;////////////////   86    /////////////////
        this.algoritmos.get(11).add("");
        this.algoritmos.get(11).add("");
        this.algoritmos.get(11).add("");
        this.algoritmos.get(11).add("85");
        this.pasos.get(11).get(0).add("");
        this.pasos.get(11).get(0).add("");
        this.pasos.get(11).get(0).add("");
        /////////////////////////////////
        this.pasos.get(11).get(1).add("");
        this.pasos.get(11).get(1).add("");
        this.pasos.get(11).get(1).add("")
        ;////////////////   87    /////////////////
        this.algoritmos.get(12).add("");
        this.algoritmos.get(12).add("");
        this.algoritmos.get(12).add("");
        this.algoritmos.get(12).add("86");
        this.pasos.get(12).get(0).add("");
        this.pasos.get(12).get(0).add("");
        this.pasos.get(12).get(0).add("");
        /////////////////////////////////
        this.pasos.get(12).get(1).add("");
        this.pasos.get(12).get(1).add("");
        this.pasos.get(12).get(1).add("")
        ;////////////////   88    /////////////////
        this.algoritmos.get(13).add("");
        this.algoritmos.get(13).add("");
        this.algoritmos.get(13).add("");
        this.algoritmos.get(13).add("87");
        this.pasos.get(13).get(0).add("");
        this.pasos.get(13).get(0).add("");
        this.pasos.get(13).get(0).add("");
        /////////////////////////////////
        this.pasos.get(13).get(1).add("");
        this.pasos.get(13).get(1).add("");
        this.pasos.get(13).get(1).add("")
        ;////////////////   89    /////////////////
        this.algoritmos.get(14).add("");
        this.algoritmos.get(14).add("");
        this.algoritmos.get(14).add("");
        this.algoritmos.get(14).add("88");
        this.pasos.get(14).get(0).add("");
        this.pasos.get(14).get(0).add("");
        this.pasos.get(14).get(0).add("");
        /////////////////////////////////
        this.pasos.get(14).get(1).add("");
        this.pasos.get(14).get(1).add("");
        this.pasos.get(14).get(1).add("")
        ;////////////////   90    /////////////////
        this.algoritmos.get(15).add("");
        this.algoritmos.get(15).add("");
        this.algoritmos.get(15).add("");
        this.algoritmos.get(15).add("89");
        this.pasos.get(15).get(0).add("");
        this.pasos.get(15).get(0).add("");
        this.pasos.get(15).get(0).add("");
        /////////////////////////////////
        this.pasos.get(15).get(1).add("");
        this.pasos.get(15).get(1).add("");
        this.pasos.get(15).get(1).add("")
        ;////////////////   91    /////////////////
        this.algoritmos.get(16).add("");
        this.algoritmos.get(16).add("");
        this.algoritmos.get(16).add("");
        this.algoritmos.get(16).add("90");
        this.pasos.get(16).get(0).add("");
        this.pasos.get(16).get(0).add("");
        this.pasos.get(16).get(0).add("");
        /////////////////////////////////
        this.pasos.get(16).get(1).add("");
        this.pasos.get(16).get(1).add("");
        this.pasos.get(16).get(1).add("")
        ;////////////////   92    /////////////////
        this.algoritmos.get(17).add("");
        this.algoritmos.get(17).add("");
        this.algoritmos.get(17).add("");
        this.algoritmos.get(17).add("91");
        this.pasos.get(17).get(0).add("");
        this.pasos.get(17).get(0).add("");
        this.pasos.get(17).get(0).add("");
        /////////////////////////////////
        this.pasos.get(17).get(1).add("");
        this.pasos.get(17).get(1).add("");
        this.pasos.get(17).get(1).add("")
        ;////////////////   93    /////////////////
        this.algoritmos.get(18).add("");
        this.algoritmos.get(18).add("");
        this.algoritmos.get(18).add("");
        this.algoritmos.get(18).add("92");
        this.pasos.get(18).get(0).add("");
        this.pasos.get(18).get(0).add("");
        this.pasos.get(18).get(0).add("");
        /////////////////////////////////
        this.pasos.get(18).get(1).add("");
        this.pasos.get(18).get(1).add("");
        this.pasos.get(18).get(1).add("")
        ;////////////////   94    /////////////////
        this.algoritmos.get(19).add("");
        this.algoritmos.get(19).add("");
        this.algoritmos.get(19).add("");
        this.algoritmos.get(19).add("93");
        this.pasos.get(19).get(0).add("");
        this.pasos.get(19).get(0).add("");
        this.pasos.get(19).get(0).add("");
        /////////////////////////////////
        this.pasos.get(19).get(1).add("");
        this.pasos.get(19).get(1).add("");
        this.pasos.get(19).get(1).add("")
        ;////////////////   95    /////////////////
        this.algoritmos.get(20).add("");
        this.algoritmos.get(20).add("");
        this.algoritmos.get(20).add("");
        this.algoritmos.get(20).add("94");
        this.pasos.get(20).get(0).add("");
        this.pasos.get(20).get(0).add("");
        this.pasos.get(20).get(0).add("");
        /////////////////////////////////
        this.pasos.get(20).get(1).add("");
        this.pasos.get(20).get(1).add("");
        this.pasos.get(20).get(1).add("")
        ;////////////////   96    /////////////////
        this.algoritmos.get(21).add("");
        this.algoritmos.get(21).add("");
        this.algoritmos.get(21).add("");
        this.algoritmos.get(21).add("95");
        this.pasos.get(21).get(0).add("");
        this.pasos.get(21).get(0).add("");
        this.pasos.get(21).get(0).add("");
        /////////////////////////////////
        this.pasos.get(21).get(1).add("");
        this.pasos.get(21).get(1).add("");
        this.pasos.get(21).get(1).add("")
        ;////////////////   97    /////////////////
        this.algoritmos.get(22).add("");
        this.algoritmos.get(22).add("");
        this.algoritmos.get(22).add("");
        this.algoritmos.get(22).add("96");
        this.pasos.get(22).get(0).add("");
        this.pasos.get(22).get(0).add("");
        this.pasos.get(22).get(0).add("");
        /////////////////////////////////
        this.pasos.get(22).get(1).add("");
        this.pasos.get(22).get(1).add("");
        this.pasos.get(22).get(1).add("")
        ;////////////////   98    /////////////////
        this.algoritmos.get(23).add("");
        this.algoritmos.get(23).add("");
        this.algoritmos.get(23).add("");
        this.algoritmos.get(23).add("97");
        this.pasos.get(23).get(0).add("");
        this.pasos.get(23).get(0).add("");
        this.pasos.get(23).get(0).add("");
        /////////////////////////////////
        this.pasos.get(23).get(1).add("");
        this.pasos.get(23).get(1).add("");
        this.pasos.get(23).get(1).add("")
        ;////////////////   99    /////////////////
        this.algoritmos.get(24).add("");
        this.algoritmos.get(24).add("");
        this.algoritmos.get(24).add("");
        this.algoritmos.get(24).add("98");
        this.pasos.get(24).get(0).add("");
        this.pasos.get(24).get(0).add("");
        this.pasos.get(24).get(0).add("");
        /////////////////////////////////
        this.pasos.get(24).get(1).add("");
        this.pasos.get(24).get(1).add("");
        this.pasos.get(24).get(1).add("")
        ;////////////////   100    /////////////////
        this.algoritmos.get(25).add("");
        this.algoritmos.get(25).add("");
        this.algoritmos.get(25).add("");
        this.algoritmos.get(25).add("99");
        this.pasos.get(25).get(0).add("");
        this.pasos.get(25).get(0).add("");
        this.pasos.get(25).get(0).add("");
        /////////////////////////////////
        this.pasos.get(25).get(1).add("");
        this.pasos.get(25).get(1).add("");
        this.pasos.get(25).get(1).add("");
        /*
        ////////////////   N    /////////////////
        this.algoritmos.get(posn).add("");
        this.algoritmos.get(posn).add("");
        this.algoritmos.get(posn).add("");
        this.algoritmos.get(posn).add("");
        this.pasos.get(posn).get(0).add("");
        this.pasos.get(posn).get(0).add("");
        this.pasos.get(posn).get(0).add("");
        /////////////////////////////////
        this.pasos.get(posn).get(1).add("");
        this.pasos.get(posn).get(1).add("");
        this.pasos.get(posn).get(1).add("");
        */
    }

    public List<List<String>> getAlgoritmos() {
        return algoritmos;
    }

    public List<List<List<String>>> getPasos() {
        return pasos;
    }
}
