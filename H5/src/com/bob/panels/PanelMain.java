package com.bob.panels;

import com.bob.frames.FrameOefening;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelMain extends JPanel {

    private ButtonHandler buttonHandler = new ButtonHandler();

    public PanelMain() {
        add(newButton("Oefening 5.1", "Oefening_1"));
    }

    private JButton newButton(final String text, final String name) {
        JButton button = new JButton(text);
        button.setName(name);
        button.addActionListener(buttonHandler);
        return button;
    }


    private JPanel getPanelByName(final String name) {
        switch (name) {
            case "Oefening_1":
                return new PanelOefening1();
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
