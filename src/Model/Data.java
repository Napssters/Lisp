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
            this.pasos.get(i).add(new ArrayList<>());
        }
        this.algoritmos.get(0).add("#|\nConstruir un algoritmo en Lisp que calcule\nla  suma  de  la  resta  de  (a – b)  y (c -d),\ndonde a, b, c y d son  iguales  a  3, 7, 1, 9.\n|#");
        this.algoritmos.get(0).add("definir a = 3\ndefinir b = 7\ndefinir c = 1\ndefinir d = 9\ndefinir suma = (a - b) + (c - d)\n");
        this.algoritmos.get(0).add("(defvar a 3)(defvar b 7)\n(defvar c 1)(defvar d 9)\n(defvar suma (+ (- a b) (- c d)))");
        this.algoritmos.get(0).add("0");
        this.pasos.get(0).get(0).add("Defvar");
        this.pasos.get(0).get(0).add("Suma");
        this.pasos.get(0).get(0).add("Resta");
        /////////////////////////////////
        this.pasos.get(0).get(1).add("(defvar a 3)(defvar b 7)");
        this.pasos.get(0).get(1).add("(+ (- a b) (- c d)))");
        this.pasos.get(0).get(1).add("(- a b)");
        ////////////////   2    /////////////////
        this.algoritmos.get(1).add("#|\nConstruir un algoritmo en Lisp que eleve el\nnumero 8 a la potencia 3, luego dividir por\n(2 * 7).\n|#");
        this.algoritmos.get(1).add("definir pot = (potencia 8, 3)\ndefinir div = (pot / (2 * 7))");
        this.algoritmos.get(1).add("(defvar pot (expt 8 3))\n(defvar div (/ pot (* 2 7)))");
        this.algoritmos.get(1).add("1");
        this.pasos.get(1).get(0).add("Defvar");
        this.pasos.get(1).get(0).add("Expt");
        this.pasos.get(1).get(0).add("Div");
        this.pasos.get(1).get(0).add("Mult");
        /////////////////////////////////
        this.pasos.get(1).get(1).add("(defvar pot (expt 8 3))");
        this.pasos.get(1).get(1).add("(expt 8 3)");
        this.pasos.get(1).get(1).add("(/ pot (* 2 7))");
        this.pasos.get(1).get(1).add("(* 2 7)");
        ////////////////   3    /////////////////
        this.algoritmos.get(2).add("#|\nCrear un programa en Lisp que sume dos\nnúmeros  los  cuales  son  ingresados por\nconsola,  luego  imprimir  el resultado de\ndicha suma.\n|#");
        this.algoritmos.get(2).add("funciion Suma\n  imrpimir \"Ingrese el valor de a\"\n  inicializar a = (valor por consola)\n  imrpimir \"Ingrese el valor de b\"\n  inicializar b = (valor por consola)\n  imrpimir \"La suma es: \", (a + b)\n\nllamar funcion Suma");
        this.algoritmos.get(2).add("(defun Suma()\n  (print \"ingrese el valor de a\")\n  (setq a (read))\n  (print \"ingrese el valor de b\")\n  (setq b (read))\n  (print \"La suma es: ~d\" (+ a b))\n)\n\n(Suma)");
        this.algoritmos.get(2).add("2");
        this.pasos.get(2).get(0).add("Llamado");
        this.pasos.get(2).get(0).add("Funcion");
        this.pasos.get(2).get(0).add("Impresión");
        this.pasos.get(2).get(0).add("Lectura");
        this.pasos.get(2).get(0).add("Impresión");
        this.pasos.get(2).get(0).add("Lectura");
        this.pasos.get(2).get(0).add("Impresión");
        /////////////////////////////////
        this.pasos.get(2).get(1).add("(Suma)");
        this.pasos.get(2).get(1).add("(defun Suma()");
        this.pasos.get(2).get(1).add("(print \"ingrese el valor de a\")");
        this.pasos.get(2).get(1).add("(setq a (read))");
        this.pasos.get(2).get(1).add("(print \"ingrese el valor de b\")");
        this.pasos.get(2).get(1).add("(setq b (read))");
        this.pasos.get(2).get(1).add("(print \"La suma es: ~d\" (+ a b))");
        ////////////////   4    /////////////////
        this.algoritmos.get(3).add("#|\nConstruir  un algoritmo en Lisp que dé a\nconocer el precio de la leche que compro\nJulián,  teniendo  como  base que el pagó\n20.000  pesos  por  3  litros de leche y le\ndieron 8.000  pesos de cambio.\n|#");
        this.algoritmos.get(3).add("funcion PrecioUnidad\n  inicializar unidad = ((20000 - 8000) / 3))\n  imprimir \"El precio por unidad es de: \", unidad\n\nllamar funcion PrecioUnidad");
        this.algoritmos.get(3).add("(defun PrecioUnidad()\n  (setq unidad (/ (- 20000 8000) 3))\n  (print \"El precio por unidad es de: ~d\" unidad)\n)\n\n(PrecioUnidad)");
        this.algoritmos.get(3).add("3");
        this.pasos.get(3).get(0).add("Llamado");
        this.pasos.get(3).get(0).add("Funcion");
        this.pasos.get(3).get(0).add("Asignación");
        this.pasos.get(3).get(0).add("Impresión");
        this.pasos.get(3).get(0).add("Resta");
        this.pasos.get(3).get(0).add("Div");
        /////////////////////////////////
        this.pasos.get(3).get(1).add("(PrecioUnidad)");
        this.pasos.get(3).get(1).add("(defun PrecioUnidad()");
        this.pasos.get(3).get(1).add("(setq unidad (/ (- 20000 8000) 3))");
        this.pasos.get(3).get(1).add("(print \"El precio de la leche por unidad es de: ~d\" unidad)");
        this.pasos.get(3).get(1).add("(- 20000 8000)");
        this.pasos.get(3).get(1).add("(/ (- 20000 8000) 3)");
        ////////////////   5    /////////////////
        this.algoritmos.get(4).add("#|\nConstruir  un  algoritmo en Lisp que le dé a\nconocer a juan el precio de la chaqueta VJT\n que  compró  por  32.000  la  cual  tiene un\ndescuento del  22% y el precio del pantalón\nque  le  costó  27.500 pesos el cual tiene un\ndescuento  del  15%.\n|#");
        this.algoritmos.get(4).add("Funcion Costo\n  inicializar chaqueta = (32000 - (32000 * 0.22))\n  inicializar pantalon = (27500 - (27500 * 0.15))\n  inicializar sum = (chaqueta + pantalon)\n  imprimir \"El precio total es de: \", sum\n\nllamar Funcion Costo");
        this.algoritmos.get(4).add("(defun Costo()\n  (setq chaqueta (- 32000 (* 32000 0.22)))\n  (setq pantalon (- 27500 (* 27500 0.15)))\n  (setq sum (+ chaqueta pantalon))\n  (print \"El precio total es de: ~d\" sum)\n)\n\n(Costo)");
        this.algoritmos.get(4).add("4");
        this.pasos.get(4).get(0).add("Llamado");
        this.pasos.get(4).get(0).add("Funcion");
        this.pasos.get(4).get(0).add("Asignación");
        this.pasos.get(4).get(0).add("Mult");
        this.pasos.get(4).get(0).add("Resta");
        this.pasos.get(4).get(0).add("Suma");
        this.pasos.get(4).get(0).add("Impresión");
        /////////////////////////////////
        this.pasos.get(4).get(1).add("(Costo)");
        this.pasos.get(4).get(1).add("(defun Costo()");
        this.pasos.get(4).get(1).add("(setq chaqueta (- 32000 (* 32000 0.22)))");
        this.pasos.get(4).get(1).add("(* 32000 0.22)");
        this.pasos.get(4).get(1).add("(- 32000 (* 32000 0.22))");
        this.pasos.get(4).get(1).add("(setq sum (+ chaqueta pantalon))");
        this.pasos.get(4).get(1).add("(print \"El precio total es de: ~d\" sum)");
        ////////////////   6    /////////////////
        this.algoritmos.get(5).add("#|\nCrear  un  algoritmo en Lisp que maneje el\ndescuento  sobre  un  precio que el usuario\ningresa, el descuento también lo determina\nel  usuario.\n|#");
        this.algoritmos.get(5).add("Funcion Descuentos\n  imprimir \"Ingrese el precio: \"\n  inicializar precio = (valor por consola)\n  imprimir \"Ingrese el descuento sin el %: \"\n  inicializar descuento = (valor por consola)\n  inicializar finalP = (precio - (precio * (descuento / 100)))\n\nllamar Funcion Descuentos");
        this.algoritmos.get(5).add("(defun Descuentos()\n  (print \"Ingrese el precio: \")\n  (setq precio (read))\n  (print \"Ingrese el descuento sin el %: \")\n  (setq descuento (read))\n  (setq finalP \n    (- precio (* precio (/ descuento 100)))\n  )\n)\n\n(Descuentos)");
        this.algoritmos.get(5).add("5");
        
        this.pasos.get(5).get(0).add("Llamado");
        this.pasos.get(5).get(0).add("Funcion");
        this.pasos.get(5).get(0).add("Impresión");
        this.pasos.get(5).get(0).add("Lectura");
        this.pasos.get(5).get(0).add("Impresión");
        this.pasos.get(5).get(0).add("Lectura");
        this.pasos.get(5).get(0).add("Div");
        this.pasos.get(5).get(0).add("Mult");
        this.pasos.get(5).get(0).add("Resta");
        this.pasos.get(5).get(0).add("Asignación");
        /////////////////////////////////
        this.pasos.get(5).get(1).add("(Descuentos)");
        this.pasos.get(5).get(1).add("(defun Descuentos()");
        this.pasos.get(5).get(1).add("(print \"Ingrese el precio: \")");
        this.pasos.get(5).get(1).add("(setq precio (read))");
        this.pasos.get(5).get(1).add("(print \"Ingrese el descuento sin el %: \")");
        this.pasos.get(5).get(1).add("(setq descuento (read))");
        this.pasos.get(5).get(1).add("(/ descuento 100)");
        this.pasos.get(5).get(1).add("(* precio (/ descuento 100))");
        this.pasos.get(5).get(1).add("(- precio (* precio (/ descuento 100)))");
        this.pasos.get(5).get(1).add("(setq finalP (- precio (* precio (/ descuento 100))))");
        ////////////////   7    /////////////////
        this.algoritmos.get(6).add("#|\nCrear un algoritmo en Lisp que valide si un\nnúmero ingresado es par o impar.\n|#");
        this.algoritmos.get(6).add("Funcion ParImpar\n  imprimir \"Ingrese un numero: \"\n  inicializar var = (valor por consola)\n  si (modulo var, 2) = 0\n    imprimir \"El numero es par\"\n  sino\n    imprimir \"El numero es imparpar\"\n\nllamar Funcion ParImpar");
        this.algoritmos.get(6).add("(defun ParImpar()\n  (print \"Ingrese un numero: \")\n  (setq var (read))\n  (if (eql remainder(var 2) 0)\n    (print \"El numero es par\")\n    (print \"El numero es imparpar\")\n  )\n)\n\n(ParImpar)");
        this.algoritmos.get(6).add("6");
        this.pasos.get(6).get(0).add("Llamado");
        this.pasos.get(6).get(0).add("Funcion");
        this.pasos.get(6).get(0).add("Impresión");
        this.pasos.get(6).get(0).add("Lectura");
        this.pasos.get(6).get(0).add("Condicional");
        this.pasos.get(6).get(0).add("Modulo");
        this.pasos.get(6).get(0).add("Impresión");
        this.pasos.get(6).get(0).add("Impresión");
        /////////////////////////////////
        this.pasos.get(6).get(1).add("(ParImpar)");
        this.pasos.get(6).get(1).add("(defun ParImpar()");
        this.pasos.get(6).get(1).add("(print \"Ingrese un numero: \")");
        this.pasos.get(6).get(1).add("(setq var (read))");
        this.pasos.get(6).get(1).add("(if (eql remainder(var 2) 0)");
        this.pasos.get(6).get(1).add("remainder(var 2)");
        this.pasos.get(6).get(1).add("(print \"El numero es par\")");
        this.pasos.get(6).get(1).add("(print \"El numero es imparpar\")");
        ////////////////   8    /////////////////
        this.algoritmos.get(7).add("#|\nCrear un algoritmo en Lisp que capture las\nnotas  de  un  estudiante  y  determine si el\nestudiante  aprobó  la  materia,  se aprueba\ncon  una  nota  mayor  a  3.0,  el  rango de\ncalificación  es  de  0  hasta  5.\n|#");
        this.algoritmos.get(7).add("Funcion NotasEstudiante\n  imprimir \"Ingrese la nota 1: \"\n  inicializar nota1 = (valor por consola)\n  imprimir \"Ingrese la nota 2: \"\n  inicializar nota2 = (valor por consola)\n  imprimir \"Ingrese la nota 3: \"\n  inicializar nota3 = (valor por consola)\n  si ((nota1 + nota2 + nota3) / 3) > 2.9\n    imprimir \"Aprobó la materia\"\n  sino\n    imprimir \"Reprobó la materia\"\n\nllamar Funcion NotasEstudiante");
        this.algoritmos.get(7).add("(defun NotasEstudiante()\n  (print \"Ingrese la nota 1: \")\n  (setq nota1 (read))\n  (print \"Ingrese la nota 2: \")\n  (setq nota2 (read))\n  (print \"Ingrese la nota 3: \")\n  (setq nota3 (read))\n  (if (> (/(+ nota1 nota2 nota3) 3) 2.9)\n    (print \"Aprobó la materia\")\n    (print \"Reprobó la materia\")\n  )\n)\n\n(NotasEstudiante)");
        this.algoritmos.get(7).add("7");
        this.pasos.get(7).get(0).add("Llamado");
        this.pasos.get(7).get(0).add("Funcion");
        this.pasos.get(7).get(0).add("Impresión");
        this.pasos.get(7).get(0).add("Lectura");
        this.pasos.get(7).get(0).add("Impresión");
        this.pasos.get(7).get(0).add("Lectura");
        this.pasos.get(7).get(0).add("Impresión");
        this.pasos.get(7).get(0).add("Lectura");
        this.pasos.get(7).get(0).add("Condicional");
        this.pasos.get(7).get(0).add("Impresión");
        this.pasos.get(7).get(0).add("Impresión");
        /////////////////////////////////
        this.pasos.get(7).get(1).add("(NotasEstudiante)");
        this.pasos.get(7).get(1).add("(defun NotasEstudiante()");
        this.pasos.get(7).get(1).add("(print \"Ingrese la nota 1: \")");
        this.pasos.get(7).get(1).add("(setq nota1 (read))");
        this.pasos.get(7).get(1).add("(print \"Ingrese la nota 2: \")");
        this.pasos.get(7).get(1).add("(setq nota2 (read))");
        this.pasos.get(7).get(1).add("(print \"Ingrese la nota 3: \")");
        this.pasos.get(7).get(1).add("(setq nota3 (read))");
        this.pasos.get(7).get(1).add("(if (> (+ nota1 nota2 nota3) 2.9)");
        this.pasos.get(7).get(1).add("(print \"Aprobó la materia\")");
        this.pasos.get(7).get(1).add("(print \"Reprobó la materia\")");
        ////////////////   9    /////////////////
        this.algoritmos.get(8).add("#|\nCrear  un  algoritmo  en  Lisp que lea tres\nnúmeros  por  consola  e  imprima  solo el\nnúmero mayor entre los ingresados.\n|#");
        this.algoritmos.get(8).add("Funcion mayorde3\n  imprimir \"Ingrese el primer numero: \"\n  inicializar n1 = (valor por consola)\n  imprimir \"Ingrese el segundo numero: \"\n  inicializar n2 = (valor por consola)\n  imprimir \"Ingrese el tercer numero: \"\n  inicializar n3 = (valor por consola)\n  si n1 > n2\n    imprimir \"El numero mayor es: \", n1\n  sino\n    si n2 > n3\n      imprimir \"El numero mayor es: \", n2\n    sino\n      imprimir \"El numero mayor es: \", n3\n\nllamar Funcion mayorde3");
        this.algoritmos.get(8).add("(defun mayorde3()\n  (print \"Ingrese el primer numero: \")\n  (setq n1 (read))\n  (print \"Ingrese el segundo numero: \")\n  (setq n2 (read))\n  (print \"Ingrese el tercer numero: \")\n  (setq n3 (read))\n  (if (> n1 n2)\n    (print \"El numero mayor es: ~a\" n1)\n    (if (> n2 n3)\n      (print \"El numero mayor es: ~a\" n2)\n      (print \"El numero mayor es: ~a\" n3)\n    )\n  )\n)\n\n(mayorde3)");
        this.algoritmos.get(8).add("8");
        this.pasos.get(8).get(0).add("Llamado");
        this.pasos.get(8).get(0).add("Funcion");
        this.pasos.get(8).get(0).add("Impresión");
        this.pasos.get(8).get(0).add("Lectura");
        this.pasos.get(8).get(0).add("Impresión");
        this.pasos.get(8).get(0).add("Lectura");
        this.pasos.get(8).get(0).add("Impresión");
        this.pasos.get(8).get(0).add("Lectura");
        this.pasos.get(8).get(0).add("Condicional");
        this.pasos.get(8).get(0).add("Impresión");
        this.pasos.get(8).get(0).add("CondiAnidado");
        this.pasos.get(8).get(0).add("Impresión");
        /////////////////////////////////
        this.pasos.get(8).get(1).add("(mayorde3)");
        this.pasos.get(8).get(1).add("(defun mayorde3()");
        this.pasos.get(8).get(1).add("(print \"Ingrese el primer numero: \")");
        this.pasos.get(8).get(1).add("(setq n1 (read))");
        this.pasos.get(8).get(1).add("(print \"Ingrese el segundo numero: \")");
        this.pasos.get(8).get(1).add("(setq n2 (read))");
        this.pasos.get(8).get(1).add("(print \"Ingrese el tercer numero: \")");
        this.pasos.get(8).get(1).add("(setq n3 (read))");
        this.pasos.get(8).get(1).add("(if (> n1 n2)");
        this.pasos.get(8).get(1).add("(print \"El numero mayor es: ~a\" n1)");
        this.pasos.get(8).get(1).add("(if (> n2 n3)");
        this.pasos.get(8).get(1).add("(print \"El numero mayor es: ~a\" n2)");
        ////////////////   10    /////////////////
        this.algoritmos.get(9).add("#|\nCrear un algoritmo en Lisp que reciba tres \nnúmeros y nos diga cuantos son negativos\n|#");
        this.algoritmos.get(9).add("funciion Negativos\n  inicializar sum = 0\n  imrpimir \"Ingrese el primer numero: \"\n  inicializar n1 = (valor por consola)\n  imrpimir \"\"Ingrese el segundo numero: \"\n  inicializar n2 = (valor por consola)\n  imrpimir \"\"Ingrese el tercer numero: \"\n  inicializar n3 = (valor por consola)\n  si n1 < 0\n      actualizar sum = sum + 1\n  si n2 < 0\n      actualizar sum = sum + 1\n  si n3 < 0\n      actualizar sum = sum + 1\n  imrpimir \"Numeros negativos: \" sum\n\nllamar funcion Negativos");
        this.algoritmos.get(9).add("(defun Negativos()\n  (setq sum 0)\n  (print \"Ingrese el primer numero: \")\n  (setq n1 (read))\n  (print \"Ingrese el segundo numero: \")\n  (setq n2 (read))\n  (print \"Ingrese el tercer numero: \")\n  (setq n3 (read))\n  (if (n1 < 0)\n    (set sum (+ sum 1))\n    (void)\n  )\n  (if (n2 < 0)\n    (set sum (+ sum 1))\n    (void)\n  )\n  (if (n3 < 0)\n    (set sum (+ sum 1))\n    (void)\n  )\n  (print \"Numeros negativos: ~a\" sum)\n)\n\n(Negativos)");
        this.algoritmos.get(9).add("9");
        this.pasos.get(9).get(0).add("Llamado");
        this.pasos.get(9).get(0).add("Asignación");
        this.pasos.get(9).get(0).add("Impresión");
        this.pasos.get(9).get(0).add("Lectura");
        this.pasos.get(9).get(0).add("Impresión");
        this.pasos.get(9).get(0).add("Lectura");
        this.pasos.get(9).get(0).add("Impresión");
        this.pasos.get(9).get(0).add("Lectura");
        this.pasos.get(9).get(0).add("Condicional");
        this.pasos.get(9).get(0).add("Actualizar");
        this.pasos.get(9).get(0).add("Vacio");
        this.pasos.get(9).get(0).add("Condicional");
        this.pasos.get(9).get(0).add("Actualizar");
        this.pasos.get(9).get(0).add("Vacio");
        this.pasos.get(9).get(0).add("Condicional");
        this.pasos.get(9).get(0).add("Actualizar");
        this.pasos.get(9).get(0).add("Vacio");
        /////////////////////////////////
        this.pasos.get(9).get(1).add("(Negativos)");
        this.pasos.get(9).get(1).add("(setq sum 0)");
        this.pasos.get(9).get(1).add("(print \"Ingrese el primer numero: \")");
        this.pasos.get(9).get(1).add("(setq n1 (read))");
        this.pasos.get(9).get(1).add("(print \"Ingrese el segundo numero: \")");
        this.pasos.get(9).get(1).add("(setq n2 (read))");
        this.pasos.get(9).get(1).add("(print \"Ingrese el tercer numero: \")");
        this.pasos.get(9).get(1).add("(setq n3 (read))");
        this.pasos.get(9).get(1).add("(if (n1 < 0)");
        this.pasos.get(9).get(1).add("(set sum (+ sum 1))");
        this.pasos.get(9).get(1).add("Vacio");
        this.pasos.get(9).get(1).add("(if (n2 < 0)");
        this.pasos.get(9).get(1).add("(set sum (+ sum 1))");
        this.pasos.get(9).get(1).add("Vacio");
        this.pasos.get(9).get(1).add("(if (n3 < 0)");
        this.pasos.get(9).get(1).add("(set sum (+ sum 1))");
        this.pasos.get(9).get(1).add("Vacio");
        ////////////////   11     /////////////////
        this.algoritmos.get(10).add("#|\nCrear  un  algoritmo  en  Lisp  que reciba un \nnúmero dentro del rango 1 a 12 y de acuerdo\nal  número  imprima  el mes correspondiente.\n|#");
        this.algoritmos.get(10).add("Funcion Mes\n    imprimir  \"numero entre el 1 y el 12: \"\n    inicializar mes = (valor por consola)\n    evaluar mes\n       (mes = 1)(imprimir \"mes Enero\")\n       (mes = 2)(imprimir \"mes Febrero\")\n       .\n       .\n       .\n       (mes = 12)(imprimir \"mes Diciembre\")\n        \nllamar Funcion Mes");
        this.algoritmos.get(10).add("(defun Mes()\n  (print \"Ingrese un numero entre el 1 y el 12: \")\n  (setq mes (read))\n  (cond\n    ((= mes 1)(print \"mes de Enero\"))\n    ((= mes 2)(print \"mes de Febrero\"))\n    ((= mes 3)(print \"mes de Marzo\"))\n    ((= mes 4)(print \"mes de Abril\"))\n    ((= mes 5)(print \"mes de Mayo\"))\n    ((= mes 6)(print \"mes de Junio\"))\n    ((= mes 7)(print \"mes de Julio\"))\n    ((= mes 8)(print \"mes de Agosto\"))\n    ((= mes 9)(print \"mes de Septiembre\"))\n    ((= mes 10)(print \"mes de Octubre\"))\n    ((= mes 11)(print \"mes de Noviembre\"))\n    ((= mes 12)(print \"mes de Diciembre\"))\n  )\n)\n\n(Mes)");
        this.algoritmos.get(10).add("10");
        this.pasos.get(10).get(0).add("Llamado");
        this.pasos.get(10).get(0).add("Funcion");
        this.pasos.get(10).get(0).add("Impresión");
        this.pasos.get(10).get(0).add("Lectura");
        this.pasos.get(10).get(0).add("Cond");
        this.pasos.get(10).get(0).add("Igual");
        this.pasos.get(10).get(0).add("Impresión");
        /////////////////////////////////
        this.pasos.get(10).get(1).add("(Mes)");
        this.pasos.get(10).get(1).add("(defun Mes()");
        this.pasos.get(10).get(1).add("(print \"Ingrese un numero entre el 1 y el 12: \")");
        this.pasos.get(10).get(1).add("(setq mes (read))");
        this.pasos.get(10).get(1).add("(cond");
        this.pasos.get(10).get(1).add("(= mes 1)");
        this.pasos.get(10).get(1).add("((= mes 1)(print \"mes de Enero\"))");
        ////////////////   12    /////////////////
        this.algoritmos.get(11).add("#|\nEscribir un algoritmo sencillo en Lisp que \nlea una de las 5 vocales e imprima en qué \nposición del alfabeto se encuentra.\n|#");
        this.algoritmos.get(11).add("Funcion vocales\n    imprimir  \"ingrese una vocal: \"\n    inicializar vocal = (valor por consola)\n    evaluar vocal\n      (vocal = \"a\")(imprimir \"La vocal esta en la posicion 1\")\n      (vocal = \"e\")(imprimir \"La vocal esta en la posicion 2\")\n       .\n       .\n       .\n      (vocal = \"u\")(imprimir \"La vocal esta en la posicion 5\")\n        \nllamar Funcion vocales");
        this.algoritmos.get(11).add("(defun vocales()\n  (print \"ingrese una vocal: \")\n  (setq vocal (read))\n  (cond\n    ((= vocal \"a\") \n       (print \"La vocal esta en la posicion 1\"))\n    ((= vocal \"e\") \n       (print \"La vocal esta en la posicion 2\"))\n    ((= vocal \"i\")\n       (print \"La vocal esta en la posicion 3\"))\n    ((= vocal \"o\")\n       (print \"La vocal esta en la posicion 4\"))\n    ((= vocal \"u\")\n       (print \"La vocal esta en la posicion 5\"))\n  )\n)\n\n(vocales)");
        this.algoritmos.get(11).add("11");
        this.pasos.get(11).get(0).add("Llamado");
        this.pasos.get(11).get(0).add("Funcion");
        this.pasos.get(11).get(0).add("Impresión");
        this.pasos.get(11).get(0).add("Lectura");
        this.pasos.get(11).get(0).add("Cond");
        this.pasos.get(11).get(0).add("Igual");
        this.pasos.get(11).get(0).add("Impresión");
        /////////////////////////////////
        this.pasos.get(11).get(1).add("(vocales)");
        this.pasos.get(11).get(1).add("(defun vocales()");
        this.pasos.get(11).get(1).add("(print \"ingrese una vocal: \")");
        this.pasos.get(11).get(1).add("(setq vocal (read))");
        this.pasos.get(11).get(1).add("(cond");
        this.pasos.get(11).get(1).add("((= vocal \"a\") ");
        this.pasos.get(11).get(1).add("(print \"La vocal esta en la posicion 1\")");
        ////////////////   13    /////////////////
        this.algoritmos.get(12).add("#|\nCrear  un  menú  de  opciones  en Lisp que \nimprima la opción seleccionada, el objetivo \nde esto,  es crear una plantilla modelo para \ncuando  se  tenga  un  menú  de  opciones. \n|#");
        this.algoritmos.get(12).add("Funcion menu\n    imprimir  \" 1) opcion 1\"\n    imprimir  \" 2) opcion 2\"\n    imprimir  \" 3) opcion 3\"\n    imprimir \"Seleccione una opción: \"\n    inicializar opc = (valor por consola)\n    evaluar opc\n       (opc = 1)(imprimir \"La opcion seleccionada es la: 1\")\n       (opc = 2)(imprimir \"La opcion seleccionada es la: 2\")\n       (opc = 3)(imprimir \"La opcion seleccionada es la: 3\")\n        \nllamar Funcion menu");
        this.algoritmos.get(12).add("(defun menu()\n  (print \" 1) opcion 1\")\n  (print \" 2) opcion 2\")\n  (print \" 3) opcion 3\")\n  (print \"Seleccione una opción: \")\n  (setq opc (read))\n  (cond\n    ((= opc 1)\n      (print \"La opcion seleccionada es la: 1\"))\n    ((= opc 2) \n      (print \"La opcion seleccionada es la: 2\"))\n    ((= opc 3) \n      (print \"La opcion seleccionada es la: 3\"))\n  )\n)\n\n(menu)");
        this.algoritmos.get(12).add("12");
        this.pasos.get(12).get(0).add("Llamado");
        this.pasos.get(12).get(0).add("Funcion");
        this.pasos.get(12).get(0).add("Impresión");
        this.pasos.get(12).get(0).add("Impresión");
        this.pasos.get(12).get(0).add("Impresión");
        this.pasos.get(12).get(0).add("Impresión");
        this.pasos.get(12).get(0).add("Lectura");
        this.pasos.get(12).get(0).add("Cond");
        this.pasos.get(12).get(0).add("Igual");
        this.pasos.get(12).get(0).add("Impresión");
        /////////////////////////////////
        this.pasos.get(12).get(1).add("(menu)");
        this.pasos.get(12).get(1).add("(defun menu()");
        this.pasos.get(12).get(1).add("(print \" 1) opcion 1\")");
        this.pasos.get(12).get(1).add("(print \" 2) opcion 2\")");
        this.pasos.get(12).get(1).add("(print \" 3) opcion 3\")");
        this.pasos.get(12).get(1).add("(print \"Seleccione una opción: \")");
        this.pasos.get(12).get(1).add("(setq opc (read))");
        this.pasos.get(12).get(1).add("(cond");
        this.pasos.get(12).get(1).add("((= opc 2)");
        this.pasos.get(12).get(1).add("(print \"La opcion seleccionada es la: 2\"))");
        ////////////////   14    /////////////////
        this.algoritmos.get(13).add("#|\nConstruir un algoritmo en Lisp que dada la \nsuma  de  dos números imprima si esta es \nmayor, menor o igual a 10\n|#");
        this.algoritmos.get(13).add("Funcion Mayor10\n    imprimir  \"ingrese el valor de a\"\n    inicializar a = (valor por consola)\n    imprimir  \"ingrese el valor de b\"\n    inicializar b = (valor por consola)\n    inicializar suma = (a + b)\n    evaluar suma\n       (suma > 10)\n            (imprimir \"Es mayor a 10\", suma)\n       (suma < 10)\n            (imprimir \"Es menor a 10\", suma)\n       (suma = 10)\n             (imprimir \"Es igual a 10\", suma)\n        \nllamar Funcion Mayor10");
        this.algoritmos.get(13).add("(defun Mayor10()\n   (print \"ingrese el valor de a\")\n   (setq a (read))\n   (print \"ingrese el valor de b\")\n   (setq b (read))\n   (setq suma (+ a b))\n   (cond\n      ((> suma 10)(print \"Es mayor a 10 -d\" suma))\n      ((< suma 10)(print \"Es menor a 10 -d\" suma))\n      ((= suma 10)(print \"Es igual a 10 -d\" suma))\n   )\n)\n\n(Mayor10)");
        this.algoritmos.get(13).add("13");
        this.pasos.get(13).get(0).add("Llamado");
        this.pasos.get(13).get(0).add("Funcion");
        this.pasos.get(13).get(0).add("Impresión");
        this.pasos.get(13).get(0).add("Lectura");
        this.pasos.get(13).get(0).add("Impresión");
        this.pasos.get(13).get(0).add("Lectura");
        this.pasos.get(13).get(0).add("Asignación");
        this.pasos.get(13).get(0).add("Cond");
        this.pasos.get(13).get(0).add("Igual");
        this.pasos.get(13).get(0).add("Impresión");
        /////////////////////////////////
        this.pasos.get(13).get(1).add("(Mayor10)");
        this.pasos.get(13).get(1).add("(defun Mayor10()");
        this.pasos.get(13).get(1).add("(print \"ingrese el valor de a\")");
        this.pasos.get(13).get(1).add("(setq a (read))");
        this.pasos.get(13).get(1).add("(print \"ingrese el valor de b\")");
        this.pasos.get(13).get(1).add("(setq b (read))");
        this.pasos.get(13).get(1).add("(setq suma (+ a b))");
        this.pasos.get(13).get(1).add("(cond");
        this.pasos.get(13).get(1).add("((= suma 10)");
        this.pasos.get(13).get(1).add("(print \"Es igual a 10 -d\" suma))");
        ////////////////   15    /////////////////
        this.algoritmos.get(14).add("#|\nConstruir un algoritmo en Lisp que sume  de \nmanera recursiva los numeros del 1 al 10 nos\nmuestre el promedio de esta suma.\n|#");
        this.algoritmos.get(14).add("Funcion Promedio (count, sum)\n   evaluar count\n     (count < 11)\n        (Promedio((count+1), (sum+count)))\n     (count = 10)\n        (imprimir \"El promedio es: \", (sum/10))\n        \nllamar Funcion Promedio(1, 0)");
        this.algoritmos.get(14).add("(defun Promedio(count suma)\n  (cond\n   ((< count 11)\n      (Promedio((+ count 1)(+ suma count))))\n   ((= count 10)\n      (print \"El promedio es. -d\" (/ suma 10)))\n  )\n)\n\n(Promedio 1 0)");
        this.algoritmos.get(14).add("14");
        this.pasos.get(14).get(0).add("Llamado");
        this.pasos.get(14).get(0).add("Funcion");
        this.pasos.get(14).get(0).add("Argumento");
        this.pasos.get(14).get(0).add("Cond");
        this.pasos.get(14).get(0).add("Menor");
        this.pasos.get(14).get(0).add("Llamado");
        this.pasos.get(14).get(0).add("Funcion");
        this.pasos.get(14).get(0).add("Cond");
        this.pasos.get(14).get(0).add("Menor");
        this.pasos.get(14).get(0).add("Llamado");
        this.pasos.get(14).get(0).add("Funcion");
        this.pasos.get(14).get(0).add("Cond");
        this.pasos.get(14).get(0).add("Menor");
        this.pasos.get(14).get(0).add("Llamado");
        this.pasos.get(14).get(0).add("Funcion");
        this.pasos.get(14).get(0).add("Cond");
        this.pasos.get(14).get(0).add("Igual");
        this.pasos.get(14).get(0).add("Impresión");
        /////////////////////////////////
        this.pasos.get(14).get(1).add("(Promedio 1 0)");
        this.pasos.get(14).get(1).add("(defun Promedio(count suma)");
        this.pasos.get(14).get(1).add("(count suma)");
        this.pasos.get(14).get(1).add("(cond");
        this.pasos.get(14).get(1).add("((< count 11)");
        this.pasos.get(14).get(1).add("(Promedio((+ count 1)(+ suma count))))");
        this.pasos.get(14).get(1).add("(defun Promedio(count suma)");
        this.pasos.get(14).get(1).add("(cond");
        this.pasos.get(14).get(1).add("((< count 11)");
        this.pasos.get(14).get(1).add("(Promedio((+ count 1)(+ suma count))))");
        this.pasos.get(14).get(1).add("(defun Promedio(count suma)");
        this.pasos.get(14).get(1).add("(cond");
        this.pasos.get(14).get(1).add("((< count 11)");
        this.pasos.get(14).get(1).add("(Promedio((+ count 1)(+ suma count))))");
        this.pasos.get(14).get(1).add("(defun Promedio(count suma)");
        this.pasos.get(14).get(1).add("(cond");
        this.pasos.get(14).get(1).add("((= count 10)");
        this.pasos.get(14).get(1).add("(print \"El promedio es. -d\" (/ suma 10)))");
        ////////////////   16    /////////////////
        this.algoritmos.get(15).add("#|\nCrear  un  menú  de opciones en Lisp que \nllame a una de dos funciones e imprima el\nnombre de la función seleccionada.\n|#");
        this.algoritmos.get(15).add("Funcion suma\n    imprimir  \"funcion de suma\"\n\nFuncion resta\n    imprimir  \"funcion de resta\"\n\nFuncion menu\n    imprimir  \" 1) Funcion Resta\"\n    imprimir  \" 2) Funcion Suma\"\n    imprimir \"Seleccione una opción: \"\n    inicializar opc = (valor por consola)\n    evaluar opc\n       (opc = 1)(resta)\n       (opc = 2)(suma)\n\nllamar Funcion menu");
        this.algoritmos.get(15).add("(defun suma()\n   (print \"funcion de suma\")\n)\n\n(defun resta()\n   (print \"funcion de resta\")\n)\n\n(defun menu()\n   (print \" 1) Funcion Resta\")\n   (print \" 2) Funcion Suma\")\n   (print \"Seleccione una opción: \")\n   (setq opc (read))\n   (cond\n      ((= opc 1) (resta))\n      ((= opc 2) (suma))\n   )\n)\n\n(menu)");
        this.algoritmos.get(15).add("15");
        this.pasos.get(15).get(0).add("Llamado");
        this.pasos.get(15).get(0).add("Funcion");
        this.pasos.get(15).get(0).add("Impresión");
        this.pasos.get(15).get(0).add("Impresión");
        this.pasos.get(15).get(0).add("Impresión");
        this.pasos.get(15).get(0).add("Lectura");
        this.pasos.get(15).get(0).add("Cond");
        this.pasos.get(15).get(0).add("Igual");
        this.pasos.get(15).get(0).add("Llamado");
        this.pasos.get(15).get(0).add("Funcion");
        this.pasos.get(15).get(0).add("Impresión");
        this.pasos.get(15).get(0).add("Igual");
        this.pasos.get(15).get(0).add("Llamado");
        this.pasos.get(15).get(0).add("Funcion");
        this.pasos.get(15).get(0).add("Impresión");
        /////////////////////////////////
        this.pasos.get(15).get(1).add("(menu)");
        this.pasos.get(15).get(1).add("(defun menu()");
        this.pasos.get(15).get(1).add("(print \" 1) Funcion Resta\")");
        this.pasos.get(15).get(1).add("(print \" 2) Funcion Suma\")");
        this.pasos.get(15).get(1).add("(print \"Seleccione una opción: \")");
        this.pasos.get(15).get(1).add("(setq opc (read))");
        this.pasos.get(15).get(1).add("(cond");
        this.pasos.get(15).get(1).add("((= opc 1) ");
        this.pasos.get(15).get(1).add("(resta))");
        this.pasos.get(15).get(1).add("(defun resta()");
        this.pasos.get(15).get(1).add("(print \"funcion de resta\")");
        this.pasos.get(15).get(1).add("((= opc 2)");
        this.pasos.get(15).get(1).add("(suma))");
        this.pasos.get(15).get(1).add("(defun suma()");
        this.pasos.get(15).get(1).add("(print \"funcion de suma\")");
        ////////////////   17    /////////////////
        this.algoritmos.get(16).add("#|\nCrear  un   menú   en   Lisp  que  permita \nseleccionar   al   usuario   que   operación\nrealizar sobre dos números que son leídos \npor   consola.  Las  opciones  son:  sumar, \nmultiplicar, y restar.\n|#");
        this.algoritmos.get(16).add("Funcion suma\n    imprimir \"ingrese el valor de a\"\n    inicializar a = (valor por consola)\n    imprimir \"ingrese el valor de b\"\n    inicializar b = (valor por consola)\n    imprimir \"La suma es: \" ( a + b)\n\nFuncion resta\n    imprimir \"ingrese el valor de a\"\n    inicializar a = (valor por consola)\n    imprimir \"ingrese el valor de b\"\n    inicializar b = (valor por consola)\n    imprimir \"La resta es: \" ( a - b)\n\nFuncion multiplicaicon\n    imprimir \"ingrese el valor de a\"\n    inicializar a = (valor por consola)\n    imprimir \"ingrese el valor de b\"\n    inicializar b = (valor por consola)\n    imprimir \"La multiplicacion es: \" ( a * b)\n\nFuncion menu\n    imprimir  \" 1) Suma\"\n    imprimir  \" 2) Resta\"\n    imprimir  \" 3) Multiplicacion\"\n    imprimir \"Seleccione una opción: \"\n    inicializar opc = (valor por consola)\n    evaluar opc\n       (opc = 1)(suma)\n       (opc = 2)(resta)\n       (opc = 2)(multiplicaicon)\n\nllamar Funcion menu");
        this.algoritmos.get(16).add("(defun suma()\n   (print \"ingrese el valor de a\")\n   (setq a (read))\n   (print \"ingrese el valor de b\")\n   (setq b (read))\n   (print \"La suma es: ~d\" (+ a b))\n)\n\n(defun resta()\n   (print \"ingrese el valor de a\")\n   (setq a (read))\n   (print \"ingrese el valor de b\")\n   (setq b (read))\n   (print \"La resta es: ~d\" (- a b))\n)\n\n(defun multiplicacion()\n   (print \"ingrese el valor de a\")\n   (setq a (read))\n   (print \"ingrese el valor de b\")\n   (setq b (read))\n   (print \"La multiplicacion es: ~d\" (* a b))\n)\n\n(defun menu()\n   (print \" 1) Suma\")\n   (print \" 2) Resta\")\n   (print \" 3) Multiplicacion\")\n   (print \"Seleccione una opción: \")\n   (setq opc (read))\n   (cond\n      ((= opc 1) (suma))\n      ((= opc 2) (resta))\n      ((= opc 3) (multiplicacion))\n   )\n)\n\n(menu)");
        this.algoritmos.get(16).add("16");
        this.pasos.get(16).get(0).add("Llamado");
        this.pasos.get(16).get(0).add("Funcion");
        this.pasos.get(16).get(0).add("Impresión");
        this.pasos.get(16).get(0).add("Impresión");
        this.pasos.get(16).get(0).add("Impresión");
        this.pasos.get(16).get(0).add("Impresión");
        this.pasos.get(16).get(0).add("Lectura");
        this.pasos.get(16).get(0).add("Cond");
        this.pasos.get(16).get(0).add("Igual");
        this.pasos.get(16).get(0).add("Llamado");
        this.pasos.get(16).get(0).add("Funcion");
        this.pasos.get(16).get(0).add("Impresión");
        this.pasos.get(16).get(0).add("Lectura");
        this.pasos.get(16).get(0).add("Impresión");
        this.pasos.get(16).get(0).add("Lectura");
        this.pasos.get(16).get(0).add("Impresión");
        this.pasos.get(16).get(0).add("Igual");
        this.pasos.get(16).get(0).add("Llamado");
        this.pasos.get(16).get(0).add("Funcion");
        this.pasos.get(16).get(0).add("Impresión");
        this.pasos.get(16).get(0).add("Igual");
        this.pasos.get(16).get(0).add("Llamado");
        this.pasos.get(16).get(0).add("Funcion");
        this.pasos.get(16).get(0).add("Impresión");
        /////////////////////////////////
        this.pasos.get(16).get(1).add("(menu)");
        this.pasos.get(16).get(1).add("(defun menu()");
        this.pasos.get(16).get(1).add("(print \" 1) Funcion Resta\")");
        this.pasos.get(16).get(1).add("(print \" 2) Funcion Suma\")");
        this.pasos.get(16).get(1).add("(print \" 3) Funcion Multiplicacion\")");
        this.pasos.get(16).get(1).add("(print \"Seleccione una opción: \")");
        this.pasos.get(16).get(1).add("(setq opc (read))");
        this.pasos.get(16).get(1).add("(cond");
        this.pasos.get(16).get(1).add("((= opc 1) ");
        this.pasos.get(16).get(1).add("(suma))");
        this.pasos.get(16).get(1).add("(defun suma()");
        this.pasos.get(16).get(1).add("(print \"ingrese el valor de a\")");
        this.pasos.get(16).get(1).add("(setq a (read))");
        this.pasos.get(16).get(1).add("(print \"ingrese el valor de b\")");
        this.pasos.get(16).get(1).add("(setq b (read))");
        this.pasos.get(16).get(1).add("(print \"La suma es: ~d\" (+ a b))");
        this.pasos.get(16).get(1).add("((= opc 2)");
        this.pasos.get(16).get(1).add("(resta))");
        this.pasos.get(16).get(1).add("(defun resta()");
        this.pasos.get(16).get(1).add("(print \"La resta es: ~d\" (- a b))");
        this.pasos.get(16).get(1).add("((= opc 3)");
        this.pasos.get(16).get(1).add("(multiplicacion))");
        this.pasos.get(16).get(1).add("(defun multiplicacion()");
        this.pasos.get(16).get(1).add("(print \"La multiplicacion es: ~d\" (* a b))");
        ////////////////   18    /////////////////
        this.algoritmos.get(17).add("#|\nEscribir   un   programa   que,   dado   un\nnúmero entero, muestre su valor absoluto.\nNota: para los números positivos  su valor\nabsoluto   es   igual   al  número  (el  valor\nabsoluto de   52   es   52),   mientras  que,\npara  los negativos,  su valor  absoluto  es\nel  número  multiplicado   por  -1 (el valor \nabsoluto  de  -52  es  52).\n|#");
        this.algoritmos.get(17).add("Funcion valorAbsoluto\n    imprimir  \"Ingrese un numero: \"\n    inicializar valor = (valor por consola)\n    evaluar valor\n       (valor < 0)(imprimir \"Valor absoluto: \", (valor * -1))\n       (valor > 0)(imprimir \"Valor absoluto: \", valor)\n        \nllamar Funcion valorAbsoluto");
        this.algoritmos.get(17).add("(defun valorAbsoluto()\n  (print \"Ingrese un numero: \")\n  (setq valor (read))\n  (cond\n    ((< valor 0)\n       (print \"Valor absoluto: ~d\" (* valor -1)))\n    ((> valor 0)\n       (print \"Valor absoluto: ~d\" valor))\n  )\n)\n(valorAbsoluto)");
        this.algoritmos.get(17).add("17");
        this.pasos.get(17).get(0).add("Llamado");
        this.pasos.get(17).get(0).add("Funcion");
        this.pasos.get(17).get(0).add("Impresión");
        this.pasos.get(17).get(0).add("Lectura");
        this.pasos.get(17).get(0).add("Cond");
        this.pasos.get(17).get(0).add("Menor");
        this.pasos.get(17).get(0).add("Impresión");
        /////////////////////////////////
        this.pasos.get(17).get(1).add("(valorAbsoluto)");
        this.pasos.get(17).get(1).add("(defun valorAbsoluto()");
        this.pasos.get(17).get(1).add("(print \"Ingrese un numero: \")");
        this.pasos.get(17).get(1).add("(setq valor (read))");
        this.pasos.get(17).get(1).add("(cond");
        this.pasos.get(17).get(1).add("((< valor 0)");
        this.pasos.get(17).get(1).add("(print \"Valor absoluto: ~d\" (* valor -1)))");
        ////////////////   19    /////////////////
        this.algoritmos.get(18).add("#|\nCrear un programa que permita al usuario \nelegir  un  candidato  por  el   cual   votar. \nLas  posibilidades  son: candidato A por el \npartido  rojo , candidato  B  por el partido \nverde,  candidato  C  por  el  partido azul. \nSegún  el  candidato elegido (A, B ó C) se \nle  debe  imprimir  el  mensaje  “Usted ha \nvotado    por    el    partido    [color   que \ncorresponda  al  candidato  elegido]”. Si el \nusuario    ingresa   una   opción   que   no \ncorresponde  a  ninguno de los candidatos\ndisponibles,  indicar  “Opción  errónea”.\n|#");
        this.algoritmos.get(18).add("Funcion Votaciones\n    imprimir  \" 1) A por el partido rojo\"\n    imprimir  \" 2) B por el partido verde\"\n    imprimir  \" 3) C por el partido azul\"\n    imprimir \"Seleccione una opción: \"\n    inicializar opc = (valor por consola)\n    evaluar opc\n       (opc = 1)(imprimir \"Usted ha votado por el partido rojo\")\n       (opc = 2)(imprimir \"Usted ha votado por el partido verde\")\n       (opc = 3)(imprimir \"Usted ha votado por el partido azul\")\n       (sino)(imprimir \"Opción errónea\")\n        \nllamar Funcion Votaciones");
        this.algoritmos.get(18).add("(defun Votaciones()\n  (print \" 1) A por el partido rojo\")\n  (print \" 2) B por el partido verde\")\n  (print \" 3) C por el partido azul\")\n  (print \"Seleccione una opción: \")\n  (setq opc (read))\n  (cond\n   ((= opc 1)\n    (print \"Usted ha votado por el partido rojo\"))\n   ((= opc 2) \n    (print \"Usted ha votado por el partido verde\"))\n   ((= opc 3) \n    (print \"Usted ha votado por el partido azul\"))\n   (else (print \"Opción errónea\"))\n  )\n)\n\n(Votaciones)");
        this.algoritmos.get(18).add("18");
        this.pasos.get(18).get(0).add("Llamado");
        this.pasos.get(18).get(0).add("Funcion");
        this.pasos.get(18).get(0).add("Impresión");
        this.pasos.get(18).get(0).add("Impresión");
        this.pasos.get(18).get(0).add("Impresión");
        this.pasos.get(18).get(0).add("Impresión");
        this.pasos.get(18).get(0).add("Lectura");
        this.pasos.get(18).get(0).add("Cond");
        this.pasos.get(18).get(0).add("Igual");
        this.pasos.get(18).get(0).add("Impresión");
        this.pasos.get(18).get(0).add("Else");
        /////////////////////////////////
        this.pasos.get(18).get(1).add("(Votaciones)");
        this.pasos.get(18).get(1).add("(defun Votaciones()");
        this.pasos.get(18).get(1).add("(print \" 1) A por el partido rojo\")");
        this.pasos.get(18).get(1).add("(print \" 2) B por el partido verde\")");
        this.pasos.get(18).get(1).add("(print \" 3) C por el partido azul\")");
        this.pasos.get(18).get(1).add("(print \"Seleccione una opción: \")");
        this.pasos.get(18).get(1).add("(setq opc (read))");
        this.pasos.get(18).get(1).add("(cond");
        this.pasos.get(18).get(1).add("((= opc 2) ");
        this.pasos.get(18).get(1).add("(print \"Usted ha votado por el partido verde\"))");
        this.pasos.get(18).get(1).add("(else (print \"Opción errónea\"))");
        ////////////////   20    /////////////////
        this.algoritmos.get(19).add("#|\nHacer un programa que permita saber si un\naño es bisiesto. Para que un año sea bisiesto \ndebe  ser  divisible  por  4  y   no   debe  ser\ndivisible  por  100,  excepto que también sea \ndivisible  por  400.\n|#");
        this.algoritmos.get(19).add("Funcion bisiesto\n    imprimir  \"Ingrese un año: \"\n    inicializar anio = (valor por consola)\n    evaluar valor\n       ((anio modulo 4) = 0)\n             (si ((anio modulo 100) != 0) o ((anio modulo 400) = 0)\n                     imprimir \"Bisiesto\"\n                     sino imprimir \"No Bisiesto\"\n             )\n       ((anio modulo 4) != 0)(imprimir \"No Bisiesto\")\n        \nllamar Funcion bisiesto");
        this.algoritmos.get(19).add("(defun bisiesto()\n   (print \"Ingrese un año: \")\n   (setq anio (read))\n   (cond\n     ((= remainder(anio 4) 0) \n       (if ((!= remainder(anio 100) 0) or \n           (= remainder(anio 400) 0))\n	      (print \"Bisiesto\")\n	      (print \"No Bisiesto\")\n        )\n    ((!= remainder(anio 4) 0)\n       (print \"No Bisiesto\"))\n    )\n)\n(bisiesto)");
        this.algoritmos.get(19).add("19");
        this.pasos.get(19).get(0).add("Llamado");
        this.pasos.get(19).get(0).add("Funcion");
        this.pasos.get(19).get(0).add("Impresión");
        this.pasos.get(19).get(0).add("Lectura");
        this.pasos.get(19).get(0).add("Cond");
        this.pasos.get(19).get(0).add("Modulo");
        this.pasos.get(19).get(0).add("Condicional");
        this.pasos.get(19).get(0).add("Modulo");
        this.pasos.get(19).get(0).add("Impresión");
        this.pasos.get(19).get(0).add("Diferente");
        this.pasos.get(19).get(0).add("Modulo");
        this.pasos.get(19).get(0).add("Impresión");
        /////////////////////////////////
        this.pasos.get(19).get(1).add("(bisiesto)");
        this.pasos.get(19).get(1).add("(defun bisiesto()");
        this.pasos.get(19).get(1).add("(print \"Ingrese un año: \")");
        this.pasos.get(19).get(1).add("(setq anio (read))");
        this.pasos.get(19).get(1).add("(cond");
        this.pasos.get(19).get(1).add("(= remainder(anio 4) 0)");
        this.pasos.get(19).get(1).add("(if ((!= remainder(anio 100))");
        this.pasos.get(19).get(1).add("(= remainder(anio 400) 0)");
        this.pasos.get(19).get(1).add("(print \"Bisiesto\")");
        this.pasos.get(19).get(1).add("!= ");
        this.pasos.get(19).get(1).add("(!= remainder(anio 4) 0)");
        this.pasos.get(19).get(1).add("(print \"No Bisiesto\"))");
        ////////////////   21    /////////////////
        this.algoritmos.get(20).add("#|\nCrear un algoritmo en Lisp que realice una \nmultiplicación  a  partir  de  sumas.\n|#");
        this.algoritmos.get(20).add("Funcion Multiplicacion_Sumas\n    imprimir  \"Ingrese el primer numero: \"\n    inicializar num1 = (valor por consola)\n    imprimir \"Ingrese el segundo numero: \"\n    inicializar num2 = (valor por consola)\n    inicializar resultado 0\n    desde i = 1 hasta num2 hacer:\n          resultado = (resultado + num1)\n    imprimir \"El resultado es: \", resultado\n\nllamar Funcion Multiplicacion_Sumas");
        this.algoritmos.get(20).add("(defun Multiplicacion_Sumas()\n   (print \"Ingrese el primer numero: \")\n   (setq num1 (read))\n   (print \"Ingrese el segundo numero: \")\n   (setq num2 (read))\n   (setq resultado 0)\n   (loop for i from 1 to num2\n      do(\n	 (set resultado (+ resultado num1))\n        )\n   )\n   (print \"El resultado es: ~a\" resultado)\n)\n\n(Multiplicacion_Sumas)");
        this.algoritmos.get(20).add("20");
        this.pasos.get(20).get(0).add("Llamado");
        this.pasos.get(20).get(0).add("Funcion");
        this.pasos.get(20).get(0).add("Impresión");
        this.pasos.get(20).get(0).add("Lectura");
        this.pasos.get(20).get(0).add("Impresión");
        this.pasos.get(20).get(0).add("Lectura");
        this.pasos.get(20).get(0).add("Asignación");
        this.pasos.get(20).get(0).add("for");
        this.pasos.get(20).get(0).add("do");
        this.pasos.get(20).get(0).add("Actualizar");
        this.pasos.get(20).get(0).add("for");
        this.pasos.get(20).get(0).add("do");
        this.pasos.get(20).get(0).add("Actualizar");
        this.pasos.get(20).get(0).add("for");
        this.pasos.get(20).get(0).add("do");
        this.pasos.get(20).get(0).add("Actualizar");
        this.pasos.get(20).get(0).add("for");
        this.pasos.get(20).get(0).add("do");
        this.pasos.get(20).get(0).add("Actualizar");
        this.pasos.get(20).get(0).add("Impresión");
        /////////////////////////////////
        this.pasos.get(20).get(1).add("(Multiplicacion_Sumas)");
        this.pasos.get(20).get(1).add("(defun Multiplicacion_Sumas()");
        this.pasos.get(20).get(1).add("(print \"Ingrese el primer numero: \")");
        this.pasos.get(20).get(1).add("(setq num1 (read))");
        this.pasos.get(20).get(1).add("(print \"Ingrese el segundo numero: \")");
        this.pasos.get(20).get(1).add("(setq num2 (read))");
        this.pasos.get(20).get(1).add("(setq resultado 0)");
        this.pasos.get(20).get(1).add("(loop for i from 1 to num2");
        this.pasos.get(20).get(1).add("do(");
        this.pasos.get(20).get(1).add("(set resultado (+ resultado num1))");
        this.pasos.get(20).get(1).add("(loop for i from 1 to num2");
        this.pasos.get(20).get(1).add("do(");
        this.pasos.get(20).get(1).add("(set resultado (+ resultado num1))");
        this.pasos.get(20).get(1).add("(loop for i from 1 to num2");
        this.pasos.get(20).get(1).add("do(");
        this.pasos.get(20).get(1).add("(set resultado (+ resultado num1))");
        this.pasos.get(20).get(1).add("(loop for i from 1 to num2");
        this.pasos.get(20).get(1).add("do(");
        this.pasos.get(20).get(1).add("(set resultado (+ resultado num1))");
        this.pasos.get(20).get(1).add("(print \"El resultado es: ~a\" resultado)");
        ////////////////   22    /////////////////
        this.algoritmos.get(21).add("#|\nCrear un algoritmo en Lisp que imprima un \ntriángulo  de  asteriscos,  la  base  de  dicho \ntriangulo  será  6.\n|#");
        this.algoritmos.get(21).add("Funcion triangulo\n    inicializar base = 6\n    inicializar aux = base\n    inicializar i = 1\n    desde q = 1 hasta aux hacer:\n        desde a = 0 hasta base hacer:\n             imprimir \" \"\n        desde b = 0 hasta i hacer:\n             imprimir \"*\"\n         salto de linea\n         base = ( base -1)\n         i = i + 1\n        \nllamar Funcion triangulo");
        this.algoritmos.get(21).add("(defun triangulo()\n   (setq base 6)\n   (setq aux base)\n   (setq i 1)\n   (loop for q from 1 to aux\n     do(loop for a from 0 to base\n	do (print \" \")\n     )\n     do(loop for b from 0 to i\n	do (print \"+\")\n     )\n     do(terpri)\n     do(set base (- base 1))\n     do(set i (+ i 1))\n   )\n)\n\n(triangulo)");
        this.algoritmos.get(21).add("21");
        this.pasos.get(21).get(0).add("Llamado");
        this.pasos.get(21).get(0).add("Funcion");
        this.pasos.get(21).get(0).add("Asignación");
        this.pasos.get(21).get(0).add("Asignación");
        this.pasos.get(21).get(0).add("Asignación");
        this.pasos.get(21).get(0).add("for");
        this.pasos.get(21).get(0).add("do");
        this.pasos.get(21).get(0).add("do");
        this.pasos.get(21).get(0).add("do");
        this.pasos.get(21).get(0).add("do");
        this.pasos.get(21).get(0).add("for");
        this.pasos.get(21).get(0).add("for");
        this.pasos.get(21).get(0).add("do");
        this.pasos.get(21).get(0).add("for");
        this.pasos.get(21).get(0).add("do");
        this.pasos.get(21).get(0).add("saltolinea");
        this.pasos.get(21).get(0).add("Asignación");
        this.pasos.get(21).get(0).add("Asignación");
        /////////////////////////////////
        this.pasos.get(21).get(1).add("(triangulo)");
        this.pasos.get(21).get(1).add("(defun triangulo()");
        this.pasos.get(21).get(1).add("(setq base 6)");
        this.pasos.get(21).get(1).add("(setq aux base)");
        this.pasos.get(21).get(1).add("(setq i 1)");
        this.pasos.get(21).get(1).add("(loop for q from 1 to aux");
        this.pasos.get(21).get(1).add("do(loop for a from 0 to base");
        this.pasos.get(21).get(1).add("do (print \" \")");
        this.pasos.get(21).get(1).add("do(loop for b from 0 to i");
        this.pasos.get(21).get(1).add("do (print \"+\")");
        this.pasos.get(21).get(1).add("(loop for q from 1 to aux");
        this.pasos.get(21).get(1).add("do(loop for a from 0 to base");
        this.pasos.get(21).get(1).add("do (print \" \")");
        this.pasos.get(21).get(1).add("do(loop for b from 0 to i");
        this.pasos.get(21).get(1).add("do (print \"+\")");
        this.pasos.get(21).get(1).add("do(terpri)");
        this.pasos.get(21).get(1).add("do(set base (- base 1))");
        this.pasos.get(21).get(1).add("do(set i (+ i 1))");
        ////////////////   23    /////////////////
        this.algoritmos.get(22).add("#|\nConstruir  un  algoritmo  en   Lisp   que \nimprima  un  cuadrado  de  lado   N,   el \ncuadrado está construido a partir de una \nsecuencia desde el número uno  hasta  el \nnúmero  N  ingresado  por  el  usuario.\n\nEjemplo: N=2\nComo N es igual a 2, se realiza un \ncuadrado 2x2:\n                            1 2\n                            1 2\n|#");
        this.algoritmos.get(22).add("Funcion Cuadrado\n    imprimir \"Ingrese el tamaño: \"\n    inicializar tam = (valor por consola)\n    desde i = 1 hasta tam hacer:\n        desde j = 1 hasta tam hacer:\n             imprimir j\n             imprimir \" \"\n        salto de linea\n        \nllamar Funcion Cuadrado");
        this.algoritmos.get(22).add("(defun Cuadrado()\n   (print \"Ingrese el tamaño: \")\n   (setq tam (read))\n   (loop for i from 1 to tam\n      do(loop for j from 1 to tam\n	 do(princ j)\n	 do(princ \" \")\n      )\n      do(terpri)\n   )\n)\n\n(Cuadrado)");
        this.algoritmos.get(22).add("22");
        this.pasos.get(22).get(0).add("Llamado");
        this.pasos.get(22).get(0).add("Funcion");
        this.pasos.get(22).get(0).add("Impresión");
        this.pasos.get(22).get(0).add("Lectura");
        this.pasos.get(22).get(0).add("for");
        this.pasos.get(22).get(0).add("for");
        this.pasos.get(22).get(0).add("do");
        this.pasos.get(22).get(0).add("do");
        this.pasos.get(22).get(0).add("for");
        this.pasos.get(22).get(0).add("for");
        this.pasos.get(22).get(0).add("do");
        this.pasos.get(22).get(0).add("do");
        this.pasos.get(22).get(0).add("for");
        this.pasos.get(22).get(0).add("for");
        this.pasos.get(22).get(0).add("do");
        this.pasos.get(22).get(0).add("do");
        this.pasos.get(22).get(0).add("saltolinea");
        /////////////////////////////////
        this.pasos.get(22).get(1).add("(Cuadrado)");
        this.pasos.get(22).get(1).add("(defun Cuadrado()");
        this.pasos.get(22).get(1).add("(print \"Ingrese el tamaño: \")");
        this.pasos.get(22).get(1).add("(setq tam (read))");
        this.pasos.get(22).get(1).add("(loop for i from 1 to tam");
        this.pasos.get(22).get(1).add("do(loop for j from 1 to tam");
        this.pasos.get(22).get(1).add("do(princ j)");
        this.pasos.get(22).get(1).add("do(princ \" \")");
        this.pasos.get(22).get(1).add("(loop for i from 1 to tam");
        this.pasos.get(22).get(1).add("do(loop for j from 1 to tam");
        this.pasos.get(22).get(1).add("do(princ j)");
        this.pasos.get(22).get(1).add("do(princ \" \")");
        this.pasos.get(22).get(1).add("(loop for i from 1 to tam");
        this.pasos.get(22).get(1).add("do(loop for j from 1 to tam");
        this.pasos.get(22).get(1).add("do(princ j)");
        this.pasos.get(22).get(1).add("do(princ \" \")");
        this.pasos.get(22).get(1).add("do(terpri)");
        ////////////////   24    /////////////////
        this.algoritmos.get(23).add("#|\nConstruir un algoritmo el Lisp que calcule  el\nfactorial de un numero ingresado por consola\n(n!)\n|#");
        this.algoritmos.get(23).add("Funcion factorial\n    imprimir  \"Ingrese un numero: \"\n    inicializar n = (valor por consola)\n    inicializar fact = 1\n    desde i = 1 hasta n hacer:\n        fact = fact * i\n            imprimir \"El resultado es: \", fact\n\nllamar Funcion factorial");
        this.algoritmos.get(23).add("(defun factorial()\n   (print \"ingrese un numero: \")\n   (setq n (read))\n   (setq fact 1)\n   (loop for i from 1 to n\n     do(\n        (set fact (* fact i))\n     )\n   )\n)\n\n(factorial)");
        this.algoritmos.get(23).add("23");
        this.pasos.get(23).get(0).add("Llamado");
        this.pasos.get(23).get(0).add("Funcion");
        this.pasos.get(23).get(0).add("Impresión");
        this.pasos.get(23).get(0).add("Lectura");
        this.pasos.get(23).get(0).add("Asignación");
        this.pasos.get(23).get(0).add("for");
        this.pasos.get(23).get(0).add("do");
        this.pasos.get(23).get(0).add("Actualizar");
        this.pasos.get(23).get(0).add("for");
        this.pasos.get(23).get(0).add("do");
        this.pasos.get(23).get(0).add("Actualizar");
        this.pasos.get(23).get(0).add("for");
        this.pasos.get(23).get(0).add("do");
        this.pasos.get(23).get(0).add("Actualizar");
        this.pasos.get(23).get(0).add("for");
        this.pasos.get(23).get(0).add("do");
        this.pasos.get(23).get(0).add("Actualizar");
        /////////////////////////////////
        this.pasos.get(23).get(1).add("(factorial)");
        this.pasos.get(23).get(1).add("(defun factorial()");
        this.pasos.get(23).get(1).add("(print \"ingrese un numero: \")");
        this.pasos.get(23).get(1).add("(setq n (read))");
        this.pasos.get(23).get(1).add("(setq fact 1)");
        this.pasos.get(23).get(1).add("(loop for i from 1 to n");
        this.pasos.get(23).get(1).add("do(");
        this.pasos.get(23).get(1).add("(set fact (* fact i))");
        this.pasos.get(23).get(1).add("(loop for i from 1 to n");
        this.pasos.get(23).get(1).add("do(");
        this.pasos.get(23).get(1).add("(set fact (* fact i))");
        this.pasos.get(23).get(1).add("(loop for i from 1 to n");
        this.pasos.get(23).get(1).add("do(");
        this.pasos.get(23).get(1).add("(set fact (* fact i))");
        this.pasos.get(23).get(1).add("(loop for i from 1 to n");
        this.pasos.get(23).get(1).add("do(");
        this.pasos.get(23).get(1).add("(set fact (* fact i))");
        ////////////////   25    /////////////////
        this.algoritmos.get(24).add("#|\nConstruir un algoritmo el Lisp que muestre \nla   tabla  de  multiplicar   de   un    numero\ningresado   por   consola\n|#");
        this.algoritmos.get(24).add("Funcion TablaMultiplicar\n    imprimir  \"Ingrese un numero: \"\n    inicializar num = (valor por consola)\n    desde i = 1 hasta num hacer:\n        imprimir num, \" * \", i, \" = \", (num*i)\n    \nllamar Funcion TablaMultiplicar");
        this.algoritmos.get(24).add("(defun TablaMultiplicar()\n   (print \"ingrese un numero: \")\n   (setq num (read))\n   (loop for i from 1 to num\n     do(\n         (print \"~d * ~d = ~d\" num i (* num i))\n     )\n   )\n)\n\n(TablaMultiplicar)");
        this.algoritmos.get(24).add("24");
        this.pasos.get(24).get(0).add("Llamado");
        this.pasos.get(24).get(0).add("Funcion");
        this.pasos.get(24).get(0).add("Impresión");
        this.pasos.get(24).get(0).add("Lectura");
        this.pasos.get(24).get(0).add("for");
        this.pasos.get(24).get(0).add("do");
        this.pasos.get(24).get(0).add("Impresión");
        this.pasos.get(24).get(0).add("for");
        this.pasos.get(24).get(0).add("do");
        this.pasos.get(24).get(0).add("Impresión");
        this.pasos.get(24).get(0).add("for");
        this.pasos.get(24).get(0).add("do");
        this.pasos.get(24).get(0).add("Impresión");
        this.pasos.get(24).get(0).add("for");
        this.pasos.get(24).get(0).add("do");
        this.pasos.get(24).get(0).add("Impresión");
        this.pasos.get(24).get(0).add("for");
        this.pasos.get(24).get(0).add("do");
        this.pasos.get(24).get(0).add("Impresión");
        this.pasos.get(24).get(0).add("");
        this.pasos.get(24).get(0).add("");
        /////////////////////////////////
        this.pasos.get(24).get(1).add("(TablaMultiplicar)");
        this.pasos.get(24).get(1).add("(defun TablaMultiplicar()");
        this.pasos.get(24).get(1).add("(print \"ingrese un numero: \")");
        this.pasos.get(24).get(1).add("(setq num (read))");
        this.pasos.get(24).get(1).add("(loop for i from 1 to num");
        this.pasos.get(24).get(1).add("do(");
        this.pasos.get(24).get(1).add("(print \"~d * ~d = ~d\" num i (* num i))");
        this.pasos.get(24).get(1).add("(loop for i from 1 to num");
        this.pasos.get(24).get(1).add("do(");
        this.pasos.get(24).get(1).add("(print \"~d * ~d = ~d\" num i (* num i))");
        this.pasos.get(24).get(1).add("(loop for i from 1 to num");
        this.pasos.get(24).get(1).add("do(");
        this.pasos.get(24).get(1).add("(print \"~d * ~d = ~d\" num i (* num i))");
        this.pasos.get(24).get(1).add("(loop for i from 1 to num");
        this.pasos.get(24).get(1).add("do(");
        this.pasos.get(24).get(1).add("(print \"~d * ~d = ~d\" num i (* num i))");
        this.pasos.get(24).get(1).add("(loop for i from 1 to num");
        this.pasos.get(24).get(1).add("do(");
        this.pasos.get(24).get(1).add("(print \"~d * ~d = ~d\" num i (* num i))");
        ////////////////   26    /////////////////
        this.algoritmos.get(25).add("#|\nConstruir  un  algoritmo  en Lisp que nos \nmuestre  de  dos en dos los numeros de 2 \nhasta   20\n|#");
        this.algoritmos.get(25).add("Funcion DeDosEnDos\n    inicializar num = 0\n    desde i = 0 hasta 20 hacer:\n        num = num + 2\n        imprimir num\nllamar Funcion DeDosEnDos");
        this.algoritmos.get(25).add("(defun DeDosEnDos()\n   (setq num 0)\n   (loop for i from 0 to 20\n      do(set num (+ num 2))\n      do((println num))\n   )  \n)\n\n(DeDosEnDos)");
        this.algoritmos.get(25).add("25");
        this.pasos.get(25).get(0).add("Llamado");
        this.pasos.get(25).get(0).add("Funcion");
        this.pasos.get(25).get(0).add("Asignación");
        this.pasos.get(25).get(0).add("for");
        this.pasos.get(25).get(0).add("do");
        this.pasos.get(25).get(0).add("do");
        this.pasos.get(25).get(0).add("for");
        this.pasos.get(25).get(0).add("do");
        this.pasos.get(25).get(0).add("do");
        this.pasos.get(25).get(0).add("for");
        this.pasos.get(25).get(0).add("do");
        this.pasos.get(25).get(0).add("do");
        this.pasos.get(25).get(0).add("for");
        this.pasos.get(25).get(0).add("do");
        this.pasos.get(25).get(0).add("do");
        this.pasos.get(25).get(0).add("for");
        this.pasos.get(25).get(0).add("do");
        this.pasos.get(25).get(0).add("do");
        /////////////////////////////////
        this.pasos.get(25).get(1).add("(DeDosEnDos)");
        this.pasos.get(25).get(1).add("(defun DeDosEnDos()");
        this.pasos.get(25).get(1).add("(setq num 0)");
        this.pasos.get(25).get(1).add("(loop for i from 0 to 20");
        this.pasos.get(25).get(1).add("do(set num (+ num 2))");
        this.pasos.get(25).get(1).add("do((println num))");
        this.pasos.get(25).get(1).add("(loop for i from 0 to 20");
        this.pasos.get(25).get(1).add("do(set num (+ num 2))");
        this.pasos.get(25).get(1).add("do((println num))");
        this.pasos.get(25).get(1).add("(loop for i from 0 to 20");
        this.pasos.get(25).get(1).add("do(set num (+ num 2))");
        this.pasos.get(25).get(1).add("do((println num))");
        this.pasos.get(25).get(1).add("(loop for i from 0 to 20");
        this.pasos.get(25).get(1).add("do(set num (+ num 2))");
        this.pasos.get(25).get(1).add("do((println num))");
        this.pasos.get(25).get(1).add("(loop for i from 0 to 20");
        this.pasos.get(25).get(1).add("do(set num (+ num 2))");
        this.pasos.get(25).get(1).add("do((println num))");
        ////////////////   27    /////////////////
        this.algoritmos.get(26).add("#|\nConstruir un algoritmo en Lisp que muestre \nla  sumatoria  de  los  multiplos  de  2  en un \nrango de 1 hasta 20\n|#");
        this.algoritmos.get(26).add("Funcion sumatoria\n    inicializar total = 0\n    desde i = 1 hasta 20 hacer:\n        si (i modulo 2) = 0\n            total = total+i\n    imprimir \"Sumatoria de los múltiplos de 2:\", total\n    \nllamar Funcion sumatoria");
        this.algoritmos.get(26).add("(defun sumatoria()\n (setq tot 0)\n (loop for i from 1 to 20\n    do(\n        (if (= remainder(i 2) 0)\n           (set tot (+ tot i))\n        )\n    )\n  )\n  (print \"Sumatoria de los múltiplos de 2: ~d\" tot)\n)\n\n(sumatoria)");
        this.algoritmos.get(26).add("26");
        this.pasos.get(26).get(0).add("Llamado");
        this.pasos.get(26).get(0).add("Funcion");
        this.pasos.get(26).get(0).add("Asignación");
        this.pasos.get(26).get(0).add("for");
        this.pasos.get(26).get(0).add("do");
        this.pasos.get(26).get(0).add("Condicional");
        this.pasos.get(26).get(0).add("Actualizar");
        this.pasos.get(26).get(0).add("for");
        this.pasos.get(26).get(0).add("do");
        this.pasos.get(26).get(0).add("Condicional");
        this.pasos.get(26).get(0).add("Actualizar");
        this.pasos.get(26).get(0).add("for");
        this.pasos.get(26).get(0).add("do");
        this.pasos.get(26).get(0).add("Condicional");
        this.pasos.get(26).get(0).add("Actualizar");
        this.pasos.get(26).get(0).add("for");
        this.pasos.get(26).get(0).add("do");
        this.pasos.get(26).get(0).add("Condicional");
        this.pasos.get(26).get(0).add("Actualizar");
        this.pasos.get(26).get(0).add("Impresión");
        /////////////////////////////////
        this.pasos.get(26).get(1).add("(sumatoria)");
        this.pasos.get(26).get(1).add("(defun sumatoria()");
        this.pasos.get(26).get(1).add("(setq tot 0)");
        this.pasos.get(26).get(1).add("(loop for i from 1 to 20");
        this.pasos.get(26).get(1).add("do(");
        this.pasos.get(26).get(1).add("(if (= remainder(i 2) 0)");
        this.pasos.get(26).get(1).add("(set tot (+ tot i))");
        this.pasos.get(26).get(1).add("(loop for i from 1 to 20");
        this.pasos.get(26).get(1).add("do(");
        this.pasos.get(26).get(1).add("(if (= remainder(i 2) 0)");
        this.pasos.get(26).get(1).add("(set tot (+ tot i))");
        this.pasos.get(26).get(1).add("(loop for i from 1 to 20");
        this.pasos.get(26).get(1).add("do(");
        this.pasos.get(26).get(1).add("(if (= remainder(i 2) 0)");
        this.pasos.get(26).get(1).add("(set tot (+ tot i))");
        this.pasos.get(26).get(1).add("(loop for i from 1 to 20");
        this.pasos.get(26).get(1).add("do(");
        this.pasos.get(26).get(1).add("(if (= remainder(i 2) 0)");
        this.pasos.get(26).get(1).add("(set tot (+ tot i))");
        this.pasos.get(26).get(1).add("(print \"Sumatoria de los múltiplos de 2: ~d\" tot)");
        ////////////////   28    /////////////////
        this.algoritmos.get(27).add("#|\nCrear un algoritmo que muestre los primeros\n10  números  de  la  sucesión  de  Fibonacci. \nLa sucesión comienza con los números 0 y 1,\na  partir  de  éstos, cada elemento es la suma\nde los dos números anteriores en la \nsecuencia: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55...\n|#");
        this.algoritmos.get(27).add("Funcion Fibonacci\n    inicializar n1 = 0\n    inicializar n2 = 1\n    inicializar n3 = 0\n    imprimir n1\n    imprimir n2\n    desde i = 0 hasta 8 hacer:\n           n3 = n1 + n2\n           imprimir n3\n           n1 = n2\n           n2 = n3\n    \nllamar Funcion Fibonacci");
        this.algoritmos.get(27).add("(defun Fibonacci()\n    (setq n1 0)\n    (setq n2 1)\n    (setq n3 0)\n    (println n1)\n    (println n2)\n    (loop for i from 0 to 8\n        do(set n3 (+ n1 n2))\n        do(println n3)\n        do(set n1 n2)\n        do(set n2 n3)\n	)\n)\n\n(Fibonacci)");
        this.algoritmos.get(27).add("27");
        this.pasos.get(27).get(0).add("Llamado");
        this.pasos.get(27).get(0).add("Funcion");
        this.pasos.get(27).get(0).add("Asignación");
        this.pasos.get(27).get(0).add("Asignación");
        this.pasos.get(27).get(0).add("Asignación");
        this.pasos.get(27).get(0).add("Impresión");
        this.pasos.get(27).get(0).add("Impresión");
        this.pasos.get(27).get(0).add("for");
        this.pasos.get(27).get(0).add("Actualizar");
        this.pasos.get(27).get(0).add("Impresión");
        this.pasos.get(27).get(0).add("Actualizar");
        this.pasos.get(27).get(0).add("Actualizar");
        this.pasos.get(27).get(0).add("for");
        this.pasos.get(27).get(0).add("Actualizar");
        this.pasos.get(27).get(0).add("Impresión");
        this.pasos.get(27).get(0).add("Actualizar");
        this.pasos.get(27).get(0).add("Actualizar");
        this.pasos.get(27).get(0).add("for");
        this.pasos.get(27).get(0).add("Actualizar");
        this.pasos.get(27).get(0).add("Impresión");
        this.pasos.get(27).get(0).add("Actualizar");
        this.pasos.get(27).get(0).add("Actualizar");
        /////////////////////////////////
        this.pasos.get(27).get(1).add("(Fibonacci)");
        this.pasos.get(27).get(1).add("(defun Fibonacci()");
        this.pasos.get(27).get(1).add("(setq n1 0)");
        this.pasos.get(27).get(1).add("(setq n2 1)");
        this.pasos.get(27).get(1).add("(setq n3 0)");
        this.pasos.get(27).get(1).add("(println n1)");
        this.pasos.get(27).get(1).add("(println n2)");
        this.pasos.get(27).get(1).add("(loop for i from 0 to 8");
        this.pasos.get(27).get(1).add("do(set n3 (+ n1 n2))");
        this.pasos.get(27).get(1).add("do(println n3)");
        this.pasos.get(27).get(1).add("do(set n1 n2)");
        this.pasos.get(27).get(1).add("do(set n2 n3)");
        this.pasos.get(27).get(1).add("(loop for i from 0 to 8");
        this.pasos.get(27).get(1).add("do(set n3 (+ n1 n2))");
        this.pasos.get(27).get(1).add("do(println n3)");
        this.pasos.get(27).get(1).add("do(set n1 n2)");
        this.pasos.get(27).get(1).add("do(set n2 n3)");
        this.pasos.get(27).get(1).add("(loop for i from 0 to 8");
        this.pasos.get(27).get(1).add("do(set n3 (+ n1 n2))");
        this.pasos.get(27).get(1).add("do(println n3)");
        this.pasos.get(27).get(1).add("do(set n1 n2)");
        this.pasos.get(27).get(1).add("do(set n2 n3)");
        ////////////////   29    /////////////////
        this.algoritmos.get(28).add("#|\nConstruir un algoritmo en Lisp que muestre\nel  resultado  de  elevar  un numero A a una \npotencia B mediante multiplicaciones\n|#");
        this.algoritmos.get(28).add("Funcion potencia\n    imprimir  \"Ingrese un numero a: \"\n    inicializar a = (valor por consola)\n    imprimir  \"Ingrese un numero b: \"\n    inicializar b = (valor por consola)\n    inicializar num = 1\n    desde i = 1 hasta b hacer:\n        num = num * a\n    imprimir \"El numero a la potencia es: \", num\n    \nllamar Funcion potencia");
        this.algoritmos.get(28).add("(defun potencia()\n    (print \"Ingrese un numero a: \")\n    (setq a (read))\n    (print \"Ingrese un numero b: \")\n    (setq b (read))\n    (setq num 1)\n    (loop for i from 1 to b\n        do(set num (* num a))\n    )\n    (print \"El numero a la potencia es: ~d\" num)\n)\n\n(potencia)");
        this.algoritmos.get(28).add("28");
        this.pasos.get(28).get(0).add("Llamado");
        this.pasos.get(28).get(0).add("Funcion");
        this.pasos.get(28).get(0).add("Impresión");
        this.pasos.get(28).get(0).add("Lectura");
        this.pasos.get(28).get(0).add("Impresión");
        this.pasos.get(28).get(0).add("Lectura");
        this.pasos.get(28).get(0).add("Asignación");
        this.pasos.get(28).get(0).add("for");
        this.pasos.get(28).get(0).add("Actualizar");
        this.pasos.get(28).get(0).add("for");
        this.pasos.get(28).get(0).add("Actualizar");
        this.pasos.get(28).get(0).add("for");
        this.pasos.get(28).get(0).add("Actualizar");
        this.pasos.get(28).get(0).add("Impresión");
        /////////////////////////////////
        this.pasos.get(28).get(1).add("(potencia)");
        this.pasos.get(28).get(1).add("(defun potencia()");
        this.pasos.get(28).get(1).add("(print \"Ingrese un numero a: \")");
        this.pasos.get(28).get(1).add("(setq a (read))");
        this.pasos.get(28).get(1).add("(print \"Ingrese un numero b: \")");
        this.pasos.get(28).get(1).add("(setq b (read))");
        this.pasos.get(28).get(1).add("(setq num 1)");
        this.pasos.get(28).get(1).add("(loop for i from 1 to b");
        this.pasos.get(28).get(1).add("do(set num (* num a))");
        this.pasos.get(28).get(1).add("(loop for i from 1 to b");
        this.pasos.get(28).get(1).add("do(set num (* num a))");
        this.pasos.get(28).get(1).add("(loop for i from 1 to b");
        this.pasos.get(28).get(1).add("do(set num (* num a))");
        this.pasos.get(28).get(1).add("(print \"El numero a la potencia es: ~d\" num)");
        ////////////////   30    /////////////////
        this.algoritmos.get(29).add("#|\nConstruir un algoritmo en Lisp que nos pida tres numeros \ndonde el primero y el segundo son limites de un intervalo\ny nos diga si el tercer numero ingresado por el usuario\nse encuentra en este intervalo\n|#");
        this.algoritmos.get(29).add("Funcion intervalo\n    imprimir  \"Ingrese un numero a: \"\n    inicializar a = (valor por consola)\n    imprimir  \"Ingrese un numero b: \"\n    inicializar b = (valor por consola)\n    imprimir  \"Ingrese un numero c: \"\n    inicializar c = (valor por consola)\n    desde i = a hasta b hacer:\n        si (c = i)\n            imprimir \"Numero existente\"\n    \nllamar Funcion intervalo");
        this.algoritmos.get(29).add("(defun intervalo()\n    (print \"Ingrese un numero a: \")\n    (setq a (read))\n    (print \"Ingrese un numero b: \")\n    (setq b (read))\n    (print \"Ingrese un numero c: \")\n    (setq c (read))\n    (loop for i from a to b\n      do(\n         (if (= c i)\n            (print \"Numero existente\")\n            (void)\n         )\n      )\n   )\n)\n\n(intervalo)");
        this.algoritmos.get(29).add("29");
        this.pasos.get(29).get(0).add("Llamado");
        this.pasos.get(29).get(0).add("Funcion");
        this.pasos.get(29).get(0).add("Impresión");
        this.pasos.get(29).get(0).add("Lectura");
        this.pasos.get(29).get(0).add("Impresión");
        this.pasos.get(29).get(0).add("Lectura");
        this.pasos.get(29).get(0).add("Impresión");
        this.pasos.get(29).get(0).add("Lectura");
        this.pasos.get(29).get(0).add("for");
        this.pasos.get(29).get(0).add("do");
        this.pasos.get(29).get(0).add("Condicional");
        this.pasos.get(29).get(0).add("Impresión");
        this.pasos.get(29).get(0).add("Vacio");
        this.pasos.get(29).get(0).add("for");
        this.pasos.get(29).get(0).add("do");
        this.pasos.get(29).get(0).add("Condicional");
        this.pasos.get(29).get(0).add("Impresión");
        this.pasos.get(29).get(0).add("Vacio");
        this.pasos.get(29).get(0).add("for");
        this.pasos.get(29).get(0).add("do");
        this.pasos.get(29).get(0).add("Condicional");
        this.pasos.get(29).get(0).add("Impresión");
        this.pasos.get(29).get(0).add("Vacio");
        /////////////////////////////////
        this.pasos.get(29).get(1).add("(intervalo)");
        this.pasos.get(29).get(1).add("(defun intervalo()");
        this.pasos.get(29).get(1).add("(print \"Ingrese un numero a: \")");
        this.pasos.get(29).get(1).add("(setq a (read))");
        this.pasos.get(29).get(1).add("(print \"Ingrese un numero b: \")");
        this.pasos.get(29).get(1).add("(setq a (read))");
        this.pasos.get(29).get(1).add("(print \"Ingrese un numero c: \")");
        this.pasos.get(29).get(1).add("(setq a (read))");
        this.pasos.get(29).get(1).add("(loop for i from a to b");
        this.pasos.get(29).get(1).add("do(");
        this.pasos.get(29).get(1).add("(if (= c i)");
        this.pasos.get(29).get(1).add("(print \"Numero existente\")");
        this.pasos.get(29).get(1).add("(void)");
        this.pasos.get(29).get(1).add("(loop for i from a to b");
        this.pasos.get(29).get(1).add("do(");
        this.pasos.get(29).get(1).add("(if (= c i)");
        this.pasos.get(29).get(1).add("(print \"Numero existente\")");
        this.pasos.get(29).get(1).add("(void)");
        this.pasos.get(29).get(1).add("(loop for i from a to b");
        this.pasos.get(29).get(1).add("do(");
        this.pasos.get(29).get(1).add("(if (= c i)");
        this.pasos.get(29).get(1).add("(print \"Numero existente\")");
        this.pasos.get(29).get(1).add("(void)");
        ////////////////   31    /////////////////
        this.algoritmos.get(30).add("#|\nConstruir un algoritmo en Lisp que muestre\nlos  numeros  del  1  al  10 haciendo uso del\nciclo   loop.\n|#");
        this.algoritmos.get(30).add("Funcion Numeros\n    inicializar a = 1\n    mientras a < 11 hacer:\n        imprimir a\n        a = a + 1\nllamar Funcion Numeros");
        this.algoritmos.get(30).add("(defun Numeros()\n    (setq a 1)\n    (loop\n        (print a)\n        (terpri)\n        (set a (+ a 1))\n        (when (< a 11) (return a))\n    )\n)\n\n(Numeros)");
        this.algoritmos.get(30).add("30");
        this.pasos.get(30).get(0).add("Llamado");
        this.pasos.get(30).get(0).add("Funcion");
        this.pasos.get(30).get(0).add("Asignación");
        this.pasos.get(30).get(0).add("ciclo");
        this.pasos.get(30).get(0).add("Impresión");
        this.pasos.get(30).get(0).add("saltolinea");
        this.pasos.get(30).get(0).add("Actualizar");
        this.pasos.get(30).get(0).add("mientras");
        this.pasos.get(30).get(0).add("ciclo");
        this.pasos.get(30).get(0).add("Impresión");
        this.pasos.get(30).get(0).add("saltolinea");
        this.pasos.get(30).get(0).add("Actualizar");
        this.pasos.get(30).get(0).add("mientras");
        this.pasos.get(30).get(0).add("ciclo");
        this.pasos.get(30).get(0).add("Impresión");
        this.pasos.get(30).get(0).add("saltolinea");
        this.pasos.get(30).get(0).add("Actualizar");
        this.pasos.get(30).get(0).add("mientras");
        /////////////////////////////////
        this.pasos.get(30).get(1).add("(Numeros)");
        this.pasos.get(30).get(1).add("(defun Numeros()");
        this.pasos.get(30).get(1).add("(setq a 1)");
        this.pasos.get(30).get(1).add("(loop");
        this.pasos.get(30).get(1).add("(print a)");
        this.pasos.get(30).get(1).add("(terpri)");
        this.pasos.get(30).get(1).add("(set a (+ a 1))");
        this.pasos.get(30).get(1).add("(when (< a 11) (return a))");
        this.pasos.get(30).get(1).add("(loop");
        this.pasos.get(30).get(1).add("(print a)");
        this.pasos.get(30).get(1).add("(terpri)");
        this.pasos.get(30).get(1).add("(set a (+ a 1))");
        this.pasos.get(30).get(1).add("(when (< a 11) (return a))");
        this.pasos.get(30).get(1).add("(loop");
        this.pasos.get(30).get(1).add("(print a)");
        this.pasos.get(30).get(1).add("(terpri)");
        this.pasos.get(30).get(1).add("(set a (+ a 1))");
        this.pasos.get(30).get(1).add("(when (< a 11) (return a))");
        ////////////////   32    /////////////////
        this.algoritmos.get(31).add("#|\nConstruir un algoritmo en Lisp que muestre\núnicamente,  los  números  pares del 1 al 10 \nhaciendo  uso  del  ciclo  loop.\n|#");
        this.algoritmos.get(31).add("Funcion NumerosPares\n    inicializar a = 1\n    mientras a < 11 hacer:\n        si (a modulo 2) = 0:\n            imprimir a\n        a = a + 1\nllamar Funcion NumerosPares");
        this.algoritmos.get(31).add("(defun NumerosPares()\n    (setq a 1)\n    (loop\n        (if (= remainder(a 2) 0)\n            (print a)\n            (terpri)\n        )\n        (set a (+ a 1))\n        (when (< a 11) (return a))\n    )\n)\n\n(NumerosPares)");
        this.algoritmos.get(31).add("31");
        this.pasos.get(31).get(0).add("Llamado");
        this.pasos.get(31).get(0).add("Funcion");
        this.pasos.get(31).get(0).add("Asignación");
        this.pasos.get(31).get(0).add("ciclo");
        this.pasos.get(31).get(0).add("Condicional");
        this.pasos.get(31).get(0).add("Impresión");
        this.pasos.get(31).get(0).add("saltolinea");
        this.pasos.get(31).get(0).add("Actualizar");
        this.pasos.get(31).get(0).add("mientras");
        this.pasos.get(31).get(0).add("ciclo");
        this.pasos.get(31).get(0).add("Condicional");
        this.pasos.get(31).get(0).add("Impresión");
        this.pasos.get(31).get(0).add("saltolinea");
        this.pasos.get(31).get(0).add("Actualizar");
        this.pasos.get(31).get(0).add("mientras");
        this.pasos.get(31).get(0).add("ciclo");
        this.pasos.get(31).get(0).add("Condicional");
        this.pasos.get(31).get(0).add("Impresión");
        this.pasos.get(31).get(0).add("saltolinea");
        this.pasos.get(31).get(0).add("Actualizar");
        this.pasos.get(31).get(0).add("mientras");
        /////////////////////////////////
        this.pasos.get(31).get(1).add("(NumerosPares)");
        this.pasos.get(31).get(1).add("(defun NumerosPares()");
        this.pasos.get(31).get(1).add("(setq a 1)");
        this.pasos.get(31).get(1).add("(loop");
        this.pasos.get(31).get(1).add("(if (= remainder(a 2) 0)");
        this.pasos.get(31).get(1).add("(print a)");
        this.pasos.get(31).get(1).add("(terpri)");
        this.pasos.get(31).get(1).add("(set a (+ a 1))");
        this.pasos.get(31).get(1).add("(when (< a 11) (return a))");
        this.pasos.get(31).get(1).add("(loop");
        this.pasos.get(31).get(1).add("(if (= remainder(a 2) 0)");
        this.pasos.get(31).get(1).add("(print a)");
        this.pasos.get(31).get(1).add("(terpri)");
        this.pasos.get(31).get(1).add("(set a (+ a 1))");
        this.pasos.get(31).get(1).add("(when (< a 11) (return a))");
        this.pasos.get(31).get(1).add("(loop");
        this.pasos.get(31).get(1).add("(if (= remainder(a 2) 0)");
        this.pasos.get(31).get(1).add("(print a)");
        this.pasos.get(31).get(1).add("(terpri)");
        this.pasos.get(31).get(1).add("(set a (+ a 1))");
        this.pasos.get(31).get(1).add("(when (< a 11) (return a))");
        ////////////////   33    /////////////////
        this.algoritmos.get(32).add("#|\nConstruir un algoritmo en Lisp que mediante\nciclos  loop  mostrar  la suma de los numeros\npares  entre  1  y  10.\n|#");
        this.algoritmos.get(32).add("Funcion sumaPares\n    inicializar a = 1\n    inicializar suma = 0\n    mientras a < 11 hacer:\n        si (a modulo 2) = 0:\n            suma = suma + a\n        a = a + 1\nllamar Funcion sumaPares");
        this.algoritmos.get(32).add("(defun sumaPares()\n    (setq a 1)\n    (setq sum 0)\n    (loop\n        (if (= remainder(a 2) 0)\n            (set sum (+ sum a))\n            (terpri)\n        )\n        (set a (+ a 1))\n        (when (< a 11) (return a))\n    )\n    (print sum)\n)\n\n(sumaPares)");
        this.algoritmos.get(32).add("32");
        this.pasos.get(32).get(0).add("Llamado");
        this.pasos.get(32).get(0).add("Funcion");
        this.pasos.get(32).get(0).add("Asignación");
        this.pasos.get(32).get(0).add("Asignación");
        this.pasos.get(32).get(0).add("ciclo");
        this.pasos.get(32).get(0).add("Condicional");
        this.pasos.get(32).get(0).add("Actualizar");
        this.pasos.get(32).get(0).add("saltolinea");
        this.pasos.get(32).get(0).add("Actualizar");
        this.pasos.get(32).get(0).add("mientras");
        this.pasos.get(32).get(0).add("ciclo");
        this.pasos.get(32).get(0).add("Condicional");
        this.pasos.get(32).get(0).add("Actualizar");
        this.pasos.get(32).get(0).add("saltolinea");
        this.pasos.get(32).get(0).add("Actualizar");
        this.pasos.get(32).get(0).add("mientras");
        this.pasos.get(32).get(0).add("ciclo");
        this.pasos.get(32).get(0).add("Condicional");
        this.pasos.get(32).get(0).add("Actualizar");
        this.pasos.get(32).get(0).add("saltolinea");
        this.pasos.get(32).get(0).add("Actualizar");
        this.pasos.get(32).get(0).add("mientras");
        this.pasos.get(32).get(0).add("Impresión");
        /////////////////////////////////
        this.pasos.get(32).get(1).add("(sumaPares");
        this.pasos.get(32).get(1).add("(defun sumaPares()");
        this.pasos.get(32).get(1).add("(setq a 1)");
        this.pasos.get(32).get(1).add("(setq sum 0)");
        this.pasos.get(32).get(1).add("(loop");
        this.pasos.get(32).get(1).add("(if (= remainder(a 2) 0)");
        this.pasos.get(32).get(1).add("(set sum (+ sum a))");
        this.pasos.get(32).get(1).add("(terpri)");
        this.pasos.get(32).get(1).add("(set a (+ a 1))");
        this.pasos.get(32).get(1).add("(when (< a 11) (return a))");
        this.pasos.get(32).get(1).add("(loop");
        this.pasos.get(32).get(1).add("(if (= remainder(a 2) 0)");
        this.pasos.get(32).get(1).add("(set sum (+ sum a))");
        this.pasos.get(32).get(1).add("(terpri)");
        this.pasos.get(32).get(1).add("(set a (+ a 1))");
        this.pasos.get(32).get(1).add("(when (< a 11) (return a))");
        this.pasos.get(32).get(1).add("(loop");
        this.pasos.get(32).get(1).add("(if (= remainder(a 2) 0)");
        this.pasos.get(32).get(1).add("(set sum (+ sum a))");
        this.pasos.get(32).get(1).add("(terpri)");
        this.pasos.get(32).get(1).add("(set a (+ a 1))");
        this.pasos.get(32).get(1).add("(when (< a 11) (return a))");
        this.pasos.get(32).get(1).add("(print sum)");
        ////////////////   34    /////////////////
        this.algoritmos.get(33).add("#|\nConstruir un algoritmo en Lisp que pida 2\nnúmeros  enteros, e  imprima los números\npares  que  existen  entre  los  2, \n\nNota: \nDesarrollar  mediante  ciclos  loop\n|#");
        this.algoritmos.get(33).add("Funcion sumaRangos\n    (print \"Ingrese un numero a: \")\n	(setq a (read))\n    (print \"Ingrese un numero b: \")\n	(setq b (read))\n    inicializar tope = 1\n    inicializar inicio = 1\n    inicializar suma = 0\n    si a > b:\n        tope = a\n        inicio = b\n    sino: \n        tope = b\n        inicio = a\n    mientras inicio < tope hacer:\n        si (inicio modulo 2) = 0:\n            suma = suma + inicio\n        inicio = inicio + 1\nllamar Funcion sumaRangos ");
        this.algoritmos.get(33).add("(defun sumaRangos()\n    (print \"Ingrese un numero a: \")\n    (setq a (read))\n    (print \"Ingrese un numero b: \")\n    (setq b (read))\n    (setq tope 1)\n    (setq inicio 1)\n    (setq sum 0)\n    (if (> a b)\n        (begin\n            (set tope a)\n            (set inicio b)\n        )\n        (begin\n            (set tope b)\n            (set inicio a)\n        )\n    )\n    (loop\n        (if (= remainder(inicio 2) 0)\n            (set sum (+ sum inicio))\n            (terpri)\n        )\n        (set inicio (+ inicio 1))\n        (when (< inicio tope) (return inicio))\n    )\n    (print sum)\n)\n\n(sumaRangos)");
        this.algoritmos.get(33).add("33");
        this.pasos.get(33).get(0).add("Llamado");
        this.pasos.get(33).get(0).add("Funcion");
        this.pasos.get(33).get(0).add("Impresión");
        this.pasos.get(33).get(0).add("Lectura");
        this.pasos.get(33).get(0).add("Impresión");
        this.pasos.get(33).get(0).add("Lectura");
        this.pasos.get(33).get(0).add("Asignación");
        this.pasos.get(33).get(0).add("Asignación");
        this.pasos.get(33).get(0).add("Asignación");
        this.pasos.get(33).get(0).add("Condicional");
        this.pasos.get(33).get(0).add("agrupacion");
        this.pasos.get(33).get(0).add("Actualizar");
        this.pasos.get(33).get(0).add("Actualizar");
        this.pasos.get(33).get(0).add("agrupacion");
        this.pasos.get(33).get(0).add("Actualizar");
        this.pasos.get(33).get(0).add("Actualizar");
        this.pasos.get(33).get(0).add("ciclo");
        this.pasos.get(33).get(0).add("Condicional");
        this.pasos.get(33).get(0).add("Actualizar");
        this.pasos.get(33).get(0).add("saltolinea");
        this.pasos.get(33).get(0).add("Actualizar");
        this.pasos.get(33).get(0).add("mientras");
        this.pasos.get(33).get(0).add("ciclo");
        this.pasos.get(33).get(0).add("Condicional");
        this.pasos.get(33).get(0).add("Actualizar");
        this.pasos.get(33).get(0).add("saltolinea");
        this.pasos.get(33).get(0).add("Actualizar");
        this.pasos.get(33).get(0).add("mientras");
        this.pasos.get(33).get(0).add("Impresión");
        /////////////////////////////////
        this.pasos.get(33).get(1).add("(sumaRangos)");
        this.pasos.get(33).get(1).add("(defun sumaRangos()");
        this.pasos.get(33).get(1).add("(print \"Ingrese un numero a: \")");
        this.pasos.get(33).get(1).add("(setq a (read))");
        this.pasos.get(33).get(1).add("(print \"Ingrese un numero b: \")");
        this.pasos.get(33).get(1).add("(setq b (read))");
        this.pasos.get(33).get(1).add("(setq tope 1)");
        this.pasos.get(33).get(1).add("(setq inicio 1)");
        this.pasos.get(33).get(1).add("(setq sum 0)");
        this.pasos.get(33).get(1).add("(if (> a b)");
        this.pasos.get(33).get(1).add("(begin");
        this.pasos.get(33).get(1).add("(set tope a)");
        this.pasos.get(33).get(1).add("(set inicio b)");
        this.pasos.get(33).get(1).add("(begin");
        this.pasos.get(33).get(1).add("(set tope b)");
        this.pasos.get(33).get(1).add("(set inicio a)");
        this.pasos.get(33).get(1).add("(loop");
        this.pasos.get(33).get(1).add("(if (= remainder(inicio 2) 0)");
        this.pasos.get(33).get(1).add("(set sum (+ sum inicio))");
        this.pasos.get(33).get(1).add("(terpri)");
        this.pasos.get(33).get(1).add("(set inicio (+ inicio 1))");
        this.pasos.get(33).get(1).add("(when (< inicio tope) (return inicio))");
        this.pasos.get(33).get(1).add("(loop");
        this.pasos.get(33).get(1).add("(if (= remainder(inicio 2) 0)");
        this.pasos.get(33).get(1).add("(set sum (+ sum inicio))");
        this.pasos.get(33).get(1).add("(terpri)");
        this.pasos.get(33).get(1).add("(set inicio (+ inicio 1))");
        this.pasos.get(33).get(1).add("(when (< inicio tope) (return inicio))");
        this.pasos.get(33).get(1).add("(print sum)");
        ////////////////   35    /////////////////
        this.algoritmos.get(34).add("#|\nConstruir un algoritmo en Lisp que lea una \npalabra  por consola y nos diga si el primer\ncaracter  de  la  palabra  inicia  por  vocal. \n|#");
        this.algoritmos.get(34).add("Funcion vocal\n    imprimir  \"Ingrese una palabra: \"\n    inicializar palabra = (valor por consola)\n    inicializar caracter = palabra[1]\n    evaluar caracter\n       (caracter = 'a')(imprimir \"inicia por vocal\")\n       (caracter = 'e')(imprimir \"inicia por vocal\")\n       (caracter = 'i')(imprimir \"inicia por vocal\")\n       (caracter = 'o')(imprimir \"inicia por vocal\")\n       (caracter = 'u')(imprimir \"inicia por vocal\")\n       (sino)(imprimir \"La palabra no inicia por vocal\")\n        \nllamar Funcion vocal");
        this.algoritmos.get(34).add("(defun vocal()\n  (print \"Ingrese una palabra: \")\n  (setq palabra (read))\n  (setq caracter (char palabra 1))\n  (cond\n    ((char= #\\a caracter) \n       (print \"inicia por vocal\"))\n    ((char= #\\e caracter)\n       (print \"inicia por vocal\"))\n    ((char= #\\i caracter)\n       (print \"inicia por vocal\"))\n    ((char= #\\o caracter)\n       (print \"inicia por vocal\"))\n    ((char= #\\u caracter)\n       (print \"inicia por vocal\"))\n    (else (print \"La palabra no inicia por vocal\"))\n  )\n)\n\n(vocal)");
        this.algoritmos.get(34).add("34");
        this.pasos.get(34).get(0).add("Llamado");
        this.pasos.get(34).get(0).add("Funcion");
        this.pasos.get(34).get(0).add("Impresión");
        this.pasos.get(34).get(0).add("Lectura");
        this.pasos.get(34).get(0).add("Asignación");
        this.pasos.get(34).get(0).add("Cond");
        this.pasos.get(34).get(0).add("char=");
        this.pasos.get(34).get(0).add("Impresión");
        this.pasos.get(34).get(0).add("char=");
        this.pasos.get(34).get(0).add("Impresión");
        this.pasos.get(34).get(0).add("char=");
        this.pasos.get(34).get(0).add("Impresión");
        this.pasos.get(34).get(0).add("char=");
        this.pasos.get(34).get(0).add("Impresión");
        this.pasos.get(34).get(0).add("char=");
        this.pasos.get(34).get(0).add("Impresión");
        this.pasos.get(34).get(0).add("Else");
        /////////////////////////////////
        this.pasos.get(34).get(1).add("(vocal)");
        this.pasos.get(34).get(1).add("(defun vocal()");
        this.pasos.get(34).get(1).add("(print \"Ingrese una palabra: \")");
        this.pasos.get(34).get(1).add("(setq palabra (read))");
        this.pasos.get(34).get(1).add("(setq caracter (char palabra 1))");
        this.pasos.get(34).get(1).add("(cond");
        this.pasos.get(34).get(1).add("((char= #\\a caracter) ");
        this.pasos.get(34).get(1).add("((char= #\\e caracter)");
        this.pasos.get(34).get(1).add("(print \"inicia por vocal\"))");
        this.pasos.get(34).get(1).add("((char= #\\i caracter)");
        this.pasos.get(34).get(1).add("(print \"inicia por vocal\"))");
        this.pasos.get(34).get(1).add("((char= #\\o caracter)");
        this.pasos.get(34).get(1).add("(print \"inicia por vocal\"))");
        this.pasos.get(34).get(1).add("((char= #\\u caracter)");
        this.pasos.get(34).get(1).add("(print \"inicia por vocal\"))");
        this.pasos.get(34).get(1).add("(else (print \"La palabra no inicia por vocal\"))");
        ////////////////   36    /////////////////
        this.algoritmos.get(35).add("#|\nConstruir un algoritmo en Lisp que lea una \npalabra   por   consola   y  nos  muestre  la \npalabra  al  reverso.\n|#");
        this.algoritmos.get(35).add("Funcion Reverso\n    imprimir  \"Ingrese una palabra: \"\n    inicializar palabra = (valor por consola)\n    imprimir  \"La palabra es: \" palabra\n    imprimir \"La palabra al reverso es: \", (reverse palabra)\n        \nllamar Funcion Reverso");
        this.algoritmos.get(35).add("(defun Reverso()\n    (print \"Ingrese una palabra: \")\n    (setq palabra (read))\n    (print \"La palabra es: ~c\" palabra)\n    (print \"La palabra al reverso es: ~c\" \n    (reverse palabra))\n)\n\n(Reverso)");
        this.algoritmos.get(35).add("35");
        this.pasos.get(35).get(0).add("Llamado");
        this.pasos.get(35).get(0).add("Funcion");
        this.pasos.get(35).get(0).add("Impresión");
        this.pasos.get(35).get(0).add("Lectura");
        this.pasos.get(35).get(0).add("Impresión");
        this.pasos.get(35).get(0).add("Impresión");
        this.pasos.get(35).get(0).add("invertir");
        /////////////////////////////////
        this.pasos.get(35).get(1).add("(Reverso)");
        this.pasos.get(35).get(1).add("(defun Reverso()");
        this.pasos.get(35).get(1).add("(print \"Ingrese una palabra: \")");
        this.pasos.get(35).get(1).add("(setq palabra (read))");
        this.pasos.get(35).get(1).add("(print \"La palabra es: ~c\" palabra)");
        this.pasos.get(35).get(1).add("(print \"La palabra al reverso es: ~c\" ");
        this.pasos.get(35).get(1).add("(reverse palabra))")
        ;////////////////   37    /////////////////
        this.algoritmos.get(36).add("#|\nConstruir un algoritmo en Lisp que lea una \npalabra por consola y dos caracteres, luego \nimprimir la palabra con el caracter al inicio\ny al final de la palabra.\n|#");
        this.algoritmos.get(36).add("Funcion AgregarCaracter\n    imprimir  \"Ingrese una palabra: \"\n    inicializar palabra = (valor por consola)\n    imprimir  \"Ingrese un caracter: \"\n    inicializar c1 = (valor por consola)\n    imprimir  \"Ingrese un segundo caracter: \"\n    inicializar c2 = (valor por consola)\n    imprimir  \"La palabra es: \" palabra\n    imprimir \"La palabra al reverso es: \", (concatenar c1, palabra, c2)\n        \nllamar Funcion AgregarCaracter");
        this.algoritmos.get(36).add("(defun AgregarCaracter()\n    (print \"Ingrese una palabra: \")\n    (setq palabra (read))\n    (print \"Ingrese un caracter: \")\n    (setq c1 (read))\n    (print \"Ingrese un segundo caracter: \")\n    (setq c2 (read))\n    (print \"La palabra es: ~c\" palabra)\n    (print \"La palabra nueva es: ~c\" \n    (concat c1 palabra c2))\n)\n\n(AgregarCaracter)");
        this.algoritmos.get(36).add("36");
        this.pasos.get(36).get(0).add("Llamado");
        this.pasos.get(36).get(0).add("Funcion");
        this.pasos.get(36).get(0).add("Impresión");
        this.pasos.get(36).get(0).add("Lectura");
        this.pasos.get(36).get(0).add("Impresión");
        this.pasos.get(36).get(0).add("Lectura");
        this.pasos.get(36).get(0).add("Impresión");
        this.pasos.get(36).get(0).add("Lectura");
        this.pasos.get(36).get(0).add("Impresión");
        this.pasos.get(36).get(0).add("Impresión");
        this.pasos.get(36).get(0).add("concatenar");
        /////////////////////////////////
        this.pasos.get(36).get(1).add("(AgregarCaracter)");
        this.pasos.get(36).get(1).add("(defun AgregarCaracter()");
        this.pasos.get(36).get(1).add("(print \"Ingrese una palabra: \")");
        this.pasos.get(36).get(1).add("(setq palabra (read))");
        this.pasos.get(36).get(1).add("(print \"Ingrese un caracter: \")");
        this.pasos.get(36).get(1).add("(setq c1 (read))");
        this.pasos.get(36).get(1).add("(print \"Ingrese un segundo caracter: \")");
        this.pasos.get(36).get(1).add("(setq c2 (read))");
        this.pasos.get(36).get(1).add("(print \"La palabra es: ~c\" palabra)");
        this.pasos.get(36).get(1).add("(print \"La palabra nueva es: ~c\" ");
        this.pasos.get(36).get(1).add("(concat c1 palabra c2))")
        ;////////////////   38    /////////////////
        this.algoritmos.get(37).add("#|\nConstruir un algoritmo en Lisp que lea una \npalabra  por consola y ponga la palabra en \nmaysucula.\n|#");
        this.algoritmos.get(37).add("Funcion ConvertirMayuscula\n    imprimir  \"Ingrese una palabra: \"\n    inicializar palabra = (valor por consola)\n    imprimir  \"La palabra es: \" palabra\n	imprimir \"La palabra en maysucula es: \", (mayuscula palabra)\n        \nllamar Funcion ConvertirMayuscula");
        this.algoritmos.get(37).add("(defun ConvertirMayuscula()\n    (print \"Ingrese una palabra: \")\n    (setq palabra (read))\n    (print \"La palabra es: ~c\" palabra)\n    (print \"La palabra en maysucula es: ~c\"\n    (string-upcase palabra))\n)\n\n(ConvertirMayuscula)");
        this.algoritmos.get(37).add("37");
        this.pasos.get(37).get(0).add("Llamado");
        this.pasos.get(37).get(0).add("Funcion");
        this.pasos.get(37).get(0).add("Impresión");
        this.pasos.get(37).get(0).add("Lectura");
        this.pasos.get(37).get(0).add("Impresión");
        this.pasos.get(37).get(0).add("Impresión");
        this.pasos.get(37).get(0).add("mayuscula");
        /////////////////////////////////
        this.pasos.get(37).get(1).add("(ConvertirMayuscula)");
        this.pasos.get(37).get(1).add("(defun ConvertirMayuscula()");
        this.pasos.get(37).get(1).add("(print \"Ingrese una palabra: \")");
        this.pasos.get(37).get(1).add("(setq palabra (read))");
        this.pasos.get(37).get(1).add("(print \"La palabra es: ~c\" palabra)");
        this.pasos.get(37).get(1).add("(print \"La palabra en maysucula es: ~c\"");
        this.pasos.get(37).get(1).add("(string-upcase palabra))")
        ;////////////////   39    /////////////////
        this.algoritmos.get(38).add("#|\nConstruir un algoritmo en Lisp que lea una\npalabra   por  consola  y  ponga  el  primer \ncaracter de la palabra en maysucula.\n|#");
        this.algoritmos.get(38).add("Funcion CaracterMayuscula\n    imprimir  \"Ingrese una palabra: \"\n    inicializar palabra = (valor por consola)\n    inicializar palabra2 = palabra = palabra[1] -> A maysucula\n    imprimir  \"La palabra es: \" palabra\n    imprimir \"La palabra al reverso es: \", palabra2\n        \nllamar Funcion CaracterMayuscula");
        this.algoritmos.get(38).add("(defun CaracterMayuscula()\n    (print \"Ingrese una palabra: \")\n    (setq palabra (read))\n    (setf palabra2 (char palabra 1) \n    (char-upcase (char palabra 1))) \n    (print \"La palabra es: ~c\" palabra)\n    (print \"La palabra nueva es: ~c\" palabra2)\n)\n\n(CaracterMayuscula)");
        this.algoritmos.get(38).add("38");
        this.pasos.get(38).get(0).add("Llamado");
        this.pasos.get(38).get(0).add("Funcion");
        this.pasos.get(38).get(0).add("Impresión");
        this.pasos.get(38).get(0).add("Lectura");
        this.pasos.get(38).get(0).add("asignarcad");
        this.pasos.get(38).get(0).add("mayusculach");
        this.pasos.get(38).get(0).add("Impresión");
        this.pasos.get(38).get(0).add("Impresión");
        /////////////////////////////////
        this.pasos.get(38).get(1).add("(CaracterMayuscula)");
        this.pasos.get(38).get(1).add("(defun CaracterMayuscula()");
        this.pasos.get(38).get(1).add("(print \"Ingrese una palabra: \")");
        this.pasos.get(38).get(1).add("(setq palabra (read))");
        this.pasos.get(38).get(1).add("(setf palabra2 (char palabra 1) ");
        this.pasos.get(38).get(1).add("(char-upcase (char palabra 1)))");
        this.pasos.get(38).get(1).add("(print \"La palabra es: ~c\" palabra)");
        this.pasos.get(38).get(1).add("(print \"La palabra nueva es: ~c\" palabra2)")
        ;////////////////   40    /////////////////
        this.algoritmos.get(39).add("#|\nConstruir un algoritmo en Lisp que lea una \npalabra por  consola  y  elimine  la  letra  o \ndentro de la palabra.\n|#");
        this.algoritmos.get(39).add("Funcion EliminarLetra\n    imprimir  \"Ingrese una palabra: \"\n    inicializar palabra = (valor por consola)\n    imprimir  \"La palabra es: \", palabra\n    imprimir \"La palabra nueva es: \", (eliminar-cadena palabra \"o\")\n        \nllamar Funcion EliminarLetra");
        this.algoritmos.get(39).add("(defun EliminarLetra()\n    (print \"Ingrese una palabra: \")\n    (setq palabra (read))\n    (print \"La palabra es: ~c\" palabra)\n    (print \"La palabra nueva es: ~c\" \n    (split-string palabra \"o\"))\n)\n\n(EliminarLetra)");
        this.algoritmos.get(39).add("39");
        this.pasos.get(39).get(0).add("Llamado");
        this.pasos.get(39).get(0).add("Funcion");
        this.pasos.get(39).get(0).add("Impresión");
        this.pasos.get(39).get(0).add("Asignación");
        this.pasos.get(39).get(0).add("Impresión");
        this.pasos.get(39).get(0).add("Impresión");
        this.pasos.get(39).get(0).add("eliminarletra");
        /////////////////////////////////
        this.pasos.get(39).get(1).add("(EliminarLetra)");
        this.pasos.get(39).get(1).add("(defun EliminarLetra()");
        this.pasos.get(39).get(1).add("(print \"Ingrese una palabra: \")");
        this.pasos.get(39).get(1).add("(setq palabra (read))");
        this.pasos.get(39).get(1).add("(print \"La palabra es: ~c\" palabra)");
        this.pasos.get(39).get(1).add("(print \"La palabra nueva es: ~c\" ");
        this.pasos.get(39).get(1).add("(split-string palabra \"o\"))")
        ;////////////////   41    /////////////////
        this.algoritmos.get(40).add("#|\nConstruir un algoritmo en Lisp que lea una \nfrase por consola y elimine los espacios que \ncontiene la frase.\n|#");
        this.algoritmos.get(40).add("EliminarEspacios\n    imprimir  \"Ingrese una frase: \"\n    inicializar frase = (valor por consola)\n    imprimir  \"La frase es: \", frase\n    imprimir \"La frase nueva es: \", (eliminar-cadena frase \" \")\n        \nllamar EliminarEspacios");
        this.algoritmos.get(40).add("(defun EliminarEspacios()\n    (print \"Ingrese una frase: \")\n    (setq frase (read))\n    (print \"La frase es: ~c\" frase)\n    (print \"La frase nueva es: ~c\" \n    (split-string frase \" \"))\n)\n\n(EliminarEspacios)");
        this.algoritmos.get(40).add("40");
        this.pasos.get(40).get(0).add("Llamado");
        this.pasos.get(40).get(0).add("Funcion");
        this.pasos.get(40).get(0).add("Impresión");
        this.pasos.get(40).get(0).add("Lectura");
        this.pasos.get(40).get(0).add("Impresión");
        this.pasos.get(40).get(0).add("Impresión");
        this.pasos.get(40).get(0).add("eliminarletra");
        /////////////////////////////////
        this.pasos.get(40).get(1).add("(EliminarEspacios)");
        this.pasos.get(40).get(1).add("(defun EliminarEspacios()");
        this.pasos.get(40).get(1).add("(print \"Ingrese una frase: \")");
        this.pasos.get(40).get(1).add("(setq frase (read))");
        this.pasos.get(40).get(1).add("(print \"La frase es: ~c\" frase)");
        this.pasos.get(40).get(1).add("(print \"La frase nueva es: ~c\" ");
        this.pasos.get(40).get(1).add("(split-string frase \" \"))")
        ;////////////////   42    /////////////////
        this.algoritmos.get(41).add("#|\nConstruir un algoritmo en  Lisp que  lea dos \npalabras y las compare, si ambas son iguales \nmostrar las cadenas, de lo contrario mostrar \npor pantalla que no son iguales. \n|#");
        this.algoritmos.get(41).add("Funcion CadenasIguales\n    imprimir  \"Ingrese una palabra: \"\n    inicializar palabra1 = (valor por consola)\n    imprimir  \"Ingrese otra palabra: \"\n    inicializar palabra2 = (valor por consola)\n    si (palabra1 = palabra2):\n        imprimir  \"Son iguales\", palabra1 \" = \", palabra2\n        imprimir  \"No son iguales\", palabra1 \" != \", palabra2\n        \nllamar Funcion CadenasIguales");
        this.algoritmos.get(41).add("(defun CadenasIguales()\n    (print \"Ingrese una palabra: \")\n    (setq palabra1 (read))\n    (print \"Ingrese otra palabra: \")\n    (setq palabra2 (read))\n    (if (string= palabra1 palabra2)\n        (print \"Son iguales ~c = ~c\" \n         palabra1 palabra2)\n        (print \"No son iguales ~c != ~c\" \n         palabra1 palabra2)\n    )\n)\n\n(CadenasIguales)");
        this.algoritmos.get(41).add("41");
        this.pasos.get(41).get(0).add("Llamado");
        this.pasos.get(41).get(0).add("Funcion");
        this.pasos.get(41).get(0).add("Impresión");
        this.pasos.get(41).get(0).add("Lectura");
        this.pasos.get(41).get(0).add("Impresión");
        this.pasos.get(41).get(0).add("Lectura");
        this.pasos.get(41).get(0).add("Condicional");
        this.pasos.get(41).get(0).add("Impresión");
        this.pasos.get(41).get(0).add("Impresión");
        /////////////////////////////////
        this.pasos.get(41).get(1).add("(CadenasIguales)");
        this.pasos.get(41).get(1).add("(defun CadenasIguales()");
        this.pasos.get(41).get(1).add("(print \"Ingrese una palabra: \")");
        this.pasos.get(41).get(1).add("(setq palabra1 (read))");
        this.pasos.get(41).get(1).add("(print \"Ingrese otra palabra: \")");
        this.pasos.get(41).get(1).add("(setq palabra2 (read))");
        this.pasos.get(41).get(1).add("(if (string= palabra1 palabra2)");
        this.pasos.get(41).get(1).add("(print \"Son iguales ~c = ~c\" ");
        this.pasos.get(41).get(1).add("(print \"No son iguales ~c != ~c\" ");
        ;////////////////   43    /////////////////
        this.algoritmos.get(42).add("#|\nConstruir  un  algoritmo  en Lisp que lea dos\npalabras y las compare,  si ambas son iguales\nconcatenar las palabras y luego mostrarla, si\nlas    palabras   son   diferentes   mostrar  el\nprimero  carácter  de  la primer palabra y el \nultimo carácter de la segunda palabra.\n|#");
        this.algoritmos.get(42).add("Funcion Concatenar\n    imprimir  \"Ingrese una palabra: \"\n    inicializar palabra1 = (valor por consola)\n    imprimir  \"Ingrese otra palabra: \"\n    inicializar palabra2 = (valor por consola)\n    inicializar pos = tamaño(palabra)\n    si (palabra1 = palabra2):\n        imprimir  \"Son iguales \", concatenar(palabra1, palabra2)\n        imprimir  \"No son iguales\", palabra1[1] \" != \", palabra2[pos]\n        \nllamar Funcion Concatenar");
        this.algoritmos.get(42).add("(defun Concatenar()\n    (print \"Ingrese una palabra: \")\n    (setq palabra1 (read))\n    (print \"Ingrese otra palabra: \")\n    (setq palabra2 (read))\n    (setq pos (length palabra2))\n    (if (string= palabra1 palabra2)\n        (print \"Son iguales ~c\"\n        (concat palabra1 palabra2))\n        (print \"No son iguales ~c != ~c\" \n        (char palabra1 1)(char palabra2 pos))\n    )\n)\n\n(Concatenar)");
        this.algoritmos.get(42).add("42");
        this.pasos.get(42).get(0).add("Llamado");
        this.pasos.get(42).get(0).add("Funcion");
        this.pasos.get(42).get(0).add("Impresión");
        this.pasos.get(42).get(0).add("Lectura");
        this.pasos.get(42).get(0).add("Impresión");
        this.pasos.get(42).get(0).add("Lectura");
        this.pasos.get(42).get(0).add("Asignación");
        this.pasos.get(42).get(0).add("Condicional");
        this.pasos.get(42).get(0).add("Impresión");
        this.pasos.get(42).get(0).add("concatenar");
        this.pasos.get(42).get(0).add("Impresión");
        /////////////////////////////////
        this.pasos.get(42).get(1).add("(Concatenar)");
        this.pasos.get(42).get(1).add("(defun Concatenar()");
        this.pasos.get(42).get(1).add("(print \"Ingrese una palabra: \")");
        this.pasos.get(42).get(1).add("(setq palabra1 (read))");
        this.pasos.get(42).get(1).add("(print \"Ingrese otra palabra: \")");
        this.pasos.get(42).get(1).add("(setq palabra2 (read))");
        this.pasos.get(42).get(1).add("(setq pos (length palabra2))");
        this.pasos.get(42).get(1).add("(if (string= palabra1 palabra2)");
        this.pasos.get(42).get(1).add("(print \"Son iguales ~c\"");
        this.pasos.get(42).get(1).add("(concat palabra1 palabra2))");
        this.pasos.get(42).get(1).add("(print \"No son iguales ~c != ~c\" ")
        ;////////////////   44    /////////////////
        this.algoritmos.get(43).add("#|\nConstruir un algoritmo en  Lisp que lea  una\npalabra por consola y la invierta mediante el\nuso del ciclo for.\n|#");
        this.algoritmos.get(43).add("Funcion InviertirPalabra\n    imprimir  \"Ingrese una palabra: \"\n    inicializar palabra = (valor por consola)\n    inicializar pos = tamaño(palabra)\n    hacer-cadena palabra2 = palabra\n    desde i = 1 hasta pos hacer:\n        actualizar palabra2[i] = palabra[pos - i] \n    imprimir \"La palabra invertida es: \", palabra2\n    \nllamar Funcion InviertirPalabra");
        this.algoritmos.get(43).add("(defun InviertirPalabra()\n    (print \"Ingrese una palabra: \")\n    (setq palabra (read))\n    (setq pos (length palabra))\n    (make-string palabra2 palabra)\n    (loop for i from 0 to pos\n      do(\n           (setf palabra2 (char palabra i) \n           (char palabra (- pos i)))\n      )\n    )\n    (print \"La palabra invertida es: ~c\" palabra2)\n)\n\n(InviertirPalabra)");
        this.algoritmos.get(43).add("43");
        this.pasos.get(43).get(0).add("Llamado");
        this.pasos.get(43).get(0).add("Funcion");
        this.pasos.get(43).get(0).add("Impresión");
        this.pasos.get(43).get(0).add("Lectura");
        this.pasos.get(43).get(0).add("Asignación");
        this.pasos.get(43).get(0).add("tamaño");
        this.pasos.get(43).get(0).add("hacercadena");
        this.pasos.get(43).get(0).add("for");
        this.pasos.get(43).get(0).add("do");
        this.pasos.get(43).get(0).add("asignarcad");
        this.pasos.get(43).get(0).add("for");
        this.pasos.get(43).get(0).add("do");
        this.pasos.get(43).get(0).add("asignarcad");
        this.pasos.get(43).get(0).add("for");
        this.pasos.get(43).get(0).add("do");
        this.pasos.get(43).get(0).add("asignarcad");
        this.pasos.get(43).get(0).add("Impresión");
        /////////////////////////////////
        this.pasos.get(43).get(1).add("(InviertirPalabra)");
        this.pasos.get(43).get(1).add("(defun InviertirPalabra()");
        this.pasos.get(43).get(1).add("(print \"Ingrese una palabra: \")");
        this.pasos.get(43).get(1).add("(setq palabra (read))");
        this.pasos.get(43).get(1).add("(setq pos (length palabra))");
        this.pasos.get(43).get(1).add("(length palabra))");
        this.pasos.get(43).get(1).add("(make-string palabra2 palabra)");
        this.pasos.get(43).get(1).add("(loop for i from 0 to pos");
        this.pasos.get(43).get(1).add("do(");
        this.pasos.get(43).get(1).add("(setf palabra2 (char palabra i) ");
        this.pasos.get(43).get(1).add("(loop for i from 0 to pos");
        this.pasos.get(43).get(1).add("do(");
        this.pasos.get(43).get(1).add("(setf palabra2 (char palabra i) ");
        this.pasos.get(43).get(1).add("(loop for i from 0 to pos");
        this.pasos.get(43).get(1).add("do(");
        this.pasos.get(43).get(1).add("(setf palabra2 (char palabra i) ");
        this.pasos.get(43).get(1).add("(print \"La palabra invertida es: ~c\" palabra2)");
        ////////////////   45    /////////////////
        this.algoritmos.get(44).add("#|\nConstruir  un  algoritmo  en Lisp que lea una\npalabra  por consola y la invierta mediante el\nuso del ciclo for y si la palabra es palindroma\nmostrar si lo es.\n|#");
        this.algoritmos.get(44).add("Funcion Palindromo\n    imprimir  \"Ingrese una palabra: \"\n    inicializar palabra = (valor por consola)\n    inicializar pos = tamaño(palabra)\n    hacer-cadena palabra2 = palabra\n    desde i = 1 hasta pos hacer:\n        actualizar palabra2[i] = palabra[pos - i] \n    imprimir \"La palabra invertida es: \", palabra2\n    si (palabra = palabra2):\n        imprimir  \"Es palindormo\"\n        imprimir  \"No es palindormo\"\n    \nllamar Funcion Palindromo");
        this.algoritmos.get(44).add("(defun Palindromo()\n    (print \"Ingrese una palabra: \")\n    (setq palabra (read))\n    (setq pos (length palabra))\n    (make-string palabra2 palabra)\n    (loop for i from 0 to pos\n        do(\n            (setf palabra2 (char palabra i) \n            (char palabra (- pos i)))\n        )\n    )\n    (if (string= palabra palabra2)\n        (print \"Es palindormo\")\n        (print \"No es palindormo\")\n    )\n)\n\n(Palindromo)");
        this.algoritmos.get(44).add("44");
        this.pasos.get(44).get(0).add("Llamado");
        this.pasos.get(44).get(0).add("Funcion");
        this.pasos.get(44).get(0).add("Impresión");
        this.pasos.get(44).get(0).add("Lectura");
        this.pasos.get(44).get(0).add("Asignación");
        this.pasos.get(44).get(0).add("tamaño");
        this.pasos.get(44).get(0).add("hacercadena");
        this.pasos.get(44).get(0).add("for");
        this.pasos.get(44).get(0).add("do");
        this.pasos.get(44).get(0).add("asignarcad");
        this.pasos.get(44).get(0).add("for");
        this.pasos.get(44).get(0).add("do");
        this.pasos.get(44).get(0).add("asignarcad");
        this.pasos.get(44).get(0).add("for");
        this.pasos.get(44).get(0).add("do");
        this.pasos.get(44).get(0).add("asignarcad");
        this.pasos.get(44).get(0).add("Condicional");
        this.pasos.get(44).get(0).add("Impresión");
        this.pasos.get(44).get(0).add("Impresión");
        /////////////////////////////////
        this.pasos.get(44).get(1).add("(Palindromo)");
        this.pasos.get(44).get(1).add("(defun Palindromo()");
        this.pasos.get(44).get(1).add("(print \"Ingrese una palabra: \")");
        this.pasos.get(44).get(1).add("(setq palabra (read))");
        this.pasos.get(44).get(1).add("(setq pos (length palabra))");
        this.pasos.get(44).get(1).add("(length palabra))");
        this.pasos.get(44).get(1).add("(make-string palabra2 palabra)");
        this.pasos.get(44).get(1).add("(loop for i from 0 to pos");
        this.pasos.get(44).get(1).add("do(");
        this.pasos.get(44).get(1).add("(setf palabra2 (char palabra i) ");
        this.pasos.get(44).get(1).add("(loop for i from 0 to pos");
        this.pasos.get(44).get(1).add("do(");
        this.pasos.get(44).get(1).add("(setf palabra2 (char palabra i) ");
        this.pasos.get(44).get(1).add("(loop for i from 0 to pos");
        this.pasos.get(44).get(1).add("do(");
        this.pasos.get(44).get(1).add("(setf palabra2 (char palabra i) ");
        this.pasos.get(44).get(1).add("(if (string= palabra palabra2)");
        this.pasos.get(44).get(1).add("(print \"Es palindormo\")");
        this.pasos.get(44).get(1).add("(print \"No es palindormo\")");
        ;////////////////   46    /////////////////
        this.algoritmos.get(45).add("#|\nConstruir  un  algoritmo en Lisp que lea el \nnombre  de  una  persona  y un carácter  y\ncomprobar  si  dicho  carácter  está  en  su \nnombre. \n|#");
        this.algoritmos.get(45).add("Funcion ComprobarCaracter\n    imprimir  \"Ingrese un nombre: \"\n    inicializar nombre = (valor por consola)\n    imprimir  \"Ingrese un caracter: \"\n    inicializar caracter = (valor por consola)\n    inicializar contador = 0\n    desde i = 1 hasta tamaño(nombre) hacer:\n        si (caracter = nombre[i]):\n            actualizar contador = contador + 1\n    imprimir \"La palabra invertida es: \", palabra2\n    si (contador > 1):\n        imprimir  \"El caracter se encuentra en el nombre\"\n        imprimir  \"El caracter no se encuentra en el nombre\"\n    \nllamar Funcion ComprobarCaracter");
        this.algoritmos.get(45).add("(defun ComprobarCaracter()\n    (print \"Ingrese un nombre: \")\n    (setq nombre (read))\n    (print \"Ingrese un caracter: \")\n    (setq caracter (read))\n    (setq contador 0)\n    (loop for i from 0 to (length nombre)\n        do(\n            (if (char= (char nombre i) caracter)\n                (set contador (+ contador 1))\n                (void)\n            )\n        )\n    )\n(if (> contador 1)\n (print \"El caracter se encuentra en el nombre\")\n (print \"El caracter no se encuentra en el nombre\")\n)\n)\n\n(ComprobarCaracter)");
        this.algoritmos.get(45).add("45");
        this.pasos.get(45).get(0).add("Llamado");
        this.pasos.get(45).get(0).add("Funcion");
        this.pasos.get(45).get(0).add("Impresión");
        this.pasos.get(45).get(0).add("Lectura");
        this.pasos.get(45).get(0).add("Impresión");
        this.pasos.get(45).get(0).add("Lectura");
        this.pasos.get(45).get(0).add("Asignación");
        this.pasos.get(45).get(0).add("for");
        this.pasos.get(45).get(0).add("do");
        this.pasos.get(45).get(0).add("Condicional");
        this.pasos.get(45).get(0).add("Actualizar");
        this.pasos.get(45).get(0).add("Vacio");
        this.pasos.get(45).get(0).add("for");
        this.pasos.get(45).get(0).add("do");
        this.pasos.get(45).get(0).add("Condicional");
        this.pasos.get(45).get(0).add("Actualizar");
        this.pasos.get(45).get(0).add("Vacio");
        this.pasos.get(45).get(0).add("Condicional");
        this.pasos.get(45).get(0).add("Impresión");
        this.pasos.get(45).get(0).add("Impresión");
        /////////////////////////////////
        this.pasos.get(45).get(1).add("(ComprobarCaracter)");
        this.pasos.get(45).get(1).add("(defun ComprobarCaracter()");
        this.pasos.get(45).get(1).add("(print \"Ingrese un nombre: \")");
        this.pasos.get(45).get(1).add("(setq nombre (read))");
        this.pasos.get(45).get(1).add("(print \"Ingrese un caracter: \")");
        this.pasos.get(45).get(1).add("(setq caracter (read))");
        this.pasos.get(45).get(1).add("(setq contador 0)");
        this.pasos.get(45).get(1).add("(loop for i from 0 to (length nombre)");
        this.pasos.get(45).get(1).add("do(");
        this.pasos.get(45).get(1).add("(if (char= (char nombre i) caracter)");
        this.pasos.get(45).get(1).add("(set contador (+ contador 1))");
        this.pasos.get(45).get(1).add("(void)");
        this.pasos.get(45).get(1).add("(loop for i from 0 to (length nombre)");
        this.pasos.get(45).get(1).add("do(");
        this.pasos.get(45).get(1).add("(if (char= (char nombre i) caracter)");
        this.pasos.get(45).get(1).add("(set contador (+ contador 1))");
        this.pasos.get(45).get(1).add("(void)");
        this.pasos.get(45).get(1).add("(if (> contador 1)");
        this.pasos.get(45).get(1).add("(print \"El caracter se encuentra en el nombre\")");
        this.pasos.get(45).get(1).add("(print \"El caracter no se encuentra en el nombre\")");
        ////////////////   47    /////////////////
        this.algoritmos.get(46).add("#|\nConstruir  un  algoritmo  en Lisp que lea una\npalabra por consola y reemplace los espacios\npor el caracter _.\n\nNota: Para este ejercicio se debe hacer uso\ndel ciclo for.\n|#");
        this.algoritmos.get(46).add("Funcion ModificarEspacios\n    imprimir  \"Ingrese una palabra: \"\n    inicializar palabra = (valor por consola)\n    imprimir \"La palabra es: \", palabra\n    desde i = 1 hasta tamaño(palabra) hacer:\n        si (palabra[i] = \" \"):\n            actualizar palabra[i] = \" \"\n    imprimir \"La palabra nueva es: \", palabra\n    \nllamar Funcion ModificarEspacios");
        this.algoritmos.get(46).add("(defun ModificarEspacios()\n    (print \"Ingrese una palabra: \")\n    (setq palabra (read))\n    (print \"La palabra es: ~c\" palabra)\n    (loop for i from 0 to (length palabra)\n        do(\n            (if (char= (char palabra i) #\\0)\n                (setf palabra (char palabra i) #\\_)\n                (void)\n            )\n        )\n    )\n    (print \"La palabra nueva es: ~c\" palabra)\n)\n\n(ModificarEspacios)");
        this.algoritmos.get(46).add("46");
        this.pasos.get(46).get(0).add("Llamado");
        this.pasos.get(46).get(0).add("Funcion");
        this.pasos.get(46).get(0).add("Impresión");
        this.pasos.get(46).get(0).add("Lectura");
        this.pasos.get(46).get(0).add("Impresión");
        this.pasos.get(46).get(0).add("for");
        this.pasos.get(46).get(0).add("do");
        this.pasos.get(46).get(0).add("Condicional");
        this.pasos.get(46).get(0).add("asignarcad");
        this.pasos.get(46).get(0).add("Vacio");
        this.pasos.get(46).get(0).add("for");
        this.pasos.get(46).get(0).add("do");
        this.pasos.get(46).get(0).add("Condicional");
        this.pasos.get(46).get(0).add("asignarcad");
        this.pasos.get(46).get(0).add("Vacio");
        this.pasos.get(46).get(0).add("Impresión");
        /////////////////////////////////
        this.pasos.get(46).get(1).add("(ModificarEspacios");
        this.pasos.get(46).get(1).add("(defun ModificarEspacios()");
        this.pasos.get(46).get(1).add("(print \"Ingrese una palabra: \")");
        this.pasos.get(46).get(1).add("(setq palabra (read))");
        this.pasos.get(46).get(1).add("(print \"La palabra es: ~c\" palabra)");
        this.pasos.get(46).get(1).add("(loop for i from 0 to (length palabra)");
        this.pasos.get(46).get(1).add("do(");
        this.pasos.get(46).get(1).add("(if (char= (char palabra i) #\\0)");
        this.pasos.get(46).get(1).add("(setf palabra (char palabra i) #\\_");
        this.pasos.get(46).get(1).add("(void)");
        this.pasos.get(46).get(1).add("(loop for i from 0 to (length palabra)");
        this.pasos.get(46).get(1).add("do(");
        this.pasos.get(46).get(1).add("(if (char= (char palabra i) #\\0)");
        this.pasos.get(46).get(1).add("(setf palabra (char palabra i) #\\_");
        this.pasos.get(46).get(1).add("(void)");
        this.pasos.get(46).get(1).add("(print \"La palabra nueva es: ~c\" palabra)")
        ;////////////////   48    /////////////////
        this.algoritmos.get(47).add("#|\nConstruir  un  algoritmo  en Lisp que lea una\npalabra por consola y nos diga cuantas veces\nse repiten cada letra dentro de la cadena .\n|#");
        this.algoritmos.get(47).add("Funcion LetraRepetida\n    imprimir  \"Ingrese una palabra: \"\n    inicializar palabra = (valor por consola)\n    imprimir \"La palabra es: \", palabra\n    inicializar rep = 0\n    desde i = 1 hasta tamaño(palabra) hacer:\n        desde j = 1 hasta tamaño(palabra) hacer:\n            si (palabra[i] = palabra[j]):\n                actualizar rep = rep + 1\n        imprimir palabra[i], \" = \" rep, \n        actualizar rep = 0\n     imprimir \"La palabra nueva es: \", palabra\n    \nllamar Funcion LetraRepetida");
        this.algoritmos.get(47).add("(defun LetraRepetida()\n    (print \"Ingrese una palabra: \")\n    (setq palabra (read))\n    (setq rep 0)\n    (loop for i from 0 to (length palabra)\n        do(loop for j from 0 to (length palabra)\n            do(\n                (if (char= (char palabra i) \n                    (char palabra j))\n                    (set rep (+ rep 1))\n                )\n            )\n        )\n        do(print \"~c = ~d\" (char palabra i) rep)\n        do(terpri)\n        do(set rep 0)\n    )\n)\n\n(LetraRepetida)");
        this.algoritmos.get(47).add("47");
        this.pasos.get(47).get(0).add("Llamado");
        this.pasos.get(47).get(0).add("Funcion");
        this.pasos.get(47).get(0).add("Impresión");
        this.pasos.get(47).get(0).add("Lectura");
        this.pasos.get(47).get(0).add("Asignación");
        this.pasos.get(47).get(0).add("for");
        this.pasos.get(47).get(0).add("for");
        this.pasos.get(47).get(0).add("do");
        this.pasos.get(47).get(0).add("Condicional");
        this.pasos.get(47).get(0).add("Actualizar");
        this.pasos.get(47).get(0).add("Impresión");
        this.pasos.get(47).get(0).add("saltolinea");
        this.pasos.get(47).get(0).add("Actualizar");
        this.pasos.get(47).get(0).add("for");
        this.pasos.get(47).get(0).add("for");
        this.pasos.get(47).get(0).add("do");
        this.pasos.get(47).get(0).add("Condicional");
        this.pasos.get(47).get(0).add("Actualizar");
        this.pasos.get(47).get(0).add("Impresión");
        this.pasos.get(47).get(0).add("saltolinea");
        this.pasos.get(47).get(0).add("Actualizar");
        /////////////////////////////////
        this.pasos.get(47).get(1).add("(LetraRepetida)");
        this.pasos.get(47).get(1).add("(defun LetraRepetida()");
        this.pasos.get(47).get(1).add("(print \"Ingrese una palabra: \")");
        this.pasos.get(47).get(1).add("(setq palabra (read))");
        this.pasos.get(47).get(1).add("(setq rep 0)");
        this.pasos.get(47).get(1).add("(loop for i from 0 to (length palabra)");
        this.pasos.get(47).get(1).add("do(loop for j from 0 to (length palabra)");
        this.pasos.get(47).get(1).add("do(");
        this.pasos.get(47).get(1).add("(if (char= (char palabra i) ");
        this.pasos.get(47).get(1).add("(set rep (+ rep 1))");
        this.pasos.get(47).get(1).add("do(print \"~c = ~d\" (char palabra i) rep)");
        this.pasos.get(47).get(1).add("do(terpri)");
        this.pasos.get(47).get(1).add("do(set rep 0)");
        this.pasos.get(47).get(1).add("(loop for i from 0 to (length palabra)");
        this.pasos.get(47).get(1).add("do(loop for j from 0 to (length palabra)");
        this.pasos.get(47).get(1).add("do(");
        this.pasos.get(47).get(1).add("(if (char= (char palabra i) ");
        this.pasos.get(47).get(1).add("(set rep (+ rep 1))");
        this.pasos.get(47).get(1).add("do(print \"~c = ~d\" (char palabra i) rep)");
        this.pasos.get(47).get(1).add("do(terpri)");
        this.pasos.get(47).get(1).add("do(set rep 0)");
        ////////////////   49    /////////////////
        this.algoritmos.get(48).add("#|\nUn  psiquiatra tiene un paciente que habla \ninvirtiendo   las   frases   completas.  (por\nejemplo: si quiere decir “hola caracola”, lo \nque  realmente  dice  es:  “alocarac aloh”). \nPara  poder  comunicarse  con el paciente \ndecide hacer un programa que traduzca lo \nque   él   dice   al   lenguaje   del  paciente.\n|#");
        this.algoritmos.get(48).add("Funcion Comunicacion\n    imprimir  \"Ingrese una frase: \"\n    hacer-cadena frase = (valor por consola)\n    inicializar pos = tamaño(frase)\n    hacer-cadena frase2 = frase\n    desde i = 1 hasta pos hacer:\n        actualizar frase2[i] = frase[pos - i] \n    imprimir \"Traducción: \", frase2\n    \nllamar Funcion Comunicacion");
        this.algoritmos.get(48).add("(defun Comunicacion()\n    (print \"Ingrese una frase: \")\n    (make-string frase (read))\n    (setq pos (length frase))\n    (make-string frase2 frase)\n    (loop for i from 0 to pos\n        do(\n            (setf frase2 (char frase i) \n            (char frase (- pos i)))\n        )\n    )\n    (print \"Traducción: ~c\" frase2)\n)\n\n(Comunicacion)");
        this.algoritmos.get(48).add("48");
        this.pasos.get(48).get(0).add("Llamado");
        this.pasos.get(48).get(0).add("Funcion");
        this.pasos.get(48).get(0).add("Impresión");
        this.pasos.get(48).get(0).add("Lectura");
        this.pasos.get(48).get(0).add("Asignación");
        this.pasos.get(48).get(0).add("hacercadena");
        this.pasos.get(48).get(0).add("for");
        this.pasos.get(48).get(0).add("do");
        this.pasos.get(48).get(0).add("asignarcad");
        this.pasos.get(48).get(0).add("for");
        this.pasos.get(48).get(0).add("do");
        this.pasos.get(48).get(0).add("asignarcad");
        this.pasos.get(48).get(0).add("for");
        this.pasos.get(48).get(0).add("do");
        this.pasos.get(48).get(0).add("asignarcad");
        this.pasos.get(48).get(0).add("Impresión");
        /////////////////////////////////
        this.pasos.get(48).get(1).add("(Comunicacion)");
        this.pasos.get(48).get(1).add("(defun Comunicacion()");
        this.pasos.get(48).get(1).add("(print \"Ingrese una frase: \")");
        this.pasos.get(48).get(1).add("(make-string frase (read))");
        this.pasos.get(48).get(1).add("(setq pos (length frase))");
        this.pasos.get(48).get(1).add("(make-string frase2 frase)");
        this.pasos.get(48).get(1).add("(loop for i from 0 to pos");
        this.pasos.get(48).get(1).add("do(");
        this.pasos.get(48).get(1).add("(setf frase2 (char frase i) ");
        this.pasos.get(48).get(1).add("(loop for i from 0 to pos");
        this.pasos.get(48).get(1).add("do(");
        this.pasos.get(48).get(1).add("(setf frase2 (char frase i) ");
        this.pasos.get(48).get(1).add("(loop for i from 0 to pos");
        this.pasos.get(48).get(1).add("do(");
        this.pasos.get(48).get(1).add("(setf frase2 (char frase i) ");
        this.pasos.get(48).get(1).add("(print \"Traducción: ~c\" frase2)")
        ;////////////////   50    /////////////////
        this.algoritmos.get(49).add("#|\nCrear   un  programa  que  reciba  desde el \nteclado  una  fecha introducida  en formato\nnumérico   (25-12-2010)  y  la  muestre en\npantalla en formato texto  (25 de diciembre \nde 2010).\n|#");
        this.algoritmos.get(49).add("Funcion Fechatexto\n    imprimir  \"Ingrese una fecha: (dd-mm-aaaa)\"\n    hacer-cadena fecha = (valor por consola)\n    inicializar dia = fecha[0:2]\n    inicializar mes = fecha[2:5]\n    inicializar anio = fecha[5:10]\n\n    evaluar mes\n       (mes = 1)(imprimir  dia, \" de Enero de \", anio)\n       (mes = 2)(imprimir  dia, \" de Febrero de \", anio)\n       .\n       .\n       .\n       (mes = 12)(imprimir  dia, \" de Diciembre de \", anio)\n        \nllamar Funcion Fechatexto");
        this.algoritmos.get(49).add("(defun lenguajeFormal()\n    (print \"Ingrese una fecha: (dd-mm-aaaa)\")\n    (make-string fecha (read))\n    (setf dia (subseq fecha 0 2))\n    (setf mes (subseq fecha 2 5))\n    (setf anio (subseq fecha 5 10))\n    (cond\n      ((= mes 1)\n	(print \"~c de Enero de ~c\" dia anio))\n      ((= mes 2)\n 	(print \"~c de Febrero de ~c\" dia anio))\n      ((= mes 3)\n	(print \"~c de Marzo de ~c\" dia anio))\n      ((= mes 4)\n	(print \"~c de Abril de ~c\" dia anio))\n      ((= mes 5)\n	(print \"~c de Mayo de ~c\" dia anio))\n      ((= mes 6)\n	(print \"~c de Junio de ~c\" dia anio))\n      ((= mes 7)\n	(print \"~c de Julio de ~c\" dia anio))\n      ((= mes 8)\n  	(print \"~c de Agosto de ~c\" dia anio))\n      ((= mes 9)\n        (print \"~c de Septiembre de ~c\" dia anio))\n      ((= mes 10)\n	(print \"~c de Octubre de ~c\" dia anio))\n      ((= mes 11)\n	(print \"~c de Noviembre de ~c\" dia anio))\n      ((= mes 12)\n	(print \"~c de Diciembre de ~c\" dia anio))\n    )\n)\n\n(lenguajeFormal)");
        this.algoritmos.get(49).add("49");
        this.pasos.get(49).get(0).add("Llamado");
        this.pasos.get(49).get(0).add("Funcion");
        this.pasos.get(49).get(0).add("Impresión");
        this.pasos.get(49).get(0).add("Lectura");
        this.pasos.get(49).get(0).add("asignarcad");
        this.pasos.get(49).get(0).add("asignarcad");
        this.pasos.get(49).get(0).add("asignarcad");
        this.pasos.get(49).get(0).add("Cond");
        this.pasos.get(49).get(0).add("Igual");
        this.pasos.get(49).get(0).add("Impresión");
        this.pasos.get(49).get(0).add("Igual");
        this.pasos.get(49).get(0).add("Impresión");
        this.pasos.get(49).get(0).add("Igual");
        this.pasos.get(49).get(0).add("Impresión");
        /////////////////////////////////
        this.pasos.get(49).get(1).add("(lenguajeFormal)");
        this.pasos.get(49).get(1).add("(defun lenguajeFormal()");
        this.pasos.get(49).get(1).add("(print \"Ingrese una fecha: (dd-mm-aaaa)\")");
        this.pasos.get(49).get(1).add("(make-string fecha (read))");
        this.pasos.get(49).get(1).add("(setf dia (subseq fecha 0 2))");
        this.pasos.get(49).get(1).add("(setf mes (subseq fecha 2 5))");
        this.pasos.get(49).get(1).add("(setf anio (subseq fecha 5 10))");
        this.pasos.get(49).get(1).add("(cond");
        this.pasos.get(49).get(1).add("((= mes 1)");
        this.pasos.get(49).get(1).add("(print \"~c de Enero de ~c\" dia anio))");
        this.pasos.get(49).get(1).add("((= mes 2)");
        this.pasos.get(49).get(1).add("(print \"~c de Febrero de ~c\" dia anio))");
        this.pasos.get(49).get(1).add("((= mes 12)");
        this.pasos.get(49).get(1).add("(print \"~c de Diciembre de ~c\" dia anio))");
        
        
        ////////////////   51    /////////////////
        this.algoritmos.get(50).add("#|\nConstruir un algoritmo en Lisp que muestre\nel tamaño de una lista.\n|#");
        this.algoritmos.get(50).add("Funcion ContarTamanio\n    inicializar lista {1,2,3,4,5,6,7,8,9,10}\n    inicializar tamanio = tamaño(lista)\n    imprimir \"El tamaño de la lista es: \", tamanio\n\nllamar Funcion ContarTamanio");
        this.algoritmos.get(50).add("(defun ContarTamanio()\n    (setq lista (list 1 2 3 4 5 6 7 8 9 10))\n    (setq tamanio (length lista))\n    (print \"El tamaño de la lista es: ~c\" tamanio)\n)\n\n(ContarTamanio)");
        this.algoritmos.get(50).add("50");
        this.pasos.get(50).get(0).add("");
        this.pasos.get(50).get(0).add("");
        this.pasos.get(50).get(0).add("");
        /////////////////////////////////
        this.pasos.get(50).get(1).add("");
        this.pasos.get(50).get(1).add("");
        this.pasos.get(50).get(1).add("")
        ;////////////////   52    /////////////////
        this.algoritmos.get(51).add("#|\nConstruir un algoritmo en Lisp que muestre \ny cuente los elementos que hay en la lista.\n|#");
        this.algoritmos.get(51).add("Funcion ContarElementos\n    inicializar lista {\n       \"juan\",23,\"alonso\",\"jimena\",23,\"Salome\"\n    }\n    inicializar tamanio = tamaño(lista)\n    desde i = 1 hasta tamanio hacer:\n        imprimir i, \": \", lista[i]\n	\nllamar Funcion ContarElementos");
        this.algoritmos.get(51).add("(defun ContarElementos()\n (setq lista \n    (list \"juan\" 23 \"alonso\" \"jimena\" 23 \"Salome\")\n  )\n  (setq tamanio (length lista))\n  (loop for i from 0 to tamanio\n     do(\n         (print \"~c: ~c\" i (list-ref lista i))\n     )\n   )\n)\n\n(ContarElementos)");
        this.algoritmos.get(51).add("51");
        this.pasos.get(51).get(0).add("");
        this.pasos.get(51).get(0).add("");
        this.pasos.get(51).get(0).add("");
        /////////////////////////////////
        this.pasos.get(51).get(1).add("");
        this.pasos.get(51).get(1).add("");
        this.pasos.get(51).get(1).add("")
        ;////////////////   53    /////////////////
        this.algoritmos.get(52).add("#|\nConstruir un algoritmo en Lisp que muestre \nla suma de los elementos de una lista.\n|#");
        this.algoritmos.get(52).add("Funcion SumaElementos\n    inicializar lista {2,23,5,23,79}\n    inicializar tamanio = tamaño(lista)\n    inicializar suma = 0\n    desde i = 1 hasta tamanio hacer:\n        suma = suma + lista[i]\n    imprimir \"la suma de los elementos es: \", suma\n	\nllamar Funcion SumaElementos");
        this.algoritmos.get(52).add("(defun SumaElementos()\n    (setq lista (list 2 23 5 23 79))\n    (setq tamanio (length lista))\n    (setq suma 0)\n    (loop for i from 0 to tamanio\n        do(\n            (set suma (+  suma (list-ref lista i)))\n        )\n    )\n    (print \"la suma de los elementos es: ~c\" suma)\n)\n\n(SumaElementos)");
        this.algoritmos.get(52).add("52");
        this.pasos.get(52).get(0).add("");
        this.pasos.get(52).get(0).add("");
        this.pasos.get(52).get(0).add("");
        /////////////////////////////////
        this.pasos.get(52).get(1).add("");
        this.pasos.get(52).get(1).add("");
        this.pasos.get(52).get(1).add("")
        ;////////////////   54    /////////////////
        this.algoritmos.get(53).add("#|\nConstruir  un  algoritmo en Lisp que reciba\nuna lista de 3 posiciones y un dato a buscar.\nSe  debe  devolver  la  posición en la que se\nencuentra el dato.\n|#");
        this.algoritmos.get(53).add("Funcion BuscarElementos\n    imprimir \"Ingrese datos para una lista: \"\n    inicializar lista {\n        (valor por consola),\n        (valor por consola),\n        (valor por consola)\n    }\n    imprimir \"Ingrese dato a buscar: \"\n    inicializar dato = (valor por consola)\n    inicializar tamanio = tamaño(lista)\n    inicializar pos = 0\n    desde i = 1 hasta tamanio hacer:\n        si (lista[i] =  dato)\n            imprimir \"El dato esta en la posicion: \" pos\n            pos = pos + 1\n	\nllamar Funcion BuscarElementos");
        this.algoritmos.get(53).add("(defun BuscarElementos()\n  (print \"Ingrese datos para una lista: \")\n  (setq lista (list (read) (read) (read)))\n  (print \"Ingrese dato a buscar: \")\n  (setq dato (read))\n  (setq pos 0)\n  (setq tamanio (length lista))\n  (loop for i from 0 to tamanio\n     do(if (= (list-ref lista) dato)\n      (print \"El dato esta en la posicion: ~c\" pos)\n      (set pos (+ pos 1))\n     )\n   )\n)\n\n(BuscarElementos)");
        this.algoritmos.get(53).add("53");
        this.pasos.get(53).get(0).add("");
        this.pasos.get(53).get(0).add("");
        this.pasos.get(53).get(0).add("");
        /////////////////////////////////
        this.pasos.get(53).get(1).add("");
        this.pasos.get(53).get(1).add("");
        this.pasos.get(53).get(1).add("")
        ;////////////////   55    /////////////////
        this.algoritmos.get(54).add("#|\nConstruir  un  algoritmo  en Lisp  que reciba\nuna  lista  de  3  posiciones    de   enteros   y \ndevuelva el mayor valor contenido en la lista.\n|#");
        this.algoritmos.get(54).add("Funcion MayorElementos\n    imprimir \"Ingrese datos para una lista: \"\n    inicializar lista {\n        (valor por consola),\n        (valor por consola),\n        (valor por consola)\n    }\n    hacer-lista lista2 = Ordenar(lista)\n    imprimir \"El mayor elemento de la lista es: \"\n    lista2[0]\n\nllamar Funcion MayorElementos");
        this.algoritmos.get(54).add("(defun MayorElementos()\n    (print \"Ingrese datos para una lista: \")\n    (setq lista \n        (list (read) (read) (read))\n    )\n    (list lista2 (vl-sort lista '>))\n    (print \"El mayor elemento de la lista es: ~d\" \n    (first lista2))\n)\n\n(MayorElementos)");
        this.algoritmos.get(54).add("54");
        this.pasos.get(54).get(0).add("");
        this.pasos.get(54).get(0).add("");
        this.pasos.get(54).get(0).add("");
        /////////////////////////////////
        this.pasos.get(54).get(1).add("");
        this.pasos.get(54).get(1).add("");
        this.pasos.get(54).get(1).add("")
        ;////////////////   56    /////////////////
        this.algoritmos.get(55).add("#|\nConstruir  un  algoritmo en Lisp que reciba\nuna lista de enteros y la ordene de mayor a \nmenor.\n|#");
        this.algoritmos.get(55).add("Funcion ListaOrdenada\n    imprimir \"Ingrese datos para una lista: \"\n    inicializar lista {\n        (valor por consola),\n        (valor por consola),\n        (valor por consola)\n    }\n    hacer-lista lista2 = Ordenar(lista)\n    imprimir \"La lista ordenada es: \"\n    lista2\n\nllamar Funcion ListaOrdenada");
        this.algoritmos.get(55).add("(defun ListaOrdenada()\n    (print \"Ingrese datos para una lista: \")\n    (setq lista \n        (list (read) (read) (read))\n    )\n    (list lista2 (vl-sort lista '>))\n    (print \"La lista ordenada es: ~d\" \n    (lista2))\n)\n\n(ListaOrdenada)");
        this.algoritmos.get(55).add("55");
        this.pasos.get(55).get(0).add("");
        this.pasos.get(55).get(0).add("");
        this.pasos.get(55).get(0).add("");
        /////////////////////////////////
        this.pasos.get(55).get(1).add("");
        this.pasos.get(55).get(1).add("");
        this.pasos.get(55).get(1).add("")
        ;////////////////   57    /////////////////
        this.algoritmos.get(56).add("#|\nConstruir un algoritmo en  Lisp  que  reciba \nuna lista y devuelva otra con los datos de la \nprimera invertida. \n|#");
        this.algoritmos.get(56).add("Funcion ListaInvertida\n    imprimir \"Ingrese datos para una lista: \"\n    inicializar lista {\n        (valor por consola),\n        (valor por consola),\n        (valor por consola)\n    }\n    hacer-lista lista2 = invertir(lista)\n    imprimir \"La lista invertida es: \"\n    lista2\n\nllamar Funcion ListaInvertida");
        this.algoritmos.get(56).add("(defun ListaInvertida()\n    (print \"Ingrese datos para una lista: \")\n    (setq lista \n        (list (read) (read) (read))\n    )\n    (list lista2 (reverse lista))\n    (print \"La lista invertida es: ~d\" \n    (lista2))\n)\n\n(ListaOrdenada)");
        this.algoritmos.get(56).add("56");
        this.pasos.get(56).get(0).add("");
        this.pasos.get(56).get(0).add("");
        this.pasos.get(56).get(0).add("");
        /////////////////////////////////
        this.pasos.get(56).get(1).add("");
        this.pasos.get(56).get(1).add("");
        this.pasos.get(56).get(1).add("")
        ;////////////////   58    /////////////////
        this.algoritmos.get(57).add("#|\nConstruir un algoritmo en Lisp que reciba\nuna lista de números y un número. Si este\nnúmero   no   se   encuentra   en   la  lista,\ningresarlo  a  ella  en  la  parte  final.\n|#");
        this.algoritmos.get(57).add("Funcion BuscarDato\n    imprimir \"Ingrese numeros para una lista: \"\n    inicializar lista {\n        (valor por consola),\n        (valor por consola),\n        (valor por consola)\n    }\n    inicializar contador = 0\n    imprimir \"Ingrese un numero a buscar: \"\n    inicializar numero = (valor por consola)\n    desde i = 1 hasta tamaño(lista) hacer:\n        si (lista[i] =  numero)\n            contador = contador + 1\n    si (contador = 0)\n        añadir numero -> lista\n    imprimir \"La lista es: \"\n    lista\n\nllamar Funcion BuscarDato");
        this.algoritmos.get(57).add("(defun BuscarDato()\n    (print \"Ingrese numeros para una lista: \")\n    (setq lista \n        (list (read) (read) (read))\n    )\n    (setq contador 0)\n    (print \"Ingrese un numero a buscar: \")\n    (setq numero (read))\n    (loop for i from 0 to (length lista)\n        do(\n            (if (= (list-ref lista) numero)\n                (set contador (+ contador 1))\n                (void)\n            )\n        )\n    )\n    (if (= contador 0)\n        (append lista numero)\n    )\n    (print \"La lista es: ~d\" \n    (lista))\n)\n\n(BuscarDato)");
        this.algoritmos.get(57).add("57");
        this.pasos.get(57).get(0).add("");
        this.pasos.get(57).get(0).add("");
        this.pasos.get(57).get(0).add("");
        /////////////////////////////////
        this.pasos.get(57).get(1).add("");
        this.pasos.get(57).get(1).add("");
        this.pasos.get(57).get(1).add("")
        ;////////////////   59    /////////////////
        this.algoritmos.get(58).add("#|\nConstruir un algoritmo en Lisp que inicialice\nuna lista con 5 valores aleatorios (del 1 al 10\ny  posteriormente  muestre  en pantalla cada\nelemento de la lista junto con su cuadrado.\n|#");
        this.algoritmos.get(58).add("Funcion ListaRandom\n    imprimir \"Ingrese datos para una lista: \"\n    hacer-lista lista 5, aleatorio(10)\n    imprimir \"Elementos de la lista: \", lista\n    imprimir \"Elementos al cuadrado: \"\n    desde i = 1 hasta tamaño(lista) hacer:\n        imprimir potencia(lista[i], 2)\n	\nllamar Funcion ListaRandom");
        this.algoritmos.get(58).add("(defun ListaRandom()\n    (print \"Ingrese numeros para una lista: \")\n    (setq lista (make-list 5 (random 10)))\n    (print \"Elementos de la lista: ~d\" lista)\n    (print \"Elementos al cuadrado: \")\n    (loop for i from 0 to (length lista)\n        do(print (expt (list-ref lista i)) 2)\n    )\n)\n\n(ListaRandom)");
        this.algoritmos.get(58).add("58");
        this.pasos.get(58).get(0).add("");
        this.pasos.get(58).get(0).add("");
        this.pasos.get(58).get(0).add("");
        /////////////////////////////////
        this.pasos.get(58).get(1).add("");
        this.pasos.get(58).get(1).add("");
        this.pasos.get(58).get(1).add("")
        ;////////////////   60    /////////////////
        this.algoritmos.get(59).add("#|\nConstruir un algoritmo en Lisp que inicialice\nuna  lista  de números con valores aleatorios\n(5 valores), y posterior ordene los elementos\nde menor a mayor.\n|#");
        this.algoritmos.get(59).add("Funcion OrdenarRandom\n    hacer-lista lista 5, aleatorio(10)\n    imprimir \"Elementos de la lista: \", lista\n    hacer-lista lista2 = Ordenar(lista)\n    imprimir \"lista ordenados: \", lista2\n	\nllamar Funcion OrdenarRandom");
        this.algoritmos.get(59).add("(defun OrdenarRandom()\n    (setq lista (make-list 5 (random 10)))\n    (print \"Elementos de la lista: ~d\" lista)\n    (list lista2 (vl-sort lista '<))\n    (print \"lista ordenados: ~d\" lista2)\n)\n\n(OrdenarRandom) ");
        this.algoritmos.get(59).add("59");
        this.pasos.get(59).get(0).add("");
        this.pasos.get(59).get(0).add("");
        this.pasos.get(59).get(0).add("");
        /////////////////////////////////
        this.pasos.get(59).get(1).add("");
        this.pasos.get(59).get(1).add("");
        this.pasos.get(59).get(1).add("")
        ;////////////////   61    /////////////////
        this.algoritmos.get(60).add("");
        this.algoritmos.get(60).add("");
        this.algoritmos.get(60).add("");
        this.algoritmos.get(60).add("60");
        this.pasos.get(60).get(0).add("");
        this.pasos.get(60).get(0).add("");
        this.pasos.get(60).get(0).add("");
        /////////////////////////////////
        this.pasos.get(60).get(1).add("");
        this.pasos.get(60).get(1).add("");
        this.pasos.get(60).get(1).add("")
        ;////////////////   62    /////////////////
        this.algoritmos.get(61).add("");
        this.algoritmos.get(61).add("");
        this.algoritmos.get(61).add("");
        this.algoritmos.get(61).add("61");
        this.pasos.get(61).get(0).add("");
        this.pasos.get(61).get(0).add("");
        this.pasos.get(61).get(0).add("");
        /////////////////////////////////
        this.pasos.get(61).get(1).add("");
        this.pasos.get(61).get(1).add("");
        this.pasos.get(61).get(1).add("")
        ;////////////////   63    /////////////////
        this.algoritmos.get(62).add("");
        this.algoritmos.get(62).add("");
        this.algoritmos.get(62).add("");
        this.algoritmos.get(62).add("62");
        this.pasos.get(62).get(0).add("");
        this.pasos.get(62).get(0).add("");
        this.pasos.get(62).get(0).add("");
        /////////////////////////////////
        this.pasos.get(62).get(1).add("");
        this.pasos.get(62).get(1).add("");
        this.pasos.get(62).get(1).add("")
        ;////////////////   64    /////////////////
        this.algoritmos.get(63).add("");
        this.algoritmos.get(63).add("");
        this.algoritmos.get(63).add("");
        this.algoritmos.get(63).add("63");
        this.pasos.get(63).get(0).add("");
        this.pasos.get(63).get(0).add("");
        this.pasos.get(63).get(0).add("");
        /////////////////////////////////
        this.pasos.get(63).get(1).add("");
        this.pasos.get(63).get(1).add("");
        this.pasos.get(63).get(1).add("")
        ;////////////////   65    /////////////////
        this.algoritmos.get(64).add("");
        this.algoritmos.get(64).add("");
        this.algoritmos.get(64).add("");
        this.algoritmos.get(64).add("64");
        this.pasos.get(64).get(0).add("");
        this.pasos.get(64).get(0).add("");
        this.pasos.get(64).get(0).add("");
        /////////////////////////////////
        this.pasos.get(64).get(1).add("");
        this.pasos.get(64).get(1).add("");
        this.pasos.get(64).get(1).add("")
        ;////////////////   66    /////////////////
        this.algoritmos.get(65).add("");
        this.algoritmos.get(65).add("");
        this.algoritmos.get(65).add("");
        this.algoritmos.get(65).add("65");
        this.pasos.get(65).get(0).add("");
        this.pasos.get(65).get(0).add("");
        this.pasos.get(65).get(0).add("");
        /////////////////////////////////
        this.pasos.get(65).get(1).add("");
        this.pasos.get(65).get(1).add("");
        this.pasos.get(65).get(1).add("")
        ;////////////////   67    /////////////////
        this.algoritmos.get(66).add("");
        this.algoritmos.get(66).add("");
        this.algoritmos.get(66).add("");
        this.algoritmos.get(66).add("66");
        this.pasos.get(66).get(0).add("");
        this.pasos.get(66).get(0).add("");
        this.pasos.get(66).get(0).add("");
        /////////////////////////////////
        this.pasos.get(66).get(1).add("");
        this.pasos.get(66).get(1).add("");
        this.pasos.get(66).get(1).add("")
        ;////////////////   68    /////////////////
        this.algoritmos.get(67).add("");
        this.algoritmos.get(67).add("");
        this.algoritmos.get(67).add("");
        this.algoritmos.get(67).add("67");
        this.pasos.get(67).get(0).add("");
        this.pasos.get(67).get(0).add("");
        this.pasos.get(67).get(0).add("");
        /////////////////////////////////
        this.pasos.get(67).get(1).add("");
        this.pasos.get(67).get(1).add("");
        this.pasos.get(67).get(1).add("")
        ;////////////////   69    /////////////////
        this.algoritmos.get(68).add("");
        this.algoritmos.get(68).add("");
        this.algoritmos.get(68).add("");
        this.algoritmos.get(68).add("68");
        this.pasos.get(68).get(0).add("");
        this.pasos.get(68).get(0).add("");
        this.pasos.get(68).get(0).add("");
        /////////////////////////////////
        this.pasos.get(68).get(1).add("");
        this.pasos.get(68).get(1).add("");
        this.pasos.get(68).get(1).add("")
        ;////////////////   70    /////////////////
        this.algoritmos.get(69).add("");
        this.algoritmos.get(69).add("");
        this.algoritmos.get(69).add("");
        this.algoritmos.get(69).add("69");
        this.pasos.get(69).get(0).add("");
        this.pasos.get(69).get(0).add("");
        this.pasos.get(69).get(0).add("");
        /////////////////////////////////
        this.pasos.get(69).get(1).add("");
        this.pasos.get(69).get(1).add("");
        this.pasos.get(69).get(1).add("")
        ;////////////////   71    /////////////////
        this.algoritmos.get(70).add("");
        this.algoritmos.get(70).add("");
        this.algoritmos.get(70).add("");
        this.algoritmos.get(70).add("70");
        this.pasos.get(70).get(0).add("");
        this.pasos.get(70).get(0).add("");
        this.pasos.get(70).get(0).add("");
        /////////////////////////////////
        this.pasos.get(70).get(1).add("");
        this.pasos.get(70).get(1).add("");
        this.pasos.get(70).get(1).add("")
        ;////////////////   72    /////////////////
        this.algoritmos.get(71).add("");
        this.algoritmos.get(71).add("");
        this.algoritmos.get(71).add("");
        this.algoritmos.get(71).add("71");
        this.pasos.get(71).get(0).add("");
        this.pasos.get(71).get(0).add("");
        this.pasos.get(71).get(0).add("");
        /////////////////////////////////
        this.pasos.get(71).get(1).add("");
        this.pasos.get(71).get(1).add("");
        this.pasos.get(71).get(1).add("")
        ;////////////////   73    /////////////////
        this.algoritmos.get(72).add("");
        this.algoritmos.get(72).add("");
        this.algoritmos.get(72).add("");
        this.algoritmos.get(72).add("72");
        this.pasos.get(72).get(0).add("");
        this.pasos.get(72).get(0).add("");
        this.pasos.get(72).get(0).add("");
        /////////////////////////////////
        this.pasos.get(72).get(1).add("");
        this.pasos.get(72).get(1).add("");
        this.pasos.get(72).get(1).add("")
        ;////////////////   74    /////////////////
        this.algoritmos.get(73).add("");
        this.algoritmos.get(73).add("");
        this.algoritmos.get(73).add("");
        this.algoritmos.get(73).add("73");
        this.pasos.get(73).get(0).add("");
        this.pasos.get(73).get(0).add("");
        this.pasos.get(73).get(0).add("");
        /////////////////////////////////
        this.pasos.get(73).get(1).add("");
        this.pasos.get(73).get(1).add("");
        this.pasos.get(73).get(1).add("")
        ;////////////////   75    /////////////////
        this.algoritmos.get(74).add("");
        this.algoritmos.get(74).add("");
        this.algoritmos.get(74).add("");
        this.algoritmos.get(74).add("74");
        this.pasos.get(74).get(0).add("");
        this.pasos.get(74).get(0).add("");
        this.pasos.get(74).get(0).add("");
        /////////////////////////////////
        this.pasos.get(74).get(1).add("");
        this.pasos.get(74).get(1).add("");
        this.pasos.get(74).get(1).add("");
        
        
        ////////////////   76    /////////////////
        this.algoritmos.get(75).add("");
        this.algoritmos.get(75).add("");
        this.algoritmos.get(75).add("");
        this.algoritmos.get(75).add("75");
        this.pasos.get(75).get(0).add("");
        this.pasos.get(75).get(0).add("");
        this.pasos.get(75).get(0).add("");
        /////////////////////////////////
        this.pasos.get(75).get(1).add("");
        this.pasos.get(75).get(1).add("");
        this.pasos.get(75).get(1).add("")
        ;////////////////   77    /////////////////
        this.algoritmos.get(76).add("");
        this.algoritmos.get(76).add("");
        this.algoritmos.get(76).add("");
        this.algoritmos.get(76).add("76");
        this.pasos.get(76).get(0).add("");
        this.pasos.get(76).get(0).add("");
        this.pasos.get(76).get(0).add("");
        /////////////////////////////////
        this.pasos.get(76).get(1).add("");
        this.pasos.get(76).get(1).add("");
        this.pasos.get(76).get(1).add("")
        ;////////////////   78    /////////////////
        this.algoritmos.get(77).add("");
        this.algoritmos.get(77).add("");
        this.algoritmos.get(77).add("");
        this.algoritmos.get(77).add("77");
        this.pasos.get(77).get(0).add("");
        this.pasos.get(77).get(0).add("");
        this.pasos.get(77).get(0).add("");
        /////////////////////////////////
        this.pasos.get(77).get(1).add("");
        this.pasos.get(77).get(1).add("");
        this.pasos.get(77).get(1).add("")
        ;////////////////   79    /////////////////
        this.algoritmos.get(78).add("");
        this.algoritmos.get(78).add("");
        this.algoritmos.get(78).add("");
        this.algoritmos.get(78).add("78");
        this.pasos.get(78).get(0).add("");
        this.pasos.get(78).get(0).add("");
        this.pasos.get(78).get(0).add("");
        /////////////////////////////////
        this.pasos.get(78).get(1).add("");
        this.pasos.get(78).get(1).add("");
        this.pasos.get(78).get(1).add("")
        ;////////////////   80    /////////////////
        this.algoritmos.get(79).add("");
        this.algoritmos.get(79).add("");
        this.algoritmos.get(79).add("");
        this.algoritmos.get(79).add("79");
        this.pasos.get(79).get(0).add("");
        this.pasos.get(79).get(0).add("");
        this.pasos.get(79).get(0).add("");
        /////////////////////////////////
        this.pasos.get(79).get(1).add("");
        this.pasos.get(79).get(1).add("");
        this.pasos.get(79).get(1).add("")
        ;////////////////   81    /////////////////
        this.algoritmos.get(80).add("");
        this.algoritmos.get(80).add("");
        this.algoritmos.get(80).add("");
        this.algoritmos.get(80).add("80");
        this.pasos.get(80).get(0).add("");
        this.pasos.get(80).get(0).add("");
        this.pasos.get(80).get(0).add("");
        /////////////////////////////////
        this.pasos.get(80).get(1).add("");
        this.pasos.get(80).get(1).add("");
        this.pasos.get(80).get(1).add("")
        ;////////////////   82    /////////////////
        this.algoritmos.get(81).add("");
        this.algoritmos.get(81).add("");
        this.algoritmos.get(81).add("");
        this.algoritmos.get(81).add("81");
        this.pasos.get(81).get(0).add("");
        this.pasos.get(81).get(0).add("");
        this.pasos.get(81).get(0).add("");
        /////////////////////////////////
        this.pasos.get(81).get(1).add("");
        this.pasos.get(81).get(1).add("");
        this.pasos.get(81).get(1).add("")
        ;////////////////   83    /////////////////
        this.algoritmos.get(82).add("");
        this.algoritmos.get(82).add("");
        this.algoritmos.get(82).add("");
        this.algoritmos.get(82).add("82");
        this.pasos.get(82).get(0).add("");
        this.pasos.get(82).get(0).add("");
        this.pasos.get(82).get(0).add("");
        /////////////////////////////////
        this.pasos.get(82).get(1).add("");
        this.pasos.get(82).get(1).add("");
        this.pasos.get(82).get(1).add("")
        ;////////////////   84    /////////////////
        this.algoritmos.get(83).add("");
        this.algoritmos.get(83).add("");
        this.algoritmos.get(83).add("");
        this.algoritmos.get(83).add("83");
        this.pasos.get(83).get(0).add("");
        this.pasos.get(83).get(0).add("");
        this.pasos.get(83).get(0).add("");
        /////////////////////////////////
        this.pasos.get(83).get(1).add("");
        this.pasos.get(83).get(1).add("");
        this.pasos.get(83).get(1).add("")
        ;////////////////   85    /////////////////
        this.algoritmos.get(84).add("");
        this.algoritmos.get(84).add("");
        this.algoritmos.get(84).add("");
        this.algoritmos.get(84).add("84");
        this.pasos.get(84).get(0).add("");
        this.pasos.get(84).get(0).add("");
        this.pasos.get(84).get(0).add("");
        /////////////////////////////////
        this.pasos.get(84).get(1).add("");
        this.pasos.get(84).get(1).add("");
        this.pasos.get(84).get(1).add("")
        ;////////////////   86    /////////////////
        this.algoritmos.get(85).add("");
        this.algoritmos.get(85).add("");
        this.algoritmos.get(85).add("");
        this.algoritmos.get(85).add("85");
        this.pasos.get(85).get(0).add("");
        this.pasos.get(85).get(0).add("");
        this.pasos.get(85).get(0).add("");
        /////////////////////////////////
        this.pasos.get(85).get(1).add("");
        this.pasos.get(85).get(1).add("");
        this.pasos.get(85).get(1).add("")
        ;////////////////   87    /////////////////
        this.algoritmos.get(86).add("");
        this.algoritmos.get(86).add("");
        this.algoritmos.get(86).add("");
        this.algoritmos.get(86).add("86");
        this.pasos.get(86).get(0).add("");
        this.pasos.get(86).get(0).add("");
        this.pasos.get(86).get(0).add("");
        /////////////////////////////////
        this.pasos.get(86).get(1).add("");
        this.pasos.get(86).get(1).add("");
        this.pasos.get(86).get(1).add("")
        ;////////////////   88    /////////////////
        this.algoritmos.get(87).add("");
        this.algoritmos.get(87).add("");
        this.algoritmos.get(87).add("");
        this.algoritmos.get(87).add("87");
        this.pasos.get(87).get(0).add("");
        this.pasos.get(87).get(0).add("");
        this.pasos.get(87).get(0).add("");
        /////////////////////////////////
        this.pasos.get(87).get(1).add("");
        this.pasos.get(87).get(1).add("");
        this.pasos.get(87).get(1).add("")
        ;////////////////   89    /////////////////
        this.algoritmos.get(88).add("");
        this.algoritmos.get(88).add("");
        this.algoritmos.get(88).add("");
        this.algoritmos.get(88).add("88");
        this.pasos.get(88).get(0).add("");
        this.pasos.get(88).get(0).add("");
        this.pasos.get(88).get(0).add("");
        /////////////////////////////////
        this.pasos.get(88).get(1).add("");
        this.pasos.get(88).get(1).add("");
        this.pasos.get(88).get(1).add("")
        ;////////////////   90    /////////////////
        this.algoritmos.get(89).add("");
        this.algoritmos.get(89).add("");
        this.algoritmos.get(89).add("");
        this.algoritmos.get(89).add("89");
        this.pasos.get(89).get(0).add("");
        this.pasos.get(89).get(0).add("");
        this.pasos.get(89).get(0).add("");
        /////////////////////////////////
        this.pasos.get(89).get(1).add("");
        this.pasos.get(89).get(1).add("");
        this.pasos.get(89).get(1).add("")
        ;////////////////   91    /////////////////
        this.algoritmos.get(90).add("");
        this.algoritmos.get(90).add("");
        this.algoritmos.get(90).add("");
        this.algoritmos.get(90).add("90");
        this.pasos.get(90).get(0).add("");
        this.pasos.get(90).get(0).add("");
        this.pasos.get(90).get(0).add("");
        /////////////////////////////////
        this.pasos.get(90).get(1).add("");
        this.pasos.get(90).get(1).add("");
        this.pasos.get(90).get(1).add("")
        ;////////////////   92    /////////////////
        this.algoritmos.get(91).add("");
        this.algoritmos.get(91).add("");
        this.algoritmos.get(91).add("");
        this.algoritmos.get(91).add("91");
        this.pasos.get(91).get(0).add("");
        this.pasos.get(91).get(0).add("");
        this.pasos.get(91).get(0).add("");
        /////////////////////////////////
        this.pasos.get(91).get(1).add("");
        this.pasos.get(91).get(1).add("");
        this.pasos.get(91).get(1).add("")
        ;////////////////   93    /////////////////
        this.algoritmos.get(92).add("");
        this.algoritmos.get(92).add("");
        this.algoritmos.get(92).add("");
        this.algoritmos.get(92).add("92");
        this.pasos.get(92).get(0).add("");
        this.pasos.get(92).get(0).add("");
        this.pasos.get(92).get(0).add("");
        /////////////////////////////////
        this.pasos.get(92).get(1).add("");
        this.pasos.get(92).get(1).add("");
        this.pasos.get(92).get(1).add("")
        ;////////////////   94    /////////////////
        this.algoritmos.get(93).add("");
        this.algoritmos.get(93).add("");
        this.algoritmos.get(93).add("");
        this.algoritmos.get(93).add("93");
        this.pasos.get(93).get(0).add("");
        this.pasos.get(93).get(0).add("");
        this.pasos.get(93).get(0).add("");
        /////////////////////////////////
        this.pasos.get(93).get(1).add("");
        this.pasos.get(93).get(1).add("");
        this.pasos.get(93).get(1).add("")
        ;////////////////   95    /////////////////
        this.algoritmos.get(94).add("");
        this.algoritmos.get(94).add("");
        this.algoritmos.get(94).add("");
        this.algoritmos.get(94).add("94");
        this.pasos.get(94).get(0).add("");
        this.pasos.get(94).get(0).add("");
        this.pasos.get(94).get(0).add("");
        /////////////////////////////////
        this.pasos.get(94).get(1).add("");
        this.pasos.get(94).get(1).add("");
        this.pasos.get(94).get(1).add("")
        ;////////////////   96    /////////////////
        this.algoritmos.get(95).add("");
        this.algoritmos.get(95).add("");
        this.algoritmos.get(95).add("");
        this.algoritmos.get(95).add("95");
        this.pasos.get(95).get(0).add("");
        this.pasos.get(95).get(0).add("");
        this.pasos.get(95).get(0).add("");
        /////////////////////////////////
        this.pasos.get(95).get(1).add("");
        this.pasos.get(95).get(1).add("");
        this.pasos.get(95).get(1).add("")
        ;////////////////   97    /////////////////
        this.algoritmos.get(96).add("");
        this.algoritmos.get(96).add("");
        this.algoritmos.get(96).add("");
        this.algoritmos.get(96).add("96");
        this.pasos.get(96).get(0).add("");
        this.pasos.get(96).get(0).add("");
        this.pasos.get(96).get(0).add("");
        /////////////////////////////////
        this.pasos.get(96).get(1).add("");
        this.pasos.get(96).get(1).add("");
        this.pasos.get(96).get(1).add("")
        ;////////////////   98    /////////////////
        this.algoritmos.get(97).add("");
        this.algoritmos.get(97).add("");
        this.algoritmos.get(97).add("");
        this.algoritmos.get(97).add("97");
        this.pasos.get(97).get(0).add("");
        this.pasos.get(97).get(0).add("");
        this.pasos.get(97).get(0).add("");
        /////////////////////////////////
        this.pasos.get(97).get(1).add("");
        this.pasos.get(97).get(1).add("");
        this.pasos.get(97).get(1).add("")
        ;////////////////   99    /////////////////
        this.algoritmos.get(98).add("");
        this.algoritmos.get(98).add("");
        this.algoritmos.get(98).add("");
        this.algoritmos.get(98).add("98");
        this.pasos.get(98).get(0).add("");
        this.pasos.get(98).get(0).add("");
        this.pasos.get(98).get(0).add("");
        /////////////////////////////////
        this.pasos.get(98).get(1).add("");
        this.pasos.get(98).get(1).add("");
        this.pasos.get(98).get(1).add("")
        ;////////////////   100    /////////////////
        this.algoritmos.get(99).add("");
        this.algoritmos.get(99).add("");
        this.algoritmos.get(99).add("");
        this.algoritmos.get(99).add("99");
        this.pasos.get(99).get(0).add("");
        this.pasos.get(99).get(0).add("");
        this.pasos.get(99).get(0).add("");
        /////////////////////////////////
        this.pasos.get(99).get(1).add("");
        this.pasos.get(99).get(1).add("");
        this.pasos.get(99).get(1).add("");
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
