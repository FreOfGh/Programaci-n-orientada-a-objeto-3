/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo5_ejercicio41;

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
        ventana_inicial.add(numeros_label);
        
        //Caja de texto 
        
        numeros = new JTextField();
        numeros.setBounds(50, 50, 200, 20);
        ventana_inicial.add(numeros);
        
        //boton
        
        añadir =  new JButton("Ingresar datos");
        añadir.setBounds(0,75,120, 20);
        añadir.setBackground(Color.blue);
        ventana_inicial.add(añadir);
        
        Ejecutar =  new JButton("Ejecutar");
        Ejecutar.setBounds(190,75,100, 20);
        Ejecutar.setBackground(Color.blue);
        ventana_inicial.add(Ejecutar);
        
        
        
        ventana_inicial.setVisible(true);
        initacciones();
    }

private void initacciones(){           
            añadir.addActionListener( new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent click){
                        if(click.getSource() == añadir){
                            operaciones.añadir(Double.valueOf(numeros.getText()));
                            JOptionPane.showMessageDialog(rootPane,"Numero añadido exitosamente  "+ operaciones.lista_de_numeros );
       
                            }
                    }
            });
        Ejecutar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent click){

                if (click.getSource() == Ejecutar){
                operaciones.mayor();
                JOptionPane.showMessageDialog(rootPane,"El numero mayor es : " + operaciones.mayor1 );

        }       
           
        
        }
        });
                
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}      