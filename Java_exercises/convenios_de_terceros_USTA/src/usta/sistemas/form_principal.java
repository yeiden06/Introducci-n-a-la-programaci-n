package usta.sistemas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form_principal extends JFrame {
    //AUTHOR:Juan David Neira Martinez
    //DATE:09/06/2020
    //DESCRIPTION:this software shows the principal buttons
    public form_principal(){
        setTitle("SAC JAVA versión 1.0");
        setLayout(new BorderLayout());
        //panel superior
        JPanel panel_superior = new JPanel();
        JLabel label_menu= new JLabel("Menú principal",SwingConstants.CENTER);
        label_menu.setFont(new Font("Arial",0,20));
        panel_superior.add(label_menu);
        //panel izquierdo (donde van a estar los botones)
        JPanel panel_izquierdo= new JPanel();
        panel_izquierdo.setLayout(new GridLayout(5,1));
        //creamos el primer boton
        JButton boton_formulario1 = new JButton("New Student");
        boton_formulario1.setBounds(0,0,100,30);
        boton_formulario1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //
                form_students form_student1=new form_students();
            }
        });
        panel_izquierdo.add(boton_formulario1);
        //creamos el segundo boton
        JButton boton_formulario2 = new JButton("List all students");
        boton_formulario2.setBounds(0,0,100,30);
        boton_formulario2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                f_abrir_form_show_all_student(actionEvent);
            }
        });
        panel_izquierdo.add(boton_formulario2);
        //creamos el tercer boton (convenios)
        JButton boton_convenios = new JButton("Convenios de terceros");
        boton_convenios.setBounds(0,0,100,30);
        boton_convenios.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                form_convenios form_convenios1 = new form_convenios();
            }
        });
        panel_izquierdo.add(boton_convenios);
        //creamos el cuarto boton (lista de convenios)
        JButton boton_all = new JButton("List all convenios");
        boton_all.setBounds(0,0,100,30);
        boton_all.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {f_abrir_f_show_all_convenios(actionEvent); }
        });
        panel_izquierdo.add(boton_all);
        //creamos el quinto boton (acercade).
        JButton boton_acercade = new JButton("Acerca de...");
        boton_acercade.setBounds(0,0,100,30);
        boton_acercade.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                form_acercade form_acercade1= new form_acercade();
            }
        });
        panel_izquierdo.add(boton_acercade);
        // creamos el panel inferior
        JPanel panel_inferior = new JPanel();
        panel_inferior.add(new JLabel("Creado por: Juan David Neira Martinez"));
        //agregar los paneles al formulario (jframe).
        add(panel_superior,BorderLayout.NORTH);
        add(panel_izquierdo,BorderLayout.WEST);
        add(panel_inferior,BorderLayout.SOUTH);

        //parametros generales del formularios
        setVisible(true);
        setResizable(false);
        setBounds(0,0,600, 400);
        setLocationRelativeTo(null);
    }

    private void f_abrir_f_show_all_convenios(java.awt.event.ActionEvent evt) {
        f_show_all_convenios f_show_all_convenios1 = new f_show_all_convenios(this);
    }

    private void f_abrir_form_show_all_student(java.awt.event.ActionEvent evt){
        form_show_all_students form_show_all_student1= new form_show_all_students(this);
    }
}
