
package module_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class swing3 implements ActionListener {

    JTextField t;

    swing3() {

        JFrame fr = new JFrame("Text Field Example");
        JPanel p = new JPanel();

        JButton b = new JButton("Click Me");

        String data[] = {"rohan", "abel", "jacob"};
        JComboBox c = new JComboBox(data);

        JCheckBox s1 = new JCheckBox("yes", true);
        JCheckBox s2 = new JCheckBox("no");
        JCheckBox s3 = new JCheckBox("w");

        JRadioButton r1 = new JRadioButton("yes");
        JRadioButton r2 = new JRadioButton("no");
        JRadioButton r3 = new JRadioButton("w");

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);

        r1.setBounds(10,200,300,30);
        r2.setBounds(10,230,300,30);
        r3.setBounds(10,270,300,30);
        r1.setSelected(true);


        t = new JTextField("hello", 40);

        p.setBounds(40, 40, 400, 400);
        p.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        p.setLayout(null);

        t.setBounds(10, 22, 200, 30);
        b.setBounds(10, 55, 200, 30);
        c.setBounds(10, 120, 150, 30);

        s1.setBounds(10, 150, 300, 30);
        s2.setBounds(70, 150, 100, 30);
        s3.setBounds(120, 150, 100, 30);

        b.addActionListener(this);

        p.add(t);
        p.add(b);
        p.add(c);
        p.add(s1);
        p.add(s2);
        p.add(s3);
        p.add(r1);
        p.add(r2);
        p.add(r3);

        fr.add(p);

        fr.setSize(500, 500);
        fr.setLayout(null);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        t.setText("WELCOME TO THE PAGE");
    }

    public static void main(String[] args) {
        new swing3();
    }
}
