package com.bob.panels;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class PanelOefening3 extends JPanel {

    private JTextField numberOfPeople;
    private JTextField year;

    PanelOefening3() {
        JButton yearLaterButton = new JButton("+1 Jaar");
        yearLaterButton.addActionListener(new YearLaterButtonHandler());
        numberOfPeople = new JTextField(10);
        year = new JTextField("0", 5);

        add(numberOfPeople);
        add(yearLaterButton);
        add(year);
    }

    class YearLaterButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            final double GROWTH = 1.02;

            double number = Double.parseDouble(numberOfPeople.getText());
            number *= GROWTH;

            int yearNumber = Integer.parseInt(year.getText());
            yearNumber++;

            numberOfPeople.setText(String.format("%-9.0f", number));
            year.setText("" + yearNumber);
        }
    }
}
