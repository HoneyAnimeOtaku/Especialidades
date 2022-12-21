/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EspLic;

import javax.swing.JOptionPane;

/**
 *
 * @author honey
 */
public class Preguntas {
    String pregunta;
    int puntos;
    
    public int Preguntas (String pregunta){
        this.pregunta = pregunta;
        System.out.println(pregunta);
        puntos = Integer.parseInt(JOptionPane.showInputDialog("\nElija del 1 al 5: "));
        if (puntos > 5 || puntos < 1){
            if (puntos==0) {
               //Hacer una pregunta contraria dependiendo de la materia
               //Fisica vs Mate pura a Mate pura vs Fisica por ejemplo
            }
            else {
             while (puntos>5 || (puntos < 1 && puntos != 0)){
             System.out.println("Por favor vuelva a ingresar el valor que este dentro del rango del 1 al 5.\n");
             puntos = Integer.parseInt(JOptionPane.showInputDialog("Elija del 1 al 5: "));
             }
             }
        }
        else{return puntos;
        }
        return puntos;
    }
    
    public void mostrar (int puntos){
        System.out.println("La puntuacion es: "+puntos+"\n");
    }
    
    
}
