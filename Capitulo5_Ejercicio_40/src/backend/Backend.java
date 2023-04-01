/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package backend;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 57302
 */
public class Backend {
    public List<Double>  lista_de_numeros = new ArrayList();

    public static void main(String[] args) {
        Frontend pantalla_principal =  new Frontend();
        pantalla_principal.diseño();
    }
    
    public void añadir(Double numero){
        //lista_de_numeros.add(numero);
    
    }
    
}
