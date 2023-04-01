/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capitulo4_ejercicio_10;


public class Backend {
    public Double patrimonio,matricula;
    public int Estrato;
    public String N_matricula, Nombre_candidato;
    public Backend(){
    
        Nombre_candidato = "";
        patrimonio = 0.0;
        N_matricula = "";
        Estrato = 0;
        matricula = 0.0;
        
    }
    public static void main(String[] args) {
        Frontend Pagina_principal_Backend = new Frontend();
        Pagina_principal_Backend.diseño();
    }
    
    public void operaciones(double patrimonio, int estracto_social,String nombre_candidato,String N_inscripcion){
    
        Nombre_candidato=  nombre_candidato;
   
        N_matricula =  N_inscripcion;
    
        if (patrimonio>2000000 && estracto_social>3){
            matricula =  (50000+0.03*(patrimonio));
        }
        else{
            matricula =  50000.0;
        }
        
    }
    
}
