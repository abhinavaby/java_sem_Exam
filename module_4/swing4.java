package module_4;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class swing4 implements ActionListener {
    JTextField t;
    swing4(){
        JFrame f = new JFrame("password");
        JButton b = new JButton("check password");
        t = new JPasswordField(50);
        b.setBounds(10,40,300,30);
        b.addActionListener(this);
        t.setBounds(10,230,300,30);
        f.add(b);
        f.add(t);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(t.getText().equals("abcd")){
            t.setText("correct password");

        }
        else{
            t.setText("incorrect password");
        }
    }
    public static void main(String[] args){
        new swing4();
    }
}
