/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Nico
 */
public class JavaAlgorithms {

    public JavaAlgorithms() {
        
    }
    
    public String a0(){
        return "-12";
    }
    
    public String a1(){
        return "36,57";
    }
    
    public String a2(List<String> reads){
        int sum = 0;
        for(int i = 0; i < reads.size(); i++){
            if(reads.get(i).equals("")){
                //No hace nada
            }else{
                try{
                    sum += Integer.parseInt(reads.get(i));
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
                }
            }
        }
        return "La suma es: " + sum;
    }
    
    public String a3(List<String> reads){
        return "El precio de la leche por unidad es de: 4.000";
    }
    
    public String a4(List<String> reads){
        return "El precio total es de: 48.355";
    }
    
    public String a5(List<String> reads){
        float precio = 0;
        float desc = 0;
        try{
            precio = Integer.parseInt(reads.get(0));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        try{
            desc = Integer.parseInt(reads.get(1));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        return "" + (precio - (precio * (desc / 100)));
    }
    
    public String a6(List<String> reads){
        String esPar = "";
        try{
            esPar = ((Integer.parseInt(reads.get(0)) % 2) == 0)? "El numero es par":"El numero es imparpar";
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        return esPar;
    }
    
    public String a7(List<String> reads){
        float n1 = 0;
        float n2 = 0;
        float n3 = 0;
        try{
            n1 = Float.parseFloat(reads.get(0));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        try{
            n2 = Float.parseFloat(reads.get(1));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        try{
            n3 = Float.parseFloat(reads.get(2));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        return (((n1 + n2 + n3) / 3) > 2.9)? "Aprobó la materia":"Reprobó la materia";
    }
    
    public String a8(List<String> reads){
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        String respuesta = "";
        try{
            n1 = Integer.parseInt(reads.get(0));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        try{
            n2 = Integer.parseInt(reads.get(1));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        try{
            n3 = Integer.parseInt(reads.get(2));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        if (n1 > n2) {
            if (n1 > n3) {
                respuesta = "El numero mayor es: " + n1;
            } else {
                respuesta = "El numero mayor es: " + n3 ;
            }
        } else if (n2 > n3) {
            respuesta = "El numero mayor es: " + n2 ;
        } else {
            respuesta = "El numero mayor es: " + n3 ;
        }
        return respuesta;
    }
    
    public String a9(List<String> reads){
        int sum = 0;
        for(int i = 0; i < 3; i++){ 
            System.out.println(Integer.parseInt(reads.get(i)));
            try{
                if(Integer.parseInt(reads.get(i)) < 0){
                    sum++;
                }
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
            }
        }
        return ""+sum;
    }
    
    public String a10(List<String> reads){
        int opc = 0;
        String mes = "";
        try{
            opc = Integer.parseInt(reads.get(0));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        switch(opc){
            case 1:
                    mes = "mes de Enero";
                break;
            case 2:
                    mes = "mes de Febrero";
                break;
            case 3:
                    mes = "mes de Marzo";
                break;
            case 4:
                    mes = "mes de Abril";
                break;
            case 5:
                    mes = "mes de Mayo";
                break;
            case 6:
                    mes = "mes de Junio";
                break;
            case 7:
                    mes = "mes de Julio";
                break;
            case 8:
                    mes = "mes de Agosto";
                break;
            case 9:
                    mes = "mes de Septiembre";
                break;
            case 0:
                    mes = "mes de Octubre";
                break;
            case 11:
                    mes = "mes de Noviembre";
                break;
            case 12:
                    mes = "mes de Diciembre";
                break;
            default: mes = "";
        }
        return mes;
    }
    
    public String a11(List<String> reads){
        String letra = "";
        try{
            letra = reads.get(0);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        switch(letra){
            case "a":
                    letra = "La vocal esta en la posicion 1";
                break;
            case "e":
                    letra = "La vocal esta en la posicion 2";
                break;
            case "i":
                    letra = "La vocal esta en la posicion 3";
                break;
            case "o":
                    letra = "La vocal esta en la posicion 4";
                break;
            case "u":
                    letra = "La vocal esta en la posicion 5";
                break;
            default: letra = "";
        }
        return letra;
    }
    
    public String a12(List<String> reads){
        int opc = 0;
        String opcion = "";
        try{
            opc = Integer.parseInt(reads.get(0));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        switch(opc){
            case 1:
                    opcion = "La opcion seleccionada es la: 1";
                break;
            case 2:
                    opcion = "La opcion seleccionada es la: 2";
                break;
            case 3:
                    opcion = "La opcion seleccionada es la: 3";
                break;
            default: opcion = "";
        }
        return opcion;
    }
    
    public String a13(List<String> reads){
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        try{
            n1 = Integer.parseInt(reads.get(0));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        try{
            n2 = Integer.parseInt(reads.get(1));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        n3 = n1 + n2;
        String opcion = "";
        if(n3 > 10){
                opcion = "Es mayor a 10: " +  n3;
        }
        if(n3 < 10){
                opcion = "Es menor a 10: " +  n3;
        }
        if(n3 == 10){
                opcion = "Es igual a 10: " +  n3;
        }
        return opcion;
    }
    
    public String a14(List<String> reads){
        int n1 = 0;
        for(int i = 0; i < 11; i++){
            n1 = n1+i;
        }
        String opcion = "El promedio es: " + (n1 / 10);
        return opcion;
    }
    
    public String a15(List<String> reads){
        int opc = 0;
        String opcion = "";
        try{
            opc = Integer.parseInt(reads.get(0));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        switch(opc){
            case 1:
                    opcion = "funcion de suma";
                break;
            case 2:
                    opcion = "funcion de resta";
                break;
            default: opcion = "";
        }
        return opcion;
    }
    
    public String a16(List<String> reads){
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        String respuesta = "";
        try{
            n1 = Integer.parseInt(reads.get(0));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        try{
            n2 = Integer.parseInt(reads.get(1));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        try{
            n3 = Integer.parseInt(reads.get(2));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        for(int i = n1; i < n2; i++){
            if(n3 == i){
                respuesta = "Numero existente";
            }
        }
        return respuesta;
    }
    
    public String a17(List<String> reads){
        int n1 = 0;
        try{
            n1 = Integer.parseInt(reads.get(0));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        String opcion = "";
        if(n1 > 0){
                opcion = "Valor absoluto: " +  (n1 + -1);
        }
        if(n1 < 0){
                opcion = "Es menor a 10: " +  n1;
        }
        return opcion;
    }
    
    public String a18(List<String> reads){
        int n1 = 0;
        String respuesta = "";
        try{
            n1 = Integer.parseInt(reads.get(0));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        switch(n1){
            case 1:
                    respuesta = "Usted ha votado por el partido rojo";
                break;
            case 2:
                    respuesta = "Usted ha votado por el partido verde" ;
                break;
            case 3:
                    respuesta = "Usted ha votado por el partido azul";
                break;
            default: respuesta = "Opción errónea";
        }
        return respuesta;
    }
    
    public String a19(List<String> reads){
        int anio = 0;
        String dato = "";
        try{
            anio = Integer.parseInt(reads.get(0));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
            dato = "Bisiesto";
        else
            dato = "No Bisiesto";
        return dato;
    }
    
    public String a20(List<String> reads){
        int n1 = 0;
        int n2 = 0;
        try{
            n1 = Integer.parseInt(reads.get(0));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        try{
            n2 = Integer.parseInt(reads.get(1));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        return "" + (n1 * n2);
    }
    
    public String a21(List<String> reads){
        return "      +\n     ++\n    +++\n  +++++\n ++++++";
    }
    
    public String a22(List<String> reads){
        int n1 = 0;
        String dato = "";
        try{
            n1 = Integer.parseInt(reads.get(0));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        for(int i = 0; i < n1; i++){
            for(int j = 0; j < n1; j++){
                dato = dato + " " + i;
            }
            dato = dato + "\n";
        }
        return dato;
    }
    
    public String a23(List<String> reads){
        int n1 = 0;
        int dato = 0;
        try{
            n1 = Integer.parseInt(reads.get(0));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        for(int i = 0; i < n1; i++){
           dato = dato * i;
        }
        return ""+dato;
    }
    
    public String a24(List<String> reads){
        int n1 = 0;
        String dato = "";
        try{
            n1 = Integer.parseInt(reads.get(0));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        for(int i = 0; i < 11; i++){
           dato = dato + n1 + " * " + i + " = "+(n1 * i)+"\n";
        }
        return dato;
    }
    
    public String a25(List<String> reads){
        int dato = 0;
        for(int i = 0; i < 11; i++){
           dato = dato + 2;
        }
        return ""+dato;
    }
    
    public String a26(List<String> reads){
        int tot = 0;
        for(int i = 0; i < 11; i++){
           if((i % 2) == 0){
               tot = tot + i;
           }
        }
        return ""+tot;
    }
    
    public String a27(List<String> reads){
        int serie = 10, num1 = 0, num2 = 1, suma = 1;
        String data = "";
        data = ""+num1;
        for (int i = 1; i < serie; i++) {
            data = data + " " + suma;
            suma = num1 + num2;
            num1 = num2;
            num2 = suma;
        }
        return data;
    }
    
    public String a28(List<String> reads){
        int n1 = 0;
        int n2 = 0;
        try{
            n1 = Integer.parseInt(reads.get(0));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        try{
            n2 = Integer.parseInt(reads.get(1));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        return "El numero a la potencia es: " + Math.pow(n1, n2);
    }
    
    public String a29(List<String> reads){
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int tope = 0, inicio = 0;
        String respuesta = "";
        try{
            n1 = Integer.parseInt(reads.get(0));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        try{
            n2 = Integer.parseInt(reads.get(1));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        try{
            n3 = Integer.parseInt(reads.get(2));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        if(n1 < n2){
            inicio = n1;
            tope = n2;
        }else{
            inicio = n2;
            tope = n1;
        }
        for(int i = inicio; i <= tope; i++){
            if(n3 == i){
                respuesta = "Numero existente";
            }
        }
        return respuesta;
    }
    
    public String a30(List<String> reads){
        return "1\n2\n3\n4\n5\n6\n7\n8\n9\n10";
    }
    
    public String a31(List<String> reads){
        return "\n2\n4\n6\n8\n10";
    }
    
    public String a32(List<String> reads){
        return "30";
    }
    
    public String a33(List<String> reads){
        int n1 = 0;
        int n2 = 0;
        int tope = 0, inicio = 0, suma = 0;
        try{
            n1 = Integer.parseInt(reads.get(0));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        try{
            n2 = Integer.parseInt(reads.get(1));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        if(n1 < n2){
            inicio = n1;
            tope = n2;
        }else{
            inicio = n2;
            tope = n1;
        }
        for(int i = inicio; i <= tope; i++){
            if((i%2) == 0){
                suma = suma + i;
            }
        }
        return "" + suma;
    }
    
    public String a34(List<String> reads){
        String letra = "";
        try{
            letra = reads.get(0);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        switch(letra.charAt(0)){
            case 'a':
                    letra = "inicia por vocal";
                break;
            case 'e':
                    letra = "inicia por vocal";
                break;
            case 'i':
                    letra = "inicia por vocal";
                break;
            case 'o':
                    letra = "inicia por vocal";
                break;
            case 'u':
                    letra = "inicia por vocal";
                break;
            default: letra = "";
        }
        return letra;
    }
    
    public String a35(List<String> reads){
        String letra = "";
        try{
            letra = reads.get(0);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        String reverso = "La palabra es: " + letra + "\n";
        for(int i = (letra.length()-1); i >= 0; i--){
            reverso += letra.charAt(i);
        }
        return reverso;
    }
    
    public String a36(List<String> reads){
        String p1 = "",p2 = "",p3 = "";
        try{
            p1 = reads.get(0);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        try{
            p2 = reads.get(0);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }

        try{
            p3 = reads.get(0);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        return "La palabra es: " + p1 + "\n" + "La palabra nueva es: "+ p2+p1+p3;
    }
    
    public String a37(List<String> reads){
        String letra = "";
        try{
            letra = reads.get(0);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        return "La palabra es: " + letra + "\n" + "La palabra en maysucula es: " + letra.toUpperCase();
    }
    
    public String a38(List<String> reads){
        String letra = "";
        try{
            letra = reads.get(0);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        String letra2 = Character.toUpperCase(letra.charAt(0)) + letra.substring(1);
        return "La palabra es: " + letra + "\n" + "La palabra nueva es: " + letra2;
    }
    
    public String a39(List<String> reads){
        String letra = "";
        try{
            letra = reads.get(0);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        String letra2 = letra.replaceAll("[^o]", "");
        return "La palabra es: " + letra + "\n" + "La palabra nueva es: " + letra2;
    }
    
    public String a40(List<String> reads){
        String letra = "";
        try{
            letra = reads.get(0);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        String letra2 = letra.replaceAll("[^\\s]", "");
        return "La frase es: " + letra + "\n" + "La frase nueva es: " + letra2;
    }
    
    public String a41(List<String> reads){
        String letra = "";
        String letra2 = "";
        String dato = "";
        try{
            letra = reads.get(0);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        try{
            letra2 = reads.get(0);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        if(letra.equals(letra2)){
            dato = "Son iguales " + letra + " = " + letra2;
        }else{
            dato = "No son iguales " + letra + " != " + letra2;
        }
        return dato;
    }
    
    public String a42(List<String> reads){
        String letra = "";
        String letra2 = "";
        String dato = "";
        try{
            letra = reads.get(0);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        try{
            letra2 = reads.get(0);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        if(letra.equals(letra2)){
            dato = "Son iguales " + letra + letra2;
        }else{
            dato = "No son iguales " + letra.charAt(0) + " != " + letra2.charAt(letra2.length()-1);
        }
        return dato;
    }
    
    public String a43(List<String> reads){
        String letra = "";
        try{
            letra = reads.get(0);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        String reverso = "La palabra invertida es: ";
        for(int i = (letra.length()-1); i >= 0; i--){
            reverso += letra.charAt(i);
        }
        return reverso;
    }
    
    public String a44(List<String> reads){
        String letra = "";
        String data = "";
        try{
            letra = reads.get(0);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        String reverso = "";
        for(int i = (letra.length()-1); i >= 0; i--){
            reverso += letra.charAt(i);
        }
        if(letra.equals(reverso)){
            data = "Es palindormo";
        }else{ data = "No es palindormo"; }
        return data;
    }
    
    public String a45(List<String> reads){
        String letra = "";
        String letra2 = "";
        String dato = "El caracter no se encuentra en el nombre";
        try{
            letra = reads.get(0);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        try{
            letra2 = reads.get(0);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        for(int i = 0; i < letra.length(); i++){
            if(letra.charAt(i) == letra2.charAt(0)){
                dato = "El caracter se encuentra en el nombre";
            }
        }
        return dato;
    }
    
    public String a46(List<String> reads){
        String letra = "";
        try{
            letra = reads.get(0);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        String letra2 = letra.replaceAll("[^\\s]", "_   ");
        return "La palabra es: " + letra + "\n" + "La palabra nueva es: " + letra2;
    }
    
    public String a47(List<String> reads){
        String letra = "";
        String data = "";
        int contador = 0;
        try{
            letra = reads.get(0);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        for(int i = 0; i < letra.length(); i++){
            for(int j = 0; j < letra.length(); j++){
                if(letra.charAt(i) == letra.charAt(j)){
                    contador++;
                }
            }
            data += letra.charAt(i) + " = " +  contador + "\n";
            contador = 0;
        }
        return data;
    }
    
    public String a48(List<String> reads){
        String letra = "";
        try{
            letra = reads.get(0);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        String reverso = "";
        for(int i = (letra.length()-1); i >= 0; i--){
            reverso += letra.charAt(i);
        }
        return "Traducción: " + reverso;
    }
    
    public String a49(List<String> reads){
        int opc = 0;
        String fecha = "";
        try{
            fecha = reads.get(0);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡¡Valor incorrecto en uno de los campos!!");
        }
        String mes = fecha.substring(3, 5);
        String dia = fecha.substring(0, 2);
        String anio = fecha.substring(6, 10);
        opc = Integer.parseInt(mes);
        switch(opc){
            case 1:
                    mes = dia + " de Enero de " + anio;
                break;
            case 2:
                    mes = dia + " de Febrero de " + anio;
                break;
            case 3:
                    mes = dia + " de Marzo de " + anio;
                break;
            case 4:
                    mes = dia + " de Abril de " + anio;
                break;
            case 5:
                    mes = dia + " de Mayo de " + anio;
                break;
            case 6:
                    mes = dia + " de Junio de " + anio;
                break;
            case 7:
                    mes = dia + " de Julio de " + anio;
                break;
            case 8:
                    mes = dia + " de Agosto de " + anio;
                break;
            case 9:
                    mes = dia + " de Septiembre de " + anio;
                break;
            case 0:
                    mes = dia + " de Octubre de " + anio;
                break;
            case 11:
                    mes = dia + " de Noviembre de " + anio;
                break;
            case 12:
                    mes = dia + " de Diciembre de " + anio;
                break;
            default: mes = "";
        }
        return mes;
    }
    
    public String a50(List<String> reads){
        return "";
    }
    
    public String a51(List<String> reads){
        return "";
    }
    
    public String a52(List<String> reads){
        return "";
    }
    
    public String a53(List<String> reads){
        return "";
    }
    
    public String a54(List<String> reads){
        return "";
    }
    
    public String a55(List<String> reads){
        return "";
    }
    
    public String a56(List<String> reads){
        return "";
    }
    
    public String a57(List<String> reads){
        return "";
    }
    
    public String a58(List<String> reads){
        return "";
    }
    
    public String a59(List<String> reads){
        return "";
    }
    
    public String a60(List<String> reads){
        return "";
    }
    
    public String a61(List<String> reads){
        return "";
    }
    
    public String a62(List<String> reads){
        return "";
    }
    
    public String a63(List<String> reads){
        return "";
    }
    
    public String a64(List<String> reads){
        return "";
    }
    
    public String a65(List<String> reads){
        return "";
    }
    
    public String a66(List<String> reads){
        return "";
    }
    
    public String a67(List<String> reads){
        return "";
    }
    
    public String a68(List<String> reads){
        return "";
    }
    
    public String a69(List<String> reads){
        return "";
    }
    
    public String a70(List<String> reads){
        return "";
    }
    
    public String a71(List<String> reads){
        return "";
    }
    
    public String a72(List<String> reads){
        return "";
    }
    
    public String a73(List<String> reads){
        return "";
    }
    
    public String a74(List<String> reads){
        return "";
    }
    
    public String a75(List<String> reads){
        return "";
    }
    
    public String a76(List<String> reads){
        return "";
    }
    
    public String a77(List<String> reads){
        return "";
    }
    
    public String a78(List<String> reads){
        return "";
    }
    
    public String a79(List<String> reads){
        return "";
    }
    
    public String a80(List<String> reads){
        return "";
    }
    
    public String a81(List<String> reads){
        return "";
    }
    
    public String a82(List<String> reads){
        return "";
    }
    
    public String a83(List<String> reads){
        return "";
    }
    
    public String a84(List<String> reads){
        return "";
    }
    
    public String a85(List<String> reads){
        return "";
    }
    
    public String a86(List<String> reads){
        return "";
    }
    
    public String a87(List<String> reads){
        return "";
    }
    
    public String a88(List<String> reads){
        return "";
    }
    
    public String a89(List<String> reads){
        return "";
    }
    
    public String a90(List<String> reads){
        return "";
    }
    
    public String a91(List<String> reads){
        return "";
    }
    
    public String a92(List<String> reads){
        return "";
    }
    
    public String a93(List<String> reads){
        return "";
    }
    
    public String a94(List<String> reads){
        return "";
    }
    
    public String a95(List<String> reads){
        return "";
    }
    
    public String a96(List<String> reads){
        return "";
    }
    
    public String a97(List<String> reads){
        return "";
    }
    
    public String a98(List<String> reads){
        return "";
    }
    
    public String a99(List<String> reads){
        return "";
    }
    
    public String a100(List<String> reads){
        return "";
    }
    
    
    public String getOut(int pos, List<String> reads){
        String out = "";
        switch(pos){
            case 0:
                    out += a0();
                break;
            case 1:
                    out += a1();
                break;
            case 2:
                    out += a2(reads);
                break;
            case 3:
                    out += a3(reads);
                break;
            case 4:
                    out += a4(reads);
                break;
            case 5:
                    out += a5(reads);
                break;
            case 6:
                    out += a6(reads);
                break;
            case 7:
                    out += a7(reads);
                break;
            case 8:
                    out += a8(reads);
                break;
            case 9:
                    out += a9(reads);
                break;
            case 10:
                    out += a10(reads);
                break;
            case 11:
                    out += a11(reads);
                break;
            case 12:
                    out += a12(reads);
                break;
            case 13:
                    out += a13(reads);
                break;
            case 14:
                    out += a14(reads);
                break;
            case 15:
                    out += a15(reads);
                break;
            case 16:
                    out += a16(reads);
                break;
            case 17:
                    out += a17(reads);
                break;
            case 18:
                    out += a18(reads);
                break;
            case 19:
                    out += a19(reads);
                break;
            case 20:
                    out += a20(reads);
                break;
            case 21:
                    out += a21(reads);
                break;
            case 22:
                    out += a22(reads);
                break;
            case 23:
                    out += a23(reads);
                break;
            case 24:
                    out += a24(reads);
                break;
            case 25:
                    out += a25(reads);
                break;
            case 26:
                    out += a26(reads);
                break;
            case 27:
                    out += a27(reads);
                break;
            case 28:
                    out += a28(reads);
                break;
            case 29:
                    out += a29(reads);
                break;
            case 30:
                    out += a30(reads);
                break;
            case 31:
                    out += a31(reads);
                break;
            case 32:
                    out += a32(reads);
                break;
            case 33:
                    out += a33(reads);
                break;
            case 34:
                    out += a34(reads);
                break;
            case 35:
                    out += a35(reads);
                break;
            case 36:
                    out += a36(reads);
                break;
            case 37:
                    out += a37(reads);
                break;
            case 38:
                    out += a38(reads);
                break;
            case 39:
                    out += a39(reads);
                break;
            case 40:
                    out += a40(reads);
                break;
            case 41:
                    out += a41(reads);
                break;
            case 42:
                    out += a42(reads);
                break;
            case 43:
                    out += a43(reads);
                break;
            case 44:
                    out += a44(reads);
                break;
            case 45:
                    out += a45(reads);
                break;
            case 46:
                    out += a46(reads);
                break;
            case 47:
                    out += a47(reads);
                break;
            case 48:
                    out += a48(reads);
                break;
            case 49:
                    out += a49(reads);
                break;
            case 50:
                    out += a50(reads);
                break;
            case 51:
                    out += a51(reads);
                break;
            case 52:
                    out += a52(reads);
                break;
            case 53:
                    out += a53(reads);
                break;
            case 54:
                    out += a54(reads);
                break;
            case 55:
                    out += a55(reads);
                break;
            case 56:
                    out += a56(reads);
                break;
            case 57:
                    out += a57(reads);
                break;
            case 58:
                    out += a58(reads);
                break;
            case 59:
                    out += a59(reads);
                break;
            case 60:
                    out += a60(reads);
                break;
            case 61:
                    out += a61(reads);
                break;
            case 62:
                    out += a62(reads);
                break;
            case 63:
                    out += a63(reads);
                break;
            case 64:
                    out += a64(reads);
                break;
            case 65:
                    out += a65(reads);
                break;
            case 66:
                    out += a66(reads);
                break;
            case 67:
                    out += a67(reads);
                break;
            case 68:
                    out += a68(reads);
                break;
            case 69:
                    out += a69(reads);
                break;
            case 70:
                    out += a70(reads);
                break;
            case 71:
                    out += a71(reads);
                break;
            case 72:
                    out += a72(reads);
                break;
            case 73:
                    out += a73(reads);
                break;
            case 74:
                    out += a74(reads);
                break;
            case 75:
                    out += a75(reads);
                break;
            case 76:
                    out += a76(reads);
                break;
            case 77:
                    out += a77(reads);
                break;
            case 78:
                    out += a78(reads);
                break;
            case 79:
                    out += a79(reads);
                break;
            case 80:
                    out += a80(reads);
                break;
            case 81:
                    out += a81(reads);
                break;
            case 82:
                    out += a82(reads);
                break;
            case 83:
                    out += a83(reads);
                break;
            case 84:
                    out += a84(reads);
                break;
            case 85:
                    out += a85(reads);
                break;
            case 86:
                    out += a86(reads);
                break;
            case 87:
                    out += a87(reads);
                break;
            case 88:
                    out += a88(reads);
                break;
            case 89:
                    out += a89(reads);
                break;
            case 90:
                    out += a90(reads);
                break;
            case 91:
                    out += a91(reads);
                break;
            case 92:
                    out += a92(reads);
                break;
            case 93:
                    out += a93(reads);
                break;
            case 94:
                    out += a94(reads);
                break;
            case 95:
                    out += a95(reads);
                break;
            case 96:
                    out += a96(reads);
                break;
            case 97:
                    out += a97(reads);
                break;
            case 98:
                    out += a98(reads);
                break;
            case 99:
                    out += a99(reads);
                break;
            case 100:
                    out += a100(reads);
                break;
        }
        return out;
    }
    
}
