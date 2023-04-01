/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author 57302
 */
public class Frontend extends JFrame implements ActionListener {
     public Backend operaciones = new Backend();
    private JLabel numeros_label;
    public JTextField numeros;
    public JButton añadir,Ejecutar;
    public Frontend  (){
        this.setBackground(Color.yellow);
        this.setBounds(0, 0, 300, 150);
        this.setTitle("Ejercicio #41 capitulo 5");
        this.setLayout(null);
        this.setResizable(false);
    }
    public void  diseño(){
        Frontend ventana_inicial = new Frontend();
        //texto 
        numeros_label = new JLabel("Ingrese el numero para agregar a la lista");
        numeros_label.setBounds(20, 0, 300, 40);
        numeros_label.add(numeros_label);
        
        //Caja de texto 
        
        numeros = new JTextField();
        numeros.setBounds(50, 50, 200, 20);
        numeros.add(numeros);
        
        //boton
        
        añadir =  new JButton("Ingresar datos");
        añadir.setBounds(50,75,200, 20);
        añadir.setBackground(Color.blue);
        añadir.addActionListener(this);
        ventana_inicial.add(añadir);
        
        ventana_inicial.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
 /**     public void actionPerformed(ActionEvent click){
        if(click.getSource() == añadir){
            operaciones.añadir(Double.valueOf(numeros.getText()));
            JOptionPane.showMessageDialog(rootPane,"La  altura lista de numeros es  "+ operaciones.lista_de_numeros );
        }**/
    }


