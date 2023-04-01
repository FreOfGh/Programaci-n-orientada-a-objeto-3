/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capitulo5_ejercicio41;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 57302
 */
public class Backend {
    public List<Double>  lista_de_numeros = new ArrayList();
    public Double mayor1;
   

    public static void main(String[] args) {
        Frontend pantalla_principal =  new Frontend();
        pantalla_principal.diseño();
    }
    
    public void añadir(Double numero){
        lista_de_numeros.add(numero);
        System.out.println(lista_de_numeros.size());
    }
    public void mayor(){
        
        for(int i = 0; i<lista_de_numeros.size(); i++){
            if (i == 0 ){
                mayor1 = lista_de_numeros.get(0);
            }
            else if(lista_de_numeros.get(i-1) < lista_de_numeros.get(i)) {
                mayor1 = lista_de_numeros.get(i);
            }
            }
            
        }
    }
    
    
        
  
    