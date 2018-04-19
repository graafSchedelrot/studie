package com.bob.panels;

import javax.swing.*;
import java.awt.*;

public class PanelOefening6 extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawRoof(g);
        drawStructure(g);
        drawDoor(g);
        drawWindow(g);
    }

    private void drawRoof (Graphics g) {
        g.drawLine(50, 150, 150, 150);
        g.drawLine(50, 150, 100, 50);
        g.drawLine(150, 150, 100, 50);
    }

    private void drawStructure(Graphics g) {
        g.drawRect(50, 150, 100, 100);
    }

    private void drawDoor(Graphics g) {
        g.drawRect(65, 185, 20, 65);
        g.drawOval(65, 220, 5, 5);
    }

    private void drawWindow(Graphics g) {
        g.drawRect(110, 200, 30, 26);
        g.drawLine(125,200, 125, 225);
        g.drawLine(110, 213, 140, 213);
    }

}
