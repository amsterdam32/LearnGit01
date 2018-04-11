package com.home.learn;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    MyPanel(){
        this.setPreferredSize(new Dimension(400,400));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.drawRect(100,100,200,200);
        g2.drawRect(150,150,100,100);
    }
}
