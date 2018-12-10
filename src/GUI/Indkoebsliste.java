package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Indkoebsliste extends javax.swing.JFrame {

    public Indkoebsliste() {
        initComponents();
    }

    private void initComponents() {

        JButton jButton1 = new JButton();
        JButton jButton2 = new JButton();
        JButton jButton3 = new JButton();
        JButton jButton4 = new JButton();
        JScrollPane jScrollPane2 = new JScrollPane();
        JList jList1 = new JList<>();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Indkøbsliste");

        jButton1.setText("Find opskrifter");
        jButton1.addActionListener(actionEvent -> {
            Opskrifter opskriftScreen = new Opskrifter();
            opskriftScreen.setVisible(true);
            opskriftScreen.setLocationRelativeTo(null);
        });


        jButton2.setText("Indstil diæt");
        jButton2.addActionListener(actionEvent -> {
            Diet dietScreen = new Diet();
            dietScreen.setVisible(true);
            dietScreen.setLocationRelativeTo(null);
        });

        jButton3.setText("Fjern alt");
        jButton3.addActionListener(actionEvent -> jList1.removeAll());

        jButton4.setText("Se butikker");

        jScrollPane2.setViewportView(jList1);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton1)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton2)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton3)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                                                .addComponent(jButton4)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2)
                                        .addComponent(jButton3)
                                        .addComponent(jButton4))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }
}
