package GUI;

import Indkøbsliste.Food.Product;
import Searching.Searching;
import Services.Scripts.Json_to_java;

import javax.swing.*;
import java.io.IOException;
import java.util.List;

public class Opskrifter extends javax.swing.JFrame {

    public Opskrifter() {
        initComponents();
    }

    private void initComponents() {

        JLabel jLabel1 = new JLabel();
        JTextField jTextField1 = new JTextField();
        JButton jButton1 = new JButton();
        JScrollPane jScrollPane2 = new JScrollPane();
        JList<String> jList1 = new JList<>();
        JButton jButton2 = new JButton();
        DefaultListModel listModel1 = new DefaultListModel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Opskrifter");

        jLabel1.setText("Søg efter ingrediens eller opskrifters titler");

        jButton1.setText("Søg");
        /*
        jButton1.addActionListener(actionEvent -> {
            listModel1.removeAllElements();
            List<Product> test = null;
            try {
                test = null;
            } catch (IOException e) {
                e.printStackTrace();
            }
            var recipes = new Searching();
            List<Product> searched = recipes.FuzzySearchByName(jTextField1.getText(), test, 20);
            for (Product product : searched) listModel1.addElement(product.getName());
            jList1.setModel(listModel1);
        });
        */

        jScrollPane2.setViewportView(jList1);

        jButton2.setText("Tilføj opskrift til indkøbsliste");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                                                .addComponent(jButton2)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("");
        getAccessibleContext().setAccessibleDescription("");

        pack();
    }

}
