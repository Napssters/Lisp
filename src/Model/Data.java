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
        this.algoritmos.get(10).add("#|\nCrear  un  algoritmo  en  Lisp  que reciba un \nnúmero dentro del rango1 a 12 y de acuerdo\nal  número  imprima  el mes correspondiente.\n|#");
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
        this.algoritmos.get(17).add("");
        this.algoritmos.get(17).add("");
        this.algoritmos.get(17).add("");
        this.algoritmos.get(17).add("17");
        this.pasos.get(17).get(0).add("");
        this.pasos.get(17).get(0).add("");
        this.pasos.get(17).get(0).add("");
        /////////////////////////////////
        this.pasos.get(17).get(1).add("");
        this.pasos.get(17).get(1).add("");
        this.pasos.get(17).get(1).add("");
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
