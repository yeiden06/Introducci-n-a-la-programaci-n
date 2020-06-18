package usta.sistemas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form_menu extends JFrame {
    //AUTHOR:Juan David Neira Martinez
    //DATE:09/06/2020
    //DESCRIPTION:this software shows the different tables of information
    //this is constructor
    public form_menu (){
        //etiqueta del nombre del software
        JLabel label_menu = new JLabel("SAC version JAVA",SwingConstants.CENTER);
        label_menu.setFont(new Font("Arial",0,20));
        label_menu.setBounds(200,10,300,30);
        add(label_menu);
        //etiqueta de quien lo creo
        JLabel label_maker = new JLabel("Creado por: Juan David Neira Martinez",SwingConstants.LEFT);
        label_maker.setBounds(5,300,590,20);
        add(label_maker);
        JButton boton_iniciar = new JButton("iniciar");
        boton_iniciar.setBounds(250,200,100,50);
        //crea una accion al dar clikc
        boton_iniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //instancia del formulario
                form_principal form_principal = new form_principal();
            }
        });
        add(boton_iniciar);
        //propiedades del formulario
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setBounds(0,0,600,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
