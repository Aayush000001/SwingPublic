package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Mylabel {
    Mylabel(){ // this is the constructor
        JLabel label = new JLabel();
        label.setText("Bro, do you even code ? "); // set text label.

        ImageIcon image = new ImageIcon("images/dice.png");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text RIGHT, CENTRE, LEFT to the image icon.
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.red);
        label.setBackground(Color.BLACK);
        label.setOpaque(true); // it should be true to show label background color.
        label.setFont(Font.getFont("MV boli"));

        Border border = BorderFactory.createLineBorder(Color.GREEN, 3);
        label.setBorder(border);

        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);


        JFrame frame = new JFrame("Label frame example");
//        frame.setSize(250,250);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.CYAN);
        frame.add(label);

        //frame.setLayout(null);  // setting the default layout manager null.
        //label.setBounds(100,100,1000,1000);

        frame.pack(); // pack method automatically updates the size to pack all the components inside.
        // add all your components before using pack method, add all the components and then use the pack method.
        ImageIcon logo = new ImageIcon("images/index.png");
        frame.setIconImage(logo.getImage());
    }
}
