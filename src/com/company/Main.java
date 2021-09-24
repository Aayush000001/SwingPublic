package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true); // set visibility
        frame.setResizable(true); // is frame resizeable
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //default close operation; EXIT ON CLOSE
        frame.setSize(840, 840); // set x-dim & set y-dim
        frame.setTitle("ATOM"); // set title of the JFrame.

        ImageIcon logoImage = new ImageIcon("images/index.png");
        frame.setIconImage(logoImage.getImage()); //change icon image.

        frame.getContentPane().setBackground(new Color(128,128,128)); //change color of background.

    }
}
