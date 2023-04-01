/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo3_ejercicio_18;



public class Backend {
    public int C_empleado, N_horastrabajadas,V_hora,salario_bruto; // atributos de la clase empleado de tipo numerico
    public double P_retencion, salario_neto;
    public String   Nombres; // atributos de la clase empleado de tipo string 

    public Backend(){
        C_empleado = 0; // valaores iniciales
        N_horastrabajadas =0;  // valaores iniciales
        V_hora = 0;  // valaores iniciales
        P_retencion= 0;  // valaores iniciales
        Nombres ="";            // valaores iniciales
    }
    public static void main (String[] args) {
        Ventana_principal Ventana_inicial = new Ventana_principal();   
        Ventana_inicial.setVisible(true);
        Ventana_inicial.diseño();
        
    }    
    
     public void Codigo_empleado(int Codigo_empleado,String Nombres_1,int Valor_hora, int Horas_trabajadas, Double retencion){ // metodo para mostrar el código del empleado
        C_empleado = Codigo_empleado;
        salario_bruto = Valor_hora*Horas_trabajadas;
        Nombres=  Nombres_1;
        salario_neto =  ((Valor_hora*Horas_trabajadas)-(retencion/100)*(Valor_hora*Horas_trabajadas));
        
     }
}

