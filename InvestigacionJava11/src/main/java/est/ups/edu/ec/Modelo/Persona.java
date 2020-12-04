/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package est.ups.edu.ec.Modelo;

/**
 *
 * @author 
 */
public class Persona {
        
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
       
    }
}


