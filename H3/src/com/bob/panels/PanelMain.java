package com.bob.panels;

import com.bob.frames.FrameOefening;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelMain extends JPanel {

    private ButtonHandler buttonHandler = new ButtonHandler();

    public PanelMain() {
        add(newButton("Oefening 3.1", "Oefening_1"));
        add(newButton("Oefening 3.2", "Oefening_2"));
        add(newButton("Oefening 3.3 en 3.4", "Oefening_3"));
        add(newButton("Oefening 3.5", "Oefening_5"));
        add(newButton("Oefening 3.6", "Oefening_6"));
        add(newButton("Oefening 3.7", "Oefening_7"));
        add(newButton("Oefening 3.8", "Oefening_8"));
        add(newButton("Oefening 3.9", "Oefening_9"));
    }

    private JButton newButton(String text, String name) {
        JButton button = new JButton(text);
        button.setName(name);
        button.addActionListener(buttonHandler);
        return button;
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
            case "Oefening_6":
                return new PanelOefening6();
            case "Oefening_7":
                return  new PanelOefening7();
            case "Oefening_8":
                return new PanelOefening8();
            case "Oefening_9":
                return new PanelOefening9();
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
