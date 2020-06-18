package usta.sistemas;

import javax.swing.*;
import java.awt.*;

public class form_acercade extends JFrame {
    //AUTHOR: Juan David Neira Martinez
    //DATE: 09/06/2020
    //DESCRIPTION:this software shows information
    public form_acercade(){
        setLayout(new BorderLayout());
        //panel superior
        JPanel panel_superior = new JPanel();
        JLabel label_menu = new JLabel("Acerca de...",SwingConstants.CENTER);
        label_menu.setFont(new Font("Arial",0,20));
        panel_superior.add(label_menu);
        //panel central
        JPanel panel_central = new JPanel();
        JLabel label_maker = new JLabel("this software was make by: Juan David Neira Martinez",SwingConstants.CENTER);
        panel_central.add(label_maker);
        //se agregan los paneles
        add(panel_superior,BorderLayout.NORTH);
        add(panel_central,BorderLayout.CENTER);
        //parametros del formulario
        setVisible(true);
        setResizable(false);
        setBounds(0,0,600,400);
        setLocationRelativeTo(null);
    }
}
