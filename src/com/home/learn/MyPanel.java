package com.home.learn;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel{
    MyPanel(){
        setPreferredSize(new Dimension(400,400));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawOval(50,50,300,300);
    }
}
