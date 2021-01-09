/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Nico
 */
public class Enunciados {

    public Enunciados() {
    }
    
    public String getEnunciado(String enunciado){
        String respuesta = "";
        switch(enunciado){
            case "Suma" : respuesta = "Se usa el simbolo \" + \" como operacion para \nla suma de uno o mas valores. \n\nEjemplo: (+ a b c) \n\nDe esta manera se suman dichas variables."; 
                 break;
            case "Impresión" : respuesta = "Se usa la palabra reservada print. Entre comillas dobles \nse coloca el mensaje a imprimir.\n\nEjemplo:\n(imprimir  \"Hola mundo\")\n\nEn Lisp\n(print \"Hola mundo\")\n\nPara imprimir variables se coloca dentro de las comillas \nel  simbolo  ~  seguido del correspondiente identificador \ntipo de dato"; 
                 break;
            case "Resta" : respuesta = "Se usa el simbolo \" -  \" como operacion para \nla resta  de uno o mas valores. \n\nEjemplo: (- a b c) \n\nDe esta manera se restan dichas variables."; 
                 break;
            case "Mult" : respuesta = "Se usa el simbolo \" *  \" como operacion para \nla multiplicacion  de uno o mas valores. \n\nEjemplo: (* a b c) \n\nDe esta manera se multiplican  dichas variables."; 
                 break;
            case "Lectura" : respuesta = "Se  usa  la  palabra reservada read para ingresar datos\npor teclado\n\nEjemplo\nVamos a guardar un dato ingresado por teclado en una\nvariable.\n\na = (leer)\n\nEn Lisp tendriamos\n\n(setq a (read)\n\nDe  esta  forma  guardariamos  la  informacion  por\nteclado  en  una  variable"; 
                 break;
            case "Llamado" : respuesta = "Para hacer uso de una funcion solo es poner dentro de\nparéntesis el nombre de la función fuera y al fina l de la\nmisma.\n\nEjemplo\n\n(definir (suma)\n     …\n     …\n)\n\n (suma)\n\nAhora en Lisp tendriamos\n\n(defun (suma)\n     …\n     …\n)\n\n(suma)"; 
                 break;
            case "Funcion" : respuesta = "Para definir una función en Lisp basta con hacer uso de\nla  palabra  reservada  defun  seguido  del nombre de la \nfunción\n\nEjemplo\n(definir (suma)\n     …\n     …\n)\n\n (suma)\n\nAhora en Lisp tendríamos\n\n(defun(suma)\n     …\n     …\n)\n\n(suma)"; 
                 break;
            case "Div" : respuesta = "Se usa el simbolo \" /  \" como operacion para \nla divicion de dos valores. \n\nEjemplo: (/ a b ) \n\nDe esta manera se dividen dichas variables."; 
                 break;
            case "Expt" : respuesta = "Se usa la palabra reservada expt para elevar un número \na una potencia determinada.\n\nEjemplo: (expt a b)\n\nDonde a corresponde al valor a elevar y b a el valor del\nexponente\n\n(exponente 2 3)\n\nEl cual hace referencia a eleva    r 2 a la 3"; 
                 break;
            case "Asignación" : respuesta = "Se usa la palabra reservada setq para crear y asignar \nvalores a una variable local"; 
                 break;
            case "Defvar" : respuesta = "Se usa la palabra reservada (defvar) para crear y asignar \nvalores a una variable globales"; 
                 break;
            case "Condicional" : respuesta = "Para hacer uso de un condicional basta fácilmente con \nhacer  uso  de  la  palabra  reservada  (if) seguido de la \ninstrucción  a  comprar  y  la  respuesta  a dar, bien sea \nfalsa o verdadera\n\nEjemplo\n(si (2 < 3)\n    mostrar 2\n    sino mostrar 3\n)\n\nAhora en Lisp seria:\n(if (2 < 3)\n    (print 2)\n    (print 3)\n)"; 
                 break;
            case "CondiAnidado" : respuesta = "Si se cumple la necesidad de un  condicional  anidado \nsolo hay que agregar un condicional normal, dentro de \notro condicional.\n\nEjemplo menor de tres números 2, 3, 4\n\n(si (2 < 3)\n        (si (2 < 4)\n               mostrar 2\n               sino mostrar 4\n         )\n         (si (3 < 4)\n                mostrar 3\n                sino mostrar 4\n         )\n)\n\nAhora en Lisp seria:\n(if (2 < 3)\n       (if (2 < 4)\n             (print 2)\n             (print 4)\n       )\n       (if (3 < 4)\n            (print 2)\n            (print 4)\n       )\n)"; 
                 break;
            case "Modulo" : respuesta = "La palabra reservada remaider obtiene el módulo o el\nresiduo de una división bien sea 0 o 1\n\nEjemplo:\n(3 modulo 2) Ó (modulo 3 2)\n\nAhora en Lisp tendríamos\nremainder (3 2)"; 
                 break;
            case "Cond" : respuesta = "La función Cond sirve como condicional, pero este tiene\nla  propiedad  especial  de evaluar una lista de posibles\nopciones  y  dar  a  conocer  cuál es la condición que se\ncumple.\n\nEjemplo\n   (cond \n       [(condicional)(Respuesta_Verdadero)]\n       [(condicion2)(Respuesta_Verdadero)]\n       …\n       [(condición)(Respuesta_Verdadero)]\n       (else (Respuesta_Falso)\n   )\n\nAhora en Lisp tendríamos\n (cond\n        ((< a b) (display \"Es mayor b\"))\n        ((< b a) (display \"Es mayor a\"))\n )"; 
                 break;
            case "Igual" : respuesta = "En Lisp a diferencia de otros lenguajes la función \" = \" \nsirve para comparar un dato con otro, devolviendo así\nun verdadero o un falso.\n\nEjemplo:\n( a = b) \n( 1 = 2)  -> Falso\n( 2 = 2)  -> Verdadero\n\nAhora en Lisp tendríamos\n(= a b)\n(= 1 2)  -> Falso\n(= 2 2)  -> Verdadero"; 
                 break;
            case "otros" : respuesta = "asd"; 
                 break;
        }
        return respuesta;
    }
}
