import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class javaprac1 extends JFrame implements ActionListener
{
    JLabel l;
    JButton red,green,blue;
    javaprac1()
    {
        setVisible(true);
        setSize(600,600);
        setLayout(new FlowLayout());
        red= new JButton("Red");
        red.addActionListener(this);
        green= new JButton("Green");
        green.addActionListener(this);
        blue=new JButton("Blue");
        blue.addActionListener(this);
        l=new JLabel("Background Color");
        add(l); add(red);add(green);add(blue);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==red)
            getContentPane().setBackground(Color.red);
        else if(ae.getSource()==green)
            getContentPane().setBackground(Color.green);
        else
            getContentPane().setBackground(Color.blue);
    }

    public static void main(String args[])
    {
        new javaprac1();
    }
}
