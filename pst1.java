import java.applet.*;
import java.awt.*;
public class pst1 extends Applet
{
    public void init()
    {
        setLayout(null);
        Label l1= new Label("Name");
        Label l2=new Label("Gender");
        TextField tf = new TextField(30);
        Choice c= new Choice();
        c.add("Male"); c.add("Female");
        Button b= new Button("Submit");
        l1.setBounds(50,50,100,25);
        tf.setBounds(200,50,100,25);
        l2.setBounds(50,100,100,25);
        c.setBounds(200,100,100,25);
        b.setBounds(150,160,100,25);
        add(l1); add(tf); add(l2); add(c); add(b);
    }
}
/*<applet code=pst1 width=400 height=400></applet>*/
