import java.awt.*;
import java.awt.event.*;

public class pst10 extends Frame implements ItemListener
{
    Checkbox red,green;
    Label l;
    pst10(){
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        l= new Label("Select Color");
        CheckboxGroup cg= new CheckboxGroup();
        red= new Checkbox("Red",false,cg);
        green= new Checkbox("Green",false,cg);
        red.addItemListener(this);
        green.addItemListener(this);
        add(l); add(red); add(green);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                dispose();}});
    }


    public void itemStateChanged(ItemEvent ie){
        if(ie.getSource()==red){
            setBackground(Color.red);
            l.setBackground(Color.red);
            red.setBackground(Color.red);
            green.setBackground(Color.red);
        }
        else if (ie.getSource()==green){
            setBackground(Color.green);
            l.setBackground(Color.green);
            green.setBackground(Color.green);
            red.setBackground(Color.green);
        }
    }
    public static void main(String[] args) {
        new pst10();
    }
}
