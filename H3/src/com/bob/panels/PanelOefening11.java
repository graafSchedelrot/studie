package com.bob.panels;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelOefening11 extends JPanel {
    private int xPosition = 100;
    private int diameter = 50;

    PanelOefening11() {
        setBackground(Color.YELLOW);
        JButton buttonRight = new JButton("-->");
        JButton buttonLeft = new JButton("<--");
        JButton buttonLarger = new JButton("Larger");
        JButton buttonSmaller = new JButton("Smaller");

        buttonRight.addActionListener(new ButtonRightHandler());
        buttonLeft.addActionListener(new ButtonLeftHandler());
        buttonLarger.addActionListener(new ButtonLargerHandler());
        buttonSmaller.addActionListener(new ButtonSmallerHandler());

        add(buttonLeft);
        add(buttonRight);
        add(buttonLarger);
        add(buttonSmaller);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(xPosition, 200, diameter, diameter);
    }

    class ButtonRightHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            xPosition += 5;
            repaint();
        }
    }

    class ButtonLeftHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            xPosition -= 5;
            repaint();
        }
    }

    class ButtonLargerHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            diameter += 5;
            repaint();
        }
    }

    class ButtonSmallerHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            diameter -= 5;
            repaint();
        }
    }


}
