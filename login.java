import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Myframe extends JFrame implements ActionListener{
     Container c;
     JLabel l1,l2;
     JButton btn;
     JTextField tf;
     JPasswordField pass;

    Myframe(){
        setTitle("Login Form");
        setSize(500,500);
        setLocation(100,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        c = getContentPane();
        c.setLayout(null);
        
        l1 = new JLabel("UserName");
        l1.setBounds(10,50,100,25);
        l2 = new JLabel("Password");
        l2.setBounds(10,100,100,25);

        tf = new JTextField();
        tf.setBounds(120, 50, 120, 25);
        pass = new JPasswordField();
        pass.setBounds(120, 100, 120, 25);

        btn = new JButton("Login");
        btn.setBounds(150,150,75,25);

        c.add(l1);
        c.add(l2);
        c.add(tf);
        c.add(pass);
        c.add(btn);

        btn.addActionListener(this);
        setVisible(true);
        
    }
   
    public void actionPerformed(ActionEvent e){
        System.out.println("UserName:"+tf.getText());
        String password = new String(pass.getPassword());
        System.out.println("Password:"+password);
    }
}

class LoginForm{
    public static void main (String args[]){
        Myframe frame = new Myframe();
    }
}