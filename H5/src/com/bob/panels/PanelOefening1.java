package com.bob.panels;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelOefening1 extends JPanel {

    private JTextField input1;
    private JTextField input2;
    private String text = "";
    private int posX = 50;
    private Point messagePosition = new Point();


    PanelOefening1() {
        final JButton button = new JButton("Calculate!");
        button.addActionListener(new ButtonHandler());

        input1 = new JTextField(10);
        input2 = new JTextField(10);

        add(input1);
        add(input2);
        add(button);

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString(text, messagePosition.x, messagePosition.y);
    }

    class ButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            final int numberInput1 = Integer.parseInt(input1.getText());
            final int numberInput2 = Integer.parseInt(input2.getText());
            if (numberInput1 > numberInput2) {
                text = "Deze is groter.";
                messagePosition = input1.getLocation();
                messagePosition.y  += 30;
                repaint();
            } else if (numberInput1 == numberInput2) {
                text = "Ze zijn gelijk.";
                messagePosition.x = 100;
                messagePosition.y = 100;
                repaint();
            } else {
                text = "Deze is groter.";
                messagePosition = input2.getLocation();
                messagePosition.y  += 30;
                repaint();
            }


        }
    }


}
