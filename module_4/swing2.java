package module_4;
import javax.swing.*;

public class swing2 {
    swing2(){
        JFrame f = new JFrame("button inside panel");
        JPanel p = new JPanel();
        JButton b = new JButton("click me");
        p.setBounds(10,40,300,300);
        b.setBounds(0,0,50,23);
        p.add(b);
        f.add(p);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }
    public static void main(String[] args) {
        new swing2();
    }
}
