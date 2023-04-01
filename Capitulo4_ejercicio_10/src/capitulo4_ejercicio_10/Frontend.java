/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo4_ejercicio_10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
        
public class Frontend extends JFrame implements ActionListener {
    public JLabel Numero_inscripcion_label, Estrato_label, Nombres_label, Patrimonio_label;
    public JTextField Numero_inscripcion_text_field, Estrato_text_field, Nombres_text_field, Patrimonio_text_field;
    public JButton Ingresar_datos;
    public Backend operaciones = new Backend(); 
    public Frontend(){
        this.setBounds(0,0,300,900);
        this.setBackground(Color.yellow);
        this.setLayout(null);
        this.setResizable(false);
        this.setTitle("Capitulo 3 ejercicio 10");
    }
    public void diseño(){
        Frontend Pagina_principal = new Frontend();
        
        Numero_inscripcion_label = new JLabel("Ingrese el numero de inscripcion");
        Numero_inscripcion_label.setBounds(0,0,200,200);
        Pagina_principal.add(Numero_inscripcion_label);
        
        Numero_inscripcion_text_field = new JTextField();
        Numero_inscripcion_text_field.setBounds(20, 120, 200, 20);
        Pagina_principal.add(Numero_inscripcion_text_field);
          
        
        Nombres_label = new JLabel("Ingrese el nombre del candidato a inscripcion");
        Nombres_label.setBounds(0,80,200,200);
        Pagina_principal.add(Nombres_label);
        
        Nombres_text_field = new JTextField();
        Nombres_text_field.setBounds(20, 200, 200, 20);
        Pagina_principal.add(Nombres_text_field);
        
        Estrato_label = new JLabel("Ingrese el estrato del candidato a inscripcion");
        Estrato_label.setBounds(0,160,200,200);
        Pagina_principal.add(Estrato_label);
        
        Estrato_text_field = new JTextField();
        Estrato_text_field.setBounds(20, 280, 200, 20);
        Pagina_principal.add(Estrato_text_field);
        
        Patrimonio_label = new JLabel("Ingrese el patrimonio del candidato a inscripcion");
        Patrimonio_label.setBounds(0,240,200,200);
        Pagina_principal.add(Patrimonio_label);
        
        Patrimonio_text_field = new JTextField();
        Patrimonio_text_field.setBounds(20, 360, 200, 20);
        Pagina_principal.add(Patrimonio_text_field);
        
        Ingresar_datos = new JButton("Ingresar datos");
        Ingresar_datos.setBounds(20, 420, 200, 20);
        Ingresar_datos.addActionListener(this);
        Ingresar_datos.setBackground(Color.blue);
        Pagina_principal.add(Ingresar_datos);
        
        
        Pagina_principal.setVisible(true);
        
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == Ingresar_datos){
            
            operaciones.operaciones(Double.parseDouble(Patrimonio_text_field.getText()) , Integer.parseInt(Estrato_text_field.getText()) ,Nombres_text_field.getText() , Numero_inscripcion_text_field.getText());
            JOptionPane.showMessageDialog(rootPane, "El nombre del candidato es " + operaciones.Nombre_candidato +"\n" + "El numero de inscripcion es "+ operaciones.N_matricula + "\n" +"El valor a pagar es "+ operaciones.matricula);
            
        }

    }
    
}
