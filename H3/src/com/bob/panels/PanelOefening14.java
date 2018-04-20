package com.bob.panels;

import javax.swing.*;
import java.awt.*;

public class PanelOefening14 extends JPanel {

    PanelOefening14() {
        setBackground(Color.GRAY);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //Verkeerslicht
        g.fillRect(20, 20, 50, 150);
        g.fillRect(40, 170, 10, 100);

        g.setColor(Color.RED);
        g.fillOval(30, 30, 30, 30);

        g.setColor(Color.ORANGE);
        g.fillOval(30, 80, 30, 30);

        g.setColor(Color.GREEN);
        g.fillOval(30, 130, 30, 30);

        //Dobbelsteen
        g.setColor(Color.WHITE);
        g.fillRoundRect(120, 20, 120, 120, 20, 20);
        g.setColor(Color.BLACK);
        g.drawRoundRect(120, 20, 120, 120, 20, 20);

        g.fillOval(130, 30, 20, 20);
        g.fillOval(170, 70, 20, 20);
        g.fillOval(210, 110, 20, 20);


    }

}
