/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capitulo4_ejercicio22;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author 57302
 */
public class Frontend extends JFrame implements ActionListener{
    public JLabel nombre_label,salario_hora_label,horas_trabajadas_label;
    public JTextField nombre_text_field,salario_hora_text_field,horas_trabajadas_text_field;
    public JButton Ingresar_datos_btn;
    public Backend operaciones = new Backend();
    public JOptionPane mensaje = new JOptionPane();
    public Frontend(){
        this.setBackground(Color.yellow);
        this.setLayout(null);
        this.setBounds(0,0,450,600);
        this.setResizable(false);
        this.setTitle("Ejercicio #24");
    
    }
  
    public void Diseño() {
        Frontend Pantalla_principal =  new Frontend();
        
        nombre_label = new JLabel("Ingrese el nombre del trabajador");
        nombre_label.setBounds(50,-50,300,200);
        Pantalla_principal.add(nombre_label);
        
        nombre_text_field =  new JTextField();
        nombre_text_field.setBounds(120,100,100,20);
        Pantalla_principal.add(nombre_text_field);   
        
        salario_hora_label =  new JLabel("Ingrese el salario por hora del trabajador");
        salario_hora_label.setBounds(50,100,300,100);
        Pantalla_principal.add(salario_hora_label); 
        
        salario_hora_text_field =  new JTextField();
        salario_hora_text_field.setBounds(120,200,100,20);
        Pantalla_principal.add(salario_hora_text_field); 
        
        horas_trabajadas_label =  new JLabel("Ingrese el numero de horas trabajadas");
        horas_trabajadas_label.setBounds(50,250,300,100);
        Pantalla_principal.add(horas_trabajadas_label);    
        
        horas_trabajadas_text_field =  new JTextField();
        horas_trabajadas_text_field.setBounds(120,350,100,20);
        Pantalla_principal.add(horas_trabajadas_text_field); 
        
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
            operaciones.operaciones(nombre_text_field.getText(), Double.parseDouble(salario_hora_text_field.getText()), Double.parseDouble(horas_trabajadas_text_field.getText()));
            if ((operaciones.salario_hora != 0)){
                JOptionPane.showMessageDialog(rootPane,"El nombre del trabajador  es : " + operaciones.nombre + "\n" + " Su salario es : "+ operaciones.horas_trabajadas*operaciones.salario_hora);
                
                }
            
       
            else {
                JOptionPane.showMessageDialog(rootPane,"El nombre del empleado es "+ operaciones.nombre);
            }
        }
    }
}
