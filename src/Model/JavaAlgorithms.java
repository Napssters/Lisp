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
        return "";
    }
    
    public String a10(List<String> reads){
        return "";
    }
    
    public String a11(List<String> reads){
        return "";
    }
    
    public String a12(List<String> reads){
        return "";
    }
    
    public String a13(List<String> reads){
        return "";
    }
    
    public String a14(List<String> reads){
        return "";
    }
    
    public String a15(List<String> reads){
        return "";
    }
    
    public String a16(List<String> reads){
        return "";
    }
    
    public String a17(List<String> reads){
        return "";
    }
    
    public String a18(List<String> reads){
        return "";
    }
    
    public String a19(List<String> reads){
        return "";
    }
    
    public String a20(List<String> reads){
        return "";
    }
    
    public String a21(List<String> reads){
        return "";
    }
    
    public String a22(List<String> reads){
        return "";
    }
    
    public String a23(List<String> reads){
        return "";
    }
    
    public String a24(List<String> reads){
        return "";
    }
    
    public String a25(List<String> reads){
        return "";
    }
    
    public String a26(List<String> reads){
        return "";
    }
    
    public String a27(List<String> reads){
        return "";
    }
    
    public String a28(List<String> reads){
        return "";
    }
    
    public String a29(List<String> reads){
        return "";
    }
    
    public String a30(List<String> reads){
        return "";
    }
    
    public String a31(List<String> reads){
        return "";
    }
    
    public String a32(List<String> reads){
        return "";
    }
    
    public String a33(List<String> reads){
        return "";
    }
    
    public String a34(List<String> reads){
        return "";
    }
    
    public String a35(List<String> reads){
        return "";
    }
    
    public String a36(List<String> reads){
        return "";
    }
    
    public String a37(List<String> reads){
        return "";
    }
    
    public String a38(List<String> reads){
        return "";
    }
    
    public String a39(List<String> reads){
        return "";
    }
    
    public String a40(List<String> reads){
        return "";
    }
    
    public String a41(List<String> reads){
        return "";
    }
    
    public String a42(List<String> reads){
        return "";
    }
    
    public String a43(List<String> reads){
        return "";
    }
    
    public String a44(List<String> reads){
        return "";
    }
    
    public String a45(List<String> reads){
        return "";
    }
    
    public String a46(List<String> reads){
        return "";
    }
    
    public String a47(List<String> reads){
        return "";
    }
    
    public String a48(List<String> reads){
        return "";
    }
    
    public String a49(List<String> reads){
        return "";
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
