package GUI;

import Indkøbsliste.Food.Product;
import Searching.Searching;
import Services.Scripts.*;
import me.xdrop.fuzzywuzzy.FuzzySearch;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;
import java.util.Vector;

public class Diet extends javax.swing.JFrame {

    public Diet() {
        initComponents();
    }

    private void initComponents() {

        JComboBox<String> jComboBox1 = new JComboBox<>();
        JLabel jLabel1 = new JLabel();
        JTextField jTextField1 = new javax.swing.JTextField();
        JLabel jLabel2 = new JLabel();
        JButton jButton1 = new JButton();
        JScrollPane jScrollPane2 = new JScrollPane();
        JList jList1 = new javax.swing.JList();
        DefaultListModel listModel = new DefaultListModel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Diet");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paleo", "Vegetarian", "Vegan", "Kashrut", "Islamic", "Hindu", "Ketogenic", "MIND Diet" }));

        jLabel1.setText("Vælg en diæt");

        jLabel2.setText("Eventuelle Allergier");

        jButton1.setText("Søg");
        jButton1.addActionListener(actionEvent -> {
            listModel.removeAllElements();

            List<Product> test = null;
            try {
                test = new Json_to_java().make_list();
            } catch (IOException e) {
                e.printStackTrace();
            }
            var sorted = new Searching();

            List<Product> searched = sorted.FuzzySearchByName(jTextField1.getText(), test, 20);

            for (Product product : searched) listModel.addElement(product.getName());
            jList1.setModel(listModel);

        });

        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }
}
