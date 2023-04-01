/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo4_ejercicio_23;

/**
 *
 * @author 57302
 */
public class Backend {
    public Double argumento_a,argumento_b,argumento_c,solucion1,solucion2;
    public Backend(){
        solucion1 = 0.0;
        solucion2 = 0.0;
                
    
    }
    public static void main(String[] args) {
        Capitulo4_ejercicio_23 Pagina_principal_Backend = new Capitulo4_ejercicio_23();
        Pagina_principal_Backend.Diseño();
    }
    
    public void operaciones(double argumentoa,double argumentob,double argumentoc){
        
            solucion1 = ((-1*argumentob)+Math.sqrt((Math.pow(argumentob,2)-4*argumentoa*argumentoc)))/2*argumentoa;
            solucion2 = ((-1*argumentob)-Math.sqrt((Math.pow(argumentob,2)-4*argumentoa*argumentoc)))/2*argumentoa;
        
        }
}
