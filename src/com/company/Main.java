package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        //new MyFrame();
        JLabel label = new JLabel();
        label.setText("Bro, do you even code ? "); // set text label.

        ImageIcon image = new ImageIcon("images/dice.png");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text RIGHT, CENTRE, LEFT to the image icon.
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.red);
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setFont(Font.getFont("MV boli"));

        Border border = BorderFactory.createLineBorder(Color.GREEN, 3);
        label.setBorder(border);

        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);


        JFrame frame = new JFrame("Label frame example");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.CYAN);
        frame.add(label);

        frame.setLayout(null);  // setting the default layout manager null.
        label.setBounds(100,100,1000,1000);

        ImageIcon logo = new ImageIcon("images/index.png");
        frame.setIconImage(logo.getImage());

    }
}
