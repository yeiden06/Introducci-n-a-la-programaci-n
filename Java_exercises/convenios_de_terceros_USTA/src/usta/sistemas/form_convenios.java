package usta.sistemas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form_convenios extends JFrame {
    JTextField text_codigo, text_Nombre_tercero, text_objetivo, text_tiempo;

    public form_convenios() {
        setLayout(new BorderLayout());
        //panel superior
        JPanel panel_superior = new JPanel();
        JLabel label_menu = new JLabel("Convenios de terceros", SwingConstants.CENTER);
        label_menu.setFont(new Font("Arial", 0, 20));
        panel_superior.add(label_menu);
        //panel central
        JPanel panel_central = new JPanel();
        panel_central.setLayout(new GridLayout(5, 2));
        panel_central.add(new JLabel(""));
        panel_central.add(new JLabel(""));
        panel_central.add(new JLabel("Codigo "));
        panel_central.add(text_codigo = new JTextField(""));
        panel_central.add(new JLabel("Nombre_tercero "));
        panel_central.add(text_Nombre_tercero = new JTextField(""));
        panel_central.add(new JLabel("Objetivo: "));
        panel_central.add(text_objetivo = new JTextField(""));
        panel_central.add(new JLabel("Tiempo "));
        panel_central.add(text_tiempo = new JTextField(""));
        //panel inferior
        JPanel panel_inferior = new JPanel();
        JButton boton_crear = new JButton("Crear");
        boton_crear.setBounds(0, 0, 100, 50);
        boton_crear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                crear_nuevo_convenio(actionEvent);
            }
        });
        panel_inferior.add(boton_crear);
        //agregar paneles al formulario
        add(panel_superior, BorderLayout.NORTH);
        add(panel_central, BorderLayout.CENTER);
        //parametros del formulario
        setVisible(true);
        setResizable(false);
        setBounds(0, 0, 600, 400);
        setLocationRelativeTo(null);
    }

    public void crear_nuevo_convenio(java.awt.event.ActionEvent evt) {
        //description: this method save the data into file
        final JDialog ventana_emergente = new JDialog(this, "Save data", true);
        if (text_codigo.getText().length() < 3 || text_Nombre_tercero.getText().length() < 6 || text_objetivo.getText().length() < 5 || text_tiempo.getText().length()>=0) {
            ventana_emergente.add(new JLabel("El codigo debe tener 3 digitos"+"El Nombre_tercero debe tener 6 digitos"+"El objetivo debe tener 5 digitos"+"El tiempo puede ser solo numeros"));
        } else {
            //grabaremos en un archivo
            file_data_convenios file_data_convenios1 = new file_data_convenios();
            boolean rpta = file_data_convenios1.f_add_convenio(text_codigo.getText(), text_Nombre_tercero.getText(), text_objetivo.getText(),text_tiempo.getText());
            if (rpta == true) {
                ventana_emergente.add(new JLabel("DATOS GUARDADOS CON EXITO"));
                text_codigo.setText("");
                text_Nombre_tercero.setText("");
                text_objetivo.setText("");
            } else {
                ventana_emergente.add(new JLabel("LOS DATOS NO SE PUEDEN GUARDAR EN EL ARCHIVO d:/students.txt"));
            }
        }
        ventana_emergente.pack();
        ventana_emergente.setVisible(true);
    }
}