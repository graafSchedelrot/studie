package com.bob.panels;

import javax.swing.*;
import java.awt.*;

public class PanelOefening1 extends JPanel {

    private int secondsInHour;
    private int secondsInDay;
    private int secondsInYear;

    PanelOefening1() {
        setBackground(Color.WHITE);
        secondsInHour = 60 * 60;
        secondsInDay = secondsInHour * 24;
        secondsInYear = secondsInDay * 365;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Seconden in uur: " + secondsInHour, 40, 100);
        g.drawString("Seconden in dag: " + secondsInDay, 40, 120);
        g.drawString("Seconden in jaar: " + secondsInYear, 40, 140);
    }
}
