package com.bob.panels;

import javax.swing.*;
import java.awt.*;

public class PanelOefening5 extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(50, 150, 150, 150);
        g.drawLine(50, 150, 100, 50);
        g.drawLine(150, 150, 100, 50);
    }

}
