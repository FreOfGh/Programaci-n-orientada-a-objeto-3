/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo3_ejercicio_18;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Ventana_principal extends JFrame implements ActionListener{
    public Backend Actividades_a_Realizar = new Backend();
    public JTextField C_empleado, Horas_trabajadas, Retefuente, Valor_horas, Nombres;
    public JButton Ingresar_datos;
    public Ventana_principal () {
        this.setTitle("Ejercicio 10 Capitulo 3");
        this.setBounds(60,60,600, 600);
        this.setBackground(Color.blue);
        this.setLayout(null);
        this.setResizable(false);
    }
    
    
    
    public void diseño    () {
        
        JLabel Titulo, C_empleado_label, Horas_trabajadas_label, Retefuente_label, Valor_horas_label, Nombres_label;
        
        
        Ventana_principal Ventana_inicial = new Ventana_principal();        
       // Titulo
        Titulo = new JLabel("Ejercicio19");
        Titulo.setBounds(250,0,100,100);
        Ventana_inicial.add(Titulo); 
        // Subtitulos y cajas de texto
        
        C_empleado_label = new JLabel("Ingrese el código del empleado");
        C_empleado_label.setBounds(150,40,1010,100);
        Ventana_inicial.add(C_empleado_label);
        
        C_empleado = new JTextField();
        C_empleado.setBounds(150,120,250,20);
        Ventana_inicial.add(C_empleado);
        
        
        Horas_trabajadas_label = new JLabel("Ingrese las horas trabajadas del empleado");
        Horas_trabajadas_label.setBounds(150,120,1010,100);
        Ventana_inicial.add(Horas_trabajadas_label);
        
        Horas_trabajadas = new JTextField();
        Horas_trabajadas.setBounds(150,200,250,20);
        Ventana_inicial.add(Horas_trabajadas);
        
        Retefuente_label = new JLabel("Ingrese el retefuente del empleado");
        Retefuente_label.setBounds(150,200,1010,100);
        Ventana_inicial.add(Retefuente_label);
        
        Retefuente = new JTextField();
        Retefuente.setBounds(150,280,250,20);
        Ventana_inicial.add(Retefuente);
        
        Valor_horas_label = new JLabel("Ingrese el valor por hora del empleado");
        Valor_horas_label.setBounds(150,280,1010,100);
        Ventana_inicial.add(Valor_horas_label);
        
        Valor_horas = new JTextField();
        Valor_horas.setBounds(150,360,250,20);
        Ventana_inicial.add(Valor_horas);
        
        Nombres_label = new JLabel("Ingrese el nombre del empleado");
        Nombres_label.setBounds(150,360,1010,100);
        Ventana_inicial.add(Nombres_label);
        
        Nombres = new JTextField();
        Nombres.setBounds(150,440,250,20);
        Ventana_inicial.add(Nombres);
        
        Ingresar_datos =  new JButton("Ingresar datos");
        Ingresar_datos.setBounds(150,500,250,20);
        Ingresar_datos.addActionListener(this);
        Ventana_inicial.add(Ingresar_datos);
        

        Ventana_inicial.setVisible(true);
        
                
                
            }
        
       

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == Ingresar_datos){
                Actividades_a_Realizar.Codigo_empleado(Integer.parseInt(C_empleado.getText()), Nombres.getText(),Integer.parseInt(Valor_horas.getText()),Integer.parseInt(Horas_trabajadas.getText()),Double.valueOf(Retefuente.getText()));
                JOptionPane.showMessageDialog(rootPane,"El codigo del empleado es : " + Actividades_a_Realizar.C_empleado + "\n" + "El nombre del empleado es : " + Actividades_a_Realizar.Nombres + "\n" + "El salario bruto es : "+ Actividades_a_Realizar.salario_bruto + "\n"+ "El salario neto es : " + Actividades_a_Realizar.salario_neto);
            }
        
            
        }

    }
    
    

