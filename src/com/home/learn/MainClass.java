package com.home.learn;

import javax.swing.*;
import java.awt.*;

public class MainClass {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("SomeApp");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                MyPanel myPanel = new MyPanel();
                frame.add(myPanel);
                frame.pack();
                frame.setLocationRelativeTo(null);
            }
        });
    }
}
