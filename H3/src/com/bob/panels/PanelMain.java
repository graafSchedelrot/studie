package com.bob.panels;

import com.bob.frames.FrameOefening;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelMain extends JPanel {

    public PanelMain() {
        JButton buttonOefening1 = new JButton("Oefening 3.1");
        JButton buttonOefening2 = new JButton("Oefening 3.2");
        JButton buttonOefening3 = new JButton("Oefening 3.3 en 3.4");
        JButton buttonOefening5 = new JButton("Oefening 3.5");

        buttonOefening1.setName("Oefening_1");
        buttonOefening1.addActionListener(new ButtonHandler());
        buttonOefening2.setName("Oefening_2");
        buttonOefening2.addActionListener(new ButtonHandler());
        buttonOefening3.setName("Oefening_3");
        buttonOefening3.addActionListener(new ButtonHandler());
        buttonOefening5.setName("Oefening_5");
        buttonOefening5.addActionListener(new ButtonHandler());

        add(buttonOefening1);
        add(buttonOefening2);
        add(buttonOefening3);
        add(buttonOefening5);

    }


    private JPanel getPanelByName(String name) {
        switch (name) {
            case "Oefening_1":
                return new PanelOefening1();
            case "Oefening_2":
                return new PanelOefening2();
            case "Oefening_3":
                return new PanelOefening3();
            case "Oefening_5":
                return new PanelOefening5();
            default:
                return null;
        }
    }

    private class ButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Object button = e.getSource();
            String name = ((JButton) button).getName();
            FrameOefening frame = new FrameOefening();
            try {
                frame.newFrame(getPanelByName(name));
            } catch (NullPointerException ex) {
                System.err.println("Error: panel is null. Check panel name");
            }
        }
    }

}
