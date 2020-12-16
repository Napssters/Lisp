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
            case "Impresión" : respuesta = "Se usa la palabra reservada print. Entre comillas dobles se coloca el mensaje a imprimir.\nPara imprimir variables se coloca dentro de las comillas el simbolo ~ seguido del correspondiente identificador tipo de dato"; 
                 break;
            case "Resta" : respuesta = "Se usa el simbolo \" -  \" como operacion para \nla resta  de uno o mas valores. \n\nEjemplo: (- a b c) \n\nDe esta manera se restan dichas variables."; 
                 break;
            case "Mult" : respuesta = "Se usa el simbolo \" *  \" como operacion para \nla multiplicacion  de uno o mas valores. \n\nEjemplo: (* a b c) \n\nDe esta manera se multiplican  dichas variables."; 
                 break;
            case "Lectura" : respuesta = "Se  usa  la  palabra reservada read para ingresar datos\npor teclado\n\nEjemplo\nVamos a guardar un dato ingresado por teclado en una\nvariable.\n\na = (leer)\n\nEn Lisp tendriamos\n\n(setq a (read)\n\nDe  esta  forma  guardariamos  la  informacion  por\nteclado  en  una  variable"; 
                 break;
            case "Llamado" : respuesta = "Para hacer uso de una funcion solo es poner dentro de\nparéntesis el nombre de la función fuera y al fina l de la\nmisma.\n\nEjemplo\n\n(definir (suma)\n\t …\n\t …\n)\n\n (suma)\n\nAhora en Lisp tendriamos\n\n(defun (suma)\n\t …\n\t …\n)\n\n(suma)"; 
                 break;
            case "Funcion" : respuesta = "asd"; 
                 break;
            case "Div" : respuesta = "Se usa el simbolo \\\" /  \\\" como operacion para \\nla divicion de dos valores. \\n\\nEjemplo: (/ a b ) \\n\\nDe esta manera se dividen dichas variables."; 
                 break;
            case "Expt" : respuesta = "Se usa la palabra reservada expt para elevar un número \na una potencia determinada.\n\nEjemplo: (expt a b)\n\nDonde a corresponde al valor a elevar y b a el valor del\nexponente\n\n(exponente 2 3)\n\nEl cual hace referencia a eleva    r 2 a la 3"; 
                 break;
            case "Asignación" : respuesta = "Se usa la palabra reservada setq para crear y asignar \nvalores a una variable local"; 
                 break;
            case "Defvar" : respuesta = "Se usa la palabra reservada (defvar) para crear y asignar \nvalores a una variable globales"; 
                 break;
            case "Condicional" : respuesta = "asd"; 
                 break;
            case "CondiAnidado" : respuesta = "asd"; 
                 break;
            case "otros" : respuesta = "asd"; 
                 break;
        }
        return respuesta;
    }
}
