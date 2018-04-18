package com.bob.panels;

import com.bob.frames.FrameOefening;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelMain extends JPanel {

    public PanelMain() {
        JButton buttonOefening1 = new JButton("Oefening 1");
        JButton buttonOefening2 = new JButton("Oefening 2");
        JButton buttonOefening3 = new JButton("Oefening 3");
        JButton buttonOefening4 = new JButton("Oefening 4");

        buttonOefening1.setName("Oefening_1");
        buttonOefening1.addActionListener(new ButtonHandler());
        buttonOefening2.setName("Oefening_2");
        buttonOefening2.addActionListener(new ButtonHandler());
        buttonOefening3.setName("Oefening_3");
        buttonOefening3.addActionListener(new ButtonHandler());
        buttonOefening4.addActionListener(new ButtonHandler());

        add(buttonOefening1);
        add(buttonOefening2);
        add(buttonOefening3);
        add(buttonOefening4);

    }


    private JPanel getPanelByName(String name) {
        JPanel panel;
        switch (name) {
            case "Oefening_1":
                panel = new PanelOefening1();
                break;
            case "Oefening_2":
                panel = new PanelOefening2();
                break;
            case "Oefening_3":
                panel = new PanelOefening3();
                break;
            default:
                panel = null;
        }
        return panel;
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
