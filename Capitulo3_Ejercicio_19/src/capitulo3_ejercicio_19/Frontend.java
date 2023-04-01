/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo3_ejercicio_19;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frontend extends JFrame implements ActionListener {
    public Backend operaciones = new Backend();
    private JLabel titulo;
    public JTextField lado_del_triangulo;
    public JButton ingresar_datos;
    public Frontend  (){
        this.setBackground(Color.yellow);
        this.setBounds(0, 0, 300, 150);
        this.setTitle("Ejercicio #19 capitulo 3");
        this.setLayout(null);
        this.setResizable(false);
    }
    public void  diseño(){
        Frontend ventana_inicial = new Frontend();
        //texto 
        titulo = new JLabel("Ingrese el lado del del triangulos equilatero");
        titulo.setBounds(20, 0, 300, 40);
        ventana_inicial.add(titulo);
        
        //Caja de texto 
        
        lado_del_triangulo = new JTextField();
        lado_del_triangulo.setBounds(50, 50, 200, 20);
        ventana_inicial.add(lado_del_triangulo);
        
        //boton
        
        ingresar_datos =  new JButton("Ingresar datos");
        ingresar_datos.setBounds(50,75,200, 20);
        ingresar_datos.setBackground(Color.blue);
        ingresar_datos.addActionListener(this);
        ventana_inicial.add(ingresar_datos);
        
        ventana_inicial.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent click){
        if(click.getSource() == ingresar_datos){
            operaciones.operaciones_con_el_triangulo(Double.valueOf(lado_del_triangulo.getText()));
            JOptionPane.showMessageDialog(rootPane,"La  altura es " + operaciones.altura +" \n" + "El area es " + operaciones.area +"\n" + "El perimetro es "+ operaciones.perimetro );
        }
    }
}
