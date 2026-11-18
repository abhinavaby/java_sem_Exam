package module_4;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;




public class swing5 implements ActionListener{
    JTextField t1;
    JLabel l1;
    swing5(){
        JFrame frame=new JFrame("action listener example");
        JButton b1=new JButton("button");
        t1=new JTextField("hi dude");
        l1=new JLabel("label");
        b1.setBounds(100,300,100,30);
        l1.setBounds(100,100,100,30);
        t1.setBounds(100,200,100,30);

        b1.addActionListener(this);
        frame.add(b1);
        frame.add(l1);
        frame.add(t1);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        t1.setText("hello world");
        l1.setText("hello world");

    }
    public static void main(String[] args){
        new swing5();
    }
}
