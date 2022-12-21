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
        String respuesta;
        System.out.print("Deseas comenzar el programa? (y/n): ");
        respuesta = teclado.nextLine();
            Preguntas p1 = new Preguntas();
            Preguntas p2 = new Preguntas();
            Preguntas p3 = new Preguntas();
            Preguntas p4 = new Preguntas();
            Preguntas p5 = new Preguntas();
            Preguntas p6 = new Preguntas();
            Preguntas p7 = new Preguntas();
            
        if (respuesta == "y"){
            
            p1.Preguntas("Que tanto te gusta la fisica?");
        
        }

        
        
        
        
        
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
