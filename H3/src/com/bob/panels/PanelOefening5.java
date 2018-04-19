package com.bob.panels;

import javax.swing.*;
import java.awt.*;

public class PanelOefening5 extends JPanel {

    PanelOefening5() {

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(100, 100, 200, 200);

    }

}
