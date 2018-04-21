package com.bob.panels;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

class PanelOefening2 extends JPanel {

    private JTextField textFieldInput1;
    private JTextField textFieldInput2;
    private JTextField output;

    PanelOefening2() {
        textFieldInput1 = new JTextField(10);
        textFieldInput2 = new JTextField(10);
        output = new JTextField(10);

        JButton calculateButton = new JButton("Gemiddelde");
        calculateButton.addActionListener(new CalculateButtonHandler());

        output.setEditable(false);

        add(textFieldInput1);
        add(textFieldInput2);
        add(calculateButton);
        add(output);
    }

    class CalculateButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            final int NUMBER_OF_INPUTS = 2;
            double input1 = Double.parseDouble(textFieldInput1.getText());
            double input2 = Double.parseDouble(textFieldInput2.getText());
            double result = (input1 + input2) / NUMBER_OF_INPUTS;

            output.setText(new DecimalFormat("#.###").format(result));
        }
    }

}
