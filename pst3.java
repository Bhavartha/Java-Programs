import java.awt.*;

public class pst3 extends Frame
{
    pst3()
    {
        MenuBar mb= new MenuBar();
        Menu fm= new Menu("File");
        Menu em= new Menu("Edit");
        MenuItem fm_new = new MenuItem("New");
        MenuItem fm_open= new MenuItem("Open");
        mb.add(fm); mb.add(em);
        fm.add(fm_new); fm.add(fm_open);
        setLayout(null);
        setTitle("Menu");
        setVisible(true);
        setSize(400,400);
        setMenuBar(mb);
    }
    public static void main(String[] args) {
        new pst3();
    }
}
