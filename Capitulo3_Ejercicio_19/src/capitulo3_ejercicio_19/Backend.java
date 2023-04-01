/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo3_ejercicio_19;

public class Backend {
    public double perimetro, area ,altura;
    
    public Backend(){
        perimetro= 0;
        area= 0;
        altura= 0;
    }
    public static void main (String[] args) {
        Frontend Nueva_ventana =  new Frontend();
        Nueva_ventana.diseño();
    }
    
    public void operaciones_con_el_triangulo(Double lado){
        perimetro = lado*3;
        altura = (Math.sqrt(3)*lado)/2;
        area = (altura*lado)/2;
    }

    
}
