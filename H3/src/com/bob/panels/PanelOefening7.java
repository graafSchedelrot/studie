package com.bob.panels;

import javax.swing.*;
import java.awt.*;

public class PanelOefening7 extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(50, 50, 100, 25);
        g.setColor(Color.YELLOW);
        g.fillRect( 50, 75, 100, 25);
        g.setColor(Color.RED);
        g.fillPolygon(triangle());

    }

    private Polygon triangle() {
        int xPoints[] = {50, 100, 50};
        int yPoints[] = {50, 75, 100};
        return new Polygon(xPoints, yPoints,3);
    }

}
