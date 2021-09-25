package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class MyPanel {
    /*
    JPanel = a GUI component that functions as a container to hold other components.
    We can add components to a panel and then add the panel to the frame.
     */
    MyPanel(){
        JPanel GreyPanel = new JPanel(); // Panel created.
        GreyPanel.setBackground(Color.GRAY); // setBackground is used to set background color.
        GreyPanel.setBounds(0,0,250,250); // we are not using any Layout Manager, so we have to set x,y,width,height of the panel.

        JPanel RedPanel = new JPanel();
        RedPanel.setBackground(Color.red);
        RedPanel.setBounds(250,250,250,250);

        JPanel YellowPanel = new JPanel();
        YellowPanel.setBackground(Color.YELLOW);
        YellowPanel.setBounds(500,500,250,250);

        JPanel BluePanel = new JPanel();
        BluePanel.setBackground(Color.BLUE);
        BluePanel.setBounds(250,0,250,250);

        JPanel PinkPanel = new JPanel();
        PinkPanel.setBackground(Color.PINK);
        PinkPanel.setBounds(500,0,250,250);

        JPanel CyanPanel = new JPanel();
        CyanPanel.setBackground(Color.CYAN);
        CyanPanel.setBounds(500,250,250,250);

        JPanel LightBluePanel = new JPanel();
        LightBluePanel.setBackground(new Color(50, 154, 232)); // if we want more precise color we can create our own color using "new Color(rgb)" and then pass the RGB values.
        LightBluePanel.setBounds(0,250,250,250);

        JLabel label = new JLabel("Hello, Java");
        ImageIcon icon = new ImageIcon("images/settings.jpg");
        label.setIcon(icon);

/*
error occurred here.
        BufferedImage image = null;
        try{
            image = ImageIO.read(new File("images/india.png"));
        }catch (Exception e){
            e.printStackTrace();
        }

        Image resizeImage = image.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(resizeImage);

        label.setVerticalAlignment(JLabel.TOP); used with BorderLayout manager.
        label.setHorizontalAlignment(JLabel.CENTER); used with BorderLayout manager, we don't need this because we are
         not using any layout manager.
 */


        JFrame frame = new JFrame("MyPannel");  // Created JFrame
        frame.setVisible(true);
        frame.setSize(750,750);
        frame.add(GreyPanel);

        GreyPanel.setLayout(null);  // null because we are setting manually the x and y coordinates.
        GreyPanel.add(label); // added label to the GreyPanel.
        label.setBounds(50,50,75,75); // setting up the label coordinates, it will take reference from the container it is added, not from the frame.
        // relative to the container that's in.
        frame.add(RedPanel);
        frame.add(YellowPanel);
        frame.add(BluePanel);
        frame.add(PinkPanel);
        frame.add(CyanPanel);
        frame.add(LightBluePanel);
        frame.getContentPane().setBackground(new Color(109, 229, 116));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
    }
}
