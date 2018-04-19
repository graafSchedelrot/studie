package com.bob.panels;

import javax.swing.*;
import java.awt.*;

public class PanelOefening2 extends JPanel {

    private int negativeNumber1 = -5;
    private int negativeNumber2 = -8;
    private int result;

    PanelOefening2() {
        result = negativeNumber1 - negativeNumber2;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("" + negativeNumber1, 40, 100);
        g.drawString("" + negativeNumber2, 40, 120);
        g.drawLine(25, 130, 55, 130);
        g.drawString("" + result, 40, 140);
    }
}
