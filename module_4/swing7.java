package module_4;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class swing7 {
    swing7(){
        JFrame jf=new JFrame();
        JTextField t1=new JTextField();
        JTextField t2=new JTextField();
        JTextField t3=new JTextField();
        jf.setLayout(new GridLayout(2,1));
        jf.add(t1);
        jf.add(t2);
        jf.add(t3);
        jf.setSize(400,400);
        jf.setVisible(true);



    }
    public static void main(String[] args) {
        new swing7();
    }
}
