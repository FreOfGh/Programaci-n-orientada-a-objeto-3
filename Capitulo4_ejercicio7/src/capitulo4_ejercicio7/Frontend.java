/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo4_ejercicio7;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frontend extends JFrame implements ActionListener {
    public JButton Btn_Ingresar_datos;
    public JLabel label_numero1, label_numero2;
    public JTextField numero_1_text_field,numero_2_text_field;
    public Frontend(){
        this.setTitle("Ejercicio capitulo 4 ejercicio #7");
        this.setBounds(0,0,400,600);
        this.setLayout(null);
        this.setResizable(false);
        this.setBackground(Color.yellow);  
    }
    public void diseño(){
        Frontend ventana_inicial =  new Frontend();
        //labels y text fields
        
        label_numero1 =  new JLabel("Numero 1");
        label_numero1.setBounds(150,0,200,200);
        ventana_inicial.add(label_numero1);
        
        numero_1_text_field = new JTextField();
        numero_1_text_field.setBounds(75,160,200,20);
        ventana_inicial.add(numero_1_text_field);
        
        label_numero2 =  new JLabel("Numero 2");
        label_numero2.setBounds(150,160,200,200);
        ventana_inicial.add(label_numero2);
        
        numero_2_text_field = new JTextField();
        numero_2_text_field.setBounds(75,280,200,20);
        ventana_inicial.add(numero_2_text_field);
        
        Btn_Ingresar_datos = new JButton("Ingresar datos");
        Btn_Ingresar_datos.setBounds(75,320,200,50);
        Btn_Ingresar_datos.setBackground(Color.blue);
        Btn_Ingresar_datos.addActionListener(this);
        ventana_inicial.add(Btn_Ingresar_datos);
        
        ventana_inicial.setVisible(true);
    }
    public void actionPerformed(ActionEvent Click ){
        Backend operaciones = new Backend();
        operaciones.Numero1 = Double.valueOf(numero_1_text_field.getText());
        operaciones.Numero2 = Double.valueOf(numero_2_text_field.getText());
        if (Click.getSource() == Btn_Ingresar_datos){
            if (operaciones.Numero1 > operaciones.Numero2){
                JOptionPane.showMessageDialog(rootPane, "El numero " + operaciones.Numero1 +" es mayor al numero  " + operaciones.Numero2);
                 
            }
            else if(operaciones.Numero2 > operaciones.Numero1){
                                
                JOptionPane.showMessageDialog(rootPane, "El numero " + operaciones.Numero2 +" es mayor al numero  " + operaciones.Numero1);

            }
            else {
                JOptionPane.showMessageDialog(rootPane, "El numero " + operaciones.Numero2 +" es igual al numero  " + operaciones.Numero1);

            }
        }
    }
   
    
}
