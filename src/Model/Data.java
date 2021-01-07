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
        this.algoritmos.get(2).add("funciion Suma\n\timrpimir \"Ingrese el valor de a\"\n\tinicializar a = (valor por consola)\n\timrpimir \"Ingrese el valor de b\"\n\tinicializar b = (valor por consola)\n\timrpimir \"La suma es: \", (a + b)\n\nllamar funcion Suma");
        this.algoritmos.get(2).add("(defun Suma()\n\t(print \"ingrese el valor de a\")\n\t(setq a (read))\n\t(print \"ingrese el valor de b\")\n\t(setq b (read))\n\t(print \"La suma es: ~d\" (+ a b))\n)\n\n(Suma)");
        this.algoritmos.get(2).add("2");
        this.pasos.get(2).get(0).add("Funcion");
        this.pasos.get(2).get(0).add("Impresión");
        this.pasos.get(2).get(0).add("Lectura");
        this.pasos.get(2).get(0).add("Impresión");
        this.pasos.get(2).get(0).add("Lectura");
        this.pasos.get(2).get(0).add("Llamado");
        /////////////////////////////////
        this.pasos.get(2).get(1).add("(defun Suma()");
        this.pasos.get(2).get(1).add("(print \"ingrese el valor de a\")");
        this.pasos.get(2).get(1).add("(setq a (read))");
        this.pasos.get(2).get(1).add("(print \"ingrese el valor de b\")");
        this.pasos.get(2).get(1).add("(setq b (read))");
        this.pasos.get(2).get(1).add("(Suma)");
        ////////////////   4    /////////////////
        this.algoritmos.get(3).add("#|\nConstruir  un algoritmo en Lisp que dé a\nconocer el precio de la leche que compro\nJulián,  teniendo  como  base que el pagó\n20.000  pesos  por  3  litros de leche y le\ndieron 8.000  pesos de cambio.\n|#");
        this.algoritmos.get(3).add("funcion PrecioUnidad\n\tinicializar unidad = ((20000 - 8000) / 3))\n\timprimir \"El precio de la leche por unidad es de: \", unidad\n\nllamar funcion PrecioUnidad");
        this.algoritmos.get(3).add("(defun PrecioUnidad()\n\t(setq unidad (/ (- 20000 8000) 3))\n\t(print \"El precio de la leche por unidad es de: ~d\" unidad)\n)\n\n(PrecioUnidad)");
        this.algoritmos.get(3).add("3");
        this.pasos.get(3).get(0).add("Funcion");
        this.pasos.get(3).get(0).add("Asignación");
        this.pasos.get(3).get(0).add("Impresión");
        this.pasos.get(3).get(0).add("Resta");
        this.pasos.get(3).get(0).add("Div");
        /////////////////////////////////
        this.pasos.get(3).get(1).add("(defun PrecioUnidad()");
        this.pasos.get(3).get(1).add("(setq unidad (/ (- 20000 8000) 3))");
        this.pasos.get(3).get(1).add("(print \"El precio de la leche por unidad es de: ~d\" unidad)");
        this.pasos.get(3).get(1).add("(- 20000 8000)");
        this.pasos.get(3).get(1).add("(/ (- 20000 8000) 3)");
        ////////////////   5    /////////////////
        this.algoritmos.get(4).add("#|\nConstruir  un  algoritmo en Lisp que le dé a\nconocer a juan el precio de la chaqueta VJT\n que  compró  por  32.000  la  cual  tiene un\ndescuento del  22% y el precio del pantalón\nque  le  costó  27.500 pesos el cual tiene un\ndescuento  del  15%.\n|#");
        this.algoritmos.get(4).add("Funcion Costo\n\tinicializar chaqueta = (32000 - (32000 * 0.22))\n\tinicializar pantalon = (27500 - (27500 * 0.15))\n\tinicializar sum = (chaqueta + pantalon)\n\timprimir \"El precio total es de: \", sum\n\nllamar Funcion Costo");
        this.algoritmos.get(4).add("(defun Costo()\n\t(setq chaqueta (- 32000 (* 32000 0.22)))\n\t(setq pantalon (- 27500 (* 27500 0.15)))\n\t(setq sum (+ chaqueta pantalon))\n\t(print \"El precio total es de: ~d\" sum)\n)\n\n(Costo)");
        this.algoritmos.get(4).add("4");
        this.pasos.get(4).get(0).add("Funcion");
        this.pasos.get(4).get(0).add("Asignación");
        this.pasos.get(4).get(0).add("Mult");
        this.pasos.get(4).get(0).add("Resta");
        this.pasos.get(4).get(0).add("Suma");
        this.pasos.get(4).get(0).add("Impresión");
        /////////////////////////////////
        this.pasos.get(4).get(1).add("(defun Costo()");
        this.pasos.get(4).get(1).add("(setq chaqueta (- 32000 (* 32000 0.22)))");
        this.pasos.get(4).get(1).add("(* 32000 0.22)");
        this.pasos.get(4).get(1).add("(- 32000 (* 32000 0.22))");
        this.pasos.get(4).get(1).add("(setq sum (+ chaqueta pantalon))");
        this.pasos.get(4).get(1).add("(print \"El precio total es de: ~d\" sum)");
        ////////////////   6    /////////////////
        this.algoritmos.get(5).add("#|\nCrear  un  algoritmo en Lisp que maneje el\ndescuento  sobre  un  precio que el usuario\ningresa, el descuento también lo determina\nel  usuario.\n|#");
        this.algoritmos.get(5).add("Funcion Descuentos\n\timprimir \"Ingrese el precio: \"\n\tinicializar precio = (valor por consola)\n\timprimir \"Ingrese el descuento sin el %: \"\n\tinicializar descuento = (valor por consola)\n\tinicializar finalP = (precio - (precio * (descuento / 100)))\n\nllamar Funcion Descuentos");
        this.algoritmos.get(5).add("(defun Descuentos()\n\t(print \"Ingrese el precio: \")\n\t(setq precio (read))\n\t(print \"Ingrese el descuento sin el %: \")\n\t(setq descuento (read))\n\t(setq finalP (- precio (* precio (/ descuento 100))))\n)\n\n(Descuentos)");
        this.algoritmos.get(5).add("5");
        this.pasos.get(5).get(0).add("Funcion");
        this.pasos.get(5).get(0).add("Impresión");
        this.pasos.get(5).get(0).add("Lectura");
        this.pasos.get(5).get(0).add("Div");
        this.pasos.get(5).get(0).add("Mult");
        this.pasos.get(5).get(0).add("Resta");
        this.pasos.get(5).get(0).add("Asignación");
        /////////////////////////////////
        this.pasos.get(5).get(1).add("(defun Descuentos()");
        this.pasos.get(5).get(1).add("(print \"Ingrese el precio: \")");
        this.pasos.get(5).get(1).add("(setq precio (read))");
        this.pasos.get(5).get(1).add("(/ descuento 100)");
        this.pasos.get(5).get(1).add("(* precio (/ descuento 100))");
        this.pasos.get(5).get(1).add("(- precio (* precio (/ descuento 100)))");
        this.pasos.get(5).get(1).add("(setq finalP (- precio (* precio (/ descuento 100))))");
        ////////////////   7    /////////////////
        this.algoritmos.get(6).add("#|\nCrear un algoritmo en Lisp que valide si un\nnúmero ingresado es par o impar.\n|#");
        this.algoritmos.get(6).add("Funcion ParImpar\n\timprimir \"Ingrese un numero: \"\n\tinicializar var = (valor por consola)\n\tsi (modulo var, 2) = 0\n\t\timprimir \"El numero es par\"\n\tsino\n\t\timprimir \"El numero es imparpar\"\n\nllamar Funcion ParImpar");
        this.algoritmos.get(6).add("(defun ParImpar()\n\t(print \"Ingrese un numero: \")\n\t(setq var (read))\n\t(if (eql remainder(var 2) 0)\n\t\t(print \"El numero es par\")\n\t\t(print \"El numero es imparpar\")\n\t)\n)\n\n(ParImpar)");
        this.algoritmos.get(6).add("6");
        this.pasos.get(6).get(0).add("Funcion");
        this.pasos.get(6).get(0).add("Impresión");
        this.pasos.get(6).get(0).add("Lectura");
        this.pasos.get(6).get(0).add("Condicional");
        this.pasos.get(6).get(0).add("Impresión");
        this.pasos.get(6).get(0).add("Impresión");
        /////////////////////////////////
        this.pasos.get(6).get(1).add("(defun ParImpar()");
        this.pasos.get(6).get(1).add("(print \"Ingrese un numero: \")");
        this.pasos.get(6).get(1).add("(setq var (read))");
        this.pasos.get(6).get(1).add("(if (eql remainder(var 2) 0)");
        this.pasos.get(6).get(1).add("(print \"El numero es par\")");
        this.pasos.get(6).get(1).add("(print \"El numero es imparpar\")");
        ////////////////   8    /////////////////
        this.algoritmos.get(7).add("#|\nCrear un algoritmo en Lisp que capture las\nnotas  de  un  estudiante  y  determine si el\nestudiante  aprobó  la  materia,  se aprueba\ncon  una  nota  mayor  a  3.0,  el  rango de\ncalificación  es  de  0  hasta  5.\n|#");
        this.algoritmos.get(7).add("Funcion NotasEstudiante\n\timprimir \"Ingrese la nota 1: \"\n\tinicializar nota1 = (valor por consola)\n\timprimir \"Ingrese la nota 2: \"\n\tinicializar nota2 = (valor por consola)\n\timprimir \"Ingrese la nota 3: \"\n\tinicializar nota3 = (valor por consola)\n\tsi (nota1 + nota2 + nota3) > 2.9\n\t\timprimir \"Aprobó la materia\"\n\tsino\n\t\timprimir \"Reprobó la materia\"\n\nllamar Funcion NotasEstudiante");
        this.algoritmos.get(7).add("(defun NotasEstudiante()\n\t(print \"Ingrese la nota 1: \")\n\t(setq nota1 (read))\n\t(print \"Ingrese la nota 2: \")\n\t(setq nota2 (read))\n\t(print \"Ingrese la nota 3: \")\n\t(setq nota3 (read))\n\t(if (> (+ nota1 nota2 nota3) 2.9)\n\t\t(print \"Aprobó la materia\")\n\t\t(print \"Reprobó la materia\")\n\t)\n)\n\n(NotasEstudiante)");
        this.algoritmos.get(7).add("7");
        this.pasos.get(7).get(0).add("Funcion");
        this.pasos.get(7).get(0).add("Impresión");
        this.pasos.get(7).get(0).add("Lectura");
        this.pasos.get(7).get(0).add("Condicional");
        this.pasos.get(7).get(0).add("Impresión");
        this.pasos.get(7).get(0).add("Impresión");
        /////////////////////////////////
        this.pasos.get(7).get(1).add("(defun NotasEstudiante()");
        this.pasos.get(7).get(1).add("(print \"Ingrese la nota 1: \")");
        this.pasos.get(7).get(1).add("(setq nota1 (read))");
        this.pasos.get(7).get(1).add("(if (> (+ nota1 nota2 nota3) 2.9)");
        this.pasos.get(7).get(1).add("(print \"Aprobó la materia\")");
        this.pasos.get(7).get(1).add("(print \"Reprobó la materia\")");
        ////////////////   9    /////////////////
        this.algoritmos.get(8).add("#|\nCrear  un  algoritmo  en  Lisp que lea tres\nnúmeros  por  consola  e  imprima  solo el\nnúmero mayor entre los ingresados.\n|#");
        this.algoritmos.get(8).add("Funcion mayorde3\n\timprimir \"Ingrese el primer numero: \"\n\tinicializar n1 = (valor por consola)\n\timprimir \"Ingrese el segundo numero: \"\n\tinicializar n2 = (valor por consola)\n\timprimir \"Ingrese el tercer numero: \"\n\tinicializar n3 = (valor por consola)\n\tsi n1 > n2\n\t\timprimir \"El numero mayor es: \", n1\n\tsino\n\t\tsi n2 > n3\n\t\t\timprimir \"El numero mayor es: \", n2\n\t\tsino\n\t\t\timprimir \"El numero mayor es: \", n3\n\nllamar Funcion mayorde3");
        this.algoritmos.get(8).add("(defun mayorde3()\n\t(print \"Ingrese el primer numero: \")\n\t(setq n1 (read))\n\t(print \"Ingrese el segundo numero: \")\n\t(setq n2 (read))\n\t(print \"Ingrese el tercer numero: \")\n\t(setq n3 (read))\n\t(if (> n1 n2)\n\t\t(print \"El numero mayor es: ~a\" n1)\n\t\t(if (> n2 n3)\n\t\t\t(print \"El numero mayor es: ~a\" n2)\n\t\t\t(print \"El numero mayor es: ~a\" n3)\n\t\t)\n\t)\n)\n\n(mayorde3)");
        this.algoritmos.get(8).add("8");
        this.pasos.get(8).get(0).add("Funcion");
        this.pasos.get(8).get(0).add("Impresión");
        this.pasos.get(8).get(0).add("Lectura");
        this.pasos.get(8).get(0).add("Condicional");
        this.pasos.get(8).get(0).add("CondiAnidado");
        this.pasos.get(8).get(0).add("Impresión");
        /////////////////////////////////
        this.pasos.get(8).get(1).add("(defun mayorde3()");
        this.pasos.get(8).get(1).add("(print \"Ingrese el primer numero: \")");
        this.pasos.get(8).get(1).add("(setq n1 (read))");
        this.pasos.get(8).get(1).add("(if (> n1 n2)");
        this.pasos.get(8).get(1).add("(if (> n2 n3)");
        this.pasos.get(8).get(1).add("(print \"El numero mayor es: ~a\" n2)");
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
