package module_4;

import javax.swing.*;

public class swing1 {
    swing1() {
        JFrame fr = new JFrame("button example");
        JButton b = new JButton("click me");
        b.setBounds(89, 89, 300, 100);
        fr.add(b);
        fr.setSize(400, 400);
        fr.setLayout(null);
        fr.setVisible(true);
    }



    public static void main(String[] args) {
    new swing1();
}}
