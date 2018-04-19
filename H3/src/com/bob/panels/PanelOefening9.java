package com.bob.panels;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class PanelOefening9 extends JPanel {
    private JTextField invoervak1, invoervak2, resultaatVak;

    PanelOefening9() {
        invoervak1 = new JTextField(10);
        invoervak2 = new JTextField(10);
        resultaatVak = new JTextField(10);
        JButton plusKnop = new JButton("+");
        plusKnop.addActionListener(new PlusKnopHandler());
        JButton productKnop = new JButton("*");
        productKnop.addActionListener(new ProductKnopHandler());

        add(invoervak1);
        add(invoervak2);
        add(plusKnop);
        add(productKnop);
        add(resultaatVak);
    }

    private int[] getInvoer() {
        int[] invoer = new int[2];
        String invoerstring1 = invoervak1.getText();
        String invoerstring2 = invoervak2.getText();
        int getal1 = Integer.parseInt(invoerstring1);
        int getal2 = Integer.parseInt(invoerstring2);

        invoer[0] = getal1;
        invoer[1] = getal2;

        return invoer;
    }

    class PlusKnopHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int getal1 = getInvoer()[0];
            int getal2 = getInvoer()[1];

            int resultaat = getal1 + getal2;

            resultaatVak.setText("" + resultaat);
        }
    }

    class ProductKnopHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int getal1 = getInvoer()[0];
            int getal2 = getInvoer()[1];

            int resultaat = getal1 * getal2;

            resultaatVak.setText("" + resultaat);
        }
    }
}
