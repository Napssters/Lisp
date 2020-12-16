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
            case "Resta" : respuesta = "asd"; 
                 break;
            case "Mult" : respuesta = "asd"; 
                 break;
            case "Lectura" : respuesta = "asd"; 
                 break;
            case "Llamado" : respuesta = "asd"; 
                 break;
            case "Funcion" : respuesta = "asd"; 
                 break;
            case "Div" : respuesta = "asd"; 
                 break;
            case "Expt" : respuesta = "Se usa la palabra reservada expt para elevar un número \na una potencia determinada.\n\nEjemplo: (expt a b)\n\nDonde a corresponde al valor a elevar y b a el valor del\nexponente\n\n(exponente 2 3)\n\nEl cual hace referencia a eleva    r 2 a la 3"; 
                 break;
            case "Asignación" : respuesta = "Se usa la palabra reservada setq para crear y asignar valores a una variable local"; 
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
