package com.bob.panels;

import javax.swing.*;
import java.awt.*;

public class PanelOefening8 extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawRect(50, 50, 150, 150);
        g.fillRect(50, 50, 50, 50);
        g.fillRect(150, 50, 50, 50);
        g.fillRect(100, 100, 50, 50);
        g.fillRect(50, 150, 50, 50);
        g.fillRect(150, 150, 50, 50);

    }

}
