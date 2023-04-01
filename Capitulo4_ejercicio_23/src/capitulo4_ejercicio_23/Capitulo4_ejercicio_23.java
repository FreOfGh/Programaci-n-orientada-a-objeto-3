
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capitulo4_ejercicio_23;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import javax.swing.*;

public class Capitulo4_ejercicio_23 extends JFrame implements ActionListener  {
    public JLabel argumento_a_label,argumento_b_label,argumento_c_label;
    public JTextField argumento_a_text_field, argumento_b_text_field, argumento_c_text_field;
    public JButton Ingresar_datos_btn;
    public Backend operaciones = new Backend();
    public JOptionPane mensaje = new JOptionPane();
    public Capitulo4_ejercicio_23(){
        this.setBackground(Color.yellow);
        this.setLayout(null);
        this.setBounds(0,0,450,600);
        this.setResizable(false);
        this.setTitle("Ejercicio #24");
    
    }
    public void Diseño() {
        Capitulo4_ejercicio_23 Pantalla_principal =  new Capitulo4_ejercicio_23();
        
        argumento_a_label = new JLabel("Ingrese el argumento a de la ecuación de segundo grado.");
        argumento_a_label.setBounds(50,-50,300,200);
        Pantalla_principal.add(argumento_a_label);
        
        argumento_a_text_field =  new JTextField();
        argumento_a_text_field.setBounds(120,100,100,20);
        Pantalla_principal.add(argumento_a_text_field);   
        
        argumento_b_label =  new JLabel("Ingrese el argumento b de la ecuación de segundo grado");
        argumento_b_label.setBounds(50,100,300,100);
        Pantalla_principal.add(argumento_b_label); 
        
        argumento_b_text_field =  new JTextField();
        argumento_b_text_field.setBounds(120,200,100,20);
        Pantalla_principal.add(argumento_b_text_field); 
        
        argumento_c_label =  new JLabel("Ingrese el argumento c de la ecuación de segundo grado");
        argumento_c_label.setBounds(50,250,300,100);
        Pantalla_principal.add(argumento_c_label);    
        
        argumento_c_text_field =  new JTextField();
        argumento_c_text_field.setBounds(120,350,100,20);
        Pantalla_principal.add(argumento_c_text_field); 
        
        Ingresar_datos_btn = new JButton(" Ingresar datos");
        Ingresar_datos_btn.setBackground(Color.blue);
        Ingresar_datos_btn.addActionListener(this);
        Ingresar_datos_btn.setBounds(60,400,300,20);
        Pantalla_principal.add(Ingresar_datos_btn);
        
        Pantalla_principal.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== Ingresar_datos_btn){
            operaciones.operaciones(Double.parseDouble(argumento_a_text_field.getText()), Double.parseDouble(argumento_b_text_field.getText()), Double.parseDouble(argumento_c_text_field.getText()));
            if (Objects.equals(operaciones.solucion1, operaciones.solucion2)){
                JOptionPane.showMessageDialog(rootPane,"la unica solución es : " + operaciones.solucion1);
                }
            else if (Double.isNaN(operaciones.solucion1)&& Double.isNaN(operaciones.solucion2)){
                JOptionPane.showMessageDialog(rootPane,"No hay soluciones");
            }
       
            else {
                JOptionPane.showMessageDialog(rootPane,"La primera solución es "+ operaciones.solucion1 + " \n La segunda solución es "+ operaciones.solucion2);
            }
        }
    }
    
}
