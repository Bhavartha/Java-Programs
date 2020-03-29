import javax.swing.*;

public class pst4 extends JFrame
{
    pst4()
    {
        setSize(500,500);
        setVisible(true);
        String[] cols= {"id","name","salary"};
        Object[][] rows= {
            {"1","ABC","50000"},
            {"2","PQR","61000"},
            {"3","XYZ","85000"}
        };
        JTable table = new JTable(rows,cols);
        table.setBounds(50,50,150,150);
        table.setEnabled(false);
        int v= ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
        int h= ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
        JScrollPane jsp= new JScrollPane(table,v,h);
        add(jsp);
    }
    public static void main(String[] args) {
        new pst4();
    }
}
