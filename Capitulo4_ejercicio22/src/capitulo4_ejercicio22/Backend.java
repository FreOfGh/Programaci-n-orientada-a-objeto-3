/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo4_ejercicio22;

/**
 *
 * @author 57302
 */
public class Backend {
    public Double salario_hora,horas_trabajadas;
    public String nombre;
    public Backend(){
        nombre = "";
        salario_hora = 0.0;
        horas_trabajadas = 0.0;
                
    
    }
    public static void main(String[] args) {
        Frontend Pagina_principal_Backend = new Frontend();
        Pagina_principal_Backend.Diseño();
    }
    
    public void operaciones(String nombres,double salario,double horas){
        if(salario*horas >= 450000.0){
            nombre= nombres;
            salario_hora= salario;
            horas_trabajadas = horas;
        }
        else{
            nombre= nombres;
        }
            
        
        }
}
