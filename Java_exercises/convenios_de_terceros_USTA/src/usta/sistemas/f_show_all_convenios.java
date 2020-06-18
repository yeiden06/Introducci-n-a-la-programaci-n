package usta.sistemas;

import javax.swing.*;
import java.awt.*;

public class f_show_all_convenios extends JDialog {
    //AUTHOR:Juan David Neira Martinez
    //DATE:09/06/2020
    //DESCRIPTION:this method organize the convenios
    public f_show_all_convenios(java.awt.Frame parent){
        super(parent, true);
        setLayout(new BorderLayout());
        //panel superior
        JPanel panel_superior = new JPanel();
        JLabel label_menu= new JLabel("List of convenios", SwingConstants.CENTER);
        label_menu.setFont(new Font("Arial",0,20));
        panel_superior.add(label_menu);
        //panel central
        String[] columnsNames ={"Codigo", "Nombre_tercero","Objetivo", "Tiempo"};
        file_data_convenios file_data_convenios1=new file_data_convenios();
        JTable tabla_datos= new JTable(file_data_convenios1.f_all_convenios(),columnsNames);
        tabla_datos.setBounds(10,50,590,300);
        JScrollPane panel_central = new JScrollPane(tabla_datos);
        //añadimos los dos paneles al formulario
        add(panel_superior,BorderLayout.NORTH);
        add(panel_central,BorderLayout.CENTER);
        //Parametros generales del formulario
        setSize(600,400);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        pack(); // modal
    }
}
