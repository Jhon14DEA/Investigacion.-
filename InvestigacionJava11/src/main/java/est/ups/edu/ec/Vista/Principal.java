/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package est.ups.edu.ec.Vista;

import java.util.stream.Collectors;

/**
 *
 * @author ASUS
 */
public class Principal {
 
    public static void main(String[] args) {
        
        
        
        /**
         * isBlank() Este nuevo Metodo retorna un valor booleano segun  si el 
         * string contiene solo espacios en blanco y si esta vacio. Si el string 
         *  esta vacio nos devolvera un true y false de caso  contrario.
         * 
         * empty si la longitud de la cadena es 0 nos da un true y si no un false si la longitud es mayor a 0
         */
        
        System.out.println(" ".isBlank());
        System.out.println("".isEmpty());
        String s = "Estudiantes";
        System.out.println(s.isBlank());
        System.out.println();
        
        /**
         * lines() Este metodo devolvera un array de string 'spliteando' el texto por lineas. 
         */
        System.out.println("Lines");
        String palabra = "Explicacion\nJava 11\n Tarea numero 1";
        System.out.println("palabra"); 
        System.out.println(palabra.lines().collect(Collectors.toList()));
        System.out.println();
        
        /**
         * strip() 
         * stripLeadding(), stripTrailing() Remueve los caracteres en blanco
         *  A diferencia del viejo trim(), este nuevo metodo strip si tiene una cuanta de caracteres Unicode.
         * Unicode: Es un estandar de codificacion de caracteres diseniando para facilitar el tratamiento informatico. 
         */
       
        String hello = "hola";
        System.out.println("Say "+hello.strip() + " Please" );
        System.out.println("SAy "+hello.stripLeading() + " Please");
        System.out.println("Say "+ hello.stripTrailing() + "     Please");
        System.out.println();
        /**
         * Character.isWhitespace nos permite saber si un caracter es considerado un blanco. 
         */
        Character c = '\u2000';
        String  StringWithUnicode = c + "abc" + c;
        System.out.println("Contains unicode "+ Character.isWhitespace(c));
        //Trim es un metodo que elimina los caracteres  blancos  iniciales  
        //y finales de la cadena, devolviendo una copia de la misma 
        System.out.println("Trim test "+(StringWithUnicode == StringWithUnicode.trim()));
        System.out.println("strip test "+("abc"== StringWithUnicode.strip()));
        System.out.println();
        
        /**
         * Repeat()  
         * 
         * Repite  el string  las  veces que se le indique. 
         */
        String rep = "Hola".repeat(2);
        System.out.println(rep);
        System.out.println();
        
      
        
        
        
    }
    
            
}
