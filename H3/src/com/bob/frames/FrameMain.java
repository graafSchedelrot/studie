package com.bob.frames;

import com.bob.panels.PanelMain;

import javax.swing.*;

public class FrameMain extends JFrame {

    public void newFrame() {
        JFrame frame = new FrameMain();
        frame.setLocation(200, 400);
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Main");
        frame.setContentPane(new PanelMain());
        frame.setVisible(true);
    }
}
