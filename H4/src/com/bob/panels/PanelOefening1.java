package com.bob.panels;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class PanelOefening1 extends JPanel {
    private JTextField monthlySalary;
    private JTextField yearlySalary;

    PanelOefening1() {
        setLayout(null);
        final JLabel labelMonthly = new JLabel("Maandsalaris: ");
        final JLabel labelYearly = new JLabel("Jaarsalaris: ");

        final JButton calculate = new JButton("Bereken jaarsalaris");
        calculate.addActionListener(new CalculateButtonHandler());

        monthlySalary = new JTextField(10);
        yearlySalary = new JTextField(20);
        yearlySalary.setEditable(false);

        labelMonthly.setBounds(20, 40, 100, 20);
        monthlySalary.setBounds(160, 40, 80, 20);
        labelYearly.setBounds(20, 80, 100, 20);
        yearlySalary.setBounds(160, 80, 80, 20);
        calculate.setBounds(20, 120, 180, 20);

        add(labelMonthly);
        add(monthlySalary);
        add(labelYearly);
        add(yearlySalary);
        add(calculate);
    }

    class CalculateButtonHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            final int MONTHS_IN_YEAR = 12;

            double monthly = Double.parseDouble(monthlySalary.getText());
            double yearly = monthly * MONTHS_IN_YEAR;

            yearlySalary.setText(String.format("%.2f", yearly));
        }
    }
}
