package com.bob.panels;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class PanelOefening16 extends JPanel {
    private int men = 0;
    private int women = 0;

    private JTextField numberOfMen;
    private JTextField numberOfWomen;
    private JTextField totalPeople;

    PanelOefening16() {
        setBackground(Color.WHITE);
        setLayout(new GridLayout(0, 3, 5, 5));
        JLabel labelMen = new JLabel("Mannen: ");
        labelMen.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel labelWomen = new JLabel("Vrouwen: ");
        labelWomen.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel labelTotal = new JLabel("Totaal: ");
        labelTotal.setHorizontalAlignment(SwingConstants.CENTER);

        numberOfMen = new JTextField(5);
        numberOfMen.setEditable(false);
        numberOfMen.setHorizontalAlignment(SwingConstants.CENTER);
        numberOfWomen = new JTextField(5);
        numberOfWomen.setEditable(false);
        numberOfWomen.setHorizontalAlignment(SwingConstants.CENTER);
        totalPeople = new JTextField(5);
        totalPeople.setEditable(false);
        totalPeople.setHorizontalAlignment(SwingConstants.CENTER);

        JButton buttonAddMan = new JButton("M");
        buttonAddMan.addActionListener(new AddManButtonHandler());
        JButton buttonAddWoman = new JButton("V");
        buttonAddWoman.addActionListener(new AddWomanButtonHandler());
        JButton buttonTotal = new JButton("Totaal");
        buttonTotal.addActionListener(new TotalButtonHandler());

        add(labelMen);
        add(labelTotal);
        add(labelWomen);

        add(numberOfMen);
        add(totalPeople);
        add(numberOfWomen);

        add(buttonAddMan);
        add(buttonTotal);
        add(buttonAddWoman);
    }

    class AddManButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            men++;
            numberOfMen.setText("" + men);
        }
    }

    class AddWomanButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            women++;
            numberOfWomen.setText("" + women);
        }
    }

    class TotalButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            int total = men + women;
            totalPeople.setText("" + total);
        }
    }

}
