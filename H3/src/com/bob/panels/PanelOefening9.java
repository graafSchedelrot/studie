package com.bob.panels;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class PanelOefening9 extends JPanel {
    private JTextField invoervak1, invoervak2, resultaatVak;

    PanelOefening9() {
        setLayout(new GridLayout(5, 3));

        invoervak1 = new JTextField(10);
        invoervak2 = new JTextField(10);
        resultaatVak = new JTextField(10);



        JButton plusKnop = new JButton("+");
        plusKnop.addActionListener(new PlusKnopHandler());
        JButton minKnop = new JButton("-");
        minKnop.addActionListener(new MinKnopHandler());
        JButton productKnop = new JButton("*");
        productKnop.addActionListener(new ProductKnopHandler());
        JButton quotientKnop = new JButton("/");
        quotientKnop.addActionListener(new QuotientKnopHandler());
        JButton restKnop = new JButton("%");
        restKnop.addActionListener(new RestKnopHandler());
        JButton resetKnop = new JButton("Reset");
        resetKnop.addActionListener(new ResetKnopHandler());

        //Rij 1
        add(invoervak1);
        add(new JLabel(""));
        add(plusKnop);

        //Rij 2
        add(invoervak2);
        add(new JLabel(""));
        add(minKnop);



        //Rij 3
        add(new JLabel(""));
        add(new JLabel(""));
        add(productKnop);

        //Rij 4
        add(new JLabel(""));
        add(quotientKnop);
//        add(new JLabel(""));
        add(restKnop);

        //Rij 5
        add(resultaatVak);
        add(new JLabel(""));
        add(resetKnop);
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

    class MinKnopHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int getal1 = getInvoer()[0];
            int getal2 = getInvoer()[1];

            int resultaat = getal1 - getal2;

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

    class QuotientKnopHandler implements ActionListener {
        public void actionPerformed(ActionEvent e){
            int getal1 = getInvoer()[0];
            int getal2 = getInvoer()[1];

            int resultaat = getal1 / getal2;

            resultaatVak.setText("" + resultaat);
        }
    }

    class RestKnopHandler implements ActionListener {
        public void actionPerformed(ActionEvent e){
            int getal1 = getInvoer()[0];
            int getal2 = getInvoer()[1];

            int resultaat = getal1 % getal2;

            resultaatVak.setText("" + resultaat);
        }
    }

    class ResetKnopHandler implements ActionListener {
        public void actionPerformed(ActionEvent e){
            invoervak1.setText("");
            invoervak2.setText("");
            resultaatVak.setText("");
        }
    }



}
