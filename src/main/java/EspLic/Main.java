/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EspLic;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author honey
 */
public class Main {
    public static void main (String [] args){
        String nombre;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca su nombre: ");
        nombre = teclado.nextLine();
        System.out.println("\n\n¡Hola " + nombre + "!,bienvenido a Especialidade ESFM. \n");
        System.out.println("Este programa esta hecho para ayudarte en la busqueda de tu especialidad en la carrera.\n");
        System.out.println("Cabe mencionar que no es una obligacion inscribirte en la respuesta final que te de el programa\n");
        System.out.println("pues es solo una orientacion segun tus gustos, aptitudes y habilidades, sin embargo\n");
        System.out.println("la decision final es tuya. Disfruta de usar esta aplicacion! :3 . \n");
        System.out.println("Espero encuentres algo que se ajuste a tus necesidades y disfruta de la carrera.\n\n");
        
        int x;  //Puntuacion de Matematicas Puras
        float x1;  //Puntuacion final de Matematicas Puras
        int y;  //Puntuacion de Matematicas Aplicadas
        float y1;  //Puntuacion final de Matematicas Aplicadas
        int z;  //Puntuacion de Fisica
        float z1;  //Puntuacion final de Fisica
        int a;  //Puntuacion de Ingenieria Nuclear
        float a1;  //Puntuacion final de Ingenieria Nuclear
        int m;  //Cantidad de especialidades
        float b; //Promedio que todavia no se como poner en vector
        
        
        
    Especialidad mat1 = new Especialidad ("Matematicas Aplicadas", 10);
    Especialidad mat2 = new Especialidad ("Matematicas Puras", 18);
    Especialidad mat3 = new Especialidad("Fisica", 10);
    Especialidad mat4 = new Especialidad ("Ingenieria Nuclear",8);
    mat1.imprimir();
    mat2.imprimir();
    mat3.imprimir();
    mat4.imprimir();
    
    }
    
}
