package com.bob.frames;

import javax.swing.*;

public class FrameOefening extends JFrame {

    public void newFrame(JPanel panel) {
        JFrame frame = new FrameOefening();
        frame.setLocation(500, 400);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        frame.setTitle("Oefening");
        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}
