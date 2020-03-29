import java.awt.*;

public class pst2 extends Frame
{
    pst2()
    {
        setLayout(new GridLayout(0,2));
        setVisible(true);
        setSize(400,400);
        add(new Button("Button 1"));
        add(new Button("Button 2"));
        add(new Button("Button 3"));
        add(new Button("Button 4"));
        // add(new Button("Button 5"));
        // add(new Button("Button 6"));
    }
    public static void main(String[] args) {
        new pst2();
    }
}
