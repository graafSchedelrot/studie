package com.bob.panels;

import javax.swing.*;
import java.awt.*;

public class PanelOefening13 extends JPanel {
    private int lengthCharlotte = 128;
    private int lengthWelmer = 135;
    private int lengthNoa = 105;

    PanelOefening13() {
        setLayout(null);

        JTextArea textCharlotte = new JTextArea("Charlotte: " + System.lineSeparator() + lengthCharlotte + " cm.");
        textCharlotte.setBounds(60, 210, 60, 50);
        textCharlotte.setEditable(false);

        JTextArea textWelmer = new JTextArea("Welmer: " + System.lineSeparator()+ lengthWelmer+ " cm.");
        textWelmer.setBounds(120, 210, 60, 50);
        textWelmer.setEditable(false);

        JTextArea textNoa = new JTextArea("Noa: " +System.lineSeparator()+ lengthNoa+ " cm.");
        textNoa.setBounds(180, 210, 60, 50);
        textNoa.setEditable(false);

        add(textCharlotte);
        add(textWelmer);
        add(textNoa);
    }

    public void paintComponent(Graphics g) {
        int ceiling = 200;
        // Charlotte
        g.setColor(Color.BLUE);
        g.fillRect(60, (ceiling - lengthCharlotte), 60, lengthCharlotte);

        // Welmer
        g.setColor(Color.RED);
        g.fillRect(120, (ceiling - lengthWelmer), 60, lengthWelmer);
        // Noa
        g.setColor(Color.YELLOW);
        g.fillRect(180, (ceiling - lengthNoa), 60, lengthNoa);

    }
}
