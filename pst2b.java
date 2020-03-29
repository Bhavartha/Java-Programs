import java.awt.*;

public class pst2b extends Frame
{
    pst2b()
    {
        setLayout(new BorderLayout());
        setVisible(true);
        setSize(400,400);
        add(new Button("Button 1"),BorderLayout.NORTH);
        add(new Button("Button 2"),BorderLayout.WEST);
        add(new Button("Button 3"),BorderLayout.SOUTH);
        add(new Button("Button 4"),BorderLayout.EAST);
    }
    public static void main(String[] args) {
        new pst2b();
    }
}
