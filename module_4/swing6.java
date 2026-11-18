package module_4;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;



public class swing6 implements ActionListener{
    JButton sum;
    JButton sub;
    JTextField t1;
    JTextField t2;
    JTextField t3;
    swing6() {
        JFrame f = new JFrame();
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(4,2));
        JLabel l1 = new JLabel("num 1");
        JLabel l2 = new JLabel("num 2");
        JLabel re = new JLabel("result");
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        sum = new JButton("Sum");
        sub = new JButton("Sub");
        p.add(l1);
        p.add(t1);
        p.add(l2);
        p.add(t2);
        p.add(sum);
        p.add(sub);
        p.add(re);
        p.add(t3);
        f.add(p);
        sum.addActionListener(this);
        sub.addActionListener(this);

        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(null);
    }
    public void actionPerformed(ActionEvent e){
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        if(e.getSource()==sum){
            t3.setText(""+(a+b));
        }
        else if(e.getSource()==sub){
            t3.setText(""+(a-b));
        }
    }
    public static void main(String[] args) {
        new swing6();
    }
}
