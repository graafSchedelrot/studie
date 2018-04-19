package com.bob.panels;

import javax.swing.*;
import java.awt.*;

public class PanelOefening3 extends JPanel {

    private final int ageInSeconds = 5454532;
    private int hours;
    private int minutes;
    private int seconds;
    private int days;
    private int weeks;

    PanelOefening3(){
        minutes = ageInSeconds / 60;
        seconds = ageInSeconds % 60;
        hours = minutes / 60;
        minutes = minutes % 60;
        days = hours / 24;
        weeks = days / 7;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Leeftijd in seconden: " + ageInSeconds, 40, 100);
        g.drawString(hours + " uur, " + minutes + " minuten en " + seconds + " seconden.", 40, 125);
        g.drawString(days + " dagen en " + weeks + "weken.", 40, 140);
    }

}
