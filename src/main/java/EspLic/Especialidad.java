/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EspLic;

/**
 *
 * @author honey
 */
public class Especialidad {
    
    //Atributos
    int puntuacion;
    String materia;
    
    //Metodo constructor
    public Especialidad (String materia, int puntuacion){
    this.materia = materia;
    this.puntuacion = puntuacion;
    }
    
    public void imprimir (){
        System.out.println("La puntuacion de "+materia+" es "+puntuacion+"\n");
    }
    
    
    
}
