import java.awt.*;
import java.awt.event.*;
public class pst5 extends Frame implements ActionListener{
    TextField n1,n2,res;
    pst5(){
        setVisible(true);
        setSize(400,400);
        setLayout(new GridLayout(4,2));
        Label num1=new Label("Enter first number");
        n1= new TextField(20);
        Label num2=new Label("Enter second number");
        n2= new TextField(20);
        Label result= new Label("Result");
        res=new TextField(20);
        res.setEditable(false);
        Button b= new Button("Perform addition");
        b.addActionListener(this);
        add(num1); add(n1); add(num2); add(n2); add(result); add(res); add(b);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                dispose();
                // System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent ae){
        int a= Integer.parseInt(n1.getText());
        int b= Integer.parseInt(n2.getText());
        int c= a+b;
        res.setText(Integer.toString(c));
    }
    public static void main(String[] args) {
        new pst5();
    }
}
