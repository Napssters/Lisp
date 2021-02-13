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
            case "Llamado" : respuesta = "Para hacer uso de una funcion solo es poner dentro de\nparéntesis el nombre de la función.\n\nEjemplo\n\n(definir (suma)\n     …\n     …\n)\n\n (suma)\n\nAhora en Lisp tendriamos\n\n(defun (suma)\n     …\n     …\n)\n\n(suma)"; 
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
            case "Actualizar" : respuesta = "La función (set) en Lisp sirve para actualizar el valor de\nlas   variables   independiente   del   tipo   de dato de la \nvariable.\n\n(inicializar a -> 3)\n(actualizar a ->9)\n\nAhora en Lisp:\n\n(setq a 3)\n(set a 9)\n\nEn  resumen  la  función  (set)  nos sirve para asignarle\nnuevo s datos  a  variables  previamente  creadas."; 
                 break;
            case "Vacio" : respuesta = "La función (void) como bien lo indica su nombre (vacío)\nse   usa   en  los  condicionales,   cundo  el  condicional \nrequiere  poner  una  parte  falsa  y  el usuario no quiere \nque  esta  haga  nada  basta  con  usar  esta  función\n\nsi (2 < 3)\n      (imprimir \"dos mayor a tres\")\nsino\n       (vacio)\n\nEn Lisp tendríamos\n\n(if (< 2 3)\n     (print \"dos mayor a tres\")\n     (void)\n)"; 
                 break;
            case "Argumento" : respuesta = "¿Argumento?\nUn argumento en Lisp y en cualquier otro lenguaje de \nprogramación   hace  referencia  a  los  datos  que  se \nentregan a la función  desde  su llamado. Es decir:  Al \nmomento  de  llamar  la  función, se  le  entrega uno o \nmas datos para ser usados dentro de la función..\n\nEjemplo\n\nfuncion suma(arg1, arg2)\n        (imprimir (arg1 + arg2))\n\n(suma(2, 3))\n\nEn Lisp tendríamos:\n\n(defun suma(arg1 arg2)\n       (print (+ arg1 arg2))\n)\n(suma 2 3)"; 
                 break;
            case "Menor" : respuesta = "La  función  o  símbolo (<)  o  (>) sirven para  saber si un \nnumero  es  mayor o menor que otro, el retorno de estas\nfunciones es un booleano, vverdad o falso, comúnmente\nusados en los condicionales.\n\nEjemplo:\n(2 < 3)  -}> Verdadero\n(7 < 4)  -}>  Falso\n\nEn Lisp tendríamos:\n(2 < 3)  -}> True"; 
                 break;
            case "Else" : respuesta = "(Else)\nLa función  (else)  -}> sino se usa normalmente con la\nfunción  (cond)  y se encuentra de forma implícita en el \ncondicional  (if),  si  es necesario solo se pone la parte\nfalsa como el (else)\n\nejemplo\nsi (2 < 3)\n    imprimir \"mayor que tres\"\nsino:\n    imprimir \"menor que tres\"\n\nEn Lisp tendríamos:\n(if (< 2 3)\n      (print \"mayor que tres\")\n      (print \"menor que tres\")  ;;sino\n)"; 
                 break;
            case "Diferente" : respuesta = "(!=)\nLa función (!=)  -}>  diferente  de   sirve  y  se usa mucho \ncuando   se    usan    los   condicionales,   y   sirve   para \ncomparar  dos  variables,  y  retorna  un  verdadero o un \nfalso.\n\nEjemplo:\n(2 != 3) -}> Verdadero\n(4 != 4) -}> Falso\n\nEn Lips tendríamos:\n(2 != 3) -}> True\n(4 != 4) -}> False"; 
                 break;
            case "for" : respuesta = "(FOR)\nLa función (for) sirve para realizar una función repetida\nun nuero determinado de veces\n\nEjemplo:\nrepetir (i = 0 hasta i < 10)\n    imprimir i\n\nEn Lisp Tendríamos\n\n(loop for i from 0 to 10\n    (print i)\n)"; 
                 break;
            case "do" : respuesta = "(DO)\nLa    función     (do)    sirve   para   realiza   una   acción.\n(cumplir una orden), solo sirve como para realizar una \nacción   sobre   cualquier   cosa.\n\nEjemplo:\n\nhacer(imprimir \"Hola pollito\")\nhacer(2 + 4)\n\nEn Lisp Tendríamos\ndo(print \"Hola pollito\")\ndo(+ 2  4)"; 
                 break;
            case "saltolinea" : respuesta = "(TERPRI)\nLa función (terpri) sirve solo para poner un salto de\nlínea en la pantalla luego de hacer  una  impresión.\n\nEjemplo:\n\n(imprimir \"hola\")     -}> hola\n(salto línea)             -}>\n(imprimir \"pollito\")  -}> pollito\n\nEn Lisp Tendríamos\n(print \"hola\")     -}> hola\n(terpri)               -}>\n(print \"pollito\")  -}> pollito"; 
                 break;
            case "ciclo" : respuesta = "(LOOP)\nLa función  (loop)  sirve para realizar una orden repetida\nel funcionamiento de (loop) es formar un circulo o bucle \ndonde se repetirá hasta que este termine\n\nEjemplo:\n(repetir \n     imprimir \"Hola\"\n)\n\nEn Lisp Tendríamos\n(loop \n     (print \"Hola\")\n)"; 
                 break;
            case "mientras" : respuesta = "(WHEN)\nLa   función   (when)  viene  acompañada  de  la función\n(loop) de lo contrario no funcionaria esta función, el uso\nde  esta  funcion  es siimplemente detener el ciclo y que\nno sea infinito\n\nEjemplo:\n(repetir \n     imprimir \"Hola\"\n     actualizar a = a + 1\n)cuando(a < 10)\n\nEn Lisp Tendríamos\n(loop \n     (print \"Hola\")\n     (set a (+ a 1))\n(when (< a 10))"; 
                 break;
            case "agrupacion" : respuesta = "(BEGIN)\nLa   función   (begin)  sirve para agrupar uno o mas\ndatos  comúnmente  usado en  los condicionales.\n\nEjemplo:\nagrupar(\n       a = 1\n       b = 2\n       c = 3\n)\n\nEn Lisp Tendríamos\n(begin\n     ()setq a 1)\n     ()setq b 2)\n     ()setq c 3)\n)"; 
                 break;
            case "char=" : respuesta = "(CHAR=) o (CHAR)\nLa   función   (char)  nos describe a los caracteres de las\npalabras,    o   simplemente   caracteres,   retornado   un\nbooleano si se hace uso de la comparación (cahr=).\n\nEjemplo:\n(carácter= 'a' 'b')   -}> Falso\n(carácter 'a')          -}> 'a'\n\nEn Lisp Tendríamos\n(char= 'a' 'b')   -}> False\n(char 'a')          -}> 'a'"; 
                 break;
            case "invertir" : respuesta = "(REVERSE) \nLa   función   (reverse)  cumple el propósito de invertir\nuna  cadena,  vector,  o  cualquier  tipo de dato que se\npueda ordenar.\n\nEjemplo:\ninvertir (5, 4, 3, 2, 1) -}> (1, 2, 3, 4, 5)\n\nEn Lisp Tendríamos\n(reverse '(5 4 3 2 1) -}> (1 2 3 4 5)"; 
                 break;
            case "concatenar" : respuesta = "(CONCAT) \nLa   función   (concat)  cumple  el  propósito  de  juntar\nuna  cadena,  vector,  o  cualquier  tipo de dato que se\npueda ordenar.\n\nEjemplo:\ninicializar a = \"Hola\"\ninicializar b = \"Pollito\"\nconcatenar a, b   -}> \"HolaPollito\"\n\nEn Lisp Tendríamos\n(setq a  \"Hola\")\n(setq b \"Pollito\")\n(concat a b)  -}> \"HolaPollito\""; 
                 break;
            case "mayuscula" : respuesta = "(STRING-UPCASE) \nLa   función   (string-upcase)  sirve para convertir una  \ncadena  de letras en minúscula a mayúsculas.\n\nEjemplo:\ninicializar a = \"Hola Pollito\"\nstring-mayuscula(a)  -}>  \"HOLA  POLLITO\"\n\nEn Lisp Tendríamos\n(setq a  \"Hola  Pollito\")\n(string-upcase a)   -}>   \"HOLA  POLLITO\""; 
                 break;
            case "mayusculach" : respuesta = "(CHAR-UPCASE) \nLa   función   (char-upcase)  sirve para convertir un \ncarácter  en  minúscula a mayúscula.\n\nEjemplo:\ninicializar a = \"a\"\nscarácter-mayuscula(a)  -}>  \"A\"\n\nEn Lisp Tendríamos\n(setq a  \"a\")\n(char-upcase a)   -}>   \"A\""; 
                 break;
            case "asignarcad" : respuesta = "(SETF) \nLa   función   (setf)  sirve para inicializar datos de tipo\ncadena\n\nEjemplo:\ninicializarf a = \"hola\"\n\nEn Lisp Tendríamos\n(setf a  \"hola\")"; 
                 break;
            case "eliminarletra" : respuesta = "(SPLIT-STRING) \nLa   función   (split-string)  sirve para eliminar un carácter\nde una cadena.\n\nEjemplo:\ninicializar a = \"hola\"\neliminar-carácter(a, 'a')  -}> \"hol\"\n\nEn Lisp Tendríamos\n(setf a  \"hola\")\n(split-string a 'a')   -}>  \"hol\""; 
                 break;
            case "hacercadena" : respuesta = "(MAKE-STRING) \nLa   función   (make-string)  construir una cadena bien\nsea ya de caracteres, números o cualquier otro tipo de\ndato\n\nEjemplo:\nhacer-cadena 5 (\"a\")  -}>  (\"a\",\"a\",\"a\",\"a\",\"a\")\n\nEn Lisp Tendríamos\n(make-string 5 (\"a\"))   -}>  (\"a\" \"a\" \"a\" \"a\" \"a\")  "; 
                 break;
            case "tamaño" : respuesta = "(LENGHT) \n La   función   (lenght)  nos muestra el tamaño de un\nvector  o  una  cadena,  nos  referimos  a  tamaño la\ncantidad de elementos que contiene.\n\nEjemplo:\n(inicializarf a (\"a\",\"a\",\"a\",\"a\",\"a\"))\ntamaño(a) -}> 5\n\nEn Lisp Tendríamos\n(setf a (\"a\"\"a\"\"a\"\"a\"\"a\"))\n(lenght a) -}> 5"; 
                 break;
            case "lista" : respuesta = "(LIST) \n La   función   (list)  sirve para crear listas de cualquier\ntipo de dato, números, caracteres, etc...\n\nEjemplo:\n(lista lista1 (\"a\",\"a\",\"a\",\"a\",\"a\"))\n\n\nEn Lisp Tendríamos\n(list lista1 (\"a\" \"a\" \"a\" \"a\" \"a\"))"; 
                 break;
            case "añadir" : respuesta = "(APPEND) \n La   función   (append)  se usa para añadir al final de un\nvector o de una lista un dato ingresado\n\nEjemplo:\n(lista lista1 (\"a\",\"a\",\"a\",\"a\",\"a\"))\nañadir(lista1, \"b\")  -}>   (\"a\",\"a\",\"a\",\"a\",\"a\",\"b\"))\n\n\nEn Lisp Tendríamos\n(list lista1 (\"a\" \"a\" \"a\" \"a\" \"a\"))\n(append lista1 \"b\")  -}>  (\"a\" \"a\" \"a\" \"a\" \"a\" \"b\")"; 
                 break;
            case "vector" : respuesta = "(VECTOR) \n La   función   (vector)  se usa para crear vectores de\ncualquier tipo de dato\n\nEjemplo:\n(vector datos (\"a\",1,\"a\",Verdadero,\"a\"))\n\nEn Lisp Tendríamos\n(vector datos (\"a\" 1 \"a\"  True \"a\"))"; 
                 break;
            case "Actualizarvector" : respuesta = "(VECTOR-SET) \n La   función   (vector-set)  se usa para actualizar un dato\nde un vector de una posición determinada.\n\nEjemplo:\nvector  datos = hacer-vector (5, (1))\nactualizar-vector(datos, 2, \"z\")    -}>  (1, \"z\", 1, 1, 1)\n\nEn Lisp Tendríamos\n(vector datos(make-vector 5 (1)) )  -}>  (1 1 1 1 1)\n(vector-set datos 2 \"z\")   -}>  (1 \"z\" 1 1 1)"; 
                 break;
            case "hacervector" : respuesta = "(MAKE-VECTOR) \n La   función   (make-vector)  se usa para crear vectores \nde cualquier tipo de dato de forma recursiva.\n\nEjemplo:\nhacer-vector (5, (1))  -}>  (1, 1, 1, 1, 1)\n\nEn Lisp Tendríamos\n(make-vector 5 (1))   -}>  (1 1 1 1 1)"; 
                 break;
            case "otros" : respuesta = "asd"; 
                 break;
        }
        return respuesta;
    }
}
