package usta.sistemas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form_students extends JFrame {
    //AUTHOR:Juan David Neira Martinez
    //DATE:09/06/2020
    //DESCRIPTION:this software shows the students

    JTextField text_name, text_lastname, text_faculty;

    public form_students() {
        setLayout(new BorderLayout());
        //panel superior
        JPanel panel_superior = new JPanel();
        JLabel label_menu = new JLabel("New student", SwingConstants.CENTER);
        label_menu.setFont(new Font("Arial", 0, 20));
        panel_superior.add(label_menu);
        //panel central
        JPanel panel_central = new JPanel();
        panel_central.setLayout(new GridLayout(5, 2));
        panel_central.add(new JLabel(""));
        panel_central.add(new JLabel(""));
        panel_central.add(new JLabel("Name: "));
        panel_central.add(text_name = new JTextField(""));
        panel_central.add(new JLabel("Lastname: "));
        panel_central.add(text_lastname = new JTextField(""));
        panel_central.add(new JLabel("Faculty: "));
        panel_central.add(text_faculty = new JTextField(""));
        panel_central.add(new JLabel(""));
        panel_central.add(new JLabel(""));
        //panel inferior
        JPanel panel_inferior = new JPanel();
        JButton boton_crear = new JButton("Crear");
        boton_crear.setBounds(0, 0, 100, 50);
        boton_crear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //guarda la informacion
                crear_nuevo_estudiante(actionEvent);
            }
        });
        panel_inferior.add(boton_crear);
        //agregar paneles al formulario
        add(panel_superior, BorderLayout.NORTH);
        add(panel_central, BorderLayout.CENTER);
        add(panel_inferior, BorderLayout.SOUTH);
        //parametros del formulario
        setVisible(true);
        setResizable(false);
        setBounds(0, 0, 600, 400);
        setLocationRelativeTo(null);
    }

    public void crear_nuevo_estudiante(java.awt.event.ActionEvent evt) {
        //description: this method save the data into file
        final JDialog ventana_emergente = new JDialog(this, "Save data", true);
        if (text_name.getText().length() < 3 || text_lastname.getText().length() < 3 || text_faculty.getText().length() < 3) {
            ventana_emergente.add(new JLabel("Todos los campos deben tener minimo 3 caracteres"));
        } else {
            //grabaremos en un archivo
            file_data_student file_data_student1 = new file_data_student();
            boolean rpta = file_data_student1.f_add_student(text_name.getText(),text_lastname.getText(),text_faculty.getText());
            if(rpta==true){
                ventana_emergente.add(new JLabel("DATOS GUARDADOS CON EXITO"));
                text_name.setText("");
                text_lastname.setText("");
                text_faculty.setText("");
            }else{
                ventana_emergente.add(new JLabel("LOS DATOS NO SE PUEDEN GUARDAR EN EL ARCHIVO d:/students.txt"));
            }
        }
            ventana_emergente.pack();
            ventana_emergente.setVisible(true);
        }
    }
